package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int codPeca1 = scanner.nextInt();
        int numPeca1 = scanner.nextInt();
        double valorPeca1 = scanner.nextDouble();
        int codPeca2 = scanner.nextInt();
        int numPeca2 = scanner.nextInt();
        double valorPeca2 = scanner.nextDouble();

        double valorPago = (numPeca1 * valorPeca1) + (numPeca2 * valorPeca2);

        System.out.printf(Locale.US, "VALOR A PAGAR: R$ %.2f\n", valorPago);
        scanner.close();
    }
}
