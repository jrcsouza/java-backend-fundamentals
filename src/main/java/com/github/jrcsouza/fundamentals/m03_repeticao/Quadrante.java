package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        do {
            x = scanner.nextInt();
            y = scanner.nextInt();

            if (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                } else {
                    System.out.println("quarto");
                }
            }
        } while (x != 0 && y != 0);

        scanner.close();
    }
}
