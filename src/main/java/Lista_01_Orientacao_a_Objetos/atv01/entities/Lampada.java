package Lista_01_Orientacao_a_Objetos.atv01.entities;

public class Lampada {
    public boolean ligada;

    public boolean ligar() {
        return ligada= true;
    }

    public boolean desligar() {
        return ligada= false;
    }

    public String exibirStatus() {
        if (ligada) {
           return "Lâmpada ligada";
        }
        else {
            return "Lâmpada desligada";
        }
    }
}
