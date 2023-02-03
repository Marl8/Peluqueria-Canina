
package com.mycompany.peluqueriacanina.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDuenio;
    private String nombre;
    private String cel;
    

    public Duenio() {
    }

    public Duenio(int idDuenio, String nombre, String cel) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.cel = cel;
    }

    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    @Override
    public String toString() {
        return "Duenio{" + "idDuenio=" + idDuenio + ", nombre=" + nombre + ", cel=" + cel;
    }

    
    
}
