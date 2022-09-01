
package col.com.jp.amonos.test;

import col.com.jp.amonos.*;


public class TestVentas {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Azus p4", 250);
        Producto producto2 = new Producto("Dell 780f", 200);
        Producto producto3 = new Producto("Alien Warrior 21", 600);
        Producto producto4 = new Producto("Tuf gaming 21", 350);
        Producto producto5 = new Producto("hp 23", 120);
        Producto producto6 = new Producto("Airoes 98 ", 400);
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.mostarOrden();
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto6);
        orden2.mostarOrden();
        
    }
}
