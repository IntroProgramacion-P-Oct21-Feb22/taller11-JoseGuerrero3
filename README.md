# Taller 11 (Laboratorio) 
## Construcción de programas usando módulos y funciones

### Problema 01
Generar un procedimiento (método que no devuelva valor) que imprima los valor pares de un arreglo bidimensional.

El arreglo para probar la solución es:
```
int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
```
El procedimiento o método debe se invocado desde el método main (principal); además el método debe recibir como parámetro un arreglo bidimensional.

### Problema 02
* Generar una solución que implemente 3 procedimientos. Que permitan calcular el área de un cuadrado, área de un triángulo y área de un rectángulo. Cada procedimiento debe solicitar los datos necesarios y presentar o imprimir el valor correspondiente. Se debe invocar a los procedimientos desde un método principal; Si el usuario ingresa 1 se llama al procedimiento obtenerAreaCuadrado; 2 se llama al procedimiento obtenerAreaTriangulo; 3 se llama al procedimiento obtenerAreaCuadrado.
	* El área del cuadrado es igual a lado x lado x lado x lado
	* El área del triángulo es igual a (base x altura)/2
	* El área del rectángulo es igual a base x altura
***
### Problema 03
* Generar una función que tenga 4 parámetros de tipo decimal y devuelva el promedio cualitativo de los parámetros.
Si el promedio es:
De 0 a 5 el promedio cualitativo es Regular
De 5.1 a 8 el promedio es Bueno
De 8.1 a 9 el promedio es Muy Bueno
De 9.1 a 10 el promedio es Sobresaliente.
A la función se la debe llamar desde un método principal. Los parámetros necesarios para llamar a la función, deben ser ingresados solicitados al usuario. En la función principal se debe imprimir los siguiente: El promedio de las notas: 10, 5, 8, 7 es Bueno 
***

### Problema 04
* Generar un procedimiento para calcular el valor de la planilla de luz y otro procedimiento para calcular el valor del predio de un bien inmueble.
Cada procedimiento debe tener 2 parámetros (tipo cadena para nombre del cliente, cédula del cliente). 

En el procedimiento de planilla de luz se debe pedir los siguiente datos valor del kilowatio y el número de kilowatios del mes. Y se presenta en pantalla el siguiente reporte: 
Cliente Ana Contreras con cédula 1100112233 debe cancelar el valor de $10

En el procedimiento del predio se debe pedir el valor de inmueble y el para obtener el valor del predio se saca el 2% del valor del inmueble. Y se presenta el siguiente reporte:

Cliente Ana Contreras con cédula 1100112233 tiene un bien inmueble valorado en $30000 y tiene que pagar de predio $ 600.

En el método principal; si el usuario ingresa 1 se llama al procedimiento calcularValorLuz; 2 se  llama al procedimiento calcularPredio. Los datos que se necesita en cada procedimiento se los debe ingresar por teclado.

***
### Problema 05
Generar un función, método que devuelva la suma de un arreglo bidimensional; mismo que se lo recibe como parámetro.

El arreglo para probar la solución es:
```
int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
```
El método debe se invocado desde el método main (principal); además el método debe recibir como parámetro un arreglo bidimensional.


***
### Problema 06
Dado un arreglo; por ejemplo:
```
int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
```
Generar las siguiente funciones:

* Función que devuelva la media aritmética del arreglo; recibe como parámetro un arreglo de tipo entero

* Función que devuelva el valor de la desviación estándar de los valores del arreglo; recibe como parámetro un arreglo de tipo entero y un valor de tipo decimal para representar la media aritemética


Los método deben ser invocados desde el método main (principal); además, las funciones deben recibir como parámetro. En el método principal imprimir el valor de la media aritmética y el valor de la desviación estándar.

### Problema 07
* Generar una función que devuelva un arreglo unidimensional de cadenas. En dicha función se debe pedir por teclado el número de elementos de arreglo, además de ingresar los elementos por teclado, los datos a ingresar pueden ser ciuadades del Ecuador.

* Generar un procedimiento que reciba como parámetro un arreglo unidimensional de cadenas; el mismo, se debe imprimir únicamente los valores del arreglo que tengan 4 o 5 caracteres.

* Desde el método principal, se debe llamar a la función que devuelva el arreglo unidimensional y además llamar al procedimiento que imprima los valores con las consideraciones expuestas.