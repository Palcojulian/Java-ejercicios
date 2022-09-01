
package domain;

public class Empleado extends Persona{ //Extiende de la clase padre Persona, hereda de la clase Persona 
    private int idEmpleado;
    private double sueldoEmpleado;
    private static int contadorEmpleado;//Se incrementa cada vez que se crea un objeto de tipo empleado

    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;//Variable estatica
    }
    
    public Empleado(String nombre, double sueldoEmpleado) {
        //super(nombre);
        this();//Llamamos el constructor vacio, porque no tiene ningun argumento
        this.nombre = nombre;
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }


    public double getSueldoEmpleado() {
        return this.sueldoEmpleado;
    }

    public void setSueldoEmpleado(double sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" Empleado{idEmpleado=").append(idEmpleado);
        sb.append(", sueldoEmpleado=").append(sueldoEmpleado);
        sb.append(", nombre=").append(this.nombre);
        sb.append('}');
        sb.append("\n Otra impresion = ").append(super.toString());//En esta linea se llama el metodo toString de la clase padre
        return sb.toString();
    }
    
    
    
    
    
}
