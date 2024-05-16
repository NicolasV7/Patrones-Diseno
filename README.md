# Patrones de Diseño Creacionales

## Singleton: ejemplo de implementación - Inventario de Mascotas

### Explicación:

🐾 Se implementó el patrón Singleton utilizando una enumeración llamada `InventarioMascotas`. Esto define una única instancia llamada `INSTANCE`, que es la única forma de acceder al inventario de mascotas en toda la aplicación.

🐾 El inventario de mascotas contiene una lista de mascotas, representadas por la clase `Mascota`. Esta clase tiene un nombre y una categoría que indica el tipo de mascota (perro, gato o ave).

🐾 Por otra parte, para agregar mascotas al inventario, se utiliza el método `agregarMascota(Mascota mascota)`, que agrega la mascota a la lista de inventario.

🐾 El método `mostrarInventario()` se encarga de mostrar todas las mascotas presentes en el inventario, imprimiendo el nombre y la categoría de cada mascota.
