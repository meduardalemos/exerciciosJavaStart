package exercicioIMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa();

        Scanner input = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa01: ");
        pessoa01.setPeso(input.nextFloat());
        System.out.println("Digite a altura da pessoa01: ");
        pessoa01.setAltura(input.nextFloat());

        System.out.println("O IMC da pessoa 01 é: " + pessoa01.calcularIMC());
    }
}
