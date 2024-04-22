
package com.mycompany.veterinaria;

// Clase que representa un animal
class Animal {
    private String nombre;
    private String tipo;
    private int edad;

    // Constructor de la clase Animal
    public Animal(String nombre, String tipo, int edad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
    }

    // Método toString para mostrar información del animal
    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + "]";
    }
}

