
public class OpeIgualRela {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = (a != b);
        System.out.println("d = " + d);

        var cadena1 = "Hola";
        var cadena2 = "Adios";

        var e = (cadena1 == cadena2); //Compara referencias de objetos
        System.out.println("e = " + e);

        var f = cadena1.equals(cadena2); //Compara el contenido de las cadenas
        System.out.println("f = " + f);

        //Operadores relacionales 
        var g = (a >= b);
        System.out.println("g = " + g);

        if (a % 2 == 0) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }
        
        var edad = 18;
        var adulto = 18;
        
        if (edad >= adulto){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
        
        
    }
}
