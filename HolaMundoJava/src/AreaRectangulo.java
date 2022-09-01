
import java.util.Scanner;


public class AreaRectangulo {
    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        int alto = 0;
        int ancho = 0;
        System.out.println("Proporciona la altura: ");
        alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());
        
        int area = alto * ancho;
        int perimetro = (alto + ancho)*2;
        
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
        
    }
}
