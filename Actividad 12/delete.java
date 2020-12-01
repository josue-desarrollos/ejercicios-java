package Activi12;

import java.util.HashMap;
import java.util.Scanner;

public class delete {
    String Num;
    AddressBook Regis=new AddressBook();

    public void eliminar(){
        HashMap<String,String>Agnt1=Regis.inicio();
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Numero de la persona a borrar ");
        Num=teclado.nextLine();
        if (Agnt1.containsKey(Num)){
            System.out.println("Se Borro De Manera Exitosa");
            Agnt1.remove(Num);
        }
        else{
            Agnt1.remove(Num);
            System.out.println("No Se Borro De Manera Correcta");
        }
    }
}
