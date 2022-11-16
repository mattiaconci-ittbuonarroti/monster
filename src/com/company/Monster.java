package com.company;

public class Monster {
    private String nome;
    private int puntiFerita;
    private int danno;
    private Weapon arma;

    public Monster(String nome, int puntiFerita, int danno, Weapon arma) {
        this.nome = nome;
        this.puntiFerita = puntiFerita;
        this.danno = danno;
        this.arma=arma;
    }

    public int attacca(){
        return danno;
    }

    public void subisci(int dannoSubito){
        puntiFerita-=dannoSubito;
    }

    public String getNome() {
        return nome;
    }

    public int getPuntiFerita() {
        return puntiFerita;
    }
}
