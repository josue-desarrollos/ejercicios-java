package CartasP;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Deck {
        ArrayList<Object>Labara = new ArrayList<>();

        public Deck(){
        String p = "",c,v = "";
        //este random nos permitira genear el color, ya sea rojo o negro
        int R =(new Random().nextInt(2));
        if (R==2)
            c="Negro";
        else
            c = "Rojo";
        for(int x=2; x<=52; x++)
        {// aqui asignamos si es A, J, Q.
            if(x==2 || x==18 || x==35){
                v="A";}
            else if(x==11 || x==28 || x==45){
                v="J";}
            else if(x==18 || x==35 || x==52){
                v="Q";}
            else{//aqui asignamos si es del 2 al 10
                if(x<13 && x>1)
                    v=Integer.toString(x);
                else if (x<23)
                    v=Integer.toString((x-13));
                else if (x<33)
                    v=Integer.toString((x-23));
                else if (x<43)
                    v=Integer.toString((x-33));
                else if (x<52)
                    v=Integer.toString((x-42));
            }//aqui asignamos si es tréboles, corazones, picas o diamantes.
             if(x<=13)
                 p="Corazones";
             else if (x<=26)
                 p="Picas";
             else if (x<=39)
                 p="Tréboles";
             else if (x<=52)
                 p="Diamantes";
            Card Tarje =new Card(p,c,v);
            Labara.add("palo "+Tarje.Palo+" color "+Tarje.Color+" valor "+Tarje.Valor);
        }
    }

    public String shuffle()
    {

        if (Labara.size()<=0)
            System.out.println("El Deck esta vacio..");
        else{
            Collections.shuffle(Labara);
            System.out.println("Se mezcló el Deck");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "El deck a sido mezclado";
    }
    public String  head()
    {
        System.out.println("se removera: "+Labara.get(1));
        Labara.remove(1);
        System.out.println("Quedan: "+Labara.size()+" Cartas");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "se removera: "+Labara.get(1)+""+"Quedan: "+Labara.size()+" Cartas\n";
    }
    public String pick()
    {
        System.out.println("pick");
        int R =(new Random().nextInt(Labara.size()));
        System.out.println("se removera "+Labara.get(R));
        Labara.remove(R);
        System.out.println("Quedan: "+Labara.size()+" Cartas");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "se removera "+Labara.get(R)+"\n"+"Quedan: "+Labara.size()+" Cartas\n";
    }
    public String hand()
    {
        System.out.println("Hand");
        int R = (new Random().nextInt(Labara.size()));
        int f = (new Random().nextInt(Labara.size()));
        int h = (new Random().nextInt(Labara.size()));
        int k = (new Random().nextInt(Labara.size()));
        int ñ = (new Random().nextInt(Labara.size()));
        System.out.println("se removera "+Labara.get(R));
        Labara.remove(R);
        System.out.println("se removera "+Labara.get(f));
        Labara.remove(f);
        System.out.println("se removera "+Labara.get(h));
        Labara.remove(h);
        System.out.println("se removera "+Labara.get(k));
        Labara.remove(k);
        System.out.println("se removera "+Labara.get(ñ));
        Labara.remove(ñ);
        System.out.println("Quedan: "+Labara.size()+" Cartas");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "se removera "+Labara.get(R)+"\n se removera "+Labara.get(f)+"\n se removera "+Labara.get(h)+"\n se removera "+Labara.get(k)+"\n se removera "+Labara.get(ñ)+"\n Quedan: "+Labara.size()+"Cartas";

    }

}
