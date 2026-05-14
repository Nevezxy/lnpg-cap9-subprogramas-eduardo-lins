import java.util.Scanner;

public class SistemaEstoque {

    public static String lerNome(Scanner sc) {
        System.out.print("Produto: ");
        return sc.nextLine();
    }

    public static int lerQuantidade(Scanner sc) {
        System.out.print("Quantidade: ");
        return sc.nextInt();
    }

    public static double lerPreco(Scanner sc) {
        System.out.print("Preço: ");
        return sc.nextDouble();
    }

    public static double calcularTotal(int quantidade, double preco) {
        return quantidade * preco;
    }

    public static boolean estoqueBaixo(int quantidade) {
        return quantidade < 10;
    }

    public static void imprimir(String nome, int quantidade, double total, boolean baixo) {
        System.out.println("Produto: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Total: " + total);

        if (baixo) {
            System.out.println("Estoque baixo");
        } else {
            System.out.println("Estoque normal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = lerNome(sc);
        int quantidade = lerQuantidade(sc);
        double preco = lerPreco(sc);

        double total = calcularTotal(quantidade, preco);
        boolean baixo = estoqueBaixo(quantidade);

        imprimir(nome, quantidade, total, baixo);
    }
}