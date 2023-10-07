import java.util.ArrayList;
public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    public Cliente(String nombre, String rut, Direccion direccion){
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    public String getRut(){
        return this.rut;
    }

    public void setRut(String rut){
        this.rut = rut;
    }

    public String toString(){
        String s = new String();
        s = "Nombre: " + this.nombre + ".\n";
        s += "Rut: " + this.rut + ".\n";
        s += "Direccion: " +this.direccion.getDireccion() + ".\n";
        return s;
    }
}