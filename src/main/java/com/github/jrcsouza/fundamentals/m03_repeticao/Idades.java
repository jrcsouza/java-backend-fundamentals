package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade;
        int contador = 0;
        int soma = 0;
        double media;

        do {
            idade = scanner.nextInt();

            if (idade >= 0) {
                contador++;
                soma += idade;
            }

        } while (idade >= 0);

        if (contador > 0) {
            media = (double) soma / contador;
            System.out.printf(Locale.US, "%.2f%n", media);
        } else {
            System.out.println("Nenhuma idade valida foi informada");
        }

        scanner.close();
    }
}
