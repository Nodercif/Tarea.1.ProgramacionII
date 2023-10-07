import java.util.Date;
public class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;
    public Tarjeta(float monto, Date fecha, String tipo, String numTransaccion, OrdenCompra ordenCompra){
       super(monto, fecha, ordenCompra);
       this.tipo = tipo;
       this.numTransaccion = numTransaccion;
    }

    public String toString(){
        String s = new String();
        s = "Tarjeta: " + this.tipo + ".\n";
        s += "Numero de transaccion: " + this.numTransaccion + ".\n";
        return s;
    }
}
