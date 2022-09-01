
package operaciones;


public class PruebaAritmetica {
    
    int c;
    
    public static void main(String[] args) {
        //Variables locales dentro del metodo main
        var a = 10; //var solo puede utilizar al momento de definir variables locales, no se pueden definir en las clases.
        var b = 2; // Se guardan en la memoria stack 
        
        PruebaAritmetica ob1 = new PruebaAritmetica();//Se guarda en la memoria heap
        
        
        
        Aritmetica aritmetica1 = new Aritmetica();
        
        System.out.println("arimetica1 a:" + aritmetica1.a);
        System.out.println("arimetica1 b:" + aritmetica1.b);
        
        Aritmetica aritmetica2 = new Aritmetica(7, 8);//se llama al constructor con argumentos 
        
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
    }
    
    public void miMetodo(int c){
        System.out.println("Otro metodo con sus propias variables locales " + c);
        this.c = c + 2;
        System.out.println("Otro metodo con sus propias variables locales " + this.c);
    }
    
}
