package com.alan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Estructura de control
        Scanner sc= new Scanner(System.in); //Esta variable es de tipo Scanner
        System.out.println("Ingresa tu edad");
        int edad = sc.nextInt();  //Recuperamos el valor de la variable tipo scanner y la convertimos a un entero

        System.out.println("Cual es tu nombre?");
        sc.nextLine();//Para que lea la cadena completa   similar a un fflush(cin) en c++
        String nombre = sc.nextLine();

        if(edad>18){
            System.out.println("Felicidades puedes votar" + " " +  nombre);
        }else{
            System.out.println("Lo sentimos no puedes votar" + nombre);
        }
    }
}

sc.close(); //De esta manera cerramos el scanner para que limpie toda la informacion de memoria
