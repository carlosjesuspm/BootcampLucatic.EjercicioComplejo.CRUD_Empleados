package com.cj.empleados01.utilidades;

import java.util.Scanner;

public class LeerTeclado {
    
    // String 

    @SuppressWarnings("resource")
    public static String leerLinea(){
        return new Scanner(System.in).nextLine();
    }

    public static String leerLinea(String msg){
        System.out.println(msg);
        return leerLinea();
    }

    // int

    @SuppressWarnings("resource")
    public static int leerNumeroEntero(){
        return new Scanner(System.in).nextInt();
    }

    public static int leerNumeroEntero(String msg){
        System.out.println(msg);
        return leerNumeroEntero();
    }

    // float

    @SuppressWarnings("resource")
    public static float leerNumeroDecimal(){
        return new Scanner(System.in).nextFloat();
    }

    public static float leerNumeroDecimal(String msg){
        System.out.println(msg);
        return leerNumeroDecimal();
    }

    //double 
    
    @SuppressWarnings("resource")
    public static double leerNumeroDouble(){
        return new Scanner(System.in).nextDouble();
    }

    public static double leerNumeroDouble(String msg){
        System.out.println(msg);
        return leerNumeroDouble();
    }
}
