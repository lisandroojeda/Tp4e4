package ar.unrn.model;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {

    protected LogTransaction log;
    protected int mesDePromocion;


    public Calculador(int mesDePromocion) {
        log = new LogTransaction();
        this.mesDePromocion = mesDePromocion;

    }

    public double calcularPrecio(double precio) {
        double precioTotal = precio;
        if (!of(mesDePromocion).equals(now().getMonth()))
            precioTotal = mesSinPromo(precio);
        if (of(mesDePromocion).equals(now().getMonth()))
            precioTotal = mesDePromo(precio);
        log.log(this.getClass().getName());
        return precioTotal;
    }

    protected abstract double mesDePromo(double precio);

    protected abstract double mesSinPromo(double precio);
}

