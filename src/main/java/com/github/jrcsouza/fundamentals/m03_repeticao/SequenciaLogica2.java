package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class SequenciaLogica2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = 1; i <= y; i++) {
            if (i % x == 0 || i == y) {
                System.out.println(i);
            } else {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
