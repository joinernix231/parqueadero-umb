package model;

import java.util.ArrayList;
import java.util.List;
import model.Vehiculo;

public class Registro<T extends Vehiculo> {
    private List<T> vehiculos;

    public Registro() {
        this.vehiculos = new ArrayList<>();
    }

    // Método para registrar un vehículo
    public void registrarEntrada(T vehiculo) {
        vehiculos.add(vehiculo);
        System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " registrado.");
    }

    // Método para eliminar un vehículo
    public void registrarSalida(T vehiculo) {
        if (vehiculos.remove(vehiculo)) {
            System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " ha salido.");
        } else {
            System.out.println("Vehículo con placa " + vehiculo.getPlaca() + " no encontrado.");
        }
    }

    // Método para mostrar todos los vehículos registrados
    public void mostrarVehiculos() {
        System.out.println("Vehículos en el registro:");
        for (T vehiculo : vehiculos) {
            System.out.println("- Placa: " + vehiculo.getPlaca() + ", Tipo: " + vehiculo.getTipo());
        }
    }
}
