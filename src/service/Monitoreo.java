package service;

import model.Vehiculo;

public interface Monitoreo {
    void registrarEntrada(Vehiculo vehiculo);
    void registrarSalida(Vehiculo vehiculo);
}
