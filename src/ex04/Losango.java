package ex04;

import java.util.Scanner;

public class Losango {
    public static double calcularArea() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Diagonal maior: ");
        double dMaior = sc.nextDouble();

        System.out.print("Diagonal menor: ");
        double dMenor = sc.nextDouble();

        return (dMaior * dMenor) / 2;
    }
}