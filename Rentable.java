//Sistema de Gestión de Vehículos de Transporte Público
// INTERFAZ
interface Rentable {
    double calcularGananciaMensual();
}

// CLASE ABSTRACTA
abstract class Vehiculo implements Rentable {
    private String placa;
    private int capacidad;
    private double consumo;

    public Vehiculo(String placa, int capacidad, double consumo) {
        this.placa = placa;
        this.capacidad = capacidad;
        this.consumo = consumo;
    }

    public String getPlaca() { return placa; }
    public int getCapacidad() { return capacidad; }
    public double getConsumo() { return consumo; }

    public void mostrar() {
        System.out.println("Placa: " + placa);
        System.out.println("Capacidad: " + capacidad + " personas");
        System.out.println("Consumo: " + consumo + " km/galón");
    }
}

// SUBCLASES
class Bus extends Vehiculo {
    private int rutasMensuales;

    public Bus(String placa, int capacidad, double consumo, int rutasMensuales) {
        super(placa, capacidad, consumo);
        this.rutasMensuales = rutasMensuales;
    }

    public double calcularGananciaMensual() {
        return rutasMensuales * 100000;
    }
}

class Taxi extends Vehiculo {
    private int carreras;

    public Taxi(String placa, int capacidad, double consumo, int carreras) {
        super(placa, capacidad, consumo);
        this.carreras = carreras;
    }

    public double calcularGananciaMensual() {
        return carreras * 15000;
    }
}

// MAIN
public class TransporteMain {
    public static void main(String[] args) {
        Vehiculo[] flota = {
            new Bus("AAA123", 40, 5.5, 60),
            new Taxi("BBB456", 4, 10.2, 100)
        };

        for (Vehiculo v : flota) {
            v.mostrar();
            System.out.println("Ganancia mensual estimada: $" + v.calcularGananciaMensual());
            System.out.println("--------");
        }
    }
}
