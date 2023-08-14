/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quali_register_2;

/**
 *
 * @author Brenel Galicia
 */
public class Coordinador {
    String id, nombre, appat, apmat;

    public Coordinador(String id, String nombre, String appat, String apmat) {
        this.id = id;
        this.nombre = nombre;
        this.appat = appat;
        this.apmat = apmat;
    }

    public Coordinador() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAppat() {
        return appat;
    }

    public void setAppat(String appat) {
        this.appat = appat;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }
    
}
