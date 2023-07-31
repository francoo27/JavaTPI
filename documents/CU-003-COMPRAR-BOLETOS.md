**Código y Nombre del CASO DE USO:** **CU-003-Compra-de-boletos**

| Nivel  | Estructura | Alcance | Caja | Instanciación | Interacción |
|--------|------------|---------|------|---------------|-------------|
| Usuario | Sin Estructura | Sistema | Negra | Real | Semántico |

**Meta del CASO DE USO:** Permitir al usuario comprar boletos para una película específica en la vista de boletería.

**ACTORES**

**Primario:** Usuario

**Iniciador:** Usuario

**Otros:** (vacío)

**PRECONDICIONES (de negocio):** El sistema debe tener películas y funciones disponibles.

**PRECONDICIONES (de sistema):** El usuario debe tener acceso a la vista de boletería.

**DISPARADOR:** El usuario desea comprar boletos para una película en la vista de boletería.

**FLUJO DE SUCESOS**

**CAMINO BÁSICO:**

1. El sistema muestra la lista de películas disponibles en la vista de boletería.
2. El usuario selecciona una película de la lista.
3. El sistema muestra los formatos disponibles para la película seleccionada.
4. El usuario selecciona un formato.
5. El sistema muestra las funciones disponibles para el formato y la película seleccionada.
6. El usuario selecciona una función.
7. El sistema muestra la cantidad de asientos disponibles para la función seleccionada, ordenados por precio.
8. El usuario selecciona la cantidad de asientos que desea comprar.
   - Si la cantidad seleccionada es mayor a la disponibilidad de asientos:
     - El sistema muestra una alerta indicando la disponibilidad máxima de asientos y solicita al usuario que ingrese una cantidad menor.
     - El flujo vuelve al paso 8.
9. El sistema muestra el mapa de asientos del teatro para la función seleccionada.
10. El usuario selecciona los asientos deseados en el mapa.
11. El sistema muestra un resumen de la selección de boletos.
12. El usuario confirma la selección.
13. El sistema solicita al usuario que ingrese su dirección de correo electrónico y los datos de su tarjeta de crédito.
14. El usuario ingresa su dirección de correo electrónico y los datos de su tarjeta de crédito.
15. El sistema verifica los datos ingresados por el usuario.
16. El sistema confirma la compra y muestra un mensaje de éxito al usuario.

**CAMINOS ALTERNATIVOS:**

4a. El usuario decide cancelar la compra.
   - El sistema cancela la compra y vuelve a la lista de películas disponibles.

15a. Los datos de la tarjeta de crédito ingresados son inválidos.
   - El sistema muestra un mensaje de error y solicita al usuario que ingrese los datos nuevamente.
   - El flujo continúa desde el paso 13.

**POSTCONDICIONES (de sistema):**

**Éxito:** La compra se realiza correctamente y se muestra un mensaje de éxito al usuario.

**Éxito alternativo:** (vacío)

**Fracaso:** El usuario cancela la compra o los datos de la tarjeta de crédito ingresados son inválidos.
