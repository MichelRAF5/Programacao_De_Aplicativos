package Lista_01_Orientacao_a_Objetos.atv09.applications;

import Lista_01_Orientacao_a_Objetos.atv09.entities.Agenda;

public class AgendaContatos {
    static void main(String[] args) {
        Agenda agenda= new Agenda();

        System.out.println("Lista de nomes dos contatos da lista: ");
        System.out.println(agenda.listarContatos());
    }
}