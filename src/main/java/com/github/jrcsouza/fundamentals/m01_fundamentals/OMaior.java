package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Scanner;

public class OMaior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int maior = (a + b + Math.abs(a - b)) / 2;
        int maiorFinal = (maior + c + Math.abs(maior - c)) / 2;

        System.out.println(maiorFinal + " eh o maior");
    }
}
