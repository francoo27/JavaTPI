**Código y Nombre del CASO DE USO:**

| Nivel  | Estructura | Alcance | Caja | Instanciación | Interacción |
|--------|------------|---------|-------|-----------------|--------------|
| Resumen | Estructurado | Sistema | Negra | Real | Semántico |

**CU-002-Alta-Función**

**Meta del CASO DE USO:** Alta de Función

**ACTORES**

**Primario:** Usuario con permisos de administrador.

**Iniciador:** Usuario con permisos de administrador.

**Otros:** Ninguno.

**PRECONDICIONES (de negocio):** 
- Deben existir películas cargadas en el sistema.
- Deben existir complejos cargados en el sistema.
- Deben existir salas cargadas en el sistema.
- Deben existir formatos cargados en el sistema.

**PRECONDICIONES (de sistema):** El sistema debe estar funcionando correctamente.

**DISPARADOR:** El usuario decide dar de alta una nueva función para una película.

**FLUJO DE SUCESOS**

**CAMINO BÁSICO:**

1. El caso de uso comienza cuando el usuario selecciona la opción de dar de alta una nueva función en la interfaz de administración.

2. El sistema muestra un formulario con los campos requeridos para ingresar los datos de la función:
   - Película (selección de lista desplegable)
   - Complejo (selección de lista desplegable)
   - Sala (selección de lista desplegable)

3. El usuario selecciona una película de la lista desplegable.

4. El usuario selecciona un complejo de la lista desplegable.

5. El usuario selecciona una sala de la lista desplegable.

6. Cuando el usuario selecciona una película, complejo y sala, se habilitan los siguientes campos:
   - Fecha de la Función (campo de fecha)
   - Hora de Inicio (campo de hora)
   - Formato (selección de lista desplegable)

7. El usuario ingresa la fecha de la función.

8. El usuario ingresa la hora de inicio de la función.

9. El usuario selecciona un formato de la lista desplegable.

10. El usuario envía el formulario al sistema.

11. El sistema valida la información ingresada por el usuario.

12. El sistema crea un registro en la tabla "funcion" con los datos proporcionados por el usuario.

13. El sistema genera el nombre de la función concatenando los siguientes campos:
    - Nombre de la película (título original y título en Argentina)
    - Nombre del formato
    - Número de sala (si se seleccionó una sala)
    - Fecha de la función (si se ingresó una fecha)
    - Hora de inicio de la función (si se ingresó una hora)
    - Nombre del complejo (si se seleccionó un complejo)

14. El sistema muestra un mensaje de éxito indicando que la función ha sido dada de alta correctamente.

**CAMINOS ALTERNATIVOS:**

- **Paso 11 (Validación fallida):** Si la información ingresada por el usuario no es válida (por ejemplo, campos vacíos o datos incorrectos), el sistema muestra un mensaje de error y devuelve al usuario al formulario para corregir los errores.

**POSTCONDICIONES (de sistema):**

**Éxito:** 
- El sistema crea un nuevo registro en la tabla "funcion" con los datos proporcionados por el usuario.
- El sistema genera y guarda el nombre de la función.

**Éxito alternativo:** No aplica.

**Fracaso:** Si la validación de los datos falla, el sistema no crea la función y muestra un mensaje de error al usuario. La función no se agrega a la base de datos.
