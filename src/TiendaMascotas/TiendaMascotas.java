package TiendaMascotas;

public class TiendaMascotas {
    Mascota[] inventario;
    int cantidadMascotas;

    public TiendaMascotas() {
        this.inventario = new Mascota[100];
        this.cantidadMascotas = 0;
    }

    public void agregarMascota(String nombre, int edad, String tipoAnimal) {
        Mascota mascota = new Mascota(nombre, edad, tipoAnimal);
        inventario[cantidadMascotas] = mascota;
        cantidadMascotas++;
        System.out.println("La mascota " + nombre + "se a añadido correctamente.");
    }

    public void venderMascota(String nombre) {
        for (int i = 0; i < cantidadMascotas; i++) {
            if (inventario[i].getNombre().equals(nombre)) {
                System.out.println("La mascota" + inventario[i].getNombre() + " se ha vendido");
                inventario[i] = null;
                for (int j = 0; j < cantidadMascotas; j++) {
                    inventario[j] = inventario[j + 1];
                }
                cantidadMascotas--;
                return;
            }

        }
        System.out.println("La mascota con nombre" + nombre + "no se encuentra");
    }

    public void mostrarInventario() {
        if (cantidadMascotas == 0) {
            System.out.println("No hay mascotas en el inventario.");
        } else {
            System.out.println("Inventario de la tienda:");
            for (int i = 0; i < cantidadMascotas; i++) {
                System.out.println("Nombre de la mascota: "+inventario[i].getNombre());
            }
        }
    }
}