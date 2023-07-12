import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IFuncion, IFuncionCreate } from './funcion.model';
import { SERVER_API_URL } from 'src/app/app.constants';
import { createHeaders } from 'src/app/shared/createHeader';

type EntityResponseType = HttpResponse<IFuncion>;
type EntityResponseCreateType = HttpResponse<IFuncionCreate>;
type EntityArrayResponseType = HttpResponse<IFuncion[]>;

@Injectable({ providedIn: 'root' })
export class FuncionService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/funcion';

    constructor(private http: HttpClient) {}

    create(funcion: IFuncionCreate): Observable<EntityResponseCreateType> {
        return this.http.post<IFuncionCreate>(this.resourceUrl, funcion, {headers: createHeaders(), observe: 'response' });
    }

    update(funcion: IFuncionCreate): Observable<EntityResponseCreateType> {
        return this.http.put<IFuncionCreate>(`${this.resourceUrl}/${funcion.id}`, funcion, {headers: createHeaders(), observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<IFuncion>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    query(): Observable<EntityArrayResponseType> {
        return this.http.get<IFuncion[]>(this.resourceUrl, { params: {}/*options*/, observe: 'response' });
    }
        
    queryBoleteria(peliculaId:number,formatoId:number,cancelada:number,expirada:number): Observable<EntityArrayResponseType> {
        return this.http.get<IFuncion[]>(this.resourceUrl, { params: {peliculaId: peliculaId,formatoId:formatoId,cancelada:cancelada,expirada:expirada}/*options*/, observe: 'response' });
    }

    delete(id: number): Observable<EntityResponseType> {
        return this.http.delete<IFuncion>(`${this.resourceUrl}/${id}`, {headers: createHeaders(), observe: 'response' });
    }

    cancel(funcion: IFuncionCreate): Observable<EntityResponseType> {
        return this.http.put<IFuncion>(`${this.resourceUrl}/${funcion.id}`, funcion, {headers: createHeaders(), params: {cancelar: true},observe: 'response' });
    }
}
