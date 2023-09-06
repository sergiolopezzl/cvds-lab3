# CVDS-LAB3

## INTEGRANTES

**Andrés Felipe Arias Ajiaco**

**Sergio Daniel Lopez Vargas**

## DOCUMENTACION

**Compilar y Ejecutar**

Compilamos el proyecto.

![compilando](/Imagenes/App/compilar.png)

Construyendo un proyecto desde cero para : compilarlo, ejecutar pruebas y hacer que el resultado esté disponible en el repositorio local de Maven.

![construyendo](/Imagenes/App/mvninstall.png)

Realizando una limpieza de los archivos generados previamente durante el proceso de construcción eliminando todos los archivos y directorios generados en el directorio target. 

![Limpiando](/Imagenes/App/mvnclean.png)

Realizando los test

![Probando](/Imagenes/App/testOne.png)

**Ejercicio "REGISTRADURÍA"**

Ejecutando pruebas con *MVN PACKAGE* y *MVN TEST*

![Probando](/Imagenes/Resgistraduria/testTree.png)

![Probando](/Imagenes/Resgistraduria/testTwo.png)

Debemos tener en cuenta :

> * `mvn package` compila el código, ejecuta pruebas y crea un artefacto de distribución.
> * `mvn test` solo ejecuta las pruebas unitarias sin crear un artefacto de distribución.

En resumen, si se esta interesado principalmente en ejecutar pruebas unitarias para verificar la funcionalidad del código, se utiliza `mvn test`. Si se desea compilar el proyecto y empaquetarlo como un archivo de distribución (por ejemplo, un JAR o WAR) además de ejecutar las pruebas, se utiliza `mvn package`.





