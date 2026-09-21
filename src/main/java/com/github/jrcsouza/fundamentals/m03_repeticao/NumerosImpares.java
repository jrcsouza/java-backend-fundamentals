package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        int numero = 1;

        while (numero <= x) {

            if (numero % 2 != 0) {
                System.out.println(numero);
            }
            numero = numero + 1;
        }
        scanner.close();
    }
}
