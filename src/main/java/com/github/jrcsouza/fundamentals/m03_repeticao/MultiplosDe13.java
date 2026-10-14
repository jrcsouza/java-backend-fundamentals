package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class MultiplosDe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int maior;
        int menor;
        int soma = 0;

        if (x > y) {
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }

        for (int i = menor; i <= maior; i++) {
            if (i % 13 != 0) {
                soma = soma + i;
            }
        }

        System.out.println(soma);

        scanner.close();
    }
}
