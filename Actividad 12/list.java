package Activi12;

import java.util.HashMap;

public class list {
    AddressBook calendario1=new AddressBook();

    public void lista(){
        HashMap<String,String>Agnte1=calendario1.inicio();
        System.out.println("En Total Existen: "+Agnte1.size()+ " Contactos Los Cuales Son:");
        for(HashMap.Entry <String,String>entry:Agnte1.entrySet()){
            System.out.println("Numero: "+entry.getKey()+" Nombre: "+entry.getValue());}
    }
}
