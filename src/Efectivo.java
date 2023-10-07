import java.util.Date;

public class Efectivo extends Pago {
    public Efectivo(float monto, Date fecha){
        super(monto, fecha);
    }
    public float calcDevolucion(){
        float devolucion = super.getMonto()-super.getOrdenCompra();
        return devolucion;
    }
}
