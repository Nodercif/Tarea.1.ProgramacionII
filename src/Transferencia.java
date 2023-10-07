import java.util.Date;
public class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
    public Transferencia(float monto, Date fecha, String banco, String numCuenta){
        super(monto, fecha);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }

    public String toString(){
        String s = new String();
        s = "Banco: " + this.banco + ".\n";
        s += "Numero de cuenta: " + this.numCuenta + ".\n";
        return s;
    }
}
