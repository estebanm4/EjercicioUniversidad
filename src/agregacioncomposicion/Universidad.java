/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacioncomposicion;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 *
 * @author Estudiante
 */
public class Universidad {
    private String nombre;
    private ArrayList<Facultad> facultades;
    private TreeMap<Integer,Estudiante>
             estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.facultades = new ArrayList<>();
        this.estudiantes = new TreeMap<>();
    }
    
    public boolean addFacultad(String nombre){
       Facultad facultad = new Facultad(nombre);
       if(this.facultades.add(facultad))
           return true;
       else 
           return false;
    
    }
    public boolean addEstudiante(Estudiante estudiante){
  if(this.estudiantes.put(estudiante.getCodigo(), estudiante)!=null)
        return true;
     else 
           return false;
    }
    
    public boolean addEstudianteFacultad
           (String nombreFacultad, Estudiante estudiante){
        boolean resultado = false;
        for (int i = 0; i < this.facultades.size(); i++) {
            if(this.facultades.get(i).getNombre().equals(nombreFacultad)){
               this.facultades.get(i).addEstudiante(estudiante);
               resultado = true;
               break;
            }
        }
      return resultado;
    }
           
    public ArrayList<Estudiante> listAllEstudiantes(){
        return (ArrayList)this.estudiantes.values();
    }    

    public ArrayList<Facultad> listAllFacultades(){
      return this.facultades;
    }
}