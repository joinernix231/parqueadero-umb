package model;
import model.Vehiculo;

public class EspacioParqueo<T extends Vehiculo> {
    private int numero;
    private boolean ocupado;
    private T vehiculo;

    public EspacioParqueo(int numero) {
        this.numero = numero;
        this.ocupado = false;
        this.vehiculo = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public T getVehiculo() {
        return vehiculo;
    }

    public void ocuparEspacio(T vehiculo) {
        if (!ocupado) {
            this.vehiculo = vehiculo;
            this.ocupado = true;
            System.out.println("Vehículo registrado en el espacio " + numero);
        } else {
            System.out.println("El espacio ya está ocupado.");
        }
    }

    public void liberarEspacio() {
        if (ocupado) {
            this.vehiculo = null;
            this.ocupado = false;
            System.out.println("El espacio " + numero + " ha sido liberado.");
        } else {
            System.out.println("El espacio ya está libre.");
        }
    }
}
