public class PassagemValor {

    public static void alterarNumero(int x) {
        System.out.println("Dentro antes: " + x);

        x = 50;

        System.out.println("Dentro depois: " + x);
    }

    public static void main(String[] args) {
        int numero = 10;

        System.out.println("Antes: " + numero);

        alterarNumero(numero);

        System.out.println("Depois: " + numero);
    }
}