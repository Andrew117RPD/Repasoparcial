//Clases e interfaces involucradas:
//Empleado (Clase abstracta)
//Calculable (Interface)
//Desarrollador, Diseñador, Gerente (Subclases de Empleado que implementan Calculable)
//EmpresaMain (Clase con main)//
// INTERFAZ

interface Calculable {
    double calcularSalario();
}

// CLASE ABSTRACTA
abstract class Empleado implements Calculable {
    private String nombre;
    private int edad;
    private double salarioBase;

    public Empleado(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public double getSalarioBase() { return salarioBase; }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario base: $" + salarioBase);
    }
}

// SUBCLASES
class Desarrollador extends Empleado {
    private int horasExtra;

    public Desarrollador(String nombre, int edad, double salarioBase, int horasExtra) {
        super(nombre, edad, salarioBase);
        this.horasExtra = horasExtra;
    }

    public double calcularSalario() {
        return getSalarioBase() + (horasExtra * 10000);
    }
}

class Diseñador extends Empleado {
    private int proyectos;

    public Diseñador(String nombre, int edad, double salarioBase, int proyectos) {
        super(nombre, edad, salarioBase);
        this.proyectos = proyectos;
    }

    public double calcularSalario() {
        return getSalarioBase() + (proyectos * 5000);
    }
}

class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, int edad, double salarioBase, double bono) {
        super(nombre, edad, salarioBase);
        this.bono = bono;
    }

    public double calcularSalario() {
        return getSalarioBase() + bono;
    }
}

// CLASE PRINCIPAL
public class EmpresaMain {
    public static void main(String[] args) {
        Empleado[] empleados = {
            new Desarrollador("Luis", 30, 3000000, 10),
            new Diseñador("Ana", 27, 2800000, 3),
            new Gerente("Carlos", 45, 5000000, 1500000)
        };

        for (Empleado e : empleados) {
            e.mostrarInformacion();
            System.out.println("Salario total: $" + e.calcularSalario());
            System.out.println("------------------------");
        }
    }
}
