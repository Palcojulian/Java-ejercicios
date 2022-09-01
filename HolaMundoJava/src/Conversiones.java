
import java.util.Scanner;

public class Conversiones {

    public static void main(String[] args) {
        //Convertir un String a un tipo int
        var edad = Integer.parseInt("20");//Metodo de la clase Integer para covertir cadena a un tipo entero
        System.out.println("edad = " + (edad + 1));

        var valorPi = Double.parseDouble("3.1416");//Metodo de la clase Double para convertir cadena a un double
        System.out.println("valorPi = " + valorPi);

        //Pedir un valor
        var consola = new Scanner(System.in); //Se utiliza el parametro System.in
//        System.out.println("Ingrese una edad: ");
//        edad = Integer.parseInt(consola.nextLine());//Se convierte el volor ingresado desde consola a un entero 
//        
//        if (edad >= 18){
//            System.out.println("Edad es: " + edad + " Por lo tanto es mayor de edad");
//        }else{
//            System.out.println("Edad es: " + edad + " Por lo tanto es menor de edad");
//        }
        //Convertir un tipo int a un tipo String
        var edadTexto = String.valueOf(18);//Soporta varios tipos
        System.out.println("edadTexto = " + edadTexto);
        
        
        var caracter = "Hola".charAt(0);  //Recuperar un caracter de una cadena 
        System.out.println("caracter recuperado = " + caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
