
package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) { //Metodo estatico
        Persona persona1 = new Persona("Julian");
      
        Persona persona2 = new Persona("Libardo");

        imprimir(persona1);
        imprimir(persona2);
        
        //contador; Una variable no estatica no puede ser referenciada desde un metodo estatico 
    }
    
    public static void imprimir(Persona persona) {//Metodo estatico
        System.out.println("persona = " + persona);
        
    }
    
    public int getContador(){//Un metodo no estatico si puede acceder a metodos estaticos y hacer referencia
        imprimir(new Persona("Carlos"));//variable de la clase 
        return this.contador;
    }
}
