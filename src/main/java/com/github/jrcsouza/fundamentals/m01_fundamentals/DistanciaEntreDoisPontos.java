package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)));

        System.out.printf(Locale.US,"%.4f%n", distancia);
        scanner.close();
    }
}
