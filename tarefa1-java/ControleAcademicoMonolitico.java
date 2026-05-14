import java.util.Scanner;

public class ControleAcademicoMonolitico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[5];
        double[][] notas = new double[5][3];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nome: ");
            nomes[i] = sc.nextLine();

            double soma = 0;

            for (int j = 0; j < 3; j++) {
                System.out.print("Nota: ");
                notas[i][j] = sc.nextDouble();
                soma += notas[i][j];
            }

            sc.nextLine();

            double media = soma / 3;

            String situacao;

            if (media >= 7) {
                situacao = "Aprovado";
            } else if (media >= 5) {
                situacao = "Recuperacao";
            } else {
                situacao = "Reprovado";
            }

            System.out.println(nomes[i] + " - " + media + " - " + situacao);
        }
    }
}