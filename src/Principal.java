import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        double limite = 0, precoProduto = 0;
        String nomeProduto;
        int condicao = 1;

        Scanner scanner = new Scanner(System.in);
        cartaoDeCredito cartao = new cartaoDeCredito(limite);

        System.out.println("Digite seu limite");
        limite = scanner.nextDouble();

        while (condicao == 1){
            System.out.println("Digite o nome do produto");
            nomeProduto = scanner.next();
            System.out.println("Digite o preço do produto");
            precoProduto = scanner.nextDouble();

            ComprasCliente compra = new ComprasCliente(nomeProduto, precoProduto);
            boolean compraRealizada = cartao.lancaCompra(compra);

            if (compraRealizada){
                System.out.println("Compra realizada com sucesso!");
                System.out.println(cartao.getSaldo());
                System.out.println("Digite 0 para finalizar ou 1 para realizar outra compra");
                condicao = scanner.nextInt();
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }
}
