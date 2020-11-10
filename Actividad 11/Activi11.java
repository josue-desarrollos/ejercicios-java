package Actividad_11;
import java.util.*;
import java.lang.*;

public class Activi11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x=0;
        Triangle tr = new Triangle();
        Circle cr = new Circle();
        Square sq = new Square();

        System.out.println("Elije una Opcion para Calcular\n");
        System.out.println("1. Obtener Area y Perimetro De un Triangulo");
        System.out.println("2. Obtener Area y Perimetro De un Circulo");
        System.out.println("3. Obtener Area y Perimetro De un Cuadrado");
        x = sc.nextInt();

        switch (x) {
            case 1:
                tr.getArea();
                tr.getPerimeter();
                break;
            case 2:
                cr.getArea();
                cr.getPerimeter();
                break;
            case 3:
                sq.getArea();
                sq.getPerimeter();
                break;
            default: System.out.println(" opcion no valida");
        }
    }
}
