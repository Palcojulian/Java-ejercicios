package test;

import dominio.Persona; //Importamos la clase persona desde el paquete de dominio
import java.util.Scanner;

public class PesonaPrueba {

    public static void main(String[] args) {
        Persona obPersona1 = new Persona("Julian", 5000.0, false);
        //Objeto 1
        System.out.println("Informacion de persona 1: " + obPersona1);
//        System.out.println("Objeto persona numero 1");
//        System.out.println("Nombre del objeto persona sin cambio: " + obPersona1.getNombre());
        obPersona1.setNombre("Julian Libardo");
//        System.out.println("Nombre del objeto persona con cambio: " + obPersona1.getNombre());
//        System.out.println("Sueldo de: " + obPersona1.getSueldo());
//        System.out.println("Esta eliminado: " + obPersona1.isEliminado()); 
        System.out.println("Informacion de persona 1: " + obPersona1.toString());

        //Objeto 2
        System.out.println("Objeto persona numero 2");

        var consola = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        var _nombre = consola.nextLine();
        System.out.println("Ingrese el sueldo: ");
        var _sueldo = Double.parseDouble(consola.nextLine());
        System.out.println("true o false: ");
        boolean _eliminado = Boolean.getBoolean(consola.nextLine());//Esto no se sabe si esta funcionando bien, OJO pues

        Persona obPersona2 = new Persona(_nombre, _sueldo, _eliminado);
        System.out.println("Nombre: " + obPersona2.getNombre());
        System.out.println("Sueldo: " + obPersona2.getSueldo());
        System.out.println("Eliminado: " + obPersona2.isEliminado());
        System.out.println("--------------------------------");
        System.out.println("Datos" + obPersona2);

    }

}
