//Ejercicio: Crear una clase abstracta Empleado con un método abstracto calcularSalario(), y dos clases hijas: EmpleadoTiempoCompleto y EmpleadoMedioTiempo//


abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public abstract double calcularSalario();
}

class EmpleadoTiempoCompleto extends Empleado {
    private double salarioMensual;

    public EmpleadoTiempoCompleto(String nombre, double salarioMensual) {
        super(nombre);
        this.salarioMensual = salarioMensual;
    }

    public double calcularSalario() {
        return salarioMensual;
    }
}

class EmpleadoMedioTiempo extends Empleado {
    private double horasTrabajadas;
    private double tarifaHora;

    public EmpleadoMedioTiempo(String nombre, double horasTrabajadas, double tarifaHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public double calcularSalario() {
        return horasTrabajadas * tarifaHora;
    }
}

public class Empresa {
    public static void main(String[] args) {
        Empleado e1 = new EmpleadoTiempoCompleto("Laura", 2000000);
        Empleado e2 = new EmpleadoMedioTiempo("Carlos", 80, 25000);

        System.out.println(e1.nombre + ": $" + e1.calcularSalario());
        System.out.println(e2.nombre + ": $" + e2.calcularSalario());
    }
}
