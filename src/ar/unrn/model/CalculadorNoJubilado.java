package ar.unrn.model;
import static java.time.LocalDate.now;
import static java.time.Month.of;

public class CalculadorNoJubilado extends Calculador{

    private final double porcentajeDescuentoMesPromo = 0.15;
    private final double porcentajeDescuentoMesNoProm = 0.21;

    public CalculadorNoJubilado(int mesDePromocion) {
        super(mesDePromocion);
    }

    @Override
    protected double mesDePromo(double precio) {
        return precio + precio*porcentajeDescuentoMesPromo;
    }

    @Override
    protected double mesSinPromo(double precio) {
        return precio + precio*porcentajeDescuentoMesNoProm;
    }


}

