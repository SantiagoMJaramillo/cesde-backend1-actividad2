package com.example;

public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        // Validación: Si el saldo inicial es negativo, asignar 0
        if (saldoInicial < 0) {
            this.saldo = 0;
            System.out.println("Advertencia: El saldo inicial no puede ser negativo. Se asignó 0.");
        } else {
            this.saldo = saldoInicial;
        }
    }

    // ==================== GETTERS ====================
    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // ==================== SETTERS ====================
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // ==================== MÉTODOS DE TRANSACCIÓN ====================
    public void depositar(double cantidad) {
        // Validación: Cantidad debe ser positiva
        if (cantidad > 0) {
            this.saldo += cantidad; // Suma a saldo
            System.out.println("✓ Depósito exitoso de $" + cantidad);
            System.out.println("  Nuevo saldo: $" + this.saldo);
        } else {
            System.out.println("✗ Error: La cantidad a depositar debe ser mayor a 0");
        }
    }

    public void retirar(double cantidad) {
        // Validación 1: Cantidad debe ser positiva
        if (cantidad <= 0) {
            System.out.println("✗ Error: La cantidad a retirar debe ser mayor a 0");
            return; // Salir del método sin hacer nada
        }

        // Validación 2: Debe haber saldo suficiente
        if (cantidad > this.saldo) {
            System.out.println("✗ Error: Fondos insuficientes");
            System.out.println("  Intenta retirar: $" + cantidad);
            System.out.println("  Saldo disponible: $" + this.saldo);
            return; // Salir del método sin hacer nada
        }

        // Si pasa las validaciones, realizar el retiro
        this.saldo -= cantidad; // Resta del saldo
        System.out.println("✓ Retiro exitoso de $" + cantidad);
        System.out.println("  Nuevo saldo: $" + this.saldo);
    }

    public void mostrarInfo() {
        System.out.println("\n===== INFORMACIÓN DE CUENTA =====");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("=================================\n");
    }

    @Override
    public String toString() {
        return "CuentaBancaria {" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}