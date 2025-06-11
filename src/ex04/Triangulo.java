package ex04;

import java.util.Scanner;

public class Triangulo {
    public static double calcularArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        return (base * altura) / 2;
    }
}