
package test;


public class TestArreglos {
    public static void main(String[] args) {
        int edades[] = new int[3];
        
        edades[0] = 22;
        edades[1] = 57;
        edades[2] = 14;
        //Imprimir individualmente
        System.out.println("edades [0] = " + edades[0]);
        System.out.println("edades [0] = " + edades[1]);
        System.out.println("edades [0] = " + edades[2]);
        
        //Imprimir con un ciclo
        for(int i = 0; i < edades.length;i++){
            System.out.println("Edades elemento[" + i + "]: " + edades[i]);
        }
        
    }
}
