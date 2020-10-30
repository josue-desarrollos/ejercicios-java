package CartasP;

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

    public void shuffle()
    {
        if (Labara.size()<=0)
            System.out.println("El Deck esta vacio..");
        else{
            Collections.shuffle(Labara);
            System.out.println("Se mezcló el Deck");
        }

    }
    public void head()
    {
        System.out.println("se removera"+Labara.get(1));
        Labara.remove(1);
        System.out.println("Quedan: "+Labara.size()+" Cartas");

    }
    public void pick()
    {
        System.out.println("pick");
        int R =(new Random().nextInt(51));
        System.out.println("se removera "+Labara.get(R));
        Labara.remove(R);
        System.out.println("Quedan: "+Labara.size()+" Cartas");
    }
    public void hand()
    {
        System.out.println("Hand");
        int R = (new Random().nextInt(51));
        int f = (new Random().nextInt(51));
        int h = (new Random().nextInt(51));
        int k = (new Random().nextInt(51));
        int ñ = (new Random().nextInt(51));

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
    }

}
