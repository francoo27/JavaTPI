import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IClasificacion } from './clasificacion.model';
import { SERVER_API_URL } from 'src/app/app.constants';
import { createHeaders } from 'src/app/shared/createHeader';

type EntityResponseType = HttpResponse<IClasificacion>;
type EntityArrayResponseType = HttpResponse<IClasificacion[]>;

@Injectable({ providedIn: 'root' })
export class ClasificacionService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/clasificacion';

    constructor(private http: HttpClient) {}
    
    query(): Observable<EntityArrayResponseType> {
        return this.http.get<IClasificacion[]>(this.resourceUrl, { params: {}/*options*/, observe: 'response' });
    }

    create(clasificacion: IClasificacion): Observable<EntityResponseType> {
        return this.http.post<IClasificacion>(this.resourceUrl, clasificacion, {headers: createHeaders(), observe: 'response' });
    }

    update(clasificacion: IClasificacion): Observable<EntityResponseType> {
        return this.http.put<IClasificacion>(`${this.resourceUrl}/${clasificacion.id}`, clasificacion, {headers: createHeaders(), observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<IClasificacion>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    delete(id: number): Observable<EntityResponseType> {
        return this.http.delete<IClasificacion>(`${this.resourceUrl}/${id}`, {headers: createHeaders(), observe: 'response' });
    }
}
