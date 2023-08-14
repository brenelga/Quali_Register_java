/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quali_register_2;

/**
 *
 * @author Brenel Galicia
 */
public class Carrera {
    String Id, Nombre, Coordinador;

    public Carrera(String Id, String Nombre, String Coordinador) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Coordinador = Coordinador;
    }

    public Carrera() {
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

    public String getCoordinador() {
        return Coordinador;
    }

    public void setCoordinador(String Coordinador) {
        this.Coordinador = Coordinador;
    }
    
}
