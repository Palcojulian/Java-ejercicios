package com.gm.mundopc.computadora;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAXIMO_COMPUTA = 3;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAXIMO_COMPUTA];
    }

    public void agregarComputadora(Computadora computadoras) {
        if (this.contadorComputadoras < Orden.MAXIMO_COMPUTA) {
            this.computadoras[this.contadorComputadoras++] = computadoras;
        } else {
            System.out.println("Ya excedio el maximo de computadoras " + Orden.MAXIMO_COMPUTA);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden N° " + this.idOrden);

        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]);

        }

    }

}
