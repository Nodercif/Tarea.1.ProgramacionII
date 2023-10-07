import java.util.Date;
public class MainTarea {
    public static void main(String[] args) {
        Date fecha = new Date(2023, 10, 04);

        Direccion direccion1 = new Direccion("Mi casa.");
        Direccion direccion2 = new Direccion("Tu casa.");
        Cliente cliente1 = new Cliente("Gabriela.", "11111111-1", direccion1);
        Cliente cliente2 = new Cliente("Gabriela2", "2222222-2", direccion2);

        OrdenCompra ordenCompra1 = new OrdenCompra(fecha, "vacio", cliente1);
        OrdenCompra ordenCompra2 = new OrdenCompra(fecha, "vacio", cliente1);
        OrdenCompra ordenCompra3 = new OrdenCompra(fecha, "vacio", cliente2);


        Articulo articulo1 = new Articulo(1.5f, "Manzana.", "Fruta roja con sabor dulce.", 1990);
        Articulo articulo2 = new Articulo(1.2f, "Pera.", "Fruta verde con sabor dulce.", 1890);
        Articulo articulo3 = new Articulo(1.4f, "Platano.", "Fruta amarillo con sabor dulce.", 2290);
        Articulo articulo4 = new Articulo(1.8f, "Naranja.", "Fruta naranja con sabor dulce y acido.", 3990);
        Articulo articulo5 = new Articulo(1f, "Frutilla.", "Fruta roja con sabor dulce.", 5990);

        ordenCompra1.addDetalleOrden(4, articulo1);
        ordenCompra1.addDetalleOrden(3, articulo2);
        ordenCompra1.addDetalleOrden(8, articulo3);
        ordenCompra1.addDetalleOrden(9, articulo4);
        ordenCompra1.addDetalleOrden(2, articulo5);

        ordenCompra2.addDetalleOrden(4, articulo1);
        ordenCompra2.addDetalleOrden(3, articulo2);
        ordenCompra2.addDetalleOrden(8, articulo3);
        ordenCompra2.addDetalleOrden(9, articulo4);
        ordenCompra2.addDetalleOrden(2, articulo5);

        ordenCompra3.addDetalleOrden(4, articulo1);
        ordenCompra3.addDetalleOrden(3, articulo2);
        ordenCompra3.addDetalleOrden(8, articulo3);
        ordenCompra3.addDetalleOrden(9, articulo4);
        ordenCompra3.addDetalleOrden(2, articulo5);




        //No alcancé

    }
}
