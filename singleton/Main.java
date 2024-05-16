package singleton;

public class Main {
    public static void main(String[] args) {
      
        InventarioMascotas.INSTANCE.agregarMascota(new Mascota("Fido", CategoriaMascota.PERRO));
        InventarioMascotas.INSTANCE.agregarMascota(new Mascota("Mittens", CategoriaMascota.GATO));
        InventarioMascotas.INSTANCE.agregarMascota(new Mascota("Tweety", CategoriaMascota.AVE));
        InventarioMascotas.INSTANCE.mostrarInventario();
    }
}
