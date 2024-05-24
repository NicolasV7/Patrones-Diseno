package com.mediator;

public class Radio {

    private boolean encendida = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        encendida = true;
        mediator.encenderRadio();
    }

    public void apaga() {
        encendida = false;
    }

    // Métodos sin mediador para evitar recursión infinita
    public void enciendeSinMediador() {
        encendida = true;
    }

    public void apagaSinMediador() {
        encendida = false;
    }

    public boolean encendida() {
        return encendida;
    }
}
