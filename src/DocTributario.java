import java.util.Date;
public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion Direccion;
    private OrdenCompra ordenCompra;
    public DocTributario(String numero) {
        this.numero = numero;
        this.rut = ordenCompra.getCliente().getRut();
        this.fecha = ordenCompra.getFecha();
    }
}