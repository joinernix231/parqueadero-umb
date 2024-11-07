package model;

public abstract class Vehiculo {
    private String placa;
    private String tipo;

    public Vehiculo(String placa, String tipo) {
        this.placa = placa;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract double calcularTarifa(long horas);
}
