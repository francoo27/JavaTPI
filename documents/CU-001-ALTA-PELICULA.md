**Código y Nombre del CASO DE USO:** **CU-001-Alta-Película**

| Nivel  | Estructura | Alcance | Caja | Instanciación | Interacción |
|--------|------------|---------|-------|-----------------|--------------|
| Usuario | Sin Estructura | Sistema | Negra | Real | Semántico |

**Meta del CASO DE USO:** Crear Película

**ACTORES**

**Primario:** Usuario con permisos de administrador.

**Iniciador:** Usuario con permisos de administrador.

**Otros:** Ninguno.

**PRECONDICIONES (de negocio):** El usuario debe tener permisos de administrador para crear una película.

**PRECONDICIONES (de sistema):** El sistema debe estar funcionando correctamente.

**DISPARADOR:** El usuario decide crear una nueva película.

**FLUJO DE SUCESOS**

**CAMINO BÁSICO:**

1. El caso de uso comienza cuando el usuario selecciona la opción de crear una nueva película en la interfaz de administración.

2. El sistema muestra un formulario con los campos requeridos para ingresar los datos de la película:
   - Imagen de Portada (archivo de imagen)
   - Título Original (texto)
   - Título Argentina (texto)
   - Género (selección de lista desplegable)
   - Clasificación (selección de lista desplegable)
   - País de Origen (selección de lista desplegable)
   - Formatos Soportados (selección de lista desplegable)
   - Fecha de Estreno (campo de fecha)
   - Duración (Minutos) (campo numérico)
   - Sinopsis (campo de texto largo)

3. El usuario completa los campos del formulario con la información de la nueva película.

4. El usuario selecciona los formatos soportados para la película marcando las casillas correspondientes.

5. El usuario carga la imagen de portada de la película.

6. El usuario envía el formulario al sistema.

7. El sistema valida la información ingresada por el usuario, incluida la imagen de portada.

8. El sistema crea un registro en la tabla "pelicula" con los datos proporcionados por el usuario.

9. El sistema guarda la imagen de portada en una ubicación adecuada y vincula la ruta de la imagen al registro de la película en la base de datos.

10. El sistema muestra un mensaje de éxito indicando que la película ha sido creada correctamente.

**CAMINOS ALTERNATIVOS:**

- **Paso 7 (Validación fallida):** Si la información ingresada por el usuario no es válida (por ejemplo, campos vacíos o datos incorrectos), el sistema muestra un mensaje de error y devuelve al usuario al formulario para corregir los errores.

- **Paso 9 (Error en la carga de la imagen):** Si la carga de la imagen de portada falla por algún motivo, el sistema muestra un mensaje de error y devuelve al usuario al formulario para intentar nuevamente.

**POSTCONDICIONES (de sistema):**

**Éxito:** El sistema crea un nuevo registro en la tabla "pelicula" con los datos proporcionados por el usuario, incluyendo la ruta de la imagen de portada almacenada en el servidor.

**Éxito alternativo:** No aplica.

**Fracaso:** Si la validación de los datos falla o la carga de la imagen de portada no se realiza correctamente, el sistema no crea la película y muestra un mensaje de error al usuario. La película y la imagen no se agregan a la base de datos y al servidor, respectivamente.
