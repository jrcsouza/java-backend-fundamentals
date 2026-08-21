package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int x = a + b;

        System.out.println("X = " + x);
        scanner.close();
    }
}
