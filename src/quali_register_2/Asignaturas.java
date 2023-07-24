/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quali_register_2;

/**
 *
 * @author Jesus Brenel
 */
public class Asignaturas {
    String Id, Nombre, Grado;

    public Asignaturas(String Id, String Nombre, String Grado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Grado = Grado;
    }

    public Asignaturas() {
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }
    
    
}
