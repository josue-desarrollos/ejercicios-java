import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Actividad6 {
    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Scanner r = new Scanner(System.in);
    int calif[] = new int[5];
    String Nombre;
    int suma=0;
    float promedio;
    String cal;

    public static void main(String[] args) throws IOException {
        Actividad6 op = new Actividad6();

        System.out.println("Ingresa un Nombre");
        op.Nombre = entrada.readLine();

        System.out.println("La primer calificacion ");
        op.calif[0]=r.nextInt();

        System.out.println("La segunda calificacion ");
        op.calif[1]=r.nextInt();

        System.out.println("La tercera calificacion ");
        op.calif[2]=r.nextInt();

        System.out.println("La cuarta calificacion ");
        op.calif[3]=r.nextInt();

        System.out.println("La quinta calificacion ");
        op.calif[4]=r.nextInt();

        op.CalcuPro();
        op.Calificacion();
        op.imprimir();
    }
    public void CalcuPro()
    {
        for (int i=0; i<calif.length; i++)
        {
            suma=suma+calif[i];
        }
        promedio=(suma/calif.length);
    }
    public void Calificacion()
    {
      if (promedio<=50)
      {
         cal= "F";
      }else if (promedio>=51 && promedio<=60)
      {
         cal= "E";

      }else if (promedio>=61 && promedio<=70)
      {
          cal= "D";
      }else if (promedio>=71 && promedio<=80)
      {
          cal= "C";
      }else if (promedio>=81 && promedio<=90)
      {
          cal= "B";
      }else if (promedio>=91 && promedio<=100)
      {
          cal= "A";
      }
    }
    public void imprimir()
    {
        System.out.println("Nombre del estudiante:"+ Nombre);
        System.out.println("Calificación 1:"+calif[0]);
        System.out.println("Calificación 2:"+calif[1]);
        System.out.println("Calificación 3:"+calif[2]);
        System.out.println("Calificación 4:"+calif[3]);
        System.out.println("Calificación 5:"+calif[4]);
        System.out.println("Promedio:"+promedio);
        System.out.println("Calificación: "+cal);
    }

}
