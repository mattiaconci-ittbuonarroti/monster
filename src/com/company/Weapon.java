package com.company;

public class Weapon {
    private int dannoArma;
    private String nomeArma;

    public Weapon(int dannoArma, String nomeArma) {
        this.dannoArma = dannoArma;
        this.nomeArma = nomeArma;
    }

    public int getDannoArma() {
        return dannoArma;
    }

    public String getNomeArma() {
        return nomeArma;
    }

    public void setDannoArma(int dannoArma) {
        this.dannoArma = dannoArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }
}
