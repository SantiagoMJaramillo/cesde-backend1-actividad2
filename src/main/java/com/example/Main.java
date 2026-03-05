package com.example;

/**
 * Clase Main que demuestra el funcionamiento de:
 * - Libro (Constructores y sobrecarga)
 * - CuentaBancaria (Encapsulamiento y métodos)
 * - Estudiante (Lógica y métodos)
 */
public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("EJERCICIO 1: CONSTRUCTORES Y SOBRECARGA - CLASE LIBRO");
        System.out.println("=".repeat(60));
        
        // ==================== EJERCICIO 1: LIBRO ====================
        
        System.out.println("\n--- Creando libros con diferentes constructores ---\n");
        
        // Constructor vacío
        Libro l1 = new Libro();
        System.out.println("Libro 1 (Constructor vacío):");
        l1.mostrarDetalles();
        
        // Constructor con título y autor
        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        System.out.println("\nLibro 2 (Constructor con título y autor):");
        l2.mostrarDetalles();
        
        // Constructor completo
        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        System.out.println("\nLibro 3 (Constructor completo):");
        l3.mostrarDetalles();
        
        // Modificando valores con setters
        System.out.println("\n--- Modificando atributos con setters ---");
        l1.setTitulo("1984");
        l1.setAutor("George Orwell");
        l1.setPaginas(328);
        System.out.println("\nLibro 1 después de modificar:");
        l1.mostrarDetalles();
        
        // ==================== EJERCICIO 2: CUENTA BANCARIA ====================
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("EJERCICIO 2: ENCAPSULAMIENTO - CLASE CUENTA BANCARIA");
        System.out.println("=".repeat(60));
        
        System.out.println("\n--- Creando una cuenta bancaria ---");
        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);
        
        System.out.println("\nInformación inicial:");
        cuenta.mostrarInfo();
        
        System.out.println("--- Realizando transacciones ---\n");
        
        // Depósito válido
        System.out.println("1. Depositando $200:");
        cuenta.depositar(200);
        
        System.out.println("\n2. Saldo actual: $" + cuenta.getSaldo());
        
        // Intento de retiro válido
        System.out.println("\n3. Retirando $300:");
        cuenta.retirar(300);
        
        // Intento de retiro con fondos insuficientes
        System.out.println("\n4. Intentando retirar $1000 (fondos insuficientes):");
        cuenta.retirar(1000);
        
        // Intento de depósito negativo
        System.out.println("\n5. Intentando depositar -$100 (cantidad negativa):");
        cuenta.depositar(-100);
        
        // Información final
        System.out.println("\n6. Información final de la cuenta:");
        cuenta.mostrarInfo();
        
        // ==================== EJERCICIO 3: ESTUDIANTE ====================
        
        System.out.println("=".repeat(60));
        System.out.println("EJERCICIO 3: LÓGICA Y MÉTODOS - CLASE ESTUDIANTE");
        System.out.println("=".repeat(60));
        
        System.out.println("\n--- Creando estudiantes ---\n");
        
        // Estudiante con constructor vacío
        Estudiante e1 = new Estudiante();
        System.out.println("Estudiante 1 (Constructor vacío):");
        System.out.println(e1);
        
        // Estudiante con constructor completo - REPROBADO
        Estudiante e2 = new Estudiante("Pedro", 21, 2.5);
        System.out.println("\nEstudiante 2 (Constructor completo - Reprobado):");
        e2.mostrarInfo();
        
        // Estudiante con constructor completo - APROBADO
        Estudiante e3 = new Estudiante("Ana", 20, 3.8);
        System.out.println("Estudiante 3 (Constructor completo - Aprobado):");
        e3.mostrarInfo();
        
        // Modificando atributos con setters
        System.out.println("--- Modificando estudiante 2 ---");
        e2.setNombre("Pedro García");
        e2.setEdad(22);
        e2.setPromedio(3.5);  // Mejora su promedio
        System.out.println("\nEstudiante 2 después de modificar:");
        e2.mostrarInfo();
        
        // Intento de asignar edad negativa
        System.out.println("--- Intentando asignar edad negativa ---");
        e3.setEdad(-5);
        System.out.println("Edad actual de e3: " + e3.getEdad());  // Seguirá siendo 20
        
        // Verificación individual de aprobación
        System.out.println("\n--- Verificación de aprobación ---");
        System.out.println("¿" + e2.getNombre() + " aprobó? " + (e2.haAprobado() ? "SÍ" : "NO"));
        System.out.println("¿" + e3.getNombre() + " aprobó? " + (e3.haAprobado() ? "SÍ" : "NO"));
    }
}