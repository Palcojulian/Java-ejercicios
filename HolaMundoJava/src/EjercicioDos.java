//Caracteres
public class EjercicioDos {
    public static void main(String[] args) {
        var nombre = "Julian";
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre); //Regresa una posicion en la salida
        System.out.println("Comilla simple: '" + nombre + "'");//la comilla simple no cierra la cadena no es necesario poner el eslash
        System.out.println("Comilla doble: \"" + nombre + "\"");//las comillas dobles si afectan las cadenas, ya que cierra las cadenas
        
    }
}
