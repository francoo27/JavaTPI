import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IFormato } from './formato.model';
import { SERVER_API_URL } from 'src/app/app.constants';
import { createHeaders } from 'src/app/shared/createHeader';

type EntityResponseType = HttpResponse<IFormato>;
type EntityArrayResponseType = HttpResponse<IFormato[]>;

@Injectable({ providedIn: 'root' })
export class FormatoService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/formato';

    constructor(private http: HttpClient) {}

    query(): Observable<EntityArrayResponseType> {
        return this.http.get<IFormato[]>(this.resourceUrl, { params: {}/*options*/, observe: 'response' });
    }

    create(formato: IFormato): Observable<EntityResponseType> {
        return this.http.post<IFormato>(this.resourceUrl, formato, {headers: createHeaders(), observe: 'response' });
    }

    update(formato: IFormato): Observable<EntityResponseType> {
        return this.http.put<IFormato>(`${this.resourceUrl}/${formato.id}`, formato, {headers: createHeaders(), observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<IFormato>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    delete(id: number): Observable<EntityResponseType> {
        return this.http.delete<IFormato>(`${this.resourceUrl}/${id}`, {headers: createHeaders(), observe: 'response' });
    }
}
