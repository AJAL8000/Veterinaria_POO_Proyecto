
package com.mycompany.veterinaria;

//La clase ArrayList en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays
import java.util.ArrayList; 

// Clase que representa un cliente
class Cliente extends EntidadVeterinaria {
    private ArrayList<Animal> mascotas;

    // Constructor de la clase Cliente
    public Cliente(String nombre, String direccion) {
        // Llama al constructor de la clase base (EntidadVeterinaria)
        super(nombre, direccion);
        // Inicializa la lista de mascotas
        mascotas = new ArrayList<>();
    }

    // Método para agregar una mascota al cliente
    public void agregarMascota(Animal mascota) {
        mascotas.add(mascota);
    }

    // Método para mostrar todas las mascotas del cliente
    public void mostrarMascotas() {
        for (Animal mascota : mascotas) {
            System.out.println(mascota);
        }
    }

    // Método toString para mostrar información del cliente
    @Override
    public String toString() {
        return "Cliente " + super.toString();
    }
}
