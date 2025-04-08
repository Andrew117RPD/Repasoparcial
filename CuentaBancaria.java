//Encapsulamiento//
//Ejercicio: Crear una clase CuentaBancaria con acceso privado a los atributos.//

class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) saldo += cantidad;
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) saldo -= cantidad;
    }
}

public class Banco {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Luis");
        cuenta.depositar(1500000);
        cuenta.retirar(300000);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
    }
}
