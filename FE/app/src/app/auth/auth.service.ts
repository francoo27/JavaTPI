import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SERVER_API_URL } from 'src/app/app.constants';
import { IUser } from './user.model';
import { createHeaders } from '../shared/createHeader';

type EntityResponseType = HttpResponse<IUser>;
type EntityResponseCreateType = HttpResponse<IUser>;

@Injectable({ providedIn: 'root' })
export class AuthService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/authorization';

    constructor(private http: HttpClient) {}

    login(user: IUser): Observable<EntityResponseType> {
        return this.http.post<IUser>(`${this.resourceUrl}/login`, user, { observe: 'response' });
    }

    logout(user: IUser): Observable<EntityResponseType> {
        return this.http.post<IUser>(`${this.resourceUrl}/logout`, user, { headers: createHeaders(), observe: 'response' });
    }
    
    authenticate(): Observable<HttpResponse<boolean>> {
        return this.http.get<boolean>(`${this.resourceUrl}`, { headers: createHeaders(), observe: 'response' });
    }
}
