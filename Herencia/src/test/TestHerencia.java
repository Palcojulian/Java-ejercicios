
package test;


import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;


public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Pedro", 5000.0);
        System.out.println(empleado1);
        
        System.out.println("---------------------------------");
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "Julian", 'M', 21, "Mondomo");
        
        System.out.println(cliente1);
        
        Persona persona1 = new Persona("Libardo", 'M', 21, "mondomo");
        System.out.println(persona1);
    }
}
