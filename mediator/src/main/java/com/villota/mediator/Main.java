package com.mediator;

public class Main {

    public static void main(String[] args) {
        CocheMediator mediator = new CocheMediator();

        Coche coche = new Coche();
        Telefono telefono = new Telefono();
        Radio radio = new Radio();

        coche.setMediator(mediator);
        telefono.setMediator(mediator);
        radio.setMediator(mediator);

        mediator.setCoche(coche);
        mediator.setTelefono(telefono);
        mediator.setRadio(radio);

        coche.enciende();
        telefono.recibeLlamada();
        coche.apaga();
    }
}
