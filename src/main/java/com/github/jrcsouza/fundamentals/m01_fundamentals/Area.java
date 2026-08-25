package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = 3.14159 * Math.pow(c, 2);
        double areaTrapezio = ((a + b) * c) / 2.0;
        double areaQuadradro = Math.pow(b, 2);
        double areaRetangulo = a * b;

        System.out.printf(Locale.US, "TRIANGULO: %.3f\n", areaTriangulo);
        System.out.printf(Locale.US, "CIRCULO: %.3f\n", areaCirculo);
        System.out.printf(Locale.US, "TRAPEZIO: %.3f\n", areaTrapezio);
        System.out.printf(Locale.US, "QUADRADO: %.3f\n", areaQuadradro);
        System.out.printf(Locale.US, "RETANGULO: %.3f\n", areaRetangulo);
        scanner.close();
    }
}
