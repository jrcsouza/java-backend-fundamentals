package com.github.jrcsouza.fundamentals.m03_repeticao;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            //int resultado = i * n; System.out.println(i + " x " + n + " = " + resultado);
            System.out.println(i + " x " + n + " = " + (i * n));
        }

        scanner.close();
    }
}
