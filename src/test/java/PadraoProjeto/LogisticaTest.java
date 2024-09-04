package PadraoProjeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogisticaTest {

    @Test
    void testLogisticaRodoviaria() {
        Logistica logistica = new LogisticaRodoviaria();
        Transporte transporte = logistica.criarTransporte();

        assertTrue(transporte instanceof Carro, "O transporte deveria ser um Carro");

        assertDoesNotThrow(transporte::entregar);
    }

    @Test
    void testLogisticaCicloviaria() {
        Logistica logistica = new LogisticaCicloviaria();
        Transporte transporte = logistica.criarTransporte();

        assertTrue(transporte instanceof Bicicleta, "O transporte deveria ser uma Bicicleta");

        assertDoesNotThrow(transporte::entregar);
    }
}