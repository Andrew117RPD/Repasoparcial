//Estructura del código:
//Tipo (Interfaz)
//Pokemon (Clase abstracta)
//Charmander, Squirtle, Bulbasaur (Subclases)
//Main (Simula batalla)

// Interfaz Tipo
interface Tipo {
    double calcularVentaja(String tipoEnemigo);
}

// Clase abstracta
abstract class Pokemon {
    private String nombre;
    private int hp;
    private String tipo;

    public Pokemon(String nombre, int hp, String tipo) {
        this.nombre = nombre;
        this.hp = hp;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    public String getTipo() {
        return tipo;
    }

    public abstract void atacar(Pokemon enemigo);
}

// Charmander - tipo fuego
class Charmander extends Pokemon implements Tipo {
    public Charmander() {
        super("Charmander", 100, "Fuego");
    }

    public double calcularVentaja(String tipoEnemigo) {
        switch (tipoEnemigo) {
            case "Planta": return 2.0;
            case "Agua": return 0.5;
            default: return 1.0;
        }
    }

    public void atacar(Pokemon enemigo) {
        double ventaja = calcularVentaja(enemigo.getTipo());
        int daño = (int)(20 * ventaja);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(getNombre() + " atacó a " + enemigo.getNombre() + " e hizo " + daño + " de daño.");
    }
}

// Squirtle - tipo agua
class Squirtle extends Pokemon implements Tipo {
    public Squirtle() {
        super("Squirtle", 100, "Agua");
    }

    public double calcularVentaja(String tipoEnemigo) {
        switch (tipoEnemigo) {
            case "Fuego": return 2.0;
            case "Planta": return 0.5;
            default: return 1.0;
        }
    }

    public void atacar(Pokemon enemigo) {
        double ventaja = calcularVentaja(enemigo.getTipo());
        int daño = (int)(18 * ventaja);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(getNombre() + " atacó a " + enemigo.getNombre() + " e hizo " + daño + " de daño.");
    }
}

// Bulbasaur - tipo planta
class Bulbasaur extends Pokemon implements Tipo {
    public Bulbasaur() {
        super("Bulbasaur", 100, "Planta");
    }

    public double calcularVentaja(String tipoEnemigo) {
        switch (tipoEnemigo) {
            case "Agua": return 2.0;
            case "Fuego": return 0.5;
            default: return 1.0;
        }
    }

    public void atacar(Pokemon enemigo) {
        double ventaja = calcularVentaja(enemigo.getTipo());
        int daño = (int)(15 * ventaja);
        enemigo.setHp(enemigo.getHp() - daño);
        System.out.println(getNombre() + " atacó a " + enemigo.getNombre() + " e hizo " + daño + " de daño.");
    }
}

// Main
public class BatallaPokemon {
    public static void main(String[] args) {
        Pokemon p1 = new Charmander();
        Pokemon p2 = new Bulbasaur();

        System.out.println("¡Batalla Pokémon comienza!");
        System.out.println(p1.getNombre() + " vs " + p2.getNombre());

        p1.atacar(p2);
        p2.atacar(p1);

        System.out.println("HP de " + p1.getNombre() + ": " + p1.getHp());
        System.out.println("HP de " + p2.getNombre() + ": " + p2.getHp());
    }
}
