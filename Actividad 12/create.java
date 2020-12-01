package Activi12;

import java.util.Scanner;
import java.util.HashMap;

public class create {
    AddressBook Agt1=new AddressBook();
    String num;
    String nom;
    public void crear(){
        HashMap<String,String>calendario=Agt1.inicio();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa El Numero De Telefono De La Persona");
        num=teclado.nextLine();
        System.out.println("Ingresa El Nombre De La Persona Del Numero Telefonico Asociado");
        nom= teclado.nextLine();
        calendario.put( num , nom);
    }
}
