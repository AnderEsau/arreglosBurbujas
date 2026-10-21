/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.estructura4a;

import Unidad1.Burbuja;
import java.util.Arrays;
//import Unidad1.tdaCuentaBancaria;
/**
 *
 * @author Ander Esau Hernández Jimenez
 */
public class Estructura4A {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Hola mundo 4A");
        //Pruebas con arreglos desordenados
        int[] arreglo1 = new int[2000];//Declaramos el tamaño de nuestro arreglo
        for(int i=0;i<arreglo1.length;i++){
            arreglo1[i]=(int)(Math.random() * 100);//Hacemos un ciclo for para que me asigne un numero aleatorio dentro del rango del 0 al 99 para cada posicion en ese arreglo
        }
        int[] arreglo2=arreglo1.clone();//Hacemos una copia del arreglo 1
        
        long inicio = System.currentTimeMillis();//Hacemos nuestro temporizador de inicio
        Burbuja.ordenamientoBurbuja(arreglo1);//Mandamos a ordenar nuestro arreglo con la burbuja
        long fin = System.currentTimeMillis();//hacemos nuestro temporizador de fin
        long resultado = fin - inicio;//hacemos el calculo del tiempo tardado
        System.out.println("Tiempo del arreglo 1: "+(resultado));//Imprimimos el tiempo que tardo en ordenar el arreglo
        
        inicio = System.currentTimeMillis();//Hacemos nuestro temporizador de inicio
        Burbuja.ordenamientoBurbujaMejorado(arreglo2);//Mandamos a ordenar nuestro arreglo 2 con la burbuja mejorada
        fin = System.currentTimeMillis();//hacemos nuestro temporizador de fin
        
        resultado = fin - inicio;//Hacemos el calculo del tiempo tardado
        System.out.println("Tiempo del arreglo 2: "+(resultado));//Imprimimos el tiempo que tardo en ordenar el arreglo
        //Pruebas con arreglos parcialmente ordenados 
        int[] arreglo3 = {3,7,9,12,15,11,18,21,24,20,27,30,33,29,36,40,43,45,42,48,50,53,55,52,58};//Declaramos y inicializamos nuestro arreglo parcialmente ordenado
        int[] arreglo4=arreglo3.clone();//Hacemos una copia del arreglo 3
        
        System.out.println(Arrays.toString(arreglo3));//Imprimimos el arreglo desordenado
        inicio = System.currentTimeMillis();//Hacemos nuestro temporizador de inicio
        Burbuja.ordenamientoBurbuja(arreglo3);//Mandamos a ordenar nuestro arreglo con la burbuja
        fin = System.currentTimeMillis();//hacemos nuestro temporizador de fin
        resultado = fin - inicio;//hacemos el calculo del tiempo tardado
        System.out.println(Arrays.toString(arreglo3));//Imprimimos el arreglo ordenado
        System.out.println("Tiempo del arreglo 3: "+(resultado));//Imprimimos el tiempo que tardo en ordenar el arreglo
        
        System.out.println(Arrays.toString(arreglo4));//Imprimimos el arreglo desordenado
        inicio = System.currentTimeMillis();//Hacemos nuestro temporizador de inicio
        Burbuja.ordenamientoBurbujaMejorado(arreglo4);//Mandamos a ordenar nuestro arreglo 4 con la burbuja mejorada
        fin = System.currentTimeMillis();//hacemos nuestro temporizador de fin
        resultado = fin - inicio;//Hacemos el calculo del tiempo tardado
        System.out.println(Arrays.toString(arreglo4));//Imprimimos el arreglo ordenado
        System.out.println("Tiempo del arreglo 4: "+(resultado));//Imprimimos el tiempo que tardo en ordenar el arreglo
    }
    /*
    public static void menuCuenta(){
        tdaCuentaBancaria cuenta= new tdaCuentaBancaria("Ander Esau Hernández Jiménez", "5579321937812453", 5000.0f);
        
        System.out.println("Banco Universitario");
        
        if(cuenta.Depositar(6000)==true){
            System.out.println("Deposito éxitoso, tu nuevo saldo es: "+cuenta.ConsultarSaldo()+" Pesos");
        }else{
            System.out.println("Error al depositar revisa la cantidad");
        }
        
        if(cuenta.Retirar(3000)){
            System.out.println("Retiro exitoso");
        }else{
            System.out.println("Error al retirar revisa las cantidades");
        }
        
        System.out.printf("El titular de la cuenta "+cuenta.getNumCuenta()+" es : "+cuenta.getTitular()+"\n y tiene un saldo de :$"+cuenta.ConsultarSaldo());
    }
    
        public static void menuRecursivo(){
        recursivo funcion = new recursivo();
        int [] x = {10,10,5,10};
        System.out.println("El factorial de : "+ funcion.factorial(5));
    }
    
    public static void menuRecursivo2(){
        recursivo funcion = new recursivo();

         
        System.out.println("El factorial de : "+ funcion.factorial(5));
    }
    public static void menuArreglos(){
        arreglos ej = new arreglos();
    }
    */
}
