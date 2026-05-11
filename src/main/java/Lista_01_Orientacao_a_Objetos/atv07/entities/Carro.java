package Lista_01_Orientacao_a_Objetos.atv07.entities;

public class Carro {
    public String modelo, marca;
    public int velocidadeAtual= 0;

    public void acelerar() {
        velocidadeAtual+=10;
    }

    public void frear() {
        if (velocidadeAtual>0) {
            velocidadeAtual-=10;
        }
    }
}
