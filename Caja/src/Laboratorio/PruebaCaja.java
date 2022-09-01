
package Laboratorio;

public class PruebaCaja {
    public static void main(String[] args) {
        //Objetoo 1
        Caja obCaja1 = new Caja();//COnstructor vacio
    
        obCaja1.alto = 10;
        obCaja1.ancho = 5;
        obCaja1.profundo = 2;
        obCaja1.calcularVolumen();
      
        //Objeto 2
        Caja obCaja2 = new Caja(2, 5, 6);//Constructor con argumentos
        obCaja2.calcularVolumen();
        
    }
   
}
