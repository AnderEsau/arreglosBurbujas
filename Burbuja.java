/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad1;

/**
 *
 * @author Ander Esau Hernández Jiménez
 */
public class Burbuja {
    //Metodo para hacer el de la burbuja ordenado en un arreglo de numeros enteros
    public static void ordenamientoBurbuja(int[] arreglo){
        //Declaro la variable auxiliar que me servira para ordenar mi arreglo
        int aux;
        //Este for comprueba que realmente todos los numeros esten ordenados
        for(int x=0; x<arreglo.length - 1;x++){
            //El for recorre el arreglo de izquierda a derecha PERO solo un numero a la vez
            for(int i=0;i<arreglo.length - 1;i++){
                //El if valida que si el numero es mayor que el que tiene
                //enfrente lo pasa adelante
                if(arreglo[i]>arreglo[i+1]){
                    aux = arreglo[i];//Guardamos la posicion donde nos ubicamos mediante el indice i en un auxiliar
                    arreglo[i]=arreglo[i+1];//Sustituimos la posicion donde nos ubicamos por el siguiente valor del arreglo
                    arreglo[i+1] = aux;//Por ultimo, en la posicion siguiente, sustituimos el valor que tiene por el valor que habiamos guardado en nuestra variable auxiliar
                }
            }
        }
    }
    
    //Metodo para hacer el de la burbuja mejorada o con bandera en un arreglo de numeros enteros
    public static void ordenamientoBurbujaMejorado(int[] arreglo){
        //Declaro la variable auxiliar que me servira para ordenar mi arreglo
        int aux;
        //Este for comprueba que realmente todos los numeros esten ordenados
        for(int x=0; x<arreglo.length - 1;x++){
            boolean huboIntercambio=false;//declaramos y inicializamos nuestra bandera para saber si hubo un intercambio de posicion
            //El for recorre el arreglo de izquierda a derecha PERO solo un numero a la vez
            for(int i=0;i<arreglo.length - 1;i++){
                //El if valida que si el numero es mayor que el que tiene
                //enfrente lo pasa adelante
                if(arreglo[i]>arreglo[i+1]){
                    aux = arreglo[i];//Guardamos la posicion donde nos ubicamos mediante el indice i en un auxiliar
                    arreglo[i]=arreglo[i+1];//Sustituimos la posicion donde nos ubicamos por el siguiente valor del arreglo
                    arreglo[i+1] = aux;//Por ultimo, en la posicion siguiente, sustituimos el valor que tiene por el valor que habiamos guardado en nuestra variable auxiliar
                    huboIntercambio=true;
                }
            }
            //Una vez que se acaba el ciclo hacemos una evaluacion de que si no hubo ningun intercambio ya esta todo listo
            if(huboIntercambio==false){
                break;//Rompemos el ciclo
            }
        }
    }
    
}
