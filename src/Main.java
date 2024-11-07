
import model.Parqueadero;
import model.Carro;
import model.Moto;
import model.Vehiculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero(5);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n----- MENU PARQUEADERO -----");
            System.out.println("1. Registrar entrada de un vehiculo");
            System.out.println("2. Registrar salida de un vehiculo");
            System.out.println("3. Mostrar espacios disponibles");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarEntrada(parqueadero, scanner);
                    break;
                case 2:
                    registrarSalida(parqueadero, scanner);
                    break;
                case 3:
                    parqueadero.mostrarEspaciosDisponibles();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    private static void registrarEntrada(Parqueadero parqueadero, Scanner scanner) {
        System.out.print("Ingrese la placa del vehículo: ");
        String placa = scanner.nextLine();

        System.out.println("Tipo de vehículo:");
        System.out.println("1. Carro");
        System.out.println("2. Moto");
        System.out.print("Seleccione el tipo de vehículo: ");
        int tipoVehiculo = scanner.nextInt();
        scanner.nextLine();

        Vehiculo vehiculo;

        switch (tipoVehiculo) {
            case 1:
                vehiculo = new Carro(placa);
                break;
            case 2:
                vehiculo = new Moto(placa);
                break;
            default:
                System.out.println("Tipo de vehículo no válido.");
                return;
        }

        parqueadero.registrarEntrada(vehiculo);
    }

    private static void registrarSalida(Parqueadero parqueadero, Scanner scanner) {
        System.out.print("Ingrese la placa del vehículo que sale: ");
        String placa = scanner.nextLine();

        Vehiculo vehiculo = null;

        for (int i = 0; i < 5; i++) {
            if (parqueadero.getEspacio(i).isOcupado()
                    && parqueadero.getEspacio(i).getVehiculo().getPlaca().equals(placa)) {
                vehiculo = parqueadero.getEspacio(i).getVehiculo();
                break;
            }
        }

        if (vehiculo != null) {
            parqueadero.registrarSalida(vehiculo);
        } else {
            System.out.println("Vehículo no encontrado.");
        }
    }
}
