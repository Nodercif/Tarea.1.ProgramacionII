import java.util.Date;
public class MainTarea {
    public static void main(String[] args) {
        Date fecha = new Date(2023, 10, 04);

        OrdenCompra ordenCompra1 = new OrdenCompra(fecha, "vacio");
        OrdenCompra ordenCompra2 = new OrdenCompra(fecha, "vacio");
        OrdenCompra ordenCompra3 = new OrdenCompra(fecha, "vacio");

        Articulo articulo1 = new Articulo(1.5f, "Manzana.", "Fruta roja con sabor dulce.", 1990);
        Articulo articulo2 = new Articulo(1.2f, "Pera.", "Fruta verde con sabor dulce.", 1890);
        Articulo articulo3 = new Articulo(1.4f, "Platano.", "Fruta amarillo con sabor dulce.", 2290);
        Articulo articulo4 = new Articulo(1.8f, "Naranja.", "Fruta naranja con sabor dulce y acido.", 3990);
        Articulo articulo5 = new Articulo(1f, "Frutilla.", "Fruta roja con sabor dulce.", 5990);

        


    }
}
