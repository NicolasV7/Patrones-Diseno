package com.mediator;

public class Telefono {

    private boolean musicaOn = false;
    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void recibeLlamada() {
        mediator.sonarTelefono();
    }

    public void enciendeMusica() {
        musicaOn = true;
    }

    public void apagaMusica() {
        musicaOn = false;
    }

    public boolean musicaEncendida() {
        return musicaOn;
    }
}
