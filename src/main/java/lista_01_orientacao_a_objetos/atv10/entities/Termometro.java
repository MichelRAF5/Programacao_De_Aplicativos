package lista_01_orientacao_a_objetos.atv10.entities;

public class Termometro {
    public double celcius;

    public double converterFarenheit() {
        return celcius*1.8+32;
    }

    public double converterKelvin() {
        return celcius+273.15;
    }
}
