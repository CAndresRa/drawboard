# ARSW-SextoLaboratorio Drawboard
### Autor: Carlos Andrés Ramírez Torres
### Fecha: Miercoles, 24 de Junio del 2020
##### LOC/h: 2019/16 = 126.18 LOC/h

## DrawBoard

Consiste en una aplicacion web que permite a multiples usuarios participar en un tablero en el cual pueden dibujar.

* **Sesion**: Las sesiones asignan un color aleatorio al usuario que esta participando en el tablero
* **Reinciar**: La apliacion cuenta con una accion de reiniciar, la cual borra todo el tablero en todas las sesiones.
* **Registrarse**: Es la forma de adquirir una sesion propia la cual dara un color aleatorio.


## Link de heroku para dibujar.

[https://drawboardarsw.herokuapp.com/](https://drawboardarsw.herokuapp.com/)

## Uso 

Para el desarrollo del proyecto se utilizo

* **Maven** como una herramienta para la construccion y gestion del mismo.
* **Java** el codigo fue desarrollado con el lenguaje de programación.
* **Spring** framework utilizado.
* **Desarrollo web**: React y Js.
* **P5Js**: Libreria que facilita el desarrollo del producto, otorgando metodos para la implementacion de objetos (figuras) que son utilizados en el proyecto. 

Utilizar `mvn package` para la generacion del fichero .jar con los .class compilados.

![Texto alternativo](https://github.com/CAndresRa/drawboard/blob/master/imgReadme/mvn%20package.png)

Una vez realizado el `mvn package` el codigo estara listo para ser utilizado bajo la siguiente estructura.

Debido a que es un proyecto que utiliza como framework **Spring**, la manera de ejecutarlo en conjunto a **Maven** es mediante el siguiente comando en terminal.
 
`mvn spring-boot:run`

por ejemplo y dando como resultado:

![Texto alternativo](https://github.com/CAndresRa/drawboard/blob/master/imgReadme/mvn%20spring.png)

## Diagrama

* Aplicación 

![Texto alternativo](https://github.com/CAndresRa/drawboard/blob/master/imgReadme/Diagrama.png)

El diariama anteriormente expuesto muestra que existe una clase llamada **WebSiteController** que ademas de ser el controlador encargado de inicializar los componentes del framework **Spring** sera el controlador de las solicitudes que lleguen al servidor, mediante la libreria **P5Js** encontramos metodos que permiten crear eventos que generen llamados al servidor, el cual tendra como objetivo principal, generar las **sesiones** correspondientes con ayuda de un **Singleton** que se encuentra en la clase **SharedMemory** el cual guardara estructuras de datos con la informacion presente en el sitio web, el diseño dispone de dos entidades **User** y **Color** los cuales seran utilizados para obetener informacion de ellos para agregar requerimientos de distincion de sesiones.

## Muestra del proyecto 

![Texto alternativo](https://github.com/CAndresRa/drawboard/blob/master/imgReadme/Prototype.png)








