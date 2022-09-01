
package domain;

public final class Persona {//si es final, esta clase no puede hacer herencias 
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }
    
}
