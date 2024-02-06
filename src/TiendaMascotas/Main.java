package TiendaMascotas;

public class Main {
    public static void main(String[] args) {
        TiendaMascotas tiendaMascotas = new TiendaMascotas();

        tiendaMascotas.agregarMascota("Firulais", 4, "Caballo");
        tiendaMascotas.agregarMascota("Martin", 5, "Perro");
        tiendaMascotas.agregarMascota("Jose", 7, "Oso");

        tiendaMascotas.venderMascota("Firulais");

        tiendaMascotas.mostrarInventario();
    }

}

