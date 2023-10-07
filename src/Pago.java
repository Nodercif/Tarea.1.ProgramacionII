import java.util.Date;
public abstract class Pago {
    private float monto;
    private Date fecha;
    private OrdenCompra ordenCompra;
    public Pago(float monto, Date fecha, OrdenCompra ordenCompra){
        this.ordenCompra = ordenCompra;
        this.monto = monto;
        this.fecha = ordenCompra.getFecha();
    }

    public float getOrdenCompra(){
        return this.ordenCompra.calcPrecio();
    }

    public float getMonto(){
        return this.monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
