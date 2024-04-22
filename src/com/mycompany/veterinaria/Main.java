// Clase principal(main) para ejecutar el programa

package com.mycompany.veterinaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Crear una nueva instancia de Veterinaria
        Veterinaria veterinaria = new Veterinaria("Mi Veterinaria", "Calle Principal");
        
        // Crear instancia de Cliente
        System.out.println("Ingrese nombre del cliente:");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingrese Dirección del cliente:");
        String direccionCliente = scanner.nextLine();
        Cliente cliente1 = new Cliente(nombreCliente, direccionCliente);
        
        // Crear instancias de animal
        System.out.println("Ingresa el nombre de la mascota:");
        String nombreMascota = scanner.nextLine();
        System.out.println("Ingresa la especie de la mascota:");
        String especieMascota = scanner.nextLine();
        System.out.println("Ingresa la edad de la mascota:");
        int edadMascota = scanner.nextInt();
        
        Animal mascota = new Animal(nombreMascota, especieMascota, edadMascota);

        // Agregar mascotas al cliente
        cliente1.agregarMascota(mascota);

        // Agregar cliente a la veterinaria
        veterinaria.agregarCliente(cliente1);

        // Mostrar clientes de la veterinaria
        System.out.println("Clientes de la veterinaria:");
        veterinaria.mostrarClientes();

        // Mostrar mascotas del cliente
        System.out.println("\nMascotas del cliente:");
        cliente1.mostrarMascotas();
    }
}