package com.gm.mundopc.testmundopc;

import com.gm.mundopc.*;
import com.gm.mundopc.computadora.*;
import com.gm.mundopc.dispoentrada.*;

public class MundoPcTest {

    public static void main(String[] args) {
        Raton raton1 = new Raton("bluetooth", "Genius");
        Teclado teclado1 = new Teclado("bluetooth", "Hp");
        Monitor monitor1 = new Monitor("Huewei", 20);

        Raton raton2 = new Raton("USB 3.0", "Samsugn");
        Teclado teclado2 = new Teclado("USB 2.0", "Genius");
        Monitor monitor2 = new Monitor("LG", 30);

        Raton raton3 = new Raton("USB 2.0", "Huawei");
        Teclado teclado3 = new Teclado("USB 3.0", "Genius");
        Monitor monitor3 = new Monitor("Samsung", 50);
//        System.out.println(raton1);
//        System.out.println(teclado1);
//        System.out.println(monitor1);

//        System.out.println(raton2);
//        System.out.println(teclado2);
//        System.out.println(monitor2);
        Computadora computadora1 = new Computadora("Alien Warrior", monitor1, teclado1, raton2);
        Computadora computadora2 = new Computadora("TUF GAMING", monitor3, teclado2, raton3);
        //System.out.println(computadora1);

        Orden computadoras = new Orden();
        computadoras.agregarComputadora(computadora1);
        computadoras.agregarComputadora(computadora2);
        computadoras.mostrarOrden();
    }
}
