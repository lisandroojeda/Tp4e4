package ar.unrn.model;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorJubilado extends Calculador{

    private final double porcentajeDescuentoMesNoPromo = 0.1;
    public CalculadorJubilado(int mesDePromocion) {
        super(mesDePromocion);
    }

    @Override
    protected double mesDePromo(double precio) {
        return precio;
    }

    @Override
    protected double mesSinPromo(double precio) {
        return precio + precio* porcentajeDescuentoMesNoPromo;
    }
}
