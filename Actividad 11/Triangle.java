package Actividad_11;
import java.util.*;
import java.lang.*;
public class Triangle implements Shape{
    Scanner sc = new Scanner (System.in);
    public void getArea() {
        int base = 0, altura = 0;
        float area_triangulo = 0;

        System.out.println("Ingresa la base del périmetro");
        base = sc.nextInt();
        System.out.println("Ingresa la Altura del périmetro");
        altura = sc.nextInt();
        area_triangulo = (float) (base * altura) / 2;
        System.out.println("El area del triangulo es: "+area_triangulo+"\n");
    }
    public void getPerimeter() {
        int lado=0;
        float perimetro_triangulo = 0;

        System.out.println("Ingresa el lado del triangulo");
        lado = sc.nextInt();
        System.out.println("el perimetro del triangulo es: "+(perimetro_triangulo = lado * 3)+"\n");
    }
}
