import { Component, OnInit } from '@angular/core';
import { MenuItem } from 'primeng/api/menuitem';
import { AuthService } from './auth/auth.service';
import { LogStateService } from './auth/logStateService';
import { IUser, User } from './auth/user.model';
import { MessageService } from 'primeng/api';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent implements OnInit {
  title = 'app';
  items: MenuItem[] = []
  baseItems: MenuItem[] = [
    {
      label: 'Cartelera',
      icon: 'pi pi-fw',
      routerLink: ['']
    },
    {
      label: 'Boleteria',
      icon: 'pi pi-fw',
      routerLink: ['/boleteria']
    }
  ];

  user!: IUser;

  constructor(
    private authService: AuthService,
    private logStateService: LogStateService,
    private messageService: MessageService,
  ) { }

  ngOnInit() {
    this.logStateService.logStateEvent.emit();

    this.logStateService.logStateEvent.subscribe((user: IUser) => {
      this.user = user;
      console.log("logStateEvent")
      this.items = this.getMenuItems();
      location.reload();
    });

    this.user = new User();
    this.authService.authenticate().subscribe(
      res => {
        res ? this.user = new User(localStorage.getItem('email')!, undefined, localStorage.getItem('token')!) : null;
        console.log("authenticate")
        this.items = this.getMenuItems();
      },
      err => {}
    )
    this.items = this.getMenuItems();
  }

  isLogged(): boolean {
    return this.user?.token != undefined || false;
  }

  logout(): void {
    this.authService.logout(this.user).subscribe(
      res => {
        localStorage.clear();
        this.logStateService.logStateEvent.emit(new User());
        this.messageService.add({
          severity: "success",
          summary: "Deslogueado",
        })
      }
    )
  }


  getMenuItems() : MenuItem [] {
    var menuItems = this.baseItems;
    if (this.isLogged()) {
       menuItems.push({
       label: 'Entidades',
       items: [
         {
           label: 'Funcion',
           items: [
             {
               label: 'Nuevo',
               icon: 'pi pi-fw pi-plus',
               routerLink: ['/funcion/new']
             },
             {
               label: 'Listado',
               icon: 'pi pi-fw pi-eye',
               routerLink: ['/funcion']
             }
           ]
         },
         {
           label: 'Pelicula',
           items: [
             {
               label: 'Nuevo',
               icon: 'pi pi-fw pi-plus',
               routerLink: ['/pelicula/new']
             },
             {
               label: 'Listado',
               icon: 'pi pi-fw pi-eye',
               routerLink: ['/pelicula']
             }
           ]
         },
         {
           label: 'Genero',
           items: [
             {
               label: 'Nuevo',
               icon: 'pi pi-fw pi-plus',
               routerLink: ['/genero/new']
             },
             {
               label: 'Listado',
               icon: 'pi pi-fw pi-eye',
               routerLink: ['/genero']
             }
           ]
         },
         {
           label: 'Clasificacion',
           items: [
             {
               label: 'Nuevo',
               icon: 'pi pi-fw pi-plus',
               routerLink: ['/clasificacion/new']
             },
             {
               label: 'Listado',
               icon: 'pi pi-fw pi-eye',
               routerLink: ['/clasificacion']
             }
           ]
         },
         {
           label: 'Audio',
           items: [
             {
               label: 'Nuevo',
               icon: 'pi pi-fw pi-plus',
               routerLink: ['/audio/new']
             },
             {
               label: 'Listado',
               icon: 'pi pi-fw pi-eye',
               routerLink: ['/audio']
             }
           ]
         },
         {
           label: 'Tecnologia Proyeccion',
           items: [
             {
               label: 'Nuevo',
               icon: 'pi pi-fw pi-plus',
               routerLink: ['/tecnologia-proyeccion/new']
             },
             {
               label: 'Listado',
               icon: 'pi pi-fw pi-eye',
               routerLink: ['/tecnologia-proyeccion']
             }
           ]
         },
         {
           label: 'Pais',
           items: [
             {
               label: 'Nuevo',
               icon: 'pi pi-fw pi-plus',
               routerLink: ['/pais/new']
             },
             {
               label: 'Listado',
               icon: 'pi pi-fw pi-eye',
               routerLink: ['/pais']
             }
           ]
         },
         {
           label: 'Formato',
           items: [
             {
               label: 'Nuevo',
               icon: 'pi pi-fw pi-plus',
               routerLink: ['/formato/new']
             },
             {
               label: 'Listado',
               icon: 'pi pi-fw pi-eye',
               routerLink: ['/formato']
             }
           ]
         }
       ]
     })
    };
    return menuItems;
  }
}
