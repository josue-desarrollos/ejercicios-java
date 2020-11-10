package Actividad_11;
import java.util.*;
import java.lang.*;
import java.lang.Math;

public class Circle implements Shape{
    Scanner sc =new Scanner (System.in);

    public void getArea() {
        double area=0,radio=0;

        System.out.println("Ingresa el radio del circulo");
        radio = sc.nextDouble();
        area = Math.PI * Math.pow(radio,2);
        System.out.println("el area del circulo es: "+area+"\n");
    }
    public void getPerimeter() {
        double perimetro,radio;

        System.out.println("Ingresa el radio del circulo");
        radio = sc.nextDouble();
        perimetro = 2*Math.PI*radio;
        System.out.println("el perimetro del circulo es: "+perimetro+"\n");
    }
}
