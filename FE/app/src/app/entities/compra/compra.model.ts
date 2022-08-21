import { IFuncion } from "../funcion/funcion.model";

export interface ICompra {
    funcion?: IFuncion,
    asientoIdSelected?:number[];
    precioIdQuantitySelected?:IPrecioSelectedQuantity[];
    email?: string;
    nombre?: string;
}

export class Compra implements ICompra {
    constructor(
        public funcion?: IFuncion,
        public asientoIdSelected?: number[],
        public precioIdQuantitySelected?: IPrecioSelectedQuantity[],
        public email?: string,
        public nombre?: string,
    ) {
    }
}

export interface IPrecioSelectedQuantity {
    precioId?:number;
    quantity?:number;
}

export class PrecioSelectedQuantity implements IPrecioSelectedQuantity {
    constructor(
        public precioId?:number,
        public quantity?:number
    ) {}
}
