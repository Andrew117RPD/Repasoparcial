//Interfaces//
//Ejercicio: Crear una interfaz Conducible y que Carro y Moto la implementen.//
interface Conducible {
    void conducir();
}

class Carro implements Conducible {
    public void conducir() {
        System.out.println("El carro está siendo conducido.");
    }
}

class Moto implements Conducible {
    public void conducir() {
        System.out.println("La moto está siendo conducida.");
    }
}

public class Simulador {
    public static void main(String[] args) {
        Conducible[] vehiculos = {
            new Carro(),
            new Moto()
        };

        for (Conducible v : vehiculos) {
            v.conducir();
        }
    }
}
