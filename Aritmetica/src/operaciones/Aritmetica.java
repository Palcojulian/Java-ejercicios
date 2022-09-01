package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a; //El alcance de las variables que se crean dentro de una clase es mayor
    int b;

    //Cnstructor se llama igual que la clase, este constructor esta vacio
    public Aritmetica(){ //El constructor vacio siempre se va aagregar automaticamente, si no lo definimos, bueno en el IDE de neatbeans
        System.out.println("Ejecutanto constructor");
            
    }
    
    //Agregar dos o mas constructores dentro de la misma clase se le llama sobrecarga de constructores
    public Aritmetica(int a, int b){
        this.a = a;
        this.b = b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    
    //Metodos 
    public void sumar() { //Se define el metod, Void quiere decir que no devuelve nada 
        int resultado = a + b; //Este metodo solo se encarga de realizar la suma, luego la imprime 
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){ // Este metodo retorna un entero 
       //int resultado = a + b; //Lo que hace este metodo es regresar el resultado      
       //return resultado;
   
       return this.a + this.b;
    }
    
    public int sumaConAgumentos(int a, int b){ //Se declaran los argumentos
        this.a = a;   // this se utliza dentro de la clase en donde estemos trabajando
        this.b = b;   // hace referencia a un atributo de nuestra clase y no a una variable local
        return this.sumarConRetorno(); // se llama el otro metodo, reutizandolo. metodo de nuestra clase y no un metodo
        //independiente de nuestra clase en verde son los atributos de la clase y en negro las argumentos del metodo
    }
    
    /*
        El argumento a se asigna al atributo this.a que es un atributo de la clase
    */
    
}
