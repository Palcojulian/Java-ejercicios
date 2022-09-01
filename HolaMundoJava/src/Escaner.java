
import java.util.Scanner;


public class Escaner {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in);//Para leer informacion desde la consola
    
        var usuario = consola.nextLine(); //Metodo para leer informacion desde la consola, lee la linea completa
        
        //System.out.println("Usuario  = " + usuario);
        System.out.println("Escribe tu poderosísimo titulo Universitario :3");
        var titulo = consola.nextLine();
        System.out.println("Welcome " + titulo + " " + usuario);
    }

}
