package com.mediator;

public class CocheMediator implements Mediator {

    private Coche coche;
    private Telefono telefono;
    private Radio radio;

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void encenderCoche() {
        if (!radio.encendida()) {
            radio.enciendeSinMediador();
        }
        if (telefono.musicaEncendida()) {
            telefono.apagaMusica();
        }
    }

    @Override
    public void apagarCoche() {
        if (radio.encendida()) {
            radio.apagaSinMediador();
        }
    }

    @Override
    public void sonarTelefono() {
        if (radio.encendida()) {
            radio.apagaSinMediador();
        }
    }

    @Override
    public void encenderRadio() {
        if (telefono.musicaEncendida()) {
            telefono.apagaMusica();
        }
    }
}
