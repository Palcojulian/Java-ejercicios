
package col.com.jp.amonos;

public class Producto {
    private int idProducto;
    private String nombreProducto;
    private double precioProducto;
    private static int incrementoId;
    
    private Producto(){
        this.idProducto = ++Producto.incrementoId;
    }
    
    public Producto(String nombreProducto, double precioProducto){
        this();//Llama al constructor vacio
        this.nombreProducto = nombreProducto;
        this.precioProducto = precioProducto;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto { id: ").append(idProducto);
        sb.append(", nombre: ").append(nombreProducto);
        sb.append(", precio: ").append(precioProducto);
        sb.append('}');
        return sb.toString();
    }
    
    
}
