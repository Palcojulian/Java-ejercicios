
package PasoPorReferencia;

import ClasesObjetos.Persona;


public class PasoPorReferencia {
    
    public static void main(String[] args) {
        Persona obPersona1 = new Persona();
        obPersona1.nombre = "Julian";
        System.out.println("obPersona1 = " + obPersona1.nombre);
        obPersona1 = cambioValor(obPersona1);
        System.out.println("Persona uno con el cambio de nombre: " + obPersona1.nombre);
    }
    
    public static Persona cambioValor(Persona persona){ //Llama a la clase persona y se crea un objeto tipo persona
        persona.nombre = "Libardo"; //Regresa la la clase persona 
        return persona;//Puede regresar referencias de objetos
    }
}
