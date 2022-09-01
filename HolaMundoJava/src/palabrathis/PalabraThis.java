
package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona obPersona1 = new Persona("Julian", "Palco");
        System.out.println("obPersona1 = " + obPersona1);
        System.out.println("Persona nombre : = " + obPersona1.nombre);
        System.out.println("Persona apellido : = " + obPersona1.apellido);
    }
}

class Persona{
    String nombre;
    String apellido;
    public Persona(String _nombre, String _apellido) {
        //super(); //Llamada al constructor de la clase padre (Object)
        this.nombre = _nombre;
        this.apellido = _apellido;
        System.out.println("Imprimir desde la clase persona usando this: " + this);
        new Imprimir().imprimir(this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir = " + persona);
        System.out.println("Impresion del onjeto actual (this) " + this);
    }
}
