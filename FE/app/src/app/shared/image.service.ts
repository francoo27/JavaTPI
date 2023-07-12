import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IFuncion } from './image.model';
import { SERVER_API_URL } from 'src/app/app.constants';
import { createHeaders } from './createHeader';

type EntityResponseType = HttpResponse<IFuncion>;
type EntityArrayResponseType = HttpResponse<IFuncion[]>;

@Injectable({ providedIn: 'root' })
export class ImageService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/image';

    constructor(private http: HttpClient) {}

    create(image: IFuncion): Observable<EntityResponseType> {
        return this.http.post<IFuncion>(this.resourceUrl, image, {headers: createHeaders(), observe: 'response' });
    }

    update(image: IFuncion): Observable<EntityResponseType> {
        return this.http.put<any>(`${this.resourceUrl}/${image.id}`, image, {headers: createHeaders(), observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<IFuncion>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    query(): Observable<EntityArrayResponseType> {
        return this.http.get<IFuncion[]>(this.resourceUrl, { params: {}/*options*/, observe: 'response' });
    }
}
