

public class Produtos {
    String marca;
    String nome;
    int quantidade;
    double valor;

    public Produtos(String marca, String nome, int quantidade, double valor){
        this.marca = marca;
        this.nome = nome;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Valor: " + valor);
    }



}