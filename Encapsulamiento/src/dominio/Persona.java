
package dominio;

public class Persona {
    //Encapsulamiento
    private String nombre;
    private Double sueldo;
    private boolean eliminado;
    
    
    public Persona(String _nombre, Double _sueldo, boolean _eliminado){
        this.nombre = _nombre;
        this.sueldo = _sueldo;
        this.eliminado = _eliminado;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    
    public Double getSueldo(){
        return this.sueldo;
    }
    
    public void setSueldo(Double _sueldo){
        this.sueldo = _sueldo;
    }
    
    public boolean isEliminado(){
        return this.eliminado;
    }
    
    public void setEliminado(boolean _eliminado){
        this.eliminado = _eliminado;
    }
    
    public String toString(){
        return "Persona [Nombre: " + this.nombre +
                ", Sueldo: " + this.sueldo + 
                ", Eliminado: " + this.eliminado +
                "]";
    }
}
