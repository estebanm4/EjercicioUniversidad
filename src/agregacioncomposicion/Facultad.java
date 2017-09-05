/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacioncomposicion;

import java.util.HashMap;

/**
 *
 * @author Estudiante
 */
public class Facultad {
    private String nombre;
    private HashMap<Integer,Estudiante> 
                   estudiantes;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = 
                new HashMap<>();
        
    }
    
    public void addEstudiante(Estudiante estudiante){
       this.estudiantes.put(estudiante.getCodigo(),
                            estudiante);
     
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
