package Actividad_11;
import java.util.*;
import java.lang.*;

public class Square implements Shape{
    Scanner sc = new Scanner (System.in);

    public void getArea() {
        double Lado=0,Area=0;
        System.out.println("Ingresa algun lado del cuadrado");
        Lado= sc.nextInt();
        Area = Math.pow(Lado,2);
        System.out.println("el area del cuadrado es: "+Area+"\n");
    }


    public void getPerimeter() {
        double Lado=0,Perimetro=0;

        System.out.println("Ingresa algun lado del cuadrado");
        Lado= sc.nextDouble();
        Perimetro = 4*Lado;
        System.out.println("el perimetro del cuadrado es: "+Perimetro+"\n");

    }
}
