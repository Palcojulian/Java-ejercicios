
import java.util.Scanner;


public class Switch {
    public static void main(String[] args) {
        //Recomendada para menus
        
        var consola = new Scanner(System.in);
        
        System.out.println("Ingrese un Mes: ");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "Estacion desconocida";
        
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;
        }
        
        System.out.println("estacion = " + estacion);
    }
}
