package Lista_01_Orientacao_a_Objetos.atv10.applications;

import Lista_01_Orientacao_a_Objetos.atv10.entities.Termometro;

import java.util.Scanner;

public class TermometroInteligente {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Termometro t = new Termometro();
        char resp;

        do {
            System.out.println(
                    "================================"+
                            "\nQual conversão você gostaria de fazer?"+
                            "\n1- Celcius para Fahrenheit"+
                            "\n2- Celcius para Kelvin"+
                            "\n3- Sair"+
                            "\n================================"
            );
            resp= sc.next().charAt(0);

            if (resp=='1' || resp=='2') {
                System.out.println("Digite a temperatura em Celcius: ");
                t.celcius= sc.nextDouble();

                if (resp=='1') {
                    System.out.println(
                            "================================\n"+
                            t.celcius + " °C = " + t.converterFarenheit() + " °F"
                    );
                }
                else
                    System.out.println(
                            "================================\n"+
                            t.celcius+" °C = "+t.converterKelvin()+" °K"
                    );

            }
            else if (resp=='3') {
                System.out.println("Fechando o programa...");
            }
            else
                System.out.println("Digite uma resposta válida!");

        } while (resp!='3');

    }
}
