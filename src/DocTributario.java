import java.util.Date;
public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private Direccion Direccion;
    public DocTributario(String numero, String rut, Date fecha) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = fecha;
    }
}