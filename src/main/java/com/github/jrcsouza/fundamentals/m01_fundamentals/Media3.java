package com.github.jrcsouza.fundamentals.m01_fundamentals;

import java.util.Locale;
import java.util.Scanner;

public class Media3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();
        float nota3 = scanner.nextFloat();
        float nota4 = scanner.nextFloat();

        float media = ((nota1 * 2f) + (nota2 * 3f) + (nota3 * 4f) + nota4 ) / 10f;

        System.out.printf(Locale.US, "Media: %.1f%n", media);

        if (media >= 7.0f) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0f) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaExame = scanner.nextDouble();
            System.out.printf(Locale.US, "Nota do exame: %.1f%n", notaExame);

            double mediaFinal = (media + notaExame) / 2f;

            if (mediaFinal >= 5f) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf(Locale.US, "Media final: %.1f%n", mediaFinal);
        }
        scanner.close();
    }
}
