package com.github.jrcsouza.fundamentals.m02_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            double perimetro = a + b + c;
            System.out.printf(Locale.US, "Perimetro = %.1f%n", perimetro);
        } else {
            double areTrapezio = ((a + b) * c) / 2;
            System.out.printf(Locale.US, "Area = %.1f%n", areTrapezio);
        }
        scanner.close();
    }
}

