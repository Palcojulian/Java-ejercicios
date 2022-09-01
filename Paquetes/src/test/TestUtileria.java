
package test;

//1->> import col.com.julianpalco.Utileria; //Importamos clases de los paquetes que ya hemos creado, en este caso la clase Uteleria
//import col.com.julianpalco.*;//Con esta linea se importan todas las clases del paquete, no afecta a la memoria 
//2->> import static col.com.julianpalco.Utileria.imprimir;

public class TestUtileria {
    public static void main(String[] args) {
        //1->> Utileria.imprimir("Holaa Wapo");
        
        //2->> imprimir("Hola wapo");
        
        col.com.julianpalco.Utileria.imprimir("Hola Wapo");//Se conoce como el nombre netamente calificado
    }
}
