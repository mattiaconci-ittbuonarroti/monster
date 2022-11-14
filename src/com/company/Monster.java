package com.company;

public class Monster {
    private String nome;
    private int puntiFerita;
    private int danno;

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
