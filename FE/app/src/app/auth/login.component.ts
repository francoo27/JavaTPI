import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';
import { AuthService } from './auth.service';
import { Location } from '@angular/common';
import { MessageService } from 'primeng/api';
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
    private messageService: MessageService
  ) {
  }

  ngOnInit() {
    // localStorage.setItem('token', 'Como utilizar el LocalStorage en Angular');
    // console.log(localStorage.getItem('token'))
  }

  login() {
    this.loggin = true;
    this.authService.login({ email: this.email, password: this.password }).subscribe(
      res => {
        console.log(res)
        localStorage.setItem('token', res?.body?.token!)
        localStorage.setItem('email', this.email!)
      },
      err => {
        console.log(err)
        this.messageService.add({
          severity: "error",
          summary: "ERROR",
          detail: "No es posible validar esos datos"
        })
      },
      () => this.location.back()
    )
  }
  previousState() {
    this.location.back();
  }
}

