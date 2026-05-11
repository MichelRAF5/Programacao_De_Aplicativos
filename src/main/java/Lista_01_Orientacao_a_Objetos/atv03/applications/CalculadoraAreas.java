package Lista_01_Orientacao_a_Objetos.atv03.applications;

import Lista_01_Orientacao_a_Objetos.atv03.entities.Retangulo;

import java.util.Scanner;

public class CalculadoraAreas {
    static void main(String[] args) {
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
