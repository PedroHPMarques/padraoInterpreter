package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaturaTest {
    @Test
    void deveRecalcularValorFaturaComFormula() {
        Fatura fatura = new Fatura();
        fatura.setValor(100.0);
        fatura.setDiasAtraso(10);

        assertEquals(105.0, fatura.recalcularValorFatura());
    }

}