package practica1;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author luelorso
 */
public class Practica1_metodos_mecanicos {

    public static Scanner teclado = new Scanner(System.in);

    public static String contrasena_mecanica() {
         //Genera un numero del 4 al 8 para el numero de caracteres y declaro variables
        int rep = (int) (5* Math.random() + 4);
        String c1 = "";
        int contador = 0;
        char elijo = ' ';
           //Genera un numero que seran columnas , otro filas del uno al seis 
           //y un numero 0 o 1 que determinara la manera de generar la contraseña
           
        do {
            int eleccion = (int) (2 * Math.random()); 
            int n = (int) (5 * Math.random() + 1);
            int nu = (int) (5 * Math.random() + 1); 
            //segun la opcion que se elija se escoge,con el numero n que determina la fila,
            //se declara una variable y se escoge el caracter segun la columa aleatoria nu
            if (eleccion == 0) { 
//========================DADOS========================
                switch (n) { 
                    case 1:
                        String f1 = "abcdef";
                        elijo = f1.charAt(nu - 1);
                        break;
                    case 2:
                        String f2 = "ghijkl";
                        elijo = f2.charAt(nu - 1);
                        break;
                    case 3:
                        String f3 = "mnopqr";
                        elijo = f3.charAt(nu - 1);
                        break;
                    case 4:
                        String f4 = "stuvwx";
                        elijo = f4.charAt(nu - 1);
                        break;
                    case 5:
                        String f5 = "yz123";
                        elijo = f5.charAt(nu - 1);
                        break;
                    case 6:
                        String f6 = "456789";
                        elijo = f6.charAt(nu - 1);
                        break;
                }
            } else { 
//========================MONEDA========================
                switch (n) {
                    case 1:
                        String f1 = "ABCDEF";
                        elijo = f1.charAt(nu - 1);
                        break;
                    case 2:
                        String f2 = "GHIJKL";
                        elijo = f2.charAt(nu - 1);
                        break;
                    case 3:
                        String f3 = "MNOPQR";
                        elijo = f3.charAt(nu - 1);
                        break;
                    case 4:
                        String f4 = "STUVWX";
                        elijo = f4.charAt(nu - 1);
                        break;
                    case 5:
                        String f5 = "YZ!\"·";
                        elijo = f5.charAt(nu - 1);
                        break;
                    case 6:
                        String f6 = "$%&/()";
                        elijo = f6.charAt(nu - 1);
                        break;
                }
            }
            c1 = c1 + elijo;    //cada eleccion que haga lo sumara a la variable c1
            contador++; //se incrementa el contador
        } while (contador < rep); 
        return c1; 
    }
}
