package org.example;

public class Fatura {
    private double valor;
    private int diasAtraso;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDiasAtraso() {
        return diasAtraso;
    }

    public void setDiasAtraso(int diasAtraso) {
        this.diasAtraso = diasAtraso;
    }

    public double recalcularValorFatura() {
        return Banco.calcularValorComJuros(this.valor, this.diasAtraso);
    }
}

