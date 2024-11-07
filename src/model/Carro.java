package model;

public class Carro extends Vehiculo {
    public Carro(String placa) {
        super(placa, "Carro");
    }

    @Override
    public double calcularTarifa(long horas) {
        return horas * 3000; // Tarifa de ejemplo para carro
    }
}
