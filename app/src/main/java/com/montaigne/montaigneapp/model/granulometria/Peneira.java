package com.montaigne.montaigneapp.model.granulometria;

public class Peneira {
    private float massa;
    private float abertura;
    private float massaRetida;

    public Peneira() {
    }

    public Peneira(float massa, float abertura, float massaRetida) {
        this.massa = massa;
        this.abertura = abertura;
        this.massaRetida = massaRetida;
    }

    public float getMassa() {
        return massa;
    }

    public void setMassa(float massa) {
        this.massa = massa;
    }

    public float getAbertura() {
        return abertura;
    }

    public void setAbertura(float abertura) {
        this.abertura = abertura;
    }

    public float getMassaRetida() {
        return massaRetida;
    }

    public void setMassaRetida(float massaRetida) {
        this.massaRetida = massaRetida;
    }
}
