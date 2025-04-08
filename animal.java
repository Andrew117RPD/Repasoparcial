//Ejercicio: Crear una clase Animal y subclases Perro y Gato.//

class Animal {
    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println("Hace un sonido");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau!");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau!");
    }
}

public class Zoologico {
    public static void main(String[] args) {
        Perro p = new Perro("Rocky");
        Gato g = new Gato("Michi");

        p.hacerSonido();
        g.hacerSonido();
    }
}
