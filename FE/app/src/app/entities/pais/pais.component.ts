import { Component, OnInit, OnDestroy } from '@angular/core';
import {MessageService} from 'primeng/api';
import { PaisService } from './pais.service';

@Component({
    selector: 'car-pais',
    templateUrl: './pais.component.html',
    providers: []
})
export class PaisComponent implements OnInit, OnDestroy {
    countries: any[] =  [];

    constructor(
        private paisService: PaisService,
        private messageService: MessageService
    ) {
    }

    ngOnInit(): void {
      this.paisService.query().subscribe(res => {
        this.countries = res.body!
    } );

    }

    
    delete(id:number):void{
        this.paisService.delete(id).subscribe(
            x => {
                setTimeout(() => {
                    this.messageService.add({
                        severity: "success",
                        summary: "Todo Ok!",
                        detail:"Pais Eliminado"
                    })
                }, 100);
            },
            res => {
                setTimeout(() => {
                    this.messageService.add({
                        severity: "error",
                        summary: "ERROR",
                        detail:res.error.message
                    })
                }, 100);
            },
            () => {
                this.paisService.query().subscribe(res => {
                    this.countries = res.body!
                });
            }
        );
    }

    ngOnDestroy(): void {}
}
