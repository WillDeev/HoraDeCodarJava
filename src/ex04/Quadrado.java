package ex04;

import java.util.Scanner;

public class Quadrado {
    public static double calcularArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Lado: ");
        double lado = sc.nextDouble();

        return lado * lado;
    }
}