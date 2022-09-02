
package test;

import domain.Persona;

public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[5];
        
        personas[0] = new Persona("Carlos", "Guegue");
        personas[1] = new Persona("Julian", "Palco");
        personas[2] = new Persona("Pedro", "Picapiedra");
        personas[3] = new Persona("Vilma", "Picapiedra");
        personas[4] = new Persona("Goku", "God");
        
        System.out.println("El tamaño de la lista de objetos es de: " + personas.length);
        
        
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("personas [" + i + "] " + personas[i]);
        }
    }
}
