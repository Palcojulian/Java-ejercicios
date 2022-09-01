
import java.util.Scanner;


public class DosNumeros {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        
        System.out.println("Proporciona el numero 1: ");
        int numUno = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero 2: ");
        int numDos = Integer.parseInt(consola.nextLine());
        
        var nunMayor = (numUno > numDos) ? "Mayor: " + numUno : "Mayor: " + numDos;
        
        System.out.println(nunMayor);
    }
}
