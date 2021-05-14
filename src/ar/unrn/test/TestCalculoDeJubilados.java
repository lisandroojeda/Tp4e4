package ar.unrn.test;

import ar.unrn.model.Calculador;
import ar.unrn.model.CalculadorJubilado;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCalculoDeJubilados {

    @Test
    public void jubiladosConPromo(){
        Calculador calculador = new CalculadorJubilado(LocalDateTime.now().getMonth().getValue());
        double resultado = calculador.calcularPrecio(50);
        assertEquals(50, resultado);
    }

    @Test
    public void jubiladosSinPromo(){
        Calculador calculador = new CalculadorJubilado(LocalDateTime.now().getMonth().getValue()-1);
        double resultado = calculador.calcularPrecio(50);
        assertEquals(55, resultado);
    }


}
