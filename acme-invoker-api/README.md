# acme-invoker-api

Este proyecto representa un microservicio básico que sirve para invocar a un API externo configurable


Donde se puede plantear la llamada a un API externo (NO Securizado)

* [yesno.wtf](https://yesno.wtf/) : Genera aleatoriamente un SI / NO + una imagen

	* https://yesno.wtf/api
* [Advice Slip](https://api.adviceslip.com/)  : Genera aleatoriamente un consejo

	* https://api.adviceslip.com/advice : Consejo Aleatorio
	* https://api.adviceslip.com/advice/{id} : Consejo por ID
	* ...
	
* [its this for that](http://itsthisforthat.com/) : Ideas para una startup

	* http://itsthisforthat.com/api.php?json
	* ...
* [ponyapi.wtf](https://ponyweb.ml/) : API para mostrar contenido sobre la serie "Mi pequeño Pony"

	* https://ponyweb.ml/v1/character/{id} : Información sobre un personaje dado el ID o nombre
	* https://ponyweb.ml/v1/song/{id} : Información sobre una canción dado un ID
	* https://ponyweb.ml/v1/episode/all : Información sobre todos los episodios
	* ...
* ...



Este proyecto destaca por proporcionar :

* **Clases de Configuración** : Clases para configurar el proyecto (scanning package,Custom Properties...)
* **Clases de Constantes** : Clases con valores reutilizables para el proyecto
* **Clases de Trabajo** : Controller y Servicio
* **Fichero de propiedades con la configuración** (application.yml)
* **Fichero de propiedades de configuración del Log** (logback.yml)





## Stack Tecnológico

* Java 8
* [Maven 3](https://maven.apache.org/) - Gestor de dependencias
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring](https://spring.io)

Dependencias con proyectos de arquitectura

N/A

Dependencias de terceros 

* **spring-boot-starter-parent** [2.3.4.RELEASE] : Spring Boot + Spring Framework
* **spring-boot-starter-test** [Boot 2.3.4.RELEASE] : Starter del Framework de Spring para realizar testing
* **spring-boot-starter-web** [Boot 2.3.4.RELEASE] : Starter del Framework de Spring para dar soporte a la construcción de aplicaciones Web / RESTful mediante el uso de Spring MVC
* **spring-boot-devtools** [Boot 2.3.4.RELEASE] : Librería que facilita el desarrollo sobre Spring Boot

* **springfox-swagger2** [2.9.2] : Swagger
* **springfox-swagger-ui** [2.9.2] : Swagger UI
* **lombok** [1.18.12] : Herramienta para la generación automática de getters, setters, equals, hashCode , toString y más
* **archunit-junit5-engine** [0.14.1] : Framework Test de Arquitectura con integración con JUnit5





## Prerrequisitos

Define que elementos son necesarios para instalar el software

* Java 8 instalado (1.5+ version requerido)
* Maven instalado (3+)





## Instalación

Pasos a seguir

* Arrancar un terminal
* Localizar el PATH de instalación (el lugar donde esta el proyecto localizado)
* Verificar que el fichero "pom.xml" esta disponible

Ejecutar el siguiente comando

```bash
mvn clean install
```

El resultado será la generación de un artefacto en el repositorio Maven Local





## Testing

Este proyecto dispone de tests unitarios y test de arquitectura






## Deploy

Spring Boot

1. Ejecutar el siguiente comando

```bash
mvn package
```

2. Ejecutar el siguiente comando

```bash
java -jar target/acme-message-invoke-api-0.0.1-SNAPSHOT.jar
```





## Uso

El servicio aceptará peticiones GET HTTP como :

```bash
http://localhost:8091/invoke
```

Y retornará JSON

```bash
{"id":1,"content":"Hello, World!"}
```

Se puede usar "curl"





## Versionado

**Nota :** [SemVer](http://semver.org/) es usado para el versionado.





## Autores

* **Víctor Madrid**
