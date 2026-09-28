package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int contador = 0;

        while (contador < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                contador = contador + 1;
            }
            x = x + 1;
        }
        scanner.close();
    }
}
