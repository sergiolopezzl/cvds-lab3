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

**Ejercicio Aereodescuentos**

usando '$ mvn install:install-file -Dfile=aerodescuentos-1.0.0.jar -DgroupId=edu.eci.cvds -DartifactId=aerodescuentos -Dversion=1.0.0 -Dpackaging=jar'

![Comandos](/Imagenes/comando.png)

1. De acuerdo con lo indicado, y teniendo en cuenta que NO hay precondiciones, en qué casos se debería
arrojar una excepción de tipo ExcepcionParametrosInvalidos?. Agregue esto a la especificación.

* Si la tarifa base es negativa.
* Si los días de antelación son negativos.
* Si la edad del pasajero es negativa.

2. En la siguiente tabla enumere un conjunto de clases de equivalencia que -según usted- creen una
buena división del conjunto de datos de entrada de la función anterior:

| Numero |Tarifa base | Días de antelación | Edad | Resultado|
| ------ | ------------- | --------------------- | ---- |--------- |
| 1 | Positiva | Días > 20 | Edad < 18 | 20% de descuento |
| 2 | Positiva | Días > 20 | Edad > 65 | 23% de descuento |
| 3 | Positiva | Días <= 20 | Edad < 18 | 5% de descuento |
| 4 | Positiva | Días <= 20 | Edad > 65 | 8% de descuento |
| 5 | Positiva | Días > 20 |  18 < Edad > 65 | 15% de descuento |
| 6 | Positiva | Días <= 20 |  18 < Edad > 65 | 0% de descuento |

3. Para cada clase de equivalencia, defina un caso de prueba específico, definiendo: parámetros de
entrada y resultados esperados.

| Numero |Tarifa base | Días de antelación | Edad | Resultado|
| ------ | ------------- | --------------------- | ---- |--------- |
| 1 | 100 | 25 | 30 | 85 |
| 2 | 100 | 25 | 16 | 80 |
| 3 | 100 | 25 | 70 | 77 |
| 4 | 100 | 10 | 30 | 100 |
| 5 | 100 | 10 | 10 | 95 |
| 6 | 100 | 10 | 66 | 92 |

4. A partir de las clases de equivalencia identificadas en el punto 2, identifique las condiciones límite o
de frontera de las mismas.

* tarifaBase > 0
* diasAntelacion > 0
* 0 > edad < 125

5. Para cada una de las condiciones de frontera anteriores, defina casos de prueba específicos.

| Numero |Tarifa base | Días de antelación | Edad | Resultado|
| ------ | ------------- | --------------------- | ---- |--------- |
| 1 | -50 |  |  | False |
| 1 | 0 |  |  | False |
| 1 |  | -5 |  | False |
| 1 |  |  | -10 | False |
| 1 |  |  | 130 | False |






