import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IPelicula } from './pelicula.model';
import { SERVER_API_URL } from 'src/app/app.constants';
import { createHeaders } from 'src/app/shared/createHeader';

type EntityResponseType = HttpResponse<IPelicula>;
type EntityArrayResponseType = HttpResponse<IPelicula[]>;

@Injectable({ providedIn: 'root' })
export class PeliculaService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/pelicula';

    constructor(private http: HttpClient) {}

    create(pelicula: IPelicula): Observable<EntityResponseType> {
        return this.http.post<IPelicula>(this.resourceUrl, pelicula, {headers: createHeaders(), observe: 'response' });
    }

    update(pelicula: IPelicula): Observable<EntityResponseType> {
        return this.http.put<IPelicula>(`${this.resourceUrl}/${pelicula.id}`, pelicula, {headers: createHeaders(), observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<IPelicula>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    delete(id: number): Observable<EntityResponseType> {
        return this.http.delete<IPelicula>(`${this.resourceUrl}/${id}`, {headers: createHeaders(), observe: 'response' });
    }

    query(): Observable<EntityArrayResponseType> {
        return this.http.get<IPelicula[]>(this.resourceUrl, { params: {}/*options*/, observe: 'response' });
    }
}
