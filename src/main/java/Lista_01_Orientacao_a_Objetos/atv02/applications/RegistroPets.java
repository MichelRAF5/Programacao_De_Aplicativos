package Lista_01_Orientacao_a_Objetos.atv02.applications;

import Lista_01_Orientacao_a_Objetos.atv02.entities.Cachorro;

import java.util.Scanner;

public class RegistroPets {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cachorro cao1= new Cachorro();
        Cachorro cao2= new Cachorro();


        System.out.println("Digite o nome do primeiro cachorro: ");
        cao1.nome= sc.nextLine();
        System.out.println("Digite a raça do primeiro cachorro: ");
        cao1.raca= sc.nextLine();
        System.out.println("Digite o nome do segundo cachorro: ");
        cao2.nome= sc.nextLine();
        System.out.println("Digite a raça do segundo cachorro: ");
        cao2.raca= sc.nextLine();
        System.out.println(cao1.latir());
        System.out.println(cao2.latir());
        sc.close();
    }
}
