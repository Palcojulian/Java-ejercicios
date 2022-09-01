
public class OperadoresAsignacion {
    public static void main(String[] args) {
        int a = 3, b = 5;
        
        int c = a + 5 - b;
        
        System.out.println("c = " + c);
        
        a += 3;//a = a + 1
        System.out.println("a = " + a);
        
        b -= 1; // b = b-1
        System.out.println("b = " + b);
        
        a *= 2; //a = a *2 ;
        System.out.println("a = " + a);
        
        a /= 3; // a = a / 3
        System.out.println("a = " + a);
        
        b %= 2;
        System.out.println("b = " + b);
    }
}
