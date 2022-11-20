package com.company;

public class Monster{
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
    public Monster(String nome, int puntiFerita, int danno) {
        this.nome = nome;
        this.puntiFerita = puntiFerita;
        this.danno = danno;
        arma=new Weapon(0,"mano");
    }

    public int attacca(){
        return danno;
    }

    public int attaccaConArma(){
        return danno+arma.getDannoArma();
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

    public Weapon getArma() {
        return arma;
    }
}
