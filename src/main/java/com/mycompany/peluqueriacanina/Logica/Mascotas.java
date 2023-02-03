
package com.mycompany.peluqueriacanina.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascotas implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int numcliente;
    private String nombrePerro;
    private String raza;
    private String color;
    private String alergico;
    private String atencionEsp;
    private String observaciones;

    @OneToOne
    Duenio duienio = new Duenio ();
    
    public Mascotas() {
    }

    public Mascotas(int numcliente, String nombrePerro, String raza, String color, String alergico, String atencionEsp, String observaciones) {
        this.numcliente = numcliente;
        this.nombrePerro = nombrePerro;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atencionEsp = atencionEsp;
        this.observaciones = observaciones;
    }

    

    public int getNumcliente() {
        return numcliente;
    }

    public void setNumcliente(int numcliente) {
        this.numcliente = numcliente;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencionEsp() {
        return atencionEsp;
    }

    public void setAtencionEsp(String atencionEsp) {
        this.atencionEsp = atencionEsp;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Duenio getDuienio() {
        return duienio;
    }

    public void setDuienio(Duenio duienio) {
        this.duienio = duienio;
    }

    
    
    @Override
    public String toString() {
        return "Mascotas{" + "numcliente=" + numcliente + ", nombrePerro=" + nombrePerro + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico + ", atencionEsp=" + atencionEsp + ", observaciones=" + observaciones + '}';
    }

   
}
