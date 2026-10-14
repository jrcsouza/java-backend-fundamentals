package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class SequenciaLogica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);
            System.out.println(i + " " + (quadrado + 1) + " " + (cubo + 1));
        }

        scanner.close();
    }
}
