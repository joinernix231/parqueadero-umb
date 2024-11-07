package model;
import java.util.ArrayList;
import java.util.List;
import model.EspacioParqueo;
import model.Vehiculo;

public class Parqueadero {
    private List<EspacioParqueo<Vehiculo>> espacios;
    private int capacidad;

    public Parqueadero(int capacidad) {
        this.capacidad = capacidad;
        this.espacios = new ArrayList<>(capacidad);
        for (int i = 0; i < capacidad; i++) {
            espacios.add(new EspacioParqueo<>(i + 1));
        }
    }

    public void registrarEntrada(Vehiculo vehiculo) {
        for (EspacioParqueo<Vehiculo> espacio : espacios) {
            if (!espacio.isOcupado()) {
                espacio.ocuparEspacio(vehiculo);
                return;
            }
        }
        System.out.println("No hay espacios disponibles.");
    }

    public void registrarSalida(Vehiculo vehiculo) {
        for (EspacioParqueo<Vehiculo> espacio : espacios) {
            if (espacio.isOcupado() && espacio.getVehiculo().getPlaca().equals(vehiculo.getPlaca())) {
                espacio.liberarEspacio();
                return;
            }
        }
        System.out.println("Vehículo no encontrado en el parqueadero.");
    }

    public void mostrarEspaciosDisponibles() {
        System.out.println("Espacios disponibles:");
        for (EspacioParqueo<Vehiculo> espacio : espacios) {
            if (!espacio.isOcupado()) {
                System.out.println("Espacio " + espacio.getNumero() + " está disponible.");
            }
        }
    }

    public EspacioParqueo<Vehiculo> getEspacio(int index) {
        return espacios.get(index);
    }
}
