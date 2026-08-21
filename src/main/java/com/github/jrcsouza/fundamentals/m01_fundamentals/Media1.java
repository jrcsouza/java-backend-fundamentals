package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double media = (a * 3.5 + b * 7.5) / 11;

        System.out.printf(Locale.US, "MEDIA = %.5f\n", media);
        scanner.close();
    }
}
