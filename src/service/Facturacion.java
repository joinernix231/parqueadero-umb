package service;

import model.Vehiculo;

public interface Facturacion {
    double calcularTarifa(Vehiculo vehiculo, long horas);
}
