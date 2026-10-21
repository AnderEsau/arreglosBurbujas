# arreglosBurbujas
Practica de ordenamiento burbuja normal vs. mejorado (con bandera) en Java

# Burbuja normal vs. burbuja mejorado

Práctica de Estructura de Datos en Java. Compara el ordenamiento burbuja normal
con el burbuja mejorado, que usa una bandera para saber cuándo parar.

Alumno: Ander Esau Hernández Jiménez, 4:A

## Archivos
- `Burbuja.java`: tiene los métodos `ordenamientoBurbuja` y `ordenamientoBurbujaMejorado`.
- `Estructura4A.java`: tiene el `main` con las pruebas.

## Cómo funcionan

En la burbuja normal se compara cada número con el que tiene al lado. Si el de la
izquierda es mayor, se cambian de lugar con una variable auxiliar. En cada pasada el
número más grande se va hasta el final. Siempre hace todas las pasadas, aunque el
arreglo ya esté ordenado.

La burbuja mejorada hace lo mismo, pero con una bandera (`huboIntercambio`). Empieza
en `false` en cada pasada y cambia a `true` si se hace un intercambio. Si una pasada
termina sin intercambios, el arreglo ya está ordenado y se detiene con `break`.

Los dos son O(n²), pero el mejorado en el mejor caso (arreglo ya ordenado) es O(n).

## Pruebas

A los dos métodos les di una copia del mismo arreglo (con `clone()`) para que la
comparación fuera justa. Medí el tiempo con `System.currentTimeMillis()`.

| Arreglo | Burbuja normal | Burbuja mejorado |
|---------|----------------|------------------|
| 2000 números aleatorios | 10 ms | 7 ms |
| 25 elementos parcialmente ordenados | 0 ms | 0 ms |

El de 2000 no lo imprimí porque llenaría toda la consola. El de 25 sí se imprime
antes y después de ordenarlo:

```
[3, 7, 9, 12, 15, 11, 18, 21, 24, 20, 27, 30, 33, 29, 36, 40, 43, 45, 42, 48, 50, 53, 55, 52, 58]
[3, 7, 9, 11, 12, 15, 18, 20, 21, 24, 27, 29, 30, 33, 36, 40, 42, 43, 45, 48, 50, 52, 53, 55, 58]
```

Los tiempos cambian un poco cada vez que se corre el programa.

## Conclusiones

Con 2000 números aleatorios, la burbuja normal tardó 10 ms y la mejorada 7 ms. La
diferencia es poca porque con números al azar casi siempre hay intercambios hasta
las últimas pasadas, así que la bandera casi nunca corta antes. También puede ser
que el primer método salga más lento porque Java apenas está arrancando.

Con 25 elementos los dos dieron 0 ms porque son muy pocos datos. En los dos casos el
arreglo quedó bien ordenado.

La burbuja mejorada debería notarse más con arreglos que ya están ordenados o casi
ordenados, porque puede parar en las primeras pasadas.

## Uso de IA

Hice la práctica con Gemini como tutor, en modo aprendizaje guiado.

Chat:(https://share.gemini.google/eh8IakBSELGR)
