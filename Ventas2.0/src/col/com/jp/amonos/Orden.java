
package col.com.jp.amonos;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private int contadorProductos;
    private static int cantidadOrdenes;
    private static int MAXPRODUCTOS = 5;
    
    public Orden(){
        this.idOrden = ++Orden.cantidadOrdenes;
        this.productos = new Producto[Orden.MAXPRODUCTOS];
    }
    
    public void agregarProducto(Producto producto){
        if(contadorProductos < Orden.MAXPRODUCTOS){
            this.productos[contadorProductos++] = producto;
        }else{
            System.out.println("Producto con { id: " + (Orden.MAXPRODUCTOS+1) + " } no pudo ser agregada " 
                    + ", ya excedio el maximo de productos que es "+ Orden.MAXPRODUCTOS + " por orden");
        }
    }
    
    public double precioTotalProductos(){
        double total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecioProducto();
        }
        return total;
    }

    public void mostarOrden(){
        System.out.println("Orden numero " + this.idOrden);
        System.out.println("Cantidad de productos: " + this.contadorProductos);
        System.out.println("Productos de la orden ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
        double totalOrden = precioTotalProductos();
        System.out.println("Total de la orden: " + totalOrden);
        
    }
    
    
    
}
