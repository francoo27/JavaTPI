**Código y Nombre del CASO  DE  USO:** 

| Nivel  | Estructura | Alcance|Caja|Instanciacion| Interaccion|
|:------- |:-------|:-----|:-----|:-----|:-----|
| Resumen    | Estructurado | Sistema |Negra |Real |Semantico|

**Meta del CASO  DE  USO:** --

**ACTORES** 

**Primario:** Usuario con permisos de administrador, Usuario.

**Iniciador:** Usuario con permisos de administrador.

**Otros:** <vacío>

**PRECONDICIONES (de negocio):** --

**PRECONDICIONES (de sistema):** 
El sistema debe tener
- Audios
- Tecnologias de proyeccion
- Formatos
- Clasificacion
- Complejos
- Salas
- Asientos asignados a salas
Disponibles.

**DISPARADOR:** Usuario con permisos de administrador quiere dar de alta una nueva funcion de una pelicula estreno

**FLUJO DE SUCESOS**

**CAMINO BÁSICO:**

1. CU-001-Alta-Película
2. CU-002-Alta-Función
3. CU-003-Compra-de-boletos

**CAMINOS ALTERNATIVOS:**

**POSTCONDICIONES (de sistema):**

**Éxito:** La compra de usuario se realiza correctamente y se muestra un mensaje de éxito al usuario.

**Éxito alternativo:** Se genera una nueva funcion para una pelicula seleccionada.

**Fracaso:** --
