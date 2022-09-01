
package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;//Una vez asignado un valor a una variable con modificador de acceso "final" este
        System.out.println("miVariable = " + miVariable); // no se puede modificar
        //miVariable = 20; Esto no se puede hacer
        
        final Persona obPersona1 = new Persona();
        //obPersona1 = new Persona(); Esto no se puede hacer por lo que es final 
        obPersona1.setNombre("Julian");
        System.out.println("Nombre es: " + obPersona1.getNombre()); //Podemos modificar el atributo de nombre, el contenido
        obPersona1.setNombre("Carlos");                             //Pero no la referencia del objeto
        System.out.println("Nombre 2: " + obPersona1.getNombre());
    }
}
