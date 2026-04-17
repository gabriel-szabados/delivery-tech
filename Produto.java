import java.util.Scanner;

public class Produto {

    private String nome;
    private String categoria;
    private double preco;
    private int quantidade;

    public Produto(String nome, String categoria, double preco, int quantidade){
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
        setQuantidade(quantidade);
    }

    public void setQuantidade(int quantidade){
        if (quantidade < 0){
            this.quantidade = 0;
        } else {
            this.quantidade = quantidade;
        }
    }
}
