package exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        /* Escreva um algoritmo que verifique se o número positivo inteiro informado está dentro
        do intervalo entre 100 e 200. */

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número positivo inteiro: ");
        int numero = scan.nextInt();

        if (numero >= 100 && numero <= 200) {
            System.out.println("O número informado está dentro do intervalo de 100 a 200.");
        } else {
            System.out.println("O número informado não está dentro do intervalo de 100 a 200.");
        }
    }
}
