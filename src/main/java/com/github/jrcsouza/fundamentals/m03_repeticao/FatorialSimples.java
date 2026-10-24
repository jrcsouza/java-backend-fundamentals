package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int fatorial = 1;

        do {

            fatorial = fatorial * n;
            n--;

        } while (n > 0);

        System.out.println(fatorial);

        scanner.close();
    }
}
