package estruturasRepeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        // Algoritmo que soma 5 números informados pelo usuário:

        int soma = 0;
        int numero;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número a ser somado: ");
            numero = scan.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma dos números informados é " + soma);
    }
}
