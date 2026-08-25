package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int x = scanner.nextInt();
        double y = scanner.nextDouble();

        double consumoMedio = x / y;

        System.out.printf(Locale.US,"%.3f km/l%n", consumoMedio);

    }
}
