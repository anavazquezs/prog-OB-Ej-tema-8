/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
-Crear clase Persona.
-Crear variables las privadas edad, nombre y telefono de la clase Persona.
-Crear gets y sets de cada propiedad.
-Crear un objeto persona en el main.
-Utilizar los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
 
 */
public class progOBJavaTema8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona usuario1 = new Persona();
        usuario1.setEdad(51);
        usuario1.setNombre("Ana");
        usuario1.setTelefono("351-478223");
        System.out.println("Nombre: " + usuario1.getNombre() +"; edad: " + usuario1.getEdad() + "; telefono: " + usuario1.getTelefono());
    }
    
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
