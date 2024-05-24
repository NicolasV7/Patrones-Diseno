package com.mediator;

public class Coche {

    private Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void enciende() {
        mediator.encenderCoche();
        System.out.println("Coche encendido");
    }

    public void apaga() {
        mediator.apagarCoche();
        System.out.println("Coche apagado");
    }
}
