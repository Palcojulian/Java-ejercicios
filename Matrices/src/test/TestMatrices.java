
package test;

import domain.Persona;

public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][3];
        System.out.println("edades = " + edades);
        
        edades[0][0] = 54;
        edades[0][1] = 32;
        edades[0][2] = 5;
        edades[1][0] = 4;
        edades[1][1] = 94;
        edades[1][2] = 1;
        edades[2][0] = 6;
        edades[2][1] = 21;
        edades[2][2] = 12;
        
        System.out.println("Edades 0-0 = " + edades[0][0]);
        System.out.println("Edades 0-1 = " + edades[0][1]);
        System.out.println("Edades 1-0 = " + edades[1][0]);
        System.out.println("Edades 2-0 = " + edades[2][1]);
        System.out.println("----------------------------------------");
        for (int ren = 0; ren < edades.length; ren++) {
            for (int colu = 0; colu < edades[ren].length; colu++) {
                System.out.println("edades = " + ren + "-" + colu + ": " + edades[ren][colu]);
            }
        }
        
        String frutas[][] = {{"Naranja", "limon","Mandarina"},{"Fresa","Mora","Cereza"}};
        imprimir(frutas);
        
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Julian");
        personas[0][1] = new Persona("Libardo");
        personas[0][2] = new Persona("Palco");
        personas[1][0] = new Persona("Guegue");
        personas[1][1] = new Persona("Cristina");
        personas[1][2] = new Persona("Pedro");
        imprimir(personas);
         
    }
    
    public static void imprimir(Object matriz[][]){
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int colum = 0; colum < matriz[fila].length; colum++) {
                if(fila == 0){
                    System.out.println("matriz [" + fila + "]" + "[" + colum + "]: " + matriz[fila][colum]);
                }else if(fila == 1){
                    System.out.println("matriz [" + fila + "]" + "[" + colum + "]: " + matriz[fila][colum]);
                }
            }
        }
        
    }
}
