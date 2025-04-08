//Polimorfismo//
//Ejercicio: Usar polimorfismo para mostrar los sonidos de varios animales en una lista.//
public class DemoPolimorfismo {
    public static void main(String[] args) {
        Animal[] animales = {
            new Perro("Toby"),
            new Gato("Luna"),
            new Perro("Bobby")
        };

        for (Animal a : animales) {
            a.hacerSonido();
        }
    }
}
