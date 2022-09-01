
import java.util.Scanner;


public class TiendaLibros {
    public static void main(String[] args) {
        var consola =  new Scanner(System.in);
        System.out.println("Ingrese el nombre del libro: ");
        var libroNombre = consola.nextLine();
        System.out.println("Ingrese el Id del libro: ");
        var libroId = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese el precio del libro: ");
        var libroPrecio = Double.parseDouble(consola.nextLine());
        
        var libroEnvio = true;
        
        System.out.println("Libro: " + libroNombre + " #"+ libroId);
        System.out.println("Precio: $" + libroPrecio);
        
        if(libroPrecio >= 6000){
            System.out.println("Envio del libro es gratuito: " + libroEnvio);
        }else{
            libroEnvio = false;
            System.out.println("Envio del libro no es gratuito: " + libroEnvio);
        }
           
        
    }
}
