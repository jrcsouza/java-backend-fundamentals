package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();

        int anos = idade / 365;
        idade = idade % 365;
        int mes = idade / 30;
        int dia = idade % 30;

        System.out.println(anos + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
        scanner.close();
    }
}
