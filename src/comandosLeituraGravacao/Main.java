package comandosLeituraGravacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = leitor.nextInt();
        System.out.print("Digite a sua altura: ");
        float altura = leitor.nextFloat();
        System.out.print("Digite o seu peso: ");
        double peso = leitor.nextDouble();
        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.println(idade);
        System.out.println(altura);
        System.out.println(peso);
        System.out.println(nome);
    }
}
