package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int codigo = scanner.nextInt();
        int quantidade = scanner.nextInt();
        double precoUnitario = 0.0;

        if (codigo == 1) {
            precoUnitario = 4.0;
        } else if (codigo == 2) {
            precoUnitario = 4.50;
        } else if (codigo == 3) {
            precoUnitario = 5.0;
        } else if (codigo == 4) {
            precoUnitario = 2.0;
        } else if (codigo == 5) {
            precoUnitario = 1.50;
        }

        double valorConta = quantidade * precoUnitario;
        System.out.printf(Locale.US, "Total: R$ %.2f%n", valorConta);
        scanner.close();
    }
}
