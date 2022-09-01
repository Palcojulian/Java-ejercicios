
public class Boolenos {
    public static void main(String[] args) {
        //Tambien se conoce como tipo bandera
        //verde = true
        //rojo = false
        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){            
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 19;
        
        //var esAdulto = edad >= 18; //Aca se guarda el tipo boolean
        
        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        
    }
}
