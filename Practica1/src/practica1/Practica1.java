/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;




/**
 *
 * @author luelorso
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//====================PETICION DE DATOS====================

        Practica1_peticion_datos.fechanac(); //solicita al usuario su fecha de nacimiento
        Practica1_peticion_datos.dni(); //solicita el dni sin letra al usuario
        Practica1_usuarios.usuario(); //pide el nombre y los apellidos al usuario para crear un usuario
       
////====================METODOS MECANICOS====================
        System.out.println("Contraseña tipo 1: ");
        String contramec= Practica1_metodos_mecanicos.contrasena_mecanica(); //guardamos la contraseña mecanica en el string contramec
        System.out.print(contramec); //mostramos la contraseña
        System.out.println(Practica1_Validacion_contraseñas.validac(contramec)); //validamos como de segura es la contraseña
       
//====================ALGORITMOS====================
        System.out.println("Contraseña tipo 2:");
        String contraAlg=Practica1_Algoritmos.contrasec();
        System.out.print(contraAlg);
        System.out.println(Practica1_Validacion_contraseñas.validac(contraAlg));
        
//====================MI IDEA====================
        System.out.println("Contraseña tipo 3:");
        String contMiIdea=Practica1_MiIdea.miidea();// guardamos la contraseña de miidea en el string contMiIdea
        System.out.print(contMiIdea); //mostramos la contraseña
        System.out.print(Practica1_Validacion_contraseñas.validac(contMiIdea)); //validamos como de segura es la contraseña
        
        
    }
    
}
