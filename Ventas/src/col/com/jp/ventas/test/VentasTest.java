
package col.com.jp.ventas.test;

import col.com.jp.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50);
        Producto producto2 = new Producto("Pantalon", 80);
        Producto producto3 = new Producto("Chaqueta", 80);
        Producto producto4 = new Producto("Buzo", 30);
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.mostrarOrden();
        
        Orden orden2 = new Orden();
        
        orden2.agregarProducto(producto4);
        orden2.mostrarOrden();
        
    }
}
