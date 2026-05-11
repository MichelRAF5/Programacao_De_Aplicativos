package Lista_01_Orientacao_a_Objetos.atv10.entities;

public class Termometro {
    public double celcius;

    public double converterFarenheit() {
        return celcius*1.8+32;
    }

    public double converterKelvin() {
        return celcius+273.15;
    }
}
