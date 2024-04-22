package com.mycompany.veterinaria;
import java.util.ArrayList;

// Clase base que representa una entidad de la veterinaria
class EntidadVeterinaria {
    private String nombre;
    private String direccion;

    // Constructor de la clase EntidadVeterinaria
    public EntidadVeterinaria(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    // Método para obtener el nombre de la entidad
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la dirección de la entidad
    public String getDireccion() {
        return direccion;
    }

    // Método toString para mostrar información de la entidad
    @Override
    public String toString() {
        return "EntidadVeterinaria [nombre=" + nombre + ", direccion=" + direccion + "]";
    }
}