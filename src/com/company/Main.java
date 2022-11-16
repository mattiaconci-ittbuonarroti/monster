package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Se ni’ mondo esistesse un po’ di bene e ognun si honsiderasse suo fratello ci sarebbe meno pensieri e meno pene e il mondo ne sarebbe assai più bello");
        boolean turno=false;
        String[] mosse=new String[]{"fuocobomba","eterelama","abisso","giudizio"};
        int mossa=0;
        int denaro=0;
        Random rand=new Random();
        denaro= rand.nextInt(10000);
        Monster mostro1= new Monster("Yeti",1000,50);
        Monster mostro2= new Monster("bigfoot",500,100);
        while(mostro1.getPuntiFerita()>0||mostro2.getPuntiFerita()>0){
            turno= rand.nextBoolean();
            mossa=rand.nextInt(4);
            if(turno){
                mostro1.subisci(mostro2.attacca());
                System.out.println(" "+mostro2.getNome()+"usa "+mosse[mossa]+" su"+mostro1.getNome());
            }
            else{
                mostro2.subisci(mostro1.attacca());
                System.out.println(" "+mostro2.getNome()+"utilizza "+mosse[mossa]+" su"+mostro1.getNome());
            }
        }
        if(mostro1.getPuntiFerita()==0){
            System.out.println(mostro1.getNome()+" è esausto...");
            System.out.println("il mostro vincitore è "+mostro2.getNome());
            System.out.println("hai vinto"+denaro+"$");
        }
        else{
            System.out.println(mostro2.getNome()+" è esausto...");
            System.out.println("il mostro vincitore è "+mostro1.getNome());
            System.out.println("hai vinto"+denaro+"$");
        }
        
    }
}
