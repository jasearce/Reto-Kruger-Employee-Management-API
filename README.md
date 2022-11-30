# Reto Kruger - Inventario de vacunación de empleados

Kruger Corporation requiere una aplicación para llevar un registro del inventario del estado de
vacunación de los empleados

## Tecnologías Utilizadas

* Java 8
* Maven
* PostGreSQL 14.6
* Spring Boot 2.7.6
* JPA
* Hibernate
* Eclipse IDE

## Base de datos
Se creó una instancia del servicio SQL de manera local con PostgreSQL en su versión 14.6

### Acceso y credenciales
El acceso a la base de datos local se la realizó a través del daemon de PostgreSQL para Windows con las siguientes credenciales:
* User: posgres
* Pass: myPass123


## Uso de Spring Boot
Spring Boot es un framework Java, construido sobre Spring, que se utiliza para desarrollar aplicaciones web.
Spring Boot es una gran opción para que los desarrolladores construyan sus aplicaciones, ya que proporciona código boilerplate con todas las configuraciones necesarias para comenzar con la codificación de inmediato.

Para este desarrollo se utilizaron 6 módulos que son:
* Model
* Repository
* Service
* Controller
* Exception

Dentro de estos paquetes se encuentran las clases desarrolladas para establecer conexión con la base de datos y realizar operaciones CRUD (Create, Read, Update, Delete). Asimismo, se configuraron excepciones y entidades HTTP para la respuesta a las diferentes operaciones de consulta realizadas.
