
package ClasesObjetos;

public class PruebaPersona {
    public static void main(String[] args) {
        
        Persona personaUno = new Persona(); //Se llama el constructor new Persona() Se declara un objeto
        Persona personaDos = new Persona(); //tambien se le asigna una parte de memoria
                            
        personaUno.nombre = "Julian";
        personaUno.apellido = "Palco";
        
        personaDos.nombre = "Libardo";
        personaDos.apellido = "Guegue";
        
        //Null significa ausencia de valor 
        
        
        System.out.println("Referencia en memoria es = " + personaUno);
        System.out.println("Referencia en memoria es = " + personaDos);
        
        personaUno.desplegarInformacion();
        personaDos.desplegarInformacion();
    }
}
