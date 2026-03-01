package com.example;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("===== DEMOSTRACIÓN DE LA CLASE PRODUCT =====\n");
        
        System.out.println("--- Primer Producto ---");
        
        // Crear el primer objeto de tipo Product
        Product product1 = new Product();
        
        // Utilizar los setters para asignar valores
        product1.setId("P001");
        product1.setName("Laptop");
        product1.setPrice(1200.50);
        product1.setStock(15);
        
        // Utilizar los getters para imprimir valores 
        System.out.println("ID del producto 1: " + product1.getId());
        System.out.println("Nombre del producto 1: " + product1.getName());
        System.out.println("Precio del producto 1: $" + product1.getPrice());
        System.out.println("Stock del producto 1: " + product1.getStock());
        
        // Usar el toString() para imprimir la representación completa
        System.out.println("Representación completa: " + product1.toString());
        
        System.out.println("\n--- Segundo Producto ---");
        
        // Crear el segundo objeto de tipo Product
        Product product2 = new Product();
        
        // Utilizar los setters para asignar valores
        product2.setId("P002");
        product2.setName("Mouse Inalámbrico");
        product2.setPrice(25.99);
        product2.setStock(150);
        
        // Utilizar los getters para imprimir valores
        System.out.println("ID del producto 2: " + product2.getId());
        System.out.println("Precio del producto 2: $" + product2.getPrice());
        System.out.println("Stock del producto 2: " + product2.getStock());
        System.out.println("Nombre del producto 2: " + product2.getName());
        
        // Usar el toString() para imprimir la representación completa
        System.out.println("Representación completa: " + product2.toString());
        
        System.out.println("\n--- Modificación de Atributos ---");
        
        System.out.println("Modificando el precio de producto1 a $1500.00");
        product1.setPrice(1500.00);
        System.out.println("Nuevo precio: $" + product1.getPrice());
        
        System.out.println("\nModificando el stock de producto2 a 200");
        product2.setStock(200);
        System.out.println("Nuevo stock: " + product2.getStock());
        
        System.out.println("\n--- Prueba de Validación (Puntos Extra) ---");
        
        System.out.println("Intentando asignar un precio negativo a product1...");
        product1.setPrice(-100);
        System.out.println("Precio actual de product1: $" + product1.getPrice());
        
        System.out.println("\nIntentando asignar un stock negativo a product2...");
        product2.setStock(-50);
        System.out.println("Stock actual de product2: " + product2.getStock());
        
        System.out.println("\n===== RESUMEN FINAL =====");
        System.out.println(product1);
        System.out.println(product2);
    }
}