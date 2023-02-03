
package com.mycompany.peluqueriacanina.Logica;

import com.mycompany.peluqueriacanina.Persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raz, String colo, String alergico,
            String atencionEsp, String due, String cel, String observacion) {
       
        //Creamos el dueño y asignamos sus valores
        
        Duenio duenio = new Duenio ();
        duenio.setNombre(due);
        duenio.setCel(cel);
        
        //Creamos la mascota y asignamos sus valores
        
        Mascotas mascota = new Mascotas ();
        mascota.setNombrePerro(nombreMasco);
        mascota.setRaza(raz);
        mascota.setColor(colo);
        mascota.setAlergico(alergico);
        mascota.setAtencionEsp(atencionEsp);
        mascota.setObservaciones(observacion);
        mascota.setDuienio(duenio);
        
        controlPersis.guardar (duenio, mascota);
    }

    public List<Mascotas> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void borrarMascota(int num_Cliente) {
       controlPersis.borrarMascota(num_Cliente);
    }

    public Mascotas traerMascota(int num_Cliente) {
       
        return controlPersis.traerMascota (num_Cliente);
    }  

    public void ModificarMascota(Mascotas masco, String nombreMasco, String raz, String colo, 
            String alergico, String atencionEsp, String due, String cel, String observacion) {
        
        masco.setNombrePerro(nombreMasco);
        masco.setColor(colo);
        masco.setRaza(raz);
        masco.setAlergico(alergico);
        masco.setAtencionEsp(atencionEsp);
        masco.setObservaciones(observacion);
        
        controlPersis.ModificarMascota (masco);
        
        //seteo nuevos valore de dueño
        Duenio dueno = this.buscarDuenio (masco.getDuienio().getIdDuenio());
        dueno.setCel(cel);
        dueno.setNombre(due);
        
        //LLamar al modificador de dueño
        this.modificarDuenio (dueno);
        
        
    }    

    private Duenio buscarDuenio(int idDuenio) {
        
        return controlPersis.traerDuenio(idDuenio);
        
    }

    private void modificarDuenio(Duenio dueno) {
        
        controlPersis.modificarDuenio (dueno);
    }
 
}
