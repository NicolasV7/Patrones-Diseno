package singleton;

import java.io.Serializable;

class Mascota implements Serializable {
    private final String nombre;
    private final CategoriaMascota categoria;

    public Mascota(String nombre, CategoriaMascota categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public CategoriaMascota getCategoria() {
        return categoria;
    }
}
