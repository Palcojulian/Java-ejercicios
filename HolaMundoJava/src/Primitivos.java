
public class Primitivos {
    public static void main(String[] args) {
        /*
            Tipos primitivos enteros:byte, short, long, int 
        */
        //byte: el maximo que se puede utilizar es 127
        byte myByte = 10;
        System.out.println("Valor minimo byte:" + Byte.MIN_VALUE);
        System.out.println("Valor maximo byte:" + Byte.MAX_VALUE);
        
        //short: 
        short miShort = 20;
        System.out.println("Numero short : " + miShort);
        System.out.println("short Max:" + Short.MAX_VALUE);
        System.out.println("short Min:"+ Short.MIN_VALUE);
        
        //int es la que más se utliza
        int miInt = 30;
        System.out.println("Numero int:" + miInt);
        System.out.println("int max:" + Integer.MAX_VALUE);
        System.out.println("int min:" + Integer.MIN_VALUE);
        
        //long 
        long miLong = 45;
        System.out.println("Numero long:" + miLong);
        System.out.println("long Max:" + Long.MAX_VALUE);
        System.out.println("long Min:" + Long.MIN_VALUE);
    }
}
