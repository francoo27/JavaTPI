(self.webpackChunkapp=self.webpackChunkapp||[]).push([[601],{7601:(e,t,r)=>{"use strict";r.r(t),r.d(t,{CineArGeneroModule:()=>k});var s=r(2322),o=r(3109),n=r(1968),i=r(1146),a=r(2290),c=r(2844),u=r(878),p=r(9996),d=r(8619),l=r(2905),g=r(1116),h=r(1462),v=r(9892),m=r(6726);let b=(()=>{class e{constructor(e,t,r,s){this.paisService=e,this.activatedRoute=t,this.messageService=r,this.location=s}ngOnInit(){this.isSaving=!1,this.activatedRoute.data.subscribe(({genero:e})=>{this.genero=e,this.currentNombre=e.nombre})}previousState(){this.location.back()}onSubmit(){console.log("asds")}save(){this.isSaving=!0,this.isNew()?this.subscribeToSaveResponse(this.paisService.create(this.genero)):this.subscribeToSaveResponse(this.paisService.update(this.genero))}subscribeToSaveResponse(e){e.subscribe(()=>this.onSaveSuccess(),()=>this.onSaveError())}isNew(){return void 0===this.genero.id}onSaveSuccess(){this.isSaving=!1,this.messageService.add({severity:"success",summary:"Ok!",detail:this.isNew()?"Genero creado":"Genero editado"}),this.previousState()}onSaveError(){this.messageService.add({severity:"error",summary:"Ok!",detail:this.isNew()?"Hubo un error al crear el Genero":"Hubo un error al editar el Genero"}),this.isSaving=!1}get genero(){return this._genero}set genero(e){this._genero=e}}return e.\u0275fac=function(t){return new(t||e)(d.Y36(l.w),d.Y36(s.gz),d.Y36(a.ez),d.Y36(g.Ye))},e.\u0275cmp=d.Xpm({type:e,selectors:[["car-genero-update"]],decls:13,vars:4,consts:[[3,"ngSubmit"],["dataform","ngForm"],[1,"p-fluid","p-formgrid","p-grid"],[1,"p-field","p-col-3","p-md-3"],["for","nombre"],["type","text","pInputText","","placeholder","Ej: Comedia","required","","name","nombre",1,"p-inputtext-sm",3,"ngModel","ngModelChange"],[1,""],["pButton","","type","button","label","Volver",1,"p-button-secondary",3,"click"],["pButton","","type","submit","label","Guardar",3,"disabled"]],template:function(e,t){if(1&e&&(d.TgZ(0,"div"),d.TgZ(1,"h2"),d._uU(2),d.qZA(),d.TgZ(3,"form",0,1),d.NdJ("ngSubmit",function(){return t.save()}),d.TgZ(5,"div",2),d.TgZ(6,"div",3),d.TgZ(7,"label",4),d._uU(8,"Nombre"),d.qZA(),d.TgZ(9,"input",5),d.NdJ("ngModelChange",function(e){return t.genero.nombre=e}),d.qZA(),d.qZA(),d.qZA(),d.TgZ(10,"div",6),d.TgZ(11,"button",7),d.NdJ("click",function(){return t.previousState()}),d.qZA(),d._UZ(12,"button",8),d.qZA(),d.qZA(),d.qZA()),2&e){const e=d.MAs(4);d.xp6(2),d.AsE("",t.isNew()?"Nuevo":"Editar"," Genero ",t.isNew()?"":" - "+t.currentNombre,""),d.xp6(7),d.Q6J("ngModel",t.genero.nombre),d.xp6(3),d.Q6J("disabled",!e.valid)}},directives:[h._Y,h.JL,h.F,h.Fj,v.o,h.Q7,h.JJ,h.On,m.Hq],encapsulation:2}),e})();class Z{constructor(e,t){this.id=e,this.nombre=t}}var f=r(3157);function S(e,t){1&e&&(d.TgZ(0,"tr"),d.TgZ(1,"th",7),d._uU(2,"Nombre "),d._UZ(3,"p-sortIcon",8),d.qZA(),d.TgZ(4,"th",9),d._uU(5,"Operaciones"),d.qZA(),d.qZA())}const T=function(e){return[e]};function q(e,t){if(1&e){const e=d.EpF();d.TgZ(0,"tr"),d.TgZ(1,"td"),d._uU(2),d.qZA(),d.TgZ(3,"td"),d._UZ(4,"button",10),d.TgZ(5,"button",11),d.NdJ("click",function(){const t=d.CHM(e).$implicit;return d.oxw().delete(t.id)}),d.qZA(),d.qZA(),d.qZA()}if(2&e){const e=t.$implicit;d.xp6(2),d.Oqu(e.nombre),d.xp6(2),d.Q6J("routerLink",d.VKq(2,T,"/genero/"+e.id+"/edit"))}}const y=function(){return["/genero/new"]};let A=(()=>{class e{constructor(e,t){this.generoService=e,this.messageService=t,this.generos=[]}ngOnInit(){this.generoService.query().subscribe(e=>{this.generos=e.body})}delete(e){this.generoService.delete(e).subscribe(e=>{setTimeout(()=>{this.messageService.add({severity:"success",summary:"Todo Ok!",detail:"Genero Eliminado"})},100)},e=>{setTimeout(()=>{this.messageService.add({severity:"error",summary:"ERROR",detail:e.error.message})},100)},()=>{this.generoService.query().subscribe(e=>{this.generos=e.body})})}ngOnDestroy(){}}return e.\u0275fac=function(t){return new(t||e)(d.Y36(l.w),d.Y36(a.ez))},e.\u0275cmp=d.Xpm({type:e,selectors:[["car-genero"]],features:[d._Bn([])],decls:8,vars:3,consts:[[1,"p-grid","p-jc-end"],[1,"p-col-1"],["pButton","","type","submit","label","Nuevo Genero",3,"routerLink"],[1,"p-col-12"],[3,"value"],["pTemplate","header"],["pTemplate","body"],["pSortableColumn","nombre"],["field","nombre"],[2,"width","15%"],["pButton","","type","submit","icon","pi pi-pencil","title","Editar",1,"p-button-rounded",3,"routerLink"],["pButton","","type","submit","icon","pi pi-times","title","Eliminar",1,"p-button-rounded","p-button-danger",3,"click"]],template:function(e,t){1&e&&(d.TgZ(0,"div",0),d.TgZ(1,"div",1),d._UZ(2,"button",2),d.qZA(),d.qZA(),d.TgZ(3,"div",3),d.TgZ(4,"p-table",4),d.YNc(5,S,6,0,"ng-template",5),d.YNc(6,q,6,4,"ng-template",6),d.qZA(),d.qZA(),d._UZ(7,"p-toast")),2&e&&(d.xp6(2),d.Q6J("routerLink",d.DdM(2,y)),d.xp6(2),d.Q6J("value",t.generos))},directives:[m.Hq,s.rH,f.iA,a.jx,i.FN,f.lQ,f.fz],encapsulation:2}),e})(),w=(()=>{class e{constructor(e){this.generoService=e}resolve(e){const t=e.params.id?e.params.id:null;return t?this.generoService.find(t).pipe((0,p.U)(e=>e.body)):(0,u.of)(new Z)}}return e.\u0275fac=function(t){return new(t||e)(d.LFG(l.w))},e.\u0275prov=d.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})();const N=[{path:"",component:A},{path:":id/edit",component:b,resolve:{genero:w},data:{pageTitle:"Genero"}},{path:"new",component:b,resolve:{genero:w},data:{pageTitle:"Genero"}}];let k=(()=>{class e{}return e.\u0275fac=function(t){return new(t||e)},e.\u0275mod=d.oAB({type:e}),e.\u0275inj=d.cJS({providers:[a.ez],imports:[[s.Bz.forChild(N),o.XH,n.ON,i.EV,c.M]]}),e})()},2905:(e,t,r)=>{"use strict";r.d(t,{w:()=>i});var s=r(2353),o=r(8619),n=r(2693);let i=(()=>{class e{constructor(e){this.http=e,this.resourceUrl=s.B+"JavaTPI/genero"}query(){return this.http.get(this.resourceUrl,{params:{},observe:"response"})}create(e){return this.http.post(this.resourceUrl,e,{observe:"response"})}update(e){return this.http.put(`${this.resourceUrl}/${e.id}`,e,{observe:"response"})}find(e){return this.http.get(`${this.resourceUrl}/${e}`,{observe:"response"})}delete(e){return this.http.delete(`${this.resourceUrl}/${e}`,{observe:"response"})}}return e.\u0275fac=function(t){return new(t||e)(o.LFG(n.eN))},e.\u0275prov=o.Yz7({token:e,factory:e.\u0275fac,providedIn:"root"}),e})()}}]);