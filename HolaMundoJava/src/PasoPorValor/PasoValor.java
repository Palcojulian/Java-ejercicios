
package PasoPorValor;


public class PasoValor {
    
    public static void main(String[] args) {
        var x = 12;
        System.out.println("x = " + x);
        
        cambioValor(x); //Estamos pasando una copia del valor de x hacia el argumento del metodo cambioValor
    }
    
    public static void cambioValor(int arg1){
        System.out.println("arg1 = " + arg1);
        arg1 = 10; //Este metodo no puede modificar el valor del metodo main, 
        
    }
}
