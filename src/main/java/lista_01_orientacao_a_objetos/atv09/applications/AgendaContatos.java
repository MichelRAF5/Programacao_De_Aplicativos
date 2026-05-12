package lista_01_orientacao_a_objetos.atv09.applications;

import lista_01_orientacao_a_objetos.atv09.entities.Agenda;

public class AgendaContatos {
    public static void main(String[] args) {
        Agenda agenda= new Agenda();

        System.out.println("Lista de nomes dos contatos da lista: ");
        System.out.println(agenda.listarContatos());
    }
}