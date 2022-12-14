package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        boolean turno=false;
        Weapon arma1=new Weapon(400,"SPADONE DEICIDA");
        Weapon arma2=new Weapon(350,"DARDO DI GRANSAX");
        Weapon arma3=new Weapon(250,"SPADA DELLA NOTTE ARDENTE");
        Weapon arma4=new Weapon(275,"SPADONE DEL FLAGELLO CELESTE");
        Weapon arma5=new Weapon(375,"FIUMI DI SANGUE");
        Weapon armaDelBoss=new Weapon(300,"MANO DI MALENIA");
        //String[] mosse=new String[]{"fuocobomba","eterelama","abisso","giudizio"};
        Weapon[] armi = new Weapon[]{arma1,arma2,arma3,arma4,arma5};
        int armaCasuale=0;
        int possibilita;
        Random rand=new Random();
        armaCasuale=rand.nextInt(5);
        Monster mostro1= new Monster("Cavaliere errante",12500,50, armi[armaCasuale]);
        System.out.println(mostro1.getNome()+" ha ottenuto"+armi[armaCasuale].getNomeArma());
        Monster mostro2= new Monster("Malenia, Lama di Miquella",15000,75,armaDelBoss);
        while(mostro1.getPuntiFerita()>0 && mostro2.getPuntiFerita()>0){
            turno=rand.nextBoolean();
            if(turno){
                mostro2.subisci(mostro1.attaccaConArma());
                System.out.println(mostro1.getNome()+" attacca "+mostro2.getNome()+" con "+mostro1.getArma().getNomeArma()+" infliggendo "+(mostro1.getArma().getDannoArma()+mostro1.getDanno())+ " danni");
                possibilita=rand.nextInt(4);
                if(possibilita>=2 && mostro1.getPuntiFerita()>0 && mostro1.getArma().getNomeArma().equals("mano")){
                    mostro1.perdiArma(new Weapon(0,"pugno"));
                    System.out.println(mostro1.getNome()+" ha perso la sua arma!");
                    if(possibilita>=3){
                        armaCasuale=rand.nextInt(5);
                        mostro1.setArma(armi[armaCasuale]);
                        System.out.println(mostro1.getNome()+" ha trovato "+armi[armaCasuale].getNomeArma()+"! Che fortuna!");
                    }
                }
            }
            else{
                mostro1.subisci(mostro2.attaccaConArma());
                System.out.println(mostro2.getNome()+" attacca "+mostro1.getNome()+" con "+mostro2.getArma().getNomeArma()+" infliggendo "+(mostro2.getArma().getDannoArma()+mostro2.getDanno())+ " danni");
            }
        }
        if(mostro1.getPuntiFerita()<mostro2.getPuntiFerita()){
            System.out.println(mostro1.getNome()+" ha perso...");
            System.out.println("il mostro vincitore ?? "+mostro2.getNome());
        }
        else{
            System.out.println(mostro2.getNome()+" ha perso...");
            System.out.println("il mostro vincitore ?? "+mostro1.getNome());
        }

    }
}
