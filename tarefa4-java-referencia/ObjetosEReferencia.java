class Produto {
    String nome;
    double preco;
}

public class TesteProduto {

    public static void aplicarDesconto(Produto p) {
        System.out.println("Antes: " + p.preco);

        p.preco *= 0.9;

        System.out.println("Depois: " + p.preco);
    }

    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Mouse";
        produto.preco = 100;

        aplicarDesconto(produto);

        System.out.println("Final: " + produto.preco);
    }
}
