package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class UltrapassandoZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int z;

        do {
            z = scanner.nextInt();
        } while (z <= x);

        int soma = 0;
        int contador = 0;

        while (soma <= z) {
            soma += x;
            contador++;
            x++;
        }

        System.out.println(contador);

        scanner.close();
    }
}