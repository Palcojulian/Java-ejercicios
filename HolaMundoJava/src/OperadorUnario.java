
public class OperadorUnario {
    public static void main(String[] args) {
        var a = 3;
        var b = -a; //Lo que hace es cambiar el signo del valor original
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        var c = true; 
        var d = !c; //Lo que hace es cambiar el valor de un booleano
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        //Incremento 
        //1. Preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e;//Primero se incrementa e y luego se le asigna el valor a f
        
        System.out.println("e = " + e); 
        System.out.println("f = " + f);
        
        //2. Posincremento(simbolo despues de la variable)
        var g = 5;
        var h = g++;//Primero se utiliza el valor de variable g y despues se incrementa
        
        System.out.println("g = " + g); //Imprime 6
        System.out.println("h = " + h); // Imprime 5
        
        //decremento
        //1. Preincremento
        var i = 4;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //2. Posincremento
        var k = 8;
        var l = k--;
        
        System.out.println("k = " + k);
        System.out.println("l = " + l);

    }
}
