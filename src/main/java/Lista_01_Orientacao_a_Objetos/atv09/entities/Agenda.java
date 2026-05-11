package Lista_01_Orientacao_a_Objetos.atv09.entities;

import java.util.Random;

public class Agenda {
    Contato[] c = new Contato[5];
    Random rd = new Random();

    public void adicionarContatos() {
        for (int i = 0; i < c.length; i++) {
            c[i] = new Contato();
            c[i].nome = "contato " + i;
            c[i].telefone = rd.nextInt(10000000);
        }
    }

    public String listarContatos() {
        adicionarContatos();
        String listaContatos = "";

        for (int i = 0; i < c.length; i++) {
            listaContatos += c[i].nome + "\n";
        }

        return listaContatos;
    }

}