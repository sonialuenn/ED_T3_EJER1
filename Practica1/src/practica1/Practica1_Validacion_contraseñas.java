/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author Sonia
 */
public class Practica1_Validacion_contraseñas {

    public static String validac(String c) {
        //declaro variables
        String val = ""; 
        boolean simbolos = false;
        boolean mayuscula = false;
        boolean minuscula = false;
        boolean numeros = false;
        boolean continuar = true;
        int l = c.length(); 
        //si la longitud de la contraseña es menor o igual a seis msotrara el siguiente mensaje
        if (l <= 6) { 
            val="  ____Contraseña poco segura____"; 
            return val; 
        } else {
            //si es mayor a 6 entrara al bucle
            //en este bucle cada vez que el caracter este en el rango ascii indicado se activara la boolean correspondiente
            //en caso de que esten todas activas saldra del bucle
            for (int i = 0; i < l && continuar; i++) { 
                int cascii = c.charAt(i); 
                if (cascii >= 33 && cascii <= 47 || cascii >= 58 && cascii <= 64 || cascii >= 91 && cascii <= 96 || cascii >= 123 && cascii <= 126 || cascii==183) { 
                    simbolos = true;
                }
                if (cascii >= 65 && cascii <= 90) { 
                    mayuscula = true;
                }
                if (cascii >= 97 && cascii <= 122 ) {
                    minuscula = true; 
                }
                if (cascii >= 48 && cascii <= 57) {
                    numeros = true; 
                }
                if (numeros && minuscula && simbolos && mayuscula) { 
                    continuar = false;
                }
            }
            //cuando acaba el bucle o la longitud, dependiendo de cual se mostrara un mensaje u otro
            if (continuar) { 
                val = "  ____Contraseña Segura____"; 
                return val; 
            } else { 
                val = "  ____Contraseña Muy segura____"; 
                return val;
            }
        }
    }
}
