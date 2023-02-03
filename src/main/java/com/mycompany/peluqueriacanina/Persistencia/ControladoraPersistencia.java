
package com.mycompany.peluqueriacanina.Persistencia;

import com.mycompany.peluqueriacanina.Logica.Duenio;
import com.mycompany.peluqueriacanina.Logica.Mascotas;
import com.mycompany.peluqueriacanina.Persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotasJpaController mascotaJpa = new MascotasJpaController();
  

    

    public void guardar(Duenio duenio, Mascotas mascota) {
       
        //Creamos en la Base de Datos el dueño
        
        duenioJpa.create(duenio);
        
        //Cremos el la Base de Datos la mascota
        
        mascotaJpa.create(mascota);
           
    }

    public List<Mascotas> traerMascotas() {
        
        return mascotaJpa.findMascotasEntities();
    }

    public void borrarMascota(int num_Cliente) {
        try {
            mascotaJpa.destroy(num_Cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Mascotas traerMascota(int num_Cliente) {
        
      return mascotaJpa.findMascotas(num_Cliente);
    }

    public void ModificarMascota(Mascotas masco) {
        
        try {
            mascotaJpa.edit(masco);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Duenio traerDuenio(int idDuenio) {
        return duenioJpa.findDuenio(idDuenio);
    }

    public void modificarDuenio(Duenio dueno) {
        try {
            duenioJpa.edit(dueno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
