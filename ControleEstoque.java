import java.util.Scanner;

public class ControleEstoque {

    public static String lerTextoNaoNulo(Scanner caixaDeTexto, String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String texto = caixaDeTexto.nextLine();

            if (texto != null && !texto.trim().isEmpty()) {
                return texto.trim();
            }
            System.out.println("Entrada inválida. Digite um texo não vazio.");
        }
    }

    private static int lerInt(Scanner caixaDeTexto, String mensagem, int minPermitido) {
        while (true) {
            System.out.print(mensagem);
            String texto = caixaDeTexto.nextLine();

            try {
                int valor = Integer.parseInt(texto.trim());

                if (valor < minPermitido) {
                    System.out.println("Valor inválido. O mínimo permito é: " + minPermitido);
                    continue;
                }
                return valor;

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número inteiro (ex: 0, 10, 25..)");
            }
        }
    }

    private static double lerDouble(Scanner caixaDeTexto, String mensagem, double minPermitido) {
        while (true) {
            System.out.print(mensagem);
            String texto = caixaDeTexto.nextLine();

            try {
                double valor = Double.parseDouble(texto.trim().replace(",", "."));

                if (valor < minPermitido) {
                    System.out.println("Valor inválido. O mínimo permitido é: " + minPermitido);
                    continue;
                }
                return valor;

            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número (ex: 25.50, 11.38...)");
            }
        }
    }

    private static Produto cadastrarProduto(Scanner caixaDeTexto, String categoria) {
        System.out.println("\n===  Cadastro: " + categoria + " ===");
        String nome = lerTextoNaoNulo(caixaDeTexto, "Nome do produto (campo obrigatório): ");
        double preco = lerDouble(caixaDeTexto, "O preço do produto (ex: 25.50 ou 25,50): R$ ", 0.0);
        int quantidade = lerInt(caixaDeTexto, "Quantidade em estoque (ex: número inteiro >=0): ", 0);

        return new Produto(nome, categoria, preco, quantidade);
    }

    private static void compararDoisProdutos(Produto a, Produto b) {
        System.out.println("\n=== Comparação Final ===");
        System.out.println("\n--- Comparação de Quantidade em Estoque ---");

        if (a.getQuantidade() > b.getQuantidade()) {
            System.out.println(a.getNome() + " tem mais estoque que " + b.getNome());
        } else if (b.getQuantidade() > a.getQuantidade()) {
            System.out.println(b.getNome() + " tem mais estoque que " + a.getNome());
        } else {
            System.out.println("Os dois produtos possui a mesma quantidade em estoque.");
        }

        System.out.println("\n--- Comparação de Valor total em Estoque ---");

        double totalA = a.calculaValorEmEstoque();
        double totalB = b.calculaValorEmEstoque();

        if (totalA > totalB) {
            System.out.printf("%s tem maior valor em estoque (R$ %.2f%n)", a.getNome(), totalA);
        } else if (totalB > totalA) {
            System.out.printf("%s tem maior valor em estoque (R$ %.2f%n)", b.getNome(), totalB);
        } else {
            System.out.println("Os dois produtos possui o mesmo valor em estoque.");
        }
    }

    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Sistema de Controle de Estoque - T1 2601 - AS");
        System.out.println("Você vai cadastrar 3 produtos e ver depois o resumo um confronto.\n");

        Produto comida1 = cadastrarProduto(caixaDeTexto, "Comida");
        Produto produtoLimpeza1 = cadastrarProduto(caixaDeTexto, "Produto de Limpeza");
        Produto produtoHigienePessoal1 = cadastrarProduto(caixaDeTexto, "Produto Higiene Pessoal");

        System.out.println("\n=== Resumo dos Produtos Cadastrados ===");

        System.out.println("Produto 1 - Comida");
        comida1.exibirResumo();
        System.out.println("\n");

        System.out.println("Produto 2 - Limpeza");
        produtoLimpeza1.exibirResumo();
        System.out.println("\n");

        System.out.println("Produto 3 - Higiene Pessoal");
        produtoHigienePessoal1.exibirResumo();

        compararDoisProdutos(comida1, produtoLimpeza1);

        caixaDeTexto.close();
    }
}