/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

/**
 *
 * @author luelorso
 */
public class Practica1_MiIdea {

    public static String miidea() {
//==================NOMBRE==================
 //almacenamos en primera la primera letra del nombre
        char primera = Practica1_peticion_datos.Nombre.toUpperCase().charAt(0);
//==================APELLIDO==================
 //almacenamos en la variable caract la longitud del apellido 1 y cogemos el primer caracter
        int carac = Practica1_peticion_datos.apell1.length();
        char ultima = Practica1_peticion_datos.apell1.charAt(carac - 1);
//==================DNI==================
//Pasamos a una string el dni y guardamos en una string los dos ultimos datos
        String dni = String.valueOf(Practica1_peticion_datos.dni); 
        String ult2 = dni.substring(dni.length() - 2, dni.length()); 
//==================FECHA==================
        //guardo en una variable la longitud de la variable y en variables las dos ultimas cifras
        int total = Practica1_peticion_datos.fecha.length(); 
        char fultima = Practica1_peticion_datos.fecha.charAt(total - 1);
        char fpenultima = Practica1_peticion_datos.fecha.charAt(total - 2);
//==================SIMBOLOS==================
//generamos un numero aleatorio para determinar la posicion en una string formada por simbolos
        int simb = (int) (Math.random() * 10); 
        String simbolos = "!\"·$%&/()="; 
        char simbolo = simbolos.charAt(simb); 
//==================CONTRASEÑA==================
//guardo en la String contraseamiidea todas las variables que forman la contraseña, genero su longitud y devuelvo la contraseña
        String contraseamiidea = "" + primera + ultima + ult2 + Practica1_peticion_datos.letra + fpenultima + fultima + simbolo; 
        int longitud = (int) (5 * Math.random() + 4);
        return contraseamiidea.substring(0, longitud); 
    }
}
