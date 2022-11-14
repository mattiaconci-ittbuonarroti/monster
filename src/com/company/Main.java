package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("Se ni’ mondo esistesse un po’ di bene e ognun si honsiderasse suo fratello ci sarebbe meno pensieri e meno pene e il mondo ne sarebbe assai più bello");
        boolean turno=false;
        Random rand=new Random();
        Monster mostro1= new Monster("Pacciani",100,5);
        Monster mostro2= new Monster("Fantasma",50,10);
        while(mostro1.getPuntiFerita()>0||mostro2.getPuntiFerita()>0){
            turno= rand.nextBoolean();
            if(turno){
                mostro1.subisci(mostro2.attacca());
            }
            else{
                mostro2.subisci(mostro1.attacca());
            }
        }
        if(mostro1.getPuntiFerita()==0){
            System.out.println("il mostro vincitore è "+mostro2.getNome());
        }
        else{
            System.out.println("il mostro vincitore è "+mostro1.getNome());
        }
    }
}
