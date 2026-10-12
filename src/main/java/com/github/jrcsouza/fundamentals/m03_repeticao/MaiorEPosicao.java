package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class MaiorEPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int posicaoMaior = 0;
        int maior = 0;

        for (int i = 1; i <= 100; i++) {
            int numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
                posicaoMaior = i;
            }
        }

        System.out.println(maior);
        System.out.println(posicaoMaior);

        scanner.close();
    }
}
