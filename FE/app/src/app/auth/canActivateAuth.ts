import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { AuthService } from './auth.service';
import { LogStateService } from './logStateService';
import { User } from './user.model';

@Injectable()
export class CanActivateAuth implements CanActivate {

  constructor(private authService: AuthService, private router: Router, private logStateService: LogStateService) {}

  canActivate(route: ActivatedRouteSnapshot, state: RouterStateSnapshot): Promise<boolean> {
    return this.authService.authenticate().toPromise().then(authenticated => {
      if (authenticated) {
        console.log(authenticated.body)
        if (!authenticated.body){
          this.logStateService.logStateEvent.emit(new User());
          this.router.navigate(['/login']);
        }
        // User is authenticated, allow access to the route
        return authenticated.body!;
      } else {
        // User is not authenticated, redirect to the login page
        this.logStateService.logStateEvent.emit(new User());
        this.router.navigate(['/login']);
        return false;
      }
    }).catch(error => {
      console.error('Error occurred during authentication:', error);
      // Handle the error, you can redirect to an error page if needed
      return false;
    });
  }
}