package lista_01_orientacao_a_objetos.atv05.entities;

public class ContaBancaria {
    public String titular;
    public double saldo= 10000;
    public boolean saldoSuficiente;

    public String exibirSaldo() {
        return "-----------------------------"+
                "\nNome do titular: "+titular+
                "\nSaldo: "+saldo+
                "\n-----------------------------";
    }

    public void depositar(double valor) {
        saldo+= valor;
    }

    public void sacar(double valor) {
        if(saldo<valor){
            saldoSuficiente= false;
        }
        else {
            saldoSuficiente= true;
            saldo-=valor;
        }
    }
}
