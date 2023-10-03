import java.util.Date;
import java.util.ArrayList;
public class OrdenCompra {
    private Date fecha;
    private String estado;
    private Articulo articulo;
    private ArrayList<DetalleOrden> detalleOrden;
    private Cliente cliente;
    public OrdenCompra(Date fecha, String estado){
        this.fecha = fecha;
        this.estado = estado;
    }
    public int calcPrecioSinIVA(){
        int precioSinIVA = 0;
        for(int i = 0; i < detalleOrden.size(); i++){
            precioSinIVA += detalleOrden.get(i).calcPrecioSinIVA();
        }
        return precioSinIVA;
    }
    public float calcIVA(){
        int IVA = 0;
        for(int i = 0; i < detalleOrden.size(); i++){
            IVA += detalleOrden.get(i).calcIVA();
        }
        return IVA;
    }
    public float calcPrecio(){
        int precio = 0;
        for(int i = 0; i < detalleOrden.size(); i++){
            precio += detalleOrden.get(i).calcPrecio();
        }
        return precio;
    }
    public float calcPeso(){
        int peso = 0;
        for(int i = 0; i < detalleOrden.size(); i++){
            peso += detalleOrden.get(i).calcPeso();
        }
        return peso;
    }
}
