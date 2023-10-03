import java.util.Date;
public abstract class Pago {
    private float monto;
    private Date fecha;
    private OrdenCompra ordenCompra;
    public Pago(float monto, Date fecha){
        this.monto = monto;
        this.fecha = ordenCompra.getFecha();
    }

    public float getOrdenCompra(){
        return this.ordenCompra.calcPrecio();
    }

    public float getMonto(){
        return this.monto;
    }
}
