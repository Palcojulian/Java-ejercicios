
public class OperaTernario {
    public static void main(String[] args) {
        
        var resultado = (1 > 2) ? "Verdadero" : "Falso" ; //Para estructuras sencillas
        
        System.out.println("resultado = " + resultado);
        
        var numero = 9;
        
        resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
        
        System.out.println("resultado = " + resultado);
        
    }
}
