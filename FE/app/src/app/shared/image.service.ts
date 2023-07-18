import { Injectable } from '@angular/core';
import { HttpClient, HttpResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { SERVER_API_URL } from 'src/app/app.constants';
import { createHeaders } from './createHeader';

type EntityResponseType = HttpResponse<any>;

@Injectable({ providedIn: 'root' })
export class ImageService {
    private resourceUrl = SERVER_API_URL + 'JavaTPI/images';

    constructor(private http: HttpClient) {}

    upload(image: any): Observable<EntityResponseType> {
        return this.http.post<any>(this.resourceUrl, image, {headers: createHeaders(), observe: 'response' });
    }

}
