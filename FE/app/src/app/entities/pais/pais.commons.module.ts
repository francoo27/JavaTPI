import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from "@angular/core";
import { RouterModule } from "@angular/router";
import { CascadeSelectModule } from "primeng/cascadeselect";
import { PaisDetailComponent } from "./pais-detail.component";
import { PaisUpdateComponent } from "./pais-update.component";
import { PaisComponent } from "./pais.component";
import { ListboxModule } from 'primeng/listbox';
import { ToastModule } from 'primeng/toast';
import { MessageService } from "primeng/api";
import { CineArFormModule } from "../cineArForm.module";
import { CanActivateAuth } from "src/app/auth/canActivateAuth";

@NgModule({
    imports: [RouterModule, CascadeSelectModule, ListboxModule, ToastModule, CineArFormModule],
    declarations: [
        PaisComponent,
        PaisDetailComponent,
        PaisUpdateComponent
    ],
    entryComponents: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA],
    providers: [MessageService, CanActivateAuth]
})

export class CineArPaisCommonsModule { }