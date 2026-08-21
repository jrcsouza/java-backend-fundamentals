package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class SalarioComBonus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String nome = scanner.next();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double total = salarioFixo + (totalVendas * 0.15);

        System.out.printf(Locale.US, "TOTAL = R$ %.2f\n", total);

        scanner.close();
    }
}
