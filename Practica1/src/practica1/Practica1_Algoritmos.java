/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.security.SecureRandom;

/**
 *
 * @author luelorso
 */
public class Practica1_Algoritmos {

    public static String contrasec() {
        //declaro las variables y las concateno
        String numeros = "0123456789"; 
        String minusculas = "abcdefghijklmnopqrstuvwxyz"; 
        String mayusculas = minusculas.toUpperCase();
        String simbolos = "!\"·$%&/()=";
        String posibilidad = numeros + minusculas + mayusculas + simbolos; 
        String contra=""; 
        //utilizo la clase secure random si la variable i no supera la longitud aleatoria, 
        //escogera una longitud teniendo en cuenta la de la posible contraseña y escogera ese caracter de los posibles caracteres
        
        SecureRandom sr=new SecureRandom(); 
        int longitud=sr.nextInt(5)+4;   
        for(int i=0; i<longitud;i++){   
            int num=sr.nextInt(posibilidad.length());   
            contra=contra +posibilidad.charAt(num); 
        }
        return contra;
    }
}
