
public class Ejercicio {

    public static void main(String[] args) {
        var usuario = "Julian";
        var titulo = "Inge";

        var union = titulo + " " + usuario;

        System.out.println("Union = " + union);

        var i = 4; //No es recomendable nombrar variables tan cortas
        var j = 8;
        
        //El orden de izquierda a derecha de las varibles es importante
        
        System.out.println(i + j); //realiza la suma entre las dos variables
        System.out.println(i + j + usuario);// Se realiza la suma y luego imprime el valor de usuario que es una cadena
        System.out.println(usuario + i + j);//Si de izquiera a derecha encuentra una cadena, los valores los va tomar como un cadena
        System.out.println(usuario + (i + j)); // aca se toma como prioridad las variables que estan en los parentesis
        
        
    }
}
