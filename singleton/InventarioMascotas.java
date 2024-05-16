package singleton;

import java.util.ArrayList;
import java.util.List;

enum InventarioMascotas {
    INSTANCE; 
    private List<Mascota> inventario = new ArrayList<>();

    public void agregarMascota(Mascota mascota) {
        System.out.println("Agregando mascota al inventario: " + mascota.getNombre());
        inventario.add(mascota);
    }

    public void mostrarInventario() {
        System.out.println("Inventario de mascotas:");
        for (Mascota mascota : inventario) {
            System.out.println(mascota.getNombre() + " - Categoría: " + mascota.getCategoria());
        }
    }
}
