
public class PrecedenciOperadores {
    public static void main(String[] args) {
        /*
        *    es el orden en el que se van a evaluar los operadores de acuerdo a la prioridad
        */
        
        var x = 5;
        var y = 10;
        var z = ++x + y--; // Preincrento y posincremento 
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = (4+5)*6/3;
        
        System.out.println("resultado = " + resultado);
        
    }
}
