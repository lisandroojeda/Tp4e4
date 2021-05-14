package ar.unrn.test;

import ar.unrn.model.Calculador;
import ar.unrn.model.CalculadorJubilado;
import ar.unrn.model.CalculadorNoJubilado;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculoDeNoJubilados {
    @Test
    public void noJubiladosConPromo(){
        Calculador calculador = new CalculadorNoJubilado(LocalDateTime.now().getMonth().getValue());
        double resultado = calculador.calcularPrecio(50);
        assertEquals(57.5, resultado);
    }

    @Test
    public void noJubiladosSinPromo(){
        Calculador calculador = new CalculadorNoJubilado(LocalDateTime.now().getMonth().getValue()-1);
        double resultado = calculador.calcularPrecio(50);
        assertEquals(60.50, resultado);
    }


}
