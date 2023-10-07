public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    private OrdenCompra ordenCompra;
    public DetalleOrden(int cantidad, Articulo articulo){
        this.cantidad = cantidad;
        this.articulo = articulo;
    }
    public float calcPrecio(){
        float precio = (cantidad * articulo.getPrecio());
        return precio;
    }
    public float calcPrecioSinIVA(){
        float precio = (cantidad * articulo.getPrecio()) * (1f-0.19f);
        return precio;
    }
    public float calcIVA(){
        float IVA = (cantidad * articulo.getPrecio()) - (cantidad * articulo.getPrecio()) * (1f-0.19f);
        return IVA;
    }
    public float calcPeso(){
        float peso = cantidad * articulo.getPeso();
        return peso;
    }

    public String toString() {
        String s = new String();
        s = "Detalle de Orden:\n";
        s += "Articulo: " + this.articulo.getNombre() + ".\n";
        s += "Cantidad: " + this.cantidad + ".\n";
        s += "Precio: $" + this.calcPrecio() + ".\n";
        s += "Peso: " + this.calcPeso() + "ks.\n";
        return s;
    }
}
