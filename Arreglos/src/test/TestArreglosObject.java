
package test;

import domain.Persona;
import java.util.Scanner;


public class TestArreglosObject {
    public static void main(String[] args) {
        Persona personas[] = new Persona[5];
        personas[0] = new Persona("Carlos", "Guegue");
        personas[1] = new Persona("Julian", "Palco");
        personas[2] = new Persona("Pedro", "Picapiedra");
        personas[3] = new Persona("Vilma", "Picapiedra");
        personas[4] = new Persona("Goku", "God");
        
        imprimirLista(personas);
        
        System.out.println("--------------------------------------");
        
        imprimirLista(llenarLista());
    }
    
    public static Persona[] llenarLista(){
        System.out.println("Ingrese el tamaño de la lista: ");
        Scanner input = new Scanner(System.in);
        int tamLista = input.nextInt();
        Persona lista[] = new Persona[tamLista];
        for (int i = 1; i <= lista.length; i++) {
            System.out.println("Ingrese el nombre "+i+":");
            String nombre = input.next();
            System.out.println("Ingrese el apellido "+i+":");
            String apellido = input.next();
            lista[i-1] = new Persona(nombre, apellido);
        }
        return lista;
    }
    
    public static void imprimirLista(Persona lista[]){
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Me Llamo: " + lista[i].getNombre() +" "+ lista[i].getApellido());
        }
    }
}
