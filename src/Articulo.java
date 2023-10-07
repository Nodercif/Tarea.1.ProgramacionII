public class Articulo {
    private float peso;
    private String nombre;
    private String descripcion;
    private float precio;
    public Articulo(float peso, String nombre, String descripcion, float precio){
        this.peso = peso;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String toString() {
        String s = new String();
        s = "Articulo: " + this.nombre + "\n";
        s += "Descripcion del articulo: " + this.descripcion + "\n";
        s += " Peso: " + this.peso + "\n";
        s += " Precio: " + this.precio + "\n";
        return s;
    }
}