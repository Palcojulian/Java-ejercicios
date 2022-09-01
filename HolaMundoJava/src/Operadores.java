
public class Operadores {

    public static void main(String[] args) {
        int a = 3, b = 2;

        var resultado = a + b;

        System.out.println("resultado = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);

        resultado = a % b;//Operador de modulo
        System.out.println("Residuo entre a y b = " + resultado);
        
        if (a % b == 0)
            System.out.println("Es par");
        else
            System.out.println("Es impar");
        
    }
}
