package model;

public class Moto extends Vehiculo {
    public Moto(String placa) {
        super(placa, "Moto");
    }

    @Override
    public double calcularTarifa(long horas) {
        return horas * 1000; // Tarifa de ejemplo para moto
    }
}
