import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double saldo = 0d;
        Cartao card = new Cartao(saldo);
        Scanner input = new Scanner(System.in);
        System.out.println(" *** Aplicativo de compras iniciado ***");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Digite o saldo do seu cartão :");
        card.setSaldo(input.nextDouble());
        System.out.println("Seu saldo é: " + card.getSaldo());
        compras(card);
    }

    public static void compras(Cartao card) {
        double valorProduto = 0d;
        String nomeProduto = "";
        Scanner input = new Scanner(System.in);
        ArrayList<Produto> listaProd = new ArrayList();
        String resposta = "";
        do {
            System.out.println("Digite o nome do produto");
            nomeProduto = input.nextLine();

            System.out.println("Digite o valor do produto");
            valorProduto = input.nextDouble();
            card.setSaldo(card.getSaldo() - valorProduto);

            Produto prod = new Produto(nomeProduto, valorProduto);
            listaProd.add(prod);
            input.nextLine();

            System.out.println("Digite sim para inserir outro registro, ou não para sair");
            resposta = input.nextLine();

        } while (resposta.equalsIgnoreCase("sim"));

        System.out.println("Lista de produtos comprados");
        for (Produto prod : listaProd) {
            System.out.println();
            System.out.println("Produto: " + prod.getNomeProduto());
            System.out.println("Valor:  R$ " + prod.getValorProduto());
            System.out.println();
        }
        System.out.println("Saldo restante : " + card.getSaldo());
    }
}