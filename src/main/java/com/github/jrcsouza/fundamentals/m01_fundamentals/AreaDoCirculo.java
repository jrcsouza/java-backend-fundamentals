package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double raio = scanner.nextDouble();

        double n = 3.14159;

        double area = n * raio * raio;

        System.out.printf(Locale.US, "A=%.4f%n", area);

        scanner.close();

    }
}
