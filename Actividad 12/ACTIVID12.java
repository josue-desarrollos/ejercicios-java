package Activi12;

import java.util.Scanner;
import java.io.IOException;

public class ACTIVID12 {

    public static void main(String[] args) throws IOException {
        boolean Cant = false;
        int Opc;
        create cr =new create();
        list l = new list();
        delete de =new delete();
        save sa = new save();
        Scanner leer = new Scanner(System.in);

        while (!Cant){
            System.out.println("Sistema De Agenda ,selecciona Una Opcion");
            System.out.println("\n 1: Ver el listado");
            System.out.println("\n 2: Generar un contacto");
            System.out.println("\n 3: Borrar contacto");
            System.out.println("\n 4: Guardar los cambios");
            Opc = leer.nextInt();
            switch (Opc){
                case 1:
                    l.lista();
                    break;
                case 2:
                    cr.crear();
                    break;
                case 3:
                    de.eliminar();
                    break;
                case 4 :
                    sa.archivar();
                    break;
            }
        }
    }
}




