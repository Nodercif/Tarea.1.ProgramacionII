public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;
    public DetalleOrden(int cantidad){
        this.cantidad = cantidad;
    }
    public int calcPrecio(){
        int precio = (cantidad * (int)articulo.getPrecio());
        return precio;
    }
    public int calcPrecioSinIVA(){
        int precio = (int)((cantidad * (int)articulo.getPrecio()) * (1.0-0.19));
        return precio;
    }
    public int calcIVA(){
        int IVA = (cantidad * (int)articulo.getPrecio()) - (int)((cantidad * (int)articulo.getPrecio()) * (1.0-0.19));
        return IVA;
    }
    public int calcPeso(){
        int peso = cantidad * (int)articulo.getPeso();
        return peso;
    }
}
