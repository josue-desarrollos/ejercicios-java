import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Activ7 {

    private static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    static Scanner r = new Scanner(System.in);
    int inte = 0;
    int b = 1;
    int c=0;

    public static void main (String[] args) {
        Activ7 op = new Activ7();

        System.out.println("Ingresa El Numero De veces que quieres calcular los numeros primos y las :\n");
        op.inte=r.nextInt();

        System.out.println("Números primos:");
        op.calculanumPri();

        System.out.println("Números primos:\n");
        op.Fibonacci();
    }
    //calcular numeros primos
    public void calculanumPri()
    {
        int []arre = new int[inte];
        for (int i = 0; i < arre.length; i++) {
            while (i != inte) {
                if (b % 2 != 0) {
                    arre[i] = b;
                    i++;
                    b++;
                } else {
                    b++;
                }
            }
        }
        for (int k = 0; k < arre.length; k++) {
            System.out.println("" + arre[k]);
        }
    }
    //calcular la Sucesión de Fibonacci
    public void Fibonacci()
    {
        int []array = new int[inte];
            array= serie(inte);
            /*anunciamos al usuario que se mostrara la serie inversa*/
            System.out.println("La serie fibonacci invertida es: ");

            System.out.println("");
            for(c=0; c<=inte-1; c++){
                System.out.print (" "+array[c]);
            }
        }

    int[] serie(int Cant2)

    {
        int a=0;
        int l=0;
        int f1=0;
        int f2=1;

        int [] arreglo=new int[Cant2];
        int [] arreglo2=new int[Cant2];

        if(Cant2==1){

            arreglo2[a]=0;
        }
        if(Cant2>=2){
            for(l=0; l<=Cant2-1; l++)
            {
                arreglo[l]=f1;
                f2+=f1;
                f1 = f2 - f1;
            }
            for(l=Cant2-1; l>=0; l--)
            {
                arreglo2[a]=arreglo[l];
                a++;
            }
        }
        return arreglo2;
    }
}

