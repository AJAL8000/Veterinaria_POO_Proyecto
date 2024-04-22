
package com.mycompany.veterinaria;

import java.util.ArrayList;

// Clase que representa una veterinaria
class Veterinaria extends EntidadVeterinaria {
    private ArrayList<Animal> listaAnimales;
    private ArrayList<Cliente> listaClientes;

    // Constructor de la clase Veterinaria
    public Veterinaria(String nombre, String direccion) {
        // Llama al constructor de la clase base (EntidadVeterinaria)
        super(nombre, direccion);
        // Inicializa las listas de animales y clientes
        listaAnimales = new ArrayList<>();
        listaClientes = new ArrayList<>();
    }

    // Método para agregar un animal a la lista de animales de la veterinaria
    public void agregarAnimal(Animal animal) {
        listaAnimales.add(animal);
    }

    // Método para mostrar todos los animales de la veterinaria
    public void mostrarAnimales() {
        for (Animal animal : listaAnimales) {
            System.out.println(animal);
        }
    }

    // Método para agregar un cliente a la lista de clientes de la veterinaria
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    // Método para mostrar todos los clientes de la veterinaria
    public void mostrarClientes() {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);
        }
    }

    // Método toString para mostrar información de la veterinaria
    @Override
    public String toString() {
        return "Veterinaria " + super.toString();
    }
}
