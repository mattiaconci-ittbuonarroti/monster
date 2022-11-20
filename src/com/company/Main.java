package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Se ni’ mondo esistesse un po’ di bene e ognun si honsiderasse suo fratello ci sarebbe meno pensieri e meno pene e il mondo ne sarebbe assai più bello");
        boolean turno=false;
        Weapon arma1=new Weapon(400,"SPADONE DEICIDA");
        Weapon arma2=new Weapon(350,"DARDO DI GRANSAX");
        Weapon arma3=new Weapon(225,"SPADA DELLA NOTTE ARDENTE");
        Weapon arma4=new Weapon(275,"SPADONE DEL FLAGELLO CELESTE ");
        Weapon arma5=new Weapon(375,"FIUMI DI SANGUE");
        Weapon armaDelBoss=new Weapon(350,"MANO DI MALENIA");
        String[] mosse=new String[]{"fuocobomba","eterelama","abisso","giudizio"};
        Weapon[] armi = new Weapon[]{arma1,arma2,arma3,arma4,arma5};
        int armaCasuale=0;
        Random rand=new Random();
        armaCasuale=rand.nextInt(5);
        Monster mostro1= new Monster("Cavaliere errante",1000,50, armi[armaCasuale]);
        Monster mostro2= new Monster("Malenia, Lama di Miquella",500,100,armaDelBoss);
        while(mostro1.getPuntiFerita()>0||mostro2.getPuntiFerita()>0){
            turno= rand.nextBoolean();
            if(turno){
                //mostro1.subisci(mostro2.attacca());
                //System.out.println(mostro2.getNome()+" usa "+mosse[mossa]+" su "+mostro1.getNome());
            }
            else{
                //mostro2.subisci(mostro1.attacca());
                //System.out.println(mostro2.getNome()+" usa "+mosse[mossa]+" su "+mostro1.getNome());
            }
        }
        if(mostro1.getPuntiFerita()==0){
            System.out.println(mostro1.getNome()+" ha perso...");
            System.out.println("il mostro vincitore è "+mostro2.getNome());
        }
        else{
            System.out.println(mostro2.getNome()+" ha perso...");
            System.out.println("il mostro vincitore è "+mostro1.getNome());
        }
        
    }
}
