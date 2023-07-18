import { Component } from '@angular/core';
import { SERVER_API_URL } from 'src/app/app.constants';
import { IPelicula } from '../pelicula/pelicula.model';
import { PeliculaService } from '../pelicula/pelicula.service';

@Component({
    selector: 'car-home',
    templateUrl: './home.component.html',
    providers: []
})
export class HomeComponent {

    peliculas: IPelicula[] = [];
    images: IDataCarousel[] = [
        {
            "previewImageSrc": "http://192.168.0.10:5000/api/img/2.jpeg",
            "thumbnailImageSrc": "http://192.168.0.10:5000/api/img/2.jpeg",
            "alt": "Description for Image 1",
            "title": "Title 1"
        }
    ];
    buffer: IDataCarousel[] = [
    ];

    responsiveOptions: any[] = [
        {
            breakpoint: '1024px',
            numVisible: 5
        },
        {
            breakpoint: '768px',
            numVisible: 3
        },
        {
            breakpoint: '560px',
            numVisible: 1
        }
    ];

    constructor(private peliculaService: PeliculaService) { }

    ngOnInit() {
        this.peliculaService.query().subscribe(res => {
            this.peliculas = res.body!
        });
    }

    getImageSrc(img: string): string {
        return SERVER_API_URL_IMAGE + img;
    }

    getSinopsis(sinopsis: string): string {
        return sinopsis.length > 250 ? sinopsis.substring(0,300) + "..." : sinopsis;
    }

}



export const SERVER_API_URL_IMAGE = SERVER_API_URL + 'JavaTPI/images/'
export interface IDataCarousel {
    previewImageSrc: string
    thumbnailImageSrc: string;
    alt: string;
    title: string;
}
