import java.util.Date;
import java.util.ArrayList;
public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalleOrden;
    private Cliente cliente;
    private DocTributario docTributario;
    private ArrayList<Pago> pago;
    public OrdenCompra(Date fecha, String estado, Cliente cliente){
        this.fecha = fecha;
        this.estado = estado;
        this.cliente = cliente;
        this.docTributario = null;
        this.pago = new ArrayList<>();
        this.detalleOrden = new ArrayList<>();
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public DocTributario getDocumento() {
        return this.docTributario;
    }

    public void setDocumento(DocTributario documento) {
        this.docTributario = documento;
    }

    public void addPago(Pago pago) {
        this.pago.add(pago);
    }

    public Pago getPago(int indice) {
        if (indice < 0 || indice > this.pago.size() - 1) return null;
        return this.pago.get(indice);
    }

    public void addDetalleOrden(int cantidad, Articulo articulo) {
        this.detalleOrden.add(new DetalleOrden(cantidad, articulo));
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

    public String toString() {
        String s = new String();
        s = "  Estado: " + this.estado + ".\n";
        s += "  Precio: $" + this.calcPrecio() + ".\n";
        s += "  Peso:   " + this.calcPeso() + "Kg.\n";
        return s;
    }
}
