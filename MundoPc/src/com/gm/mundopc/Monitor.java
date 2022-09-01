
package com.gm.mundopc;

public class Monitor {
    private final int idMonitor;
    private String marcaMonitor;
    private double tamanioMonitor;
    private static int contadorMonitores;
    
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marcaMonitor, double tamanioMonitor){
        this();
        this.marcaMonitor = marcaMonitor;
        this.tamanioMonitor = tamanioMonitor;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

   

    public String getMarcaMonitor() {
        return marcaMonitor;
    }

    public void setMarcaMonitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }

    public double getTamanioMonitor() {
        return tamanioMonitor;
    }

    public void setTamanioMonitor(double tamañoMonitor) {
        this.tamanioMonitor = tamañoMonitor;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor: {id: ").append(idMonitor);
        sb.append(", Marca: ").append(marcaMonitor);
        sb.append(", Tama\u00f1o: ").append(tamanioMonitor);
        sb.append('}');
        return sb.toString();
    }
    
}
