package TiposOperadoresVariaveis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Tipos primitivos:
        int idade = 29;
        float peso = 71.5f;
        double altura = 1.71d;
        char genero = 'M';
        byte placar = 0;
        boolean ativo = true;

        // String não é um tipo primitivo:
        String nome = "Maria";

        // Operadores:
        int soma = 2 + 4;
        int subtracao = 5 - 3;
        int multiplicacao = 2 * 3;
        float divisao = 10 / 2f;
        int resto = 5 % 2;

        // Estruturas de decisão:
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite a sua nota: ");
        float media = leitor.nextFloat();
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        System.out.print("Escolha opção 1 ou 2: ");
        int opcao = leitor.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Opção 01 escolhida");
                break;
            case 2:
                System.out.println("Opção 02 escolhida");
                break;
            default:
                System.out.println("Opção inválida");
        }

        // Operadores relacionais:
        int numero = 10;
        boolean maior = numero > 2;
        boolean menor = numero < 20;
        boolean maiorIgual = numero >= 10;
        boolean menorIgual = numero <= 10;

        // && Operador "AND"
        // || Operador "OR"






    }
}
