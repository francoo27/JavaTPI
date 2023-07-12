import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IPais } from './pais.model';
import { SERVER_API_URL } from 'src/app/app.constants';
import { createHeaders } from 'src/app/shared/createHeader';

type EntityResponseType = HttpResponse<IPais>;
type EntityArrayResponseType = HttpResponse<IPais[]>;

@Injectable({ providedIn: 'root' })
export class PaisService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/pais';

    constructor(private http: HttpClient) {}

    create(pais: IPais): Observable<EntityResponseType> {
        return this.http.post<IPais>(this.resourceUrl, pais, {headers: createHeaders(), observe: 'response' });
    }

    delete(id: number): Observable<EntityResponseType> {
        return this.http.delete<IPais>(`${this.resourceUrl}/${id}`, {headers: createHeaders(), observe: 'response' });
    }

    update(pais: IPais): Observable<EntityResponseType> {
        return this.http.put<IPais>(`${this.resourceUrl}/${pais.id}`, pais, {headers: createHeaders(), observe: 'response' });
    }

    find(id: number): Observable<EntityResponseType> {
        return this.http.get<IPais>(`${this.resourceUrl}/${id}`, { observe: 'response' });
    }

    query(req?: any): Observable<EntityArrayResponseType> {
        // const options = createRequestOption(req);
        return this.http.get<IPais[]>(this.resourceUrl, { params: {}/*options*/, observe: 'response' });
    }
}
