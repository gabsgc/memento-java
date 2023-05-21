import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncomendaTest {

    @Test
    void deveArmazenarEstados() {
        Encomenda encomenda = new Encomenda();
        encomenda.setEstado(EncomendaEmPreparo.getInstance());
        encomenda.setEstado(EncomendaEnviada.getInstance());
        assertEquals(2, encomenda.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        Encomenda encomenda = new Encomenda();
        encomenda.setEstado(EncomendaEmPreparo.getInstance());
        encomenda.setEstado(EncomendaEnviada.getInstance());
        encomenda.restauraEstado(0);
        assertEquals(EncomendaEmPreparo.getInstance(), encomenda.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        Encomenda encomenda = new Encomenda();
        encomenda.setEstado(EncomendaEmPreparo.getInstance());
        encomenda.setEstado(EncomendaEnviada.getInstance());
        encomenda.setEstado(EncomendaEmRota.getInstance());
        encomenda.setEstado(EncomendaEntregue.getInstance());
        encomenda.restauraEstado(2);
        assertEquals(EncomendaEmRota.getInstance(), encomenda.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            Encomenda encomenda = new Encomenda();
            encomenda.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }
}