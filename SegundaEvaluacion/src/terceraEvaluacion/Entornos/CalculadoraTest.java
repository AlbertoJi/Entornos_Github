package terceraEvaluacion.Entornos;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CalculadoraTest {

    @Test
    void suma() {
        Calculadora c1 = new Calculadora(2,2);
        assertEquals(4, c1.suma());

    }

    @org.junit.jupiter.api.Test
    void resta() {
    }

    @org.junit.jupiter.api.Test
    void producto() {
    }

    @org.junit.jupiter.api.Test
    void cociente() {
    }
}