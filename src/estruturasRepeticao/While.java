package estruturasRepeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {

        int totalAlunos = 5;
        String nomeAluno;
        int idadeAluno;

        Scanner scan = new Scanner(System.in);

        while(totalAlunos > 0){
            System.out.print("Digite o primeiro nome do aluno: ");
            nomeAluno = scan.nextLine();
            System.out.print("Digite a idade do aluno: ");
            idadeAluno = scan.nextInt();

            System.out.println("O nome do aluno é " + nomeAluno + " e a sua idade é " + idadeAluno
                            + ".");

            totalAlunos--;
        }
    }
}
