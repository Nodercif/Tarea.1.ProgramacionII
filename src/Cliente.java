import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private String rut;
    private ArrayList<OrdenCompra> ordenCompra;
    private Direccion Direccion;
    public Cliente(String nombre, String rut){
        this.nombre = nombre;
        this.rut = rut;
    }

}