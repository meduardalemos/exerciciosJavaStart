package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // Algoritmo que verifica se o número digitado pelo usuário é positivo, negativo ou 0

        Scanner input = new Scanner(System.in);

        int numero;
        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {
            System.out.println("Digite um número: ");
            numero = input.nextInt();

            if (numero == 0) {
                System.out.println("O número digitado é 0.");
            } else if (numero > 0) {
                System.out.println("O número é positivo.");
            } else {
                System.out.println("O número é negativo.");
            }

            System.out.println("Deseja continuar? S ou N");
            desejaContinuar = input.next().charAt(0);
        }
    }
}
