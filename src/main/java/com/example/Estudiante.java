package com.example;

public class Estudiante {
    
    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;
    public Estudiante() {
        this.nombre = "";
        this.edad = 0;
        this.promedio = 0.0;
    }
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        
        // Validación de edad
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Advertencia: La edad debe ser mayor a 0. Se asignó 0.");
            this.edad = 0;
        }
        
        this.promedio = promedio;
    }
    // ==================== GETTERS ====================
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public double getPromedio() {
        return promedio;
    }
    // ==================== SETTERS ====================
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor a 0");
        }
    }
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    // ==================== MÉTODOS CON LÓGICA ====================
    
    public boolean haAprobado() {
        return promedio >= 3.0;
    }
    public void mostrarInfo() {
        System.out.println("\n===== INFORMACIÓN DEL ESTUDIANTE =====");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Promedio: " + promedio);
        
        // Usar haAprobado() para determinar el estado
        if (haAprobado()) {
            System.out.println("Estado: ✓ APROBADO");
        } else {
            System.out.println("Estado: ✗ REPROBADO");
        }
        System.out.println("=======================================\n");
    }
    
    @Override
    public String toString() {
        return "Estudiante {" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", promedio=" + promedio +
                ", aprobado=" + haAprobado() +
                '}';
    }
}