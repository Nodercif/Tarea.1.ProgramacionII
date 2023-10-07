import java.util.Date;

public class Efectivo extends Pago {
    public Efectivo(float monto, Date fecha, OrdenCompra ordenCompra){
        super(monto, fecha, ordenCompra);
    }
    public float calcDevolucion(){
        float devolucion = super.getMonto()-super.getOrdenCompra();
        return devolucion;
    }
}
