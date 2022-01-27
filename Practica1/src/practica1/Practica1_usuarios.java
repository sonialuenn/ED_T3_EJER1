package practica1;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sonia
 */
public class Practica1_usuarios {
    public static void usuario(){
        //solicita el nombre y los apellidos segun la peticion de datos e imprimimos en una misma linea todos segun
        //las condiciones de peticion de datos, es decir, dos primeros caracteres de apellidos y tres primeros del nombre
        String nombre=Practica1_peticion_datos.Nombre(); 
        String apell1=Practica1_peticion_datos.apell1();
        String apell2=Practica1_peticion_datos.apell2();
        System.out.println("Tu usuario es: " + apell2 + apell1+ nombre); 
        
    }
}
