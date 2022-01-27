package practica1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.text.html.HTML;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author luelorso
 */
public class Practica1_peticion_datos {
    //declaro variables y scanner
    public static Scanner teclado = new Scanner(System.in);
    public static String Nombre; 

    public static String Nombre() {
        //pedira el nombre por teclado con la condicion de ser mayor a tres y que este entre la A-Z o a-z sin espacios
        //finalmente devuelve las tres primeras letras
        do{
        System.out.println("Introduce tu nombre sin espacios:");
        Nombre = teclado.nextLine().toLowerCase(); 
        }while(Nombre.length()<3 || !Nombre.matches("[A-Za-z]*")); 
        return Nombre.substring(0, 3); 
        
    }
    //pediran los apellidos por teclado con la condicion de ser mayor a 2 y que este entre la A-Z o a-z con posibles espacios
    //finalmente devuelve las dos primeras letras
    public static String apell1; //declaro la variable apell1

    public static String apell1() {
        do{
        System.out.println("Introduce tu primer apellido:");
        apell1 = teclado.nextLine().toLowerCase(); 
        }while(apell1.length()<2 || !apell1.matches("[A-Za-z ]*")); 
        return apell1.substring(0, 2); 
    }

    public static String apell2; //declaro la variable apell2
    public static String apell2() { 
        do{
        System.out.println("Introduce tu segundo apellido:");
        apell2 = teclado.nextLine().toLowerCase(); 
        }while(apell2.length()<2 || !apell2.matches("[A-Za-z ]*")); 
        return apell2.substring(0, 2); 
    }
    //declaro variables
    public static String dni; 
    public static char letra; 
     //pediran los apellidos por teclado con la condicion de ser igual a 8 y que este entre 0-9 sin espacios
    //paso la string dni a entero y declaro la variable calculo con el resto del dni entre 23, declaro una string 
    //en funcion del orden de las letras para sacar la letra y declaro la variable letras en funcion del calculo
    //finalmente devuelve las dos primeras letras
    public static void dni() {
        do {
            System.out.println("Introduce tu DNI sin la letra:");
            dni = teclado.nextLine();  
        } while (dni.length() != 8 || !dni.matches("[0-9]*")); 
        int d= Integer.parseInt(dni); 
        int calculo = d % 23; 
        String orden = "TRWAGMYFPDXBNJZSQVHLCKE";   
        letra = orden.charAt(calculo);
    }
    //declaro variable
    public static String fecha;

    public static Date fechanac() {
        //declaro variables
        boolean rep = true;
        Date f = null;  
        Date hoy = new Date(); 
        String min="01/01/1900";
        Date minima =null;
        //creo un formato para la fecha
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        //mientras que rep sea igual a true pedira la fecha por feclado y si esa fecha no existe se mostrara un mensaje
        //de error, se pasa al formato las fechas y si la de hoy esta antes que la introducida o es anterior a 1990
        //mostrara un mensaje de error, en caso de estar correcto te dejara continuar
        while (rep) {
            System.out.println("Introduce tu fecha de nacimiento(dd/MM/yyyy):");
            fecha = teclado.nextLine(); 
            df1.setLenient(false); 
            
            try {
                f = df1.parse(fecha);
                df1.format(hoy); 
                minima=df1.parse(min);
                if (hoy.before(f) || minima.after(f)) { 
                    System.out.println("Error.Fecha de nacimiento incorrecta");
                    rep = true; 
                } else {
                    rep = false; //se acaba el bucle
                }
            } catch (Exception e) { 
                System.out.println("Error.Fecha de nacimiento invalida"); 
                rep = true; 
            } 
            
        }
        return f; 
    }
}
