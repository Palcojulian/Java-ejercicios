//Mi clase en Java
public class HolaMundo {
    
    public static void main(String args[]){ // Metodo o "funcion main" para la ejecucion del programa 
        //System.out.println("Hola Mundo desde Java");
        
        int miVariableEntera = 10; //Tipo primitivo int
        System.out.println("El numero es: " + miVariableEntera);
        miVariableEntera = 20;
        System.out.println("El numero cambio a: " + miVariableEntera);
        
        String miVariableCadena = "Soy la cadena numero 1"; //Tipo String
        System.out.println(miVariableCadena);
        miVariableCadena = "Adios";
        System.out.println(miVariableCadena);
        
        //Var - Inferencia de tipos en Java 
        
        var miVariableEntera2 = 30; // Va ser de tipo entero
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2 = "Soy la cadena numero 2"; //Va ser de tipo cadena
        System.out.println(miVariableCadena2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2);//soutV + TAB es un atajo, linea de codigo que imprime la ultima variable que tengamos
        
        //Valores permitidos en el nombre de variables
        var miVariable = 1; //Esta es la forma que mas se recomienda
        var _miVariable = 2;
        var $miVariable = 3;
        var áVariable = 4; //No se recomienda utilizar  
        
    }
}
/*Tipos de variables 
Primitivos: Tipos enteros y flotantes 
Tipos referenciados(Tipo object): Clases, interfaces, Arrays, Strings
    
*/