import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { ITecnologiaProyeccion } from './tecnologia-proyeccion.model';
import { SERVER_API_URL } from 'src/app/app.constants';
import { createHeaders } from 'src/app/shared/createHeader';

type EntityResponseType = HttpResponse<ITecnologiaProyeccion>;
type EntityArrayResponseType = HttpResponse<ITecnologiaProyeccion[]>;

@Injectable({ providedIn: 'root' })
export class TecnologiaProyeccionService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/tecnologia-proyeccion';

    constructor(private http: HttpClient) {}

    query(): Observable<EntityArrayResponseType> {
        return this.http.get<ITecnologiaProyeccion[]>(this.resourceUrl, { params: {}/*options*/, observe: 'response' });
    }

    create(tecnologiaProyeccion: ITecnologiaProyeccion): Observable<EntityResponseType> {
        return this.http.post<ITecnologiaProyeccion>(this.resourceUrl, tecnologiaProyeccion, {headers: createHeaders(), observe: 'response' });
    }

    update(tecnologiaProyeccion: ITecnologiaProyeccion): Observable<EntityResponseType> {
        return this.http.put<ITecnologiaProyeccion>(`${this.resourceUrl}/${tecnologiaProyeccion.id}`, tecnologiaProyeccion, {headers: createHeaders(), observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<ITecnologiaProyeccion>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    delete(id: number): Observable<EntityResponseType> {
        return this.http.delete<ITecnologiaProyeccion>(`${this.resourceUrl}/${id}`, {headers: createHeaders(), observe: 'response' });
    }

}
