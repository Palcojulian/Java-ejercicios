
public class CicloWhile {
    public static void main(String[] args) {
        var contador = 0;
        //Si se cumple la condicion se ejecuta el codigo 
        while( contador < 3 ){ //Mintras la condicion sea verdadera el codigo se ejecuta
            System.out.println("contador = " + contador);
            contador++;
        }
        
        //do while, se ejecuta una parte del codigo luego entra a la condidicion
        
        
        var contador2 = 0;
        do{
            
            System.out.println("contador2 = " + contador2);
            contador2++;
            
        }while( contador2 < 3);
        
    }
}
