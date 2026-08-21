package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double media = ((a * 2) + (b * 3) + (c * 5)) / 10;

        System.out.printf(Locale.US, "MEDIA = %.1f\n", media);
        scanner.close();
    }
}
