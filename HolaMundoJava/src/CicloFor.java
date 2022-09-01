
public class CicloFor {
    public static void main(String[] args) {
        
        hola:
        for( var contador = 0; contador < 3; contador++ ){
            if (contador % 2 == 0 ){
                System.out.println("contador = " + contador);
                break;
            }
        }
        
        for( var contador = 0; contador < 9; contador++ ){
            if (contador % 2 != 0 ){
                continue;// Ir a la siguiente iteración
            }
            System.out.println("contador = " + contador);
        }
    }
}
