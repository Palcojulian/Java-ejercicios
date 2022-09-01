
package com.gm.mundopc.computadora;

import com.gm.mundopc.Monitor;
import com.gm.mundopc.dispoentrada.*;


public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorCompu;
    
    private Computadora(){
        this.idComputadora = ++Computadora.contadorCompu;
        
    }
    
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Computadora [id: ").append(idComputadora);
        sb.append(", nombre: ").append(nombre);
        sb.append(" \n").append(monitor);
        sb.append(" \n").append(teclado);
        sb.append(" \n").append(raton);
        sb.append(']');
        sb.append("\n --------------");
        return sb.toString();
    }
    
    
    
}


