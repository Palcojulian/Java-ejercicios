
package Laboratorio;

public class Caja {
    int ancho;
    int alto;
    int profundo;
    
    public Caja(){
        System.out.println("CONTRUCTOR VACIO");
        
    }
    
    public Caja(int _ancho, int _alto, int _profundo){
        System.out.println("CONSTRUCTOR CON ARGUMENTOS :3");
        ancho = _ancho;
        alto = _alto;
        profundo = _profundo;
    }
    
    public int calcularVolumen(){
        int resultado = ancho * alto * profundo;
        System.out.println("El volumen de la caja es: " + resultado);
        return resultado;
    }
}
