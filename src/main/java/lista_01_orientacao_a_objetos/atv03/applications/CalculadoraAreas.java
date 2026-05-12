package lista_01_orientacao_a_objetos.atv03.applications;

import lista_01_orientacao_a_objetos.atv03.entities.Retangulo;

import java.util.Scanner;

public class CalculadoraAreas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r= new Retangulo();

        System.out.println("Digite a altura do retângulo: ");
        r.altura= sc.nextDouble();
        System.out.println("Digite a base do retângulo: ");
        r.base= sc.nextDouble();
        System.out.printf("A área do retângulo é: %.2f%n", r.calcularArea());
        sc.close();
    }
}
