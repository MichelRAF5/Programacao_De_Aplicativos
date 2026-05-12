package lista_01_orientacao_a_objetos.atv04.entities;

public class Produto {
    public String nome;
    public double preco;
    public int qtdeEstoque;

    public String exibirResumo() {
        double valorEstoque= preco*qtdeEstoque;

        return "-----------------------------------------"+
                "\n Nome do produto: "+nome+
                "\n Preço do produto: "+preco+
                "\n Quantidade em estoque: "+qtdeEstoque+
                "\n Valor que representa em estoque: "+valorEstoque+
                "\n -----------------------------------------";
    }
}
