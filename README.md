# JavaTPI
Repositorio de el proyecto de la materia JAVA 
# Documento de análisis inicial
> Participantes: <br>
Gerente Comercial Sede CineAr Rosario <br>
Analistas de Sistemas : **Franco Pinacca**

## **Introducción**
Los complejos de la empresa CineAr se encuentran en distintas ciudades (Buenos Aires, Córdoba, Rosario, etc.). <br>
Se pretende especificar los requerimientos del sistema de venta de entradas, que se podrá realizar desde la WEB. Dado el contexto
internacional de pandemia y en vista de la necesidad de procesos sin interacción humana , no existirán boleterías para atención al público.
Un usuario será capaz de seleccionar una película , tecnología y función a la que quiera asistir. <br>
Después de completar la compra, el sistema automáticamente le enviará un email de confirmación a la dirección de correo electrónico que se
proporcionó durante el proceso de compra. En el mail se adjuntará el código de confirmación para retirar las entradas en las boleterías
automáticas. <br>
Cuando el cliente ingrese a la sala deberá presentar las entradas para la película que verá.



## **Reglas de negocio**
### **Respecto de películas**
De una película se conoce: el título en argentina, el título original, clasificación (ATP, SAM13, SAM16, SAM18), sinopsis (un breve texto
descriptivo), los intérpretes (foto y nombre y apellido), director/es (foto, nombre y apellido), el género (comedia, drama, etc.), la duración (en
minutos), fecha de estreno, país y un video del tráiler (o avance). Una película puede venir en distintas tecnologías de proyección (2D, 3D, etc.).
El audio de una película puede ser en castellano o en idioma original con subtítulos. Las funciones de una película pueden tener distintos
formatos. El formato es una combinación de tecnología de proyección y audio (2D castellano, 2D subtitulada, etc.).
### **Respecto de una sala**
En un complejo hay varias salas, por ejemplo en CineAr ROSARIO hay 6 salas. Para cada complejo las salas están identificadas con un número.
Una sala tiene varias filas de asientos. Cada fila estará identificada con una letra. Cada asiento estará identificado por una letra (de la fila a la que
pertenece) y un número. Cada sala puede tener diferentes configuraciones de columnas y filas, por lo tanto, no todas tienen la misma cantidad de
asientos. En el caso de nuestro sistema, en orden de reducir el alcance del mismo, se acordó que todas las salas tendrán la misma
configuración.
### **Estados de un asiento en un evento de Función**
_Libre_: Estado inicial de todos los asientos cuando una función en una sala es creada.
_Ocupado_: Estado final de el asiento en el evento de una función , un asiento es _OCUPADO_ una vez que la transacción de compra es concretada y
queda en estado Finalizada. Puede volver a _Libre_ si la compra es cancelada.
Un asiento para una función podrá estar libre u ocupado. Los asientos libres se identificarán con color blanco o azul (en caso de lugar adaptado
para sillas de rueda). Los asientos ocupados se identificarán en color gris.
### **Respecto de tipos de precio**
Los precios dependen de cada complejo, de la tecnología de proyección y del tipo de entrada. Los beneficios 2x1 no aplican sobre entradas de
precio reducido o con descuento en ningún caso, aplican sobre el precio vigente de la entrada general.
### **Respecto de funciones**
El gerente comercial de un complejo define para cada película, que día (lunes, martes, etc.), en cuantas salas y en qué horarios se proyectarán las películas.
Para cada función se definirá la sala donde se exhibirá la película, la fecha y la hora de la función. En una función se proyectará una película en un formato (2D
castellano, 2D subtitulada, etc.).

### **Detalles de los tickets (entradas)**
El ticket deberá contener la siguiente información
* Nombre Pelicula
* Identificacion sala
* Identificación asiento (Fila y número)
* Número de función
* Fecha
* Hora de comienzo de película
* Precio
* Código QR identificador para ser escaneado
* Fecha y hora de venta
### **Respecto de forma de pago**
El único medio de pago es con tarjeta de crédito. Los tipos de tarjetas permitidos son: Visa, American Express, MasterCard,Mercadopago
Se ingresará el número de tarjeta de crédito, el año y mes de vencimiento de la tarjeta y el código de seguridad o CSC (El año y mes de vencimiento de la
tarjeta, y el código de seguridad no se deben guardar para cumplir con normas de seguridad).
### **Respecto de la devolución de entradas**
La devolución de las entradas está fuera del alcance de este sistema.
### **Respecto a usuarios del sistema**
A un usuario del sistema se le identificará por su email. Para la registración de los usuarios en el sistema, se deberá ingresar nombre, apellido, fecha de
nacimiento, género (Masculino / Femenino), email y contraseña.