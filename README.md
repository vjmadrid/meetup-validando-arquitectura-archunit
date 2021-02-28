# meetup-validando-arquitectura-archunit

Este repositorio se encarga de servir como una estructura de recursos utilizados para el meetup relacionados con el uso de **ArchUnit** y basado en la serie de artículos “Validanto una Arquitectura con ArchUnit” 

* [Validando una Arquitectura con ArchUnit (Parte 1)](https://enmilocalfunciona.io/validando-arquitectura-archunit/) :  Artículo de introducción a Arquitecturas y a los problemas típicos que trataremos de solucionar
* [Validando una Arquitectura con ArchUnit (Parte 2)](https://enmilocalfunciona.io/validando-una-arquitectura-con-archunit-parte-2/)  :  Artículo donde se enseña a utilizar el framework / herramienta ArchUnit
* [Validando una Arquitectura con ArchUnit (Parte 3)](https://enmilocalfunciona.io/validando-una-arquitectura-con-archunit-parte-3/) :  Artículo de aplicación de lo anterior sobre un ejemplo “real” y avanzado basado en Spring / Spring Boot
* [Integrando ArchUnit  con SonarQube](https://enmilocalfunciona.io/integrando-archunit-con-sonarqube/) :  Artículo sobre como identificar con SonarQube este tipo testing y que aspectos hay que tener en cuenta

> IMPORTANTE
>
> Se requiere leer el artículo **Validando una Arquitectura con ArchUnit (Parte 2)** aunque se revisarán muchos de sus puntos durante el meetup
>
> Se require montar un workspace con los 3 proyectos incluidos en el repositorio y tenerlos importados



## Stack Tecnológico General

* Java 8
* [Maven 3](https://maven.apache.org/) - Gestor de dependencias
* [ArchUnit](https://www.archunit.org/) - Framework de Testing de Arquitectura

Dependencias con Proyectos de Arquitectura

N/A

Dependecias con Terceros

N/A

**Importante:** Cada recurso definido establecerá las necesidades y las tecnologías definidas en su propio fichero de README





## Prerrequisitos

Define que elementos son necesarios para instalar el software

* Java 8 instalado (1.5+ version requerido)
* Maven 3 instalado





## Uso


Se encuentra organizado en áreas :

* **acme-architecture-testing** : Librería de arquitectura para testing de proyectos enfocada principalmente en el soporte de Archunit con contexto de propósito general
* **acme-architecture-spring-testing** : Librería de arquitectura para testing de proyectos enfocada principalmente en el soporte de Archunit con contexto de propósito general para el Framework de Spring / Spring Boot
* **acme-invoker-api** : Aplicación que define un API REST "básico" y "avanzado" sobre como invocar a otro API de terceros. Será utilizado como base para la explicación del Meetup






 ## Autor

* **Víctor Madrid**
