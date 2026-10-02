package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int contador = 0;
        double soma = 0;

        while (contador < 2) {
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                soma = soma + nota;
                contador = contador + 1;
            } else {
                System.out.println("nota invalida");
            }
        }
        double media = soma / 2;
        System.out.println("media = " + media);
        scanner.close();
    }
}
