package ex04;

import java.util.Scanner;

public class Circulo {
    public static double calcularArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Raio: ");
        double raio = sc.nextDouble();

        return Math.PI * raio * raio;
    }
}