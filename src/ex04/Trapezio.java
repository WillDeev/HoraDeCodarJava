package ex04;

import java.util.Scanner;

public class Trapezio {
    public static double calcularArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base maior: ");
        double baseMaior = sc.nextDouble();

        System.out.print("Base menor: ");
        double baseMenor = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        return ((baseMaior + baseMenor) * altura) / 2;
    }
}