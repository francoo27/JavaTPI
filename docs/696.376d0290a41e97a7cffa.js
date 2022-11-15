(self.webpackChunkapp=self.webpackChunkapp||[]).push([[696],{1696:(e,o,t)=>{"use strict";t.r(o),t.d(o,{CineArFormatoModule:()=>M});var r=t(2322),i=t(3109),s=t(1968),n=t(1146),a=t(2290),c=t(2844),u=t(878),d=t(9996),l=t(8619),m=t(5155),p=t(1116),h=t(4015),g=t(3688),f=t(1462),b=t(9892),v=t(4568),Z=t(6726);let y=(()=>{class e{constructor(e,o,t,r,i,s){this.formatoService=e,this.activatedRoute=o,this.messageService=t,this.location=r,this.audioService=i,this.tecnologiaProyeccionService=s,this.audios=[],this.tecnologiasProyeccion=[]}ngOnInit(){this.isSaving=!1,this.activatedRoute.data.subscribe(({formato:e})=>{this.formato=e,this.currentNombre=e.nombre}),this.audioService.query().subscribe(e=>{this.audios=e.body}),this.tecnologiaProyeccionService.query().subscribe(e=>{this.tecnologiasProyeccion=e.body})}previousState(){this.location.back()}changeNombre(){this.formato.nombre=null==this.formato.audio||null==this.formato.tecnologiaProyeccion?"":this.formato.tecnologiaProyeccion.nombre+" "+this.formato.audio.nombre}save(){this.isSaving=!0,this.isNew()?this.subscribeToSaveResponse(this.formatoService.create(this.formato)):this.subscribeToSaveResponse(this.formatoService.update(this.formato))}subscribeToSaveResponse(e){e.subscribe(()=>this.onSaveSuccess(),e=>this.onSaveError(e.error))}isNew(){return void 0===this.formato.id}onSaveSuccess(){this.isSaving=!1,this.messageService.add({severity:"success",summary:"Ok!",detail:this.isNew()?"Formato creado":"Formato editado"}),this.previousState()}onSaveError(e){this.messageService.add({severity:"error",summary:"ERROR",detail:this.isNew()?"Hubo un error al crear el Formato\n "+e.message:"Hubo un error al editar el Formato "+e.message}),this.isSaving=!1}get formato(){return this._formato}set formato(e){this._formato=e}}return e.\u0275fac=function(o){return new(o||e)(l.Y36(m.y),l.Y36(r.gz),l.Y36(a.ez),l.Y36(p.Ye),l.Y36(h.Q),l.Y36(g.o))},e.\u0275cmp=l.Xpm({type:e,selectors:[["car-formato-update"]],decls:22,vars:12,consts:[[3,"ngSubmit"],["dataform","ngForm"],[1,"p-fluid","p-formgrid","p-grid"],[1,"p-field","p-col-3","p-md-3"],["for","nombre"],["type","text","pInputText","","placeholder","NOMBRE GENERADO","disabled","","name","nombre",1,"p-inputtext-sm",3,"ngModel"],["for","clasificacion"],["optionLabel","nombre","name","clasificacion","placeholder","Seleccione una Tecnologia de Proyeccion",3,"options","ngModel","required","showClear","ngModelChange"],["for","genero"],["optionLabel","nombre","name","formato","placeholder","Seleccione un Audio",3,"options","ngModel","required","showClear","ngModelChange"],[1,""],["pButton","","type","button","label","Volver",1,"p-button-secondary",3,"click"],["pButton","","type","submit","label","Guardar",3,"disabled"]],template:function(e,o){if(1&e&&(l.TgZ(0,"div"),l.TgZ(1,"h2"),l._uU(2),l.qZA(),l.TgZ(3,"form",0,1),l.NdJ("ngSubmit",function(){return o.save()}),l.TgZ(5,"div",2),l.TgZ(6,"div",3),l.TgZ(7,"label",4),l._uU(8,"Nombre"),l.qZA(),l._UZ(9,"input",5),l.qZA(),l.TgZ(10,"div",3),l.TgZ(11,"label",6),l._uU(12,"Clasificacion"),l.qZA(),l.TgZ(13,"p-dropdown",7),l.NdJ("ngModelChange",function(e){return o.formato.tecnologiaProyeccion=e})("ngModelChange",function(){return o.changeNombre()}),l.qZA(),l.qZA(),l.TgZ(14,"div",3),l.TgZ(15,"label",8),l._uU(16,"Genero"),l.qZA(),l.TgZ(17,"p-dropdown",9),l.NdJ("ngModelChange",function(e){return o.formato.audio=e})("ngModelChange",function(){return o.changeNombre()}),l.qZA(),l.qZA(),l.qZA(),l.TgZ(18,"div",10),l.TgZ(19,"button",11),l.NdJ("click",function(){return o.previousState()}),l.qZA(),l._UZ(20,"button",12),l.qZA(),l.qZA(),l.qZA(),l._UZ(21,"p-toast")),2&e){const e=l.MAs(4);l.xp6(2),l.AsE("",o.isNew()?"Nuevo":"Editar"," Formato ",o.isNew()?"":" - "+o.currentNombre,""),l.xp6(7),l.Q6J("ngModel",o.formato.nombre),l.xp6(4),l.Q6J("options",o.tecnologiasProyeccion)("ngModel",o.formato.tecnologiaProyeccion)("required",!0)("showClear",!0),l.xp6(4),l.Q6J("options",o.audios)("ngModel",o.formato.audio)("required",!0)("showClear",!0),l.xp6(3),l.Q6J("disabled",!e.valid)}},directives:[f._Y,f.JL,f.F,f.Fj,b.o,f.JJ,f.On,v.Lt,f.Q7,Z.Hq,n.FN],encapsulation:2}),e})();class S{constructor(e,o,t,r){this.id=e,this.nombre=o,this.tecnologiaProyeccion=t,this.audio=r}}var T=t(3157);function q(e,o){1&e&&(l.TgZ(0,"tr"),l.TgZ(1,"th",7),l._uU(2,"Nombre "),l._UZ(3,"p-sortIcon",8),l.qZA(),l.TgZ(4,"th",9),l._uU(5,"Operaciones"),l.qZA(),l.qZA())}function A(e,o){if(1&e){const e=l.EpF();l.TgZ(0,"tr"),l.TgZ(1,"td"),l._uU(2),l.qZA(),l.TgZ(3,"td"),l.TgZ(4,"button",10),l.NdJ("click",function(){const o=l.CHM(e).$implicit;return l.oxw().delete(o.id)}),l.qZA(),l.qZA(),l.qZA()}if(2&e){const e=o.$implicit;l.xp6(2),l.Oqu(e.nombre)}}const N=function(){return["/formato/new"]};let w=(()=>{class e{constructor(e,o){this.formatoService=e,this.messageService=o,this.formatos=[]}ngOnInit(){this.formatoService.query().subscribe(e=>{this.formatos=e.body})}delete(e){this.formatoService.delete(e).subscribe(e=>{setTimeout(()=>{this.messageService.add({severity:"success",summary:"Todo Ok!",detail:"Formato Eliminado"})},100)},e=>{setTimeout(()=>{this.messageService.add({severity:"error",summary:"ERROR",detail:e.error.message})},100)},()=>{this.formatoService.query().subscribe(e=>{this.formatos=e.body})})}ngOnDestroy(){}}return e.\u0275fac=function(o){return new(o||e)(l.Y36(m.y),l.Y36(a.ez))},e.\u0275cmp=l.Xpm({type:e,selectors:[["car-formato"]],features:[l._Bn([])],decls:8,vars:3,consts:[[1,"p-grid","p-jc-end"],[1,"p-col-1"],["pButton","","type","submit","label","Nuevo Formato",3,"routerLink"],[1,"p-col-12"],[3,"value"],["pTemplate","header"],["pTemplate","body"],["pSortableColumn","nombre"],["field","nombre"],[2,"width","15%"],["pButton","","type","submit","icon","pi pi-times","title","Eliminar",1,"p-button-rounded","p-button-danger",3,"click"]],template:function(e,o){1&e&&(l.TgZ(0,"div",0),l.TgZ(1,"div",1),l._UZ(2,"button",2),l.qZA(),l.qZA(),l.TgZ(3,"div",3),l.TgZ(4,"p-table",4),l.YNc(5,q,6,0,"ng-template",5),l.YNc(6,A,5,1,"ng-template",6),l.qZA(),l.qZA(),l._UZ(7,"p-toast")),2&e&&(l.xp6(2),l.Q6J("routerLink",l.DdM(2,N)),l.xp6(2),l.Q6J("value",o.formatos))},directives:[Z.Hq,r.rH,T.iA,a.jx,n.FN,T.lQ,T.fz],encapsulation:2}),e})(),U=(()=>{class e{constructor(e){this.formatoService=e}resolve(e){const o=e.params.id?e.params.id:null;return o?this.formatoService.find(o).pipe((0,d.U)(e=>e.body)):(0,u.of)(new S)}}return e.\u0275fac=function(o){return new(o||e)(l.LFG(m.y))},e.\u0275prov=l.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})();const F=[{path:"",component:w},{path:":id/edit",component:y,resolve:{formato:U},data:{pageTitle:"Formato"}},{path:"new",component:y,resolve:{formato:U},data:{pageTitle:"Formato"}}];let M=(()=>{class e{}return e.\u0275fac=function(o){return new(o||e)},e.\u0275mod=l.oAB({type:e}),e.\u0275inj=l.cJS({providers:[a.ez],imports:[[r.Bz.forChild(F),i.XH,s.ON,n.EV,c.M]]}),e})()},5155:(e,o,t)=>{"use strict";t.d(o,{y:()=>n});var r=t(2353),i=t(8619),s=t(2693);let n=(()=>{class e{constructor(e){this.http=e,this.resourceUrl=r.B+"JavaTPI/formato"}query(){return this.http.get(this.resourceUrl,{params:{},observe:"response"})}create(e){return this.http.post(this.resourceUrl,e,{observe:"response"})}update(e){return this.http.put(`${this.resourceUrl}/${e.id}`,e,{observe:"response"})}find(e){return this.http.get(`${this.resourceUrl}/${e}`,{observe:"response"})}delete(e){return this.http.delete(`${this.resourceUrl}/${e}`,{observe:"response"})}}return e.\u0275fac=function(o){return new(o||e)(i.LFG(s.eN))},e.\u0275prov=i.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})()}}]);