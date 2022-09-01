
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Carlos");
        personas[1] = new Persona("Julian");
        
        System.out.println("Personas nombre 0:" + personas[0]);
        System.out.println("Personas nombre 1:" + personas[1]);
        
        System.out.println("--------------------------------");
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas [" + i + "] " + personas[i]);
        }
    }
}
