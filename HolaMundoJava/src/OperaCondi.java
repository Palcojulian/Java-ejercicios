
public class OperaCondi {
    public static void main(String[] args) {
        var a = 11;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        var resultado = (a >= valorMinimo && a <= valorMaximo);
        
        if (resultado){
            System.out.println("Dentro del rango" );
        }else{
            System.out.println("No esta en el rango");
        }
        
        var vacaciones = false;
        var diaDescanso = false;
        if( vacaciones || diaDescanso ){
            System.out.println("Puede asistir");
        }else{
            System.out.println("No puede asistir");
        }
        
    }
}
