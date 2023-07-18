import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';
import { AuthService } from './auth.service';
import { Location } from '@angular/common';
import { MessageService } from 'primeng/api';
import { EventEmitter } from '@angular/core';
import { User } from './user.model';
import { LogStateService } from './logStateService';

@Component({
  selector: 'login',
  templateUrl: './login.component.html'
  , providers: []
})
export class LoginComponent implements OnInit {
  loggin: boolean = false;
  password!: string;
  email!: string;

  constructor(
    private authService: AuthService,
    private location: Location,
    private messageService: MessageService,
    private logStateService: LogStateService
  ) {
  }

  ngOnInit() { }

  login() {
    this.loggin = true;
    this.authService.login({ email: this.email, password: this.password }).subscribe(
      res => {
        var token = res?.body?.token!
        localStorage.setItem('token', token)
        localStorage.setItem('email', this.email!)
        this.emitLoggedState(this.email,token)
        this.messageService.add({
          severity: "success",
          summary: "Bienvenido",
        })
        this.previousState();
      },
      err => {
        this.messageService.add({
          severity: "error",
          summary: "ERROR",
          detail: "No es posible validar esos datos"
        })
      }
    )
  }

  previousState() {
    this.location.back();
  }

  emitLoggedState(email?:string,token?:string): void {
    this.logStateService.logStateEvent.emit(new User(email,undefined,token));
  }
}

