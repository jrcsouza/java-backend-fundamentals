package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double raio = scanner.nextDouble();

        double volume = (4.0 / 3.0) * 3.14159 * Math.pow(raio, 3);

        System.out.printf(Locale.US, "VOLUME = %.3f\n", volume);
        scanner.close();
    }
}
