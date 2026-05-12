package lista_01_orientacao_a_objetos.atv04.applications;

import lista_01_orientacao_a_objetos.atv04.entities.Produto;

import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Produto prod= new Produto();

        System.out.println("Digite o nome do produto: ");
        prod.nome= sc.nextLine();
        System.out.println("Digite o preço do produto: ");
        prod.preco= sc.nextDouble();
        System.out.println("Digite a quantidade em estoque: ");
        prod.qtdeEstoque= sc.nextInt();
        System.out.println(prod.exibirResumo());
        sc.close();
    }
}
