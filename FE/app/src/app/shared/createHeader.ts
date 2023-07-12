import { HttpHeaders } from "@angular/common/http";

export function createHeaders(): HttpHeaders{
    return new HttpHeaders()
        .set('X-User-Email', localStorage.getItem('email')!)
        .set('X-Auth-Token', localStorage.getItem('token')!)
}