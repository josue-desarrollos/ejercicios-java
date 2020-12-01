package Activi12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class save {

    AddressBook Save= new AddressBook();

    public void archivar() throws IOException{
        HashMap<String, String> agentel = Save.inicio();
        int Cant = 30;
        int Conta = 0;
        FileWriter Entr;
        BufferedWriter Sal;

        Entr = new FileWriter("contactos.txt");
        Sal = new BufferedWriter(Entr);
        Iterator<HashMap.Entry<String, String>> it = agentel.entrySet().iterator();
        while (it.hasNext() && Conta < Cant) {
            HashMap.Entry<String, String> pairs = it.next();
            Sal.write( pairs.getKey() + "," + pairs.getValue() + "\n");
            Conta++;
        }
        Sal.close();
    }

}
