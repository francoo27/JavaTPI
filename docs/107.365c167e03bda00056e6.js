(self.webpackChunkapp=self.webpackChunkapp||[]).push([[107],{1107:(e,o,t)=>{"use strict";t.r(o),t.d(o,{CineArFuncionModule:()=>k});var n=t(2322),i=t(3109),r=t(1968),a=t(1146),s=t(2290),c=t(2844),u=t(1116),l=t(8619);let d=(()=>{class e{}return e.\u0275fac=function(o){return new(o||e)},e.\u0275mod=l.oAB({type:e}),e.\u0275inj=l.cJS({providers:[s.ez],imports:[[n.Bz,i.XH,r.ON,a.EV,c.M,u.ez]]}),e})();var h=t(878),p=t(9996);class f{constructor(e,o,t,n,i,r,a,s){this.id=e,this.nombre=o,this.fechaInicio=t,this.horaInicio=n,this.pelicula=i,this.formato=r,this.sala=a,this.cancelada=s}}class g{constructor(e,o,t,n,i,r,a,s,c,u,l,d){this.id=e,this.nombre=o,this.fechaInicio=t,this.horaInicio=n,this.peliculaId=i,this.formatoId=r,this.salaId=a,this.fechaDia=s,this.fechaMes=c,this.fechaAnio=u,this.hora=l,this.minuto=d}}var m=t(7419),v=t(2353),b=t(2693);let Z=(()=>{class e{constructor(e){this.http=e,this.resourceUrl=v.B+"JavaTPI/complejo"}query(){return this.http.get(this.resourceUrl,{params:{},observe:"response"})}}return e.\u0275fac=function(o){return new(o||e)(l.LFG(b.eN))},e.\u0275prov=l.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})();var q=t(9121);let S=(()=>{class e{constructor(e){this.http=e,this.resourceUrl=v.B+"JavaTPI/sala"}query(){return this.http.get(this.resourceUrl,{params:{},observe:"response"})}query_ByComplejo(e){return this.http.get(`${this.resourceUrl}`,{params:{complejoId:e},observe:"response"})}}return e.\u0275fac=function(o){return new(o||e)(l.LFG(b.eN))},e.\u0275prov=l.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})();var T=t(1462),y=t(9892),A=t(4568),w=t(6726),C=t(1709);function I(e,o){if(1&e){const e=l.EpF();l.ynx(0),l.TgZ(1,"div",3),l.TgZ(2,"label",17),l._uU(3,"Formato"),l.qZA(),l.TgZ(4,"p-dropdown",18),l.NdJ("ngModelChange",function(o){return l.CHM(e),l.oxw().funcion.formato=o}),l.qZA(),l.qZA(),l.TgZ(5,"div",3),l.TgZ(6,"label",19),l._uU(7,"Fecha"),l.qZA(),l.TgZ(8,"p-calendar",20),l.NdJ("ngModelChange",function(o){return l.CHM(e),l.oxw().fechaStr=o}),l.qZA(),l.qZA(),l.TgZ(9,"div",3),l.TgZ(10,"label",21),l._uU(11,"Hora"),l.qZA(),l.TgZ(12,"p-calendar",22),l.NdJ("ngModelChange",function(o){return l.CHM(e),l.oxw().hora=o}),l.qZA(),l.qZA(),l.BQk()}if(2&e){const e=l.oxw();l.xp6(4),l.Q6J("options",e.formatos)("ngModel",e.funcion.formato)("required",!0)("showClear",!0),l.xp6(4),l.Q6J("ngModel",e.fechaStr)("minDate",e.minFecha)("dateOnly",!0)("readonlyInput",!0)("dateFormat","dd/mm/yy")("required",!0),l.xp6(4),l.Q6J("ngModel",e.hora)("timeOnly",!0)("required",!0)}}let M=(()=>{class e{constructor(e,o,t,n,i,r,a){this.funcionService=e,this.complejoService=o,this.peliculaService=t,this.salaService=n,this.activatedRoute=i,this.messageService=r,this.location=a,this.formatos=[],this.peliculas=[],this.complejos=[],this.salas=[],this.minFecha=new Date}ngOnInit(){this.isSaving=!1,this.activatedRoute.data.subscribe(e=>{this.funcion=e.funcion,this.currentNombre=e.funcion.nombre,this.complejoSelected=e.funcion.sala.complejo,this.fecha=new Date(e.funcion.fechaInicio),console.log(this.funcion)}),this.complejoService.query().subscribe(e=>{this.complejos=e.body}),this.peliculaService.query().subscribe(e=>{this.peliculas=e.body})}previousState(){this.location.back()}onSubmit(){console.log("asds")}generateNombre(){var e,o,t,n,i;let r=new Date(Date.parse(this.fechaStr));return this.funcion.nombre=(null===(e=this.funcion.pelicula)||void 0===e?void 0:e.id)&&(null===(o=this.funcion.formato)||void 0===o?void 0:o.id)?(null===(t=this.funcion.pelicula)||void 0===t?void 0:t.tituloPais)+" - "+(null===(n=this.funcion.formato)||void 0===n?void 0:n.nombre)+" - Sala: "+(null===(i=this.funcion.sala)||void 0===i?void 0:i.numero)+" - "+(r?r.getDate().toString()+"/"+(r.getMonth()+1).toString():"")+" - "+(this.hora?this.hora.getHours().toString()+":"+this.hora.getMinutes().toString():""):"",this.funcion.nombre}onComplejoChange(){this.salaService.query_ByComplejo(this.complejoSelected.id).subscribe(e=>{this.salas=e.body,this.funcion.sala=this.funcion.sala})}onSalaChange(){var e;this.formatos=[];let o=null===(e=this.funcion.sala)||void 0===e?void 0:e.formatos.map(e=>{var o;return null===(o=this.funcion.pelicula)||void 0===o?void 0:o.formatos.find(o=>o.id===e.id)}).filter(e=>void 0!==e);this.formatos=void 0!==o&&o.length>0?o:this.formatos}save(){this.isSaving=!0;let e=new Date(Date.parse(this.fechaStr));this.funcion.horaInicio=`${Number(new Date(this.hora).getHours())}:${Number(new Date(this.hora).getMinutes())}`,this.funcion.fechaInicio=`${Number(e.getFullYear())}-${Number(e.getMonth()+1)}-${e.getDate()}`;let o=new g((t=this.funcion).id,t.nombre,t.fechaInicio,t.horaInicio,null===(n=t.pelicula)||void 0===n?void 0:n.id,null===(i=t.formato)||void 0===i?void 0:i.id,null===(r=t.sala)||void 0===r?void 0:r.id);var t,n,i,r;console.log(this.funcion.horaInicio),console.log(`${Number(e.getFullYear())}-${Number(e.getMonth()+1)}-${e.getDate()}`),o.fechaAnio=e.getFullYear(),o.fechaMes=e.getMonth()+1,o.fechaDia=e.getDate(),o.hora=Number(new Date(this.hora).getHours()),o.minuto=Number(new Date(this.hora).getMinutes()),this.isNew()?this.subscribeToSaveResponse(this.funcionService.create(this.funcion)):this.subscribeToSaveResponse(this.funcionService.update(this.funcion))}subscribeToSaveResponse(e){e.subscribe(()=>this.onSaveSuccess(),()=>this.onSaveError())}isNew(){return void 0===this.funcion.id}onSaveSuccess(){this.isSaving=!1,setTimeout(()=>{this.messageService.add({severity:"success",summary:"Ok!",detail:this.isNew()?"Funcion creada":"Funcion editada"})},1e3),this.previousState()}onSaveError(){setTimeout(()=>{this.messageService.add({severity:"error",summary:"ERROR",detail:this.isNew()?"Hubo un error al crear el Funcion":"Hubo un error al editar el Funcion"})},1e3),this.isSaving=!1}get funcion(){return this._funcion}set funcion(e){this._funcion=e}}return e.\u0275fac=function(o){return new(o||e)(l.Y36(m.N),l.Y36(Z),l.Y36(q.I),l.Y36(S),l.Y36(n.gz),l.Y36(s.ez),l.Y36(u.Ye))},e.\u0275cmp=l.Xpm({type:e,selectors:[["car-funcion-update"]],decls:29,vars:17,consts:[[3,"ngSubmit"],["dataform","ngForm"],[1,"p-fluid","p-formgrid","p-grid"],[1,"p-field","p-col-3","p-md-3"],["for","nombre"],["type","text","pInputText","","placeholder","","required","","disabled","","name","nombre",1,"p-inputtext-sm",3,"ngModel"],["for","pelicula"],["optionLabel","tituloPais","name","pelicula","placeholder","Seleccione una pelicula",3,"options","ngModel","required","showClear","ngModelChange"],["for","complejo"],["optionLabel","nombre","name","complejo","placeholder","Seleccione un complejo",3,"options","ngModel","required","showClear","ngModelChange"],["for","sala"],["optionLabel","numero","name","sala","placeholder","Seleccione una sala",3,"options","ngModel","required","showClear","ngModelChange"],[4,"ngIf"],[1,"p-grid","p-jc-end"],[1,"p-col-1","p-md-1"],["pButton","","type","button","label","Volver",1,"p-button-secondary",3,"click"],["pButton","","type","submit","label","Guardar",3,"disabled"],["for","formato"],["optionLabel","nombre","name","formato","placeholder","Seleccione un formato",3,"options","ngModel","required","showClear","ngModelChange"],["for","fecha"],["name","fecha","inputId","fecha",3,"ngModel","minDate","dateOnly","readonlyInput","dateFormat","required","ngModelChange"],["for","hora"],["inputId","hora","name","hora",3,"ngModel","timeOnly","required","ngModelChange"]],template:function(e,o){if(1&e&&(l.TgZ(0,"div"),l.TgZ(1,"h2"),l._uU(2),l.qZA(),l.TgZ(3,"form",0,1),l.NdJ("ngSubmit",function(){return o.save()}),l.TgZ(5,"div",2),l.TgZ(6,"div",3),l.TgZ(7,"label",4),l._uU(8,"Nombre (Generado)"),l.qZA(),l._UZ(9,"input",5),l.qZA(),l.TgZ(10,"div",3),l.TgZ(11,"label",6),l._uU(12,"Pelicula"),l.qZA(),l.TgZ(13,"p-dropdown",7),l.NdJ("ngModelChange",function(e){return o.funcion.pelicula=e}),l.qZA(),l.qZA(),l.TgZ(14,"div",3),l.TgZ(15,"label",8),l._uU(16,"Complejo"),l.qZA(),l.TgZ(17,"p-dropdown",9),l.NdJ("ngModelChange",function(e){return o.complejoSelected=e})("ngModelChange",function(){return o.onComplejoChange()}),l.qZA(),l.qZA(),l.TgZ(18,"div",3),l.TgZ(19,"label",10),l._uU(20,"Sala"),l.qZA(),l.TgZ(21,"p-dropdown",11),l.NdJ("ngModelChange",function(e){return o.funcion.sala=e})("ngModelChange",function(){return o.onSalaChange()}),l.qZA(),l.qZA(),l.YNc(22,I,13,13,"ng-container",12),l.qZA(),l.TgZ(23,"div",13),l.TgZ(24,"div",14),l.TgZ(25,"button",15),l.NdJ("click",function(){return o.previousState()}),l.qZA(),l.qZA(),l.TgZ(26,"div",14),l._UZ(27,"button",16),l.qZA(),l.qZA(),l.qZA(),l.qZA(),l._UZ(28,"p-toast")),2&e){const e=l.MAs(4);l.xp6(2),l.AsE("",o.isNew()?"Nueva":"Editar"," Funcion ",o.isNew()?"":"- "+o.currentNombre,""),l.xp6(7),l.Q6J("ngModel",o.generateNombre()),l.xp6(4),l.Q6J("options",o.peliculas)("ngModel",o.funcion.pelicula)("required",!0)("showClear",!0),l.xp6(4),l.Q6J("options",o.complejos)("ngModel",o.complejoSelected)("required",!0)("showClear",!0),l.xp6(4),l.Q6J("options",o.salas)("ngModel",o.funcion.sala)("required",!0)("showClear",!0),l.xp6(1),l.Q6J("ngIf",o.funcion.sala),l.xp6(5),l.Q6J("disabled",!e.valid)}},directives:[T._Y,T.JL,T.F,T.Fj,y.o,T.Q7,T.JJ,T.On,A.Lt,u.O5,w.Hq,a.FN,C.f],encapsulation:2}),e})(),N=(()=>{class e{constructor(e){this.activatedRoute=e}ngOnInit(){this.activatedRoute.data.subscribe(({funcion:e})=>this.funcion=e)}}return e.\u0275fac=function(o){return new(o||e)(l.Y36(n.gz))},e.\u0275cmp=l.Xpm({type:e,selectors:[["car-funcion-detail"]],decls:2,vars:0,template:function(e,o){1&e&&(l.TgZ(0,"div"),l._uU(1," funcion detail\n"),l.qZA())},encapsulation:2}),e})();var U=t(3157);function _(e,o){1&e&&(l.TgZ(0,"tr"),l.TgZ(1,"th",7),l._uU(2,"nombre "),l._UZ(3,"p-sortIcon",8),l.qZA(),l.TgZ(4,"th",9),l._uU(5,"Pelicula "),l._UZ(6,"p-sortIcon",10),l.qZA(),l.TgZ(7,"th",11),l._uU(8,"Sala "),l._UZ(9,"p-sortIcon",12),l.qZA(),l.TgZ(10,"th",13),l._uU(11,"Fecha "),l._UZ(12,"p-sortIcon",14),l.qZA(),l.TgZ(13,"th",15),l._uU(14,"Horario "),l._UZ(15,"p-sortIcon",16),l.qZA(),l.TgZ(16,"th",17),l._uU(17,"Operaciones"),l.qZA(),l.qZA())}function F(e,o){if(1&e){const e=l.EpF();l.ynx(0),l.TgZ(1,"button",20),l.NdJ("click",function(){l.CHM(e);const o=l.oxw().$implicit;return l.oxw().cancel(o.id)}),l._uU(2,"C"),l.qZA(),l.BQk()}}function x(e,o){if(1&e){const e=l.EpF();l.TgZ(0,"tr"),l.TgZ(1,"td"),l._uU(2),l.qZA(),l.TgZ(3,"td"),l._uU(4),l.qZA(),l.TgZ(5,"td"),l._uU(6),l.qZA(),l.TgZ(7,"td"),l._uU(8),l.qZA(),l.TgZ(9,"td"),l._uU(10),l.qZA(),l.TgZ(11,"td"),l.TgZ(12,"button",18),l.NdJ("click",function(){const o=l.CHM(e).$implicit;return l.oxw().delete(o.id)}),l.qZA(),l.YNc(13,F,3,0,"ng-container",19),l.qZA(),l.qZA()}if(2&e){const e=o.$implicit;l.xp6(2),l.Oqu(e.nombre),l.xp6(2),l.Oqu(e.pelicula.tituloOriginal),l.xp6(2),l.Oqu(e.sala.numero),l.xp6(2),l.Oqu(e.fechaInicio),l.xp6(2),l.Oqu(e.horaInicio),l.xp6(3),l.Q6J("ngIf",null==e.cancelada||null==e.cancelada||0==e.cancelada)}}const J=function(){return["/funcion/new"]};let j=(()=>{class e{constructor(e,o){this.funcionService=e,this.messageService=o,this.funciones=[]}ngOnInit(){this.funcionService.query().subscribe(e=>{this.funciones=e.body})}cancel(e){this.funcionService.cancel(this.funciones.find(o=>o.id==e)).subscribe(e=>{setTimeout(()=>{this.messageService.add({severity:"success",summary:"Todo Ok!",detail:"Funcion Cancelada"})},100)},e=>{setTimeout(()=>{this.messageService.add({severity:"error",summary:"ERROR",detail:"No es posible cancelar esta Funcion"})},100)},()=>{this.funcionService.query().subscribe(e=>{this.funciones=e.body})})}delete(e){this.funcionService.delete(e).subscribe(e=>{setTimeout(()=>{this.messageService.add({severity:"success",summary:"Todo Ok!",detail:"Funcion Eliminado"})},100)},e=>{setTimeout(()=>{this.messageService.add({severity:"error",summary:"ERROR",detail:"No es posible eliminar esta Funcion"})},100)},()=>{this.funcionService.query().subscribe(e=>{this.funciones=e.body})})}ngOnDestroy(){}}return e.\u0275fac=function(o){return new(o||e)(l.Y36(m.N),l.Y36(s.ez))},e.\u0275cmp=l.Xpm({type:e,selectors:[["car-funcion"]],features:[l._Bn([])],decls:8,vars:3,consts:[[1,"p-grid","p-jc-end"],[1,"p-col-1"],["pButton","","type","submit","label","Nuevo funcion",3,"routerLink"],[1,"p-col-12"],[3,"value"],["pTemplate","header"],["pTemplate","body"],["pSortableColumn","codigo"],["field","nombre"],["pSortableColumn","nombre"],["field","pelicula"],["pSortableColumn","sala"],["field","sala"],["pSortableColumn","fechaInicio"],["field","fechaInicio"],["pSortableColumn","horaInicio"],["field","horaInicio"],[2,"width","15%"],["pButton","","type","submit","icon","pi pi-times","title","Eliminar",1,"p-button-rounded","p-button-warning",3,"click"],[4,"ngIf"],["pButton","","type","submit","icon","pi","title","Cancelar",1,"p-button-rounded","p-button-danger",3,"click"]],template:function(e,o){1&e&&(l.TgZ(0,"div",0),l.TgZ(1,"div",1),l._UZ(2,"button",2),l.qZA(),l.qZA(),l.TgZ(3,"div",3),l.TgZ(4,"p-table",4),l.YNc(5,_,18,0,"ng-template",5),l.YNc(6,x,14,6,"ng-template",6),l.qZA(),l.qZA(),l._UZ(7,"p-toast")),2&e&&(l.xp6(2),l.Q6J("routerLink",l.DdM(2,J)),l.xp6(2),l.Q6J("value",o.funciones))},directives:[w.Hq,n.rH,U.iA,s.jx,a.FN,U.lQ,U.fz,u.O5],encapsulation:2}),e})(),O=(()=>{class e{constructor(e){this.funcionService=e}resolve(e){const o=e.params.id?e.params.id:null;return o?this.funcionService.find(o).pipe((0,p.U)(e=>e.body)):(0,h.of)(new f)}}return e.\u0275fac=function(o){return new(o||e)(l.LFG(m.N))},e.\u0275prov=l.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})();const Y=[{path:"",component:j},{path:":id/view",component:N,resolve:{funcion:O},data:{pageTitle:"Funcion"}},{path:":id/edit",component:M,resolve:{funcion:O},data:{pageTitle:"Funcion"}},{path:"new",component:M,resolve:{funcion:O},data:{pageTitle:"Funcion"}}];let k=(()=>{class e{}return e.\u0275fac=function(o){return new(o||e)},e.\u0275mod=l.oAB({type:e}),e.\u0275inj=l.cJS({imports:[[d,n.Bz.forChild(Y)]]}),e})()},9121:(e,o,t)=>{"use strict";t.d(o,{I:()=>a});var n=t(2353),i=t(8619),r=t(2693);let a=(()=>{class e{constructor(e){this.http=e,this.resourceUrl=n.B+"JavaTPI/pelicula"}create(e){return this.http.post(this.resourceUrl,e,{observe:"response"})}update(e){return this.http.put(`${this.resourceUrl}/${e.id}`,e,{observe:"response"})}find(e){return this.http.get(`${this.resourceUrl}/${e}`,{observe:"response"})}delete(e){return this.http.delete(`${this.resourceUrl}/${e}`,{observe:"response"})}query(){return this.http.get(this.resourceUrl,{params:{},observe:"response"})}}return e.\u0275fac=function(o){return new(o||e)(i.LFG(r.eN))},e.\u0275prov=i.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})()}}]);