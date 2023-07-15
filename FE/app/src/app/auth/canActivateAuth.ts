import { Injectable } from "@angular/core";
import { ActivatedRouteSnapshot, CanActivate, RouterStateSnapshot, UrlTree } from "@angular/router";
import { Observable } from "rxjs";
import { AuthService } from "./auth.service";
import { map } from "rxjs/operators";

@Injectable()
export class CanActivateAuth implements CanActivate {
  constructor(private authService: AuthService) {}

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot
  ): Observable<boolean | UrlTree> {
    return this.authService.authenticate().pipe(
      map((res) => {
        if (res) {
          return true; // Allow navigation
        } else {
          return false; // Block navigation
        }
      })
    );
  }
}
