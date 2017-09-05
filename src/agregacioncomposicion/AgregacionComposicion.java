/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agregacioncomposicion;

import java.util.Scanner;
import java.util.TreeMap;
/**
 *
 * @author Estudiante
 */
public class AgregacionComposicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("Ingrese el nombre de la Universidad");
        String universidad = in.nextLine();
        Universidad u1 = new Universidad(universidad);
        
        System.out.println("Ingrese el nombre de la Facultad que desea agregar");
        String facultad = in.nextLine();
        u1.addFacultad(facultad);
        
        System.out.println("Ingrese el código y el nombre del estudiante");
        int codigo = in.nextInt();
        String Nombre = in.nextLine();
        u1.addEstudiante(new Estudiante(codigo, Nombre));
        
        /*System.out.println("Ingrese el nombre de la Facultad a la que quiere ingresar este estudiante");
        String facultadIngreso = in.nextLine();
        u1.addEstudianteFacultad(facultadIngreso, Universidad.estudiantes.get(0).getCodigo());
        
       */
        
        System.out.println("Seleccione la opción que desea realizar" + "\n" + "!. Listar los estudiantes de esta Universidades" + "\n" + "2. Listar las Facultades de esta Universidad");
        int resultado = in.nextInt();
        if(resultado == 1){
            for(int i = 0; i < u1.listAllEstudiantes.size(); i++)
            u1.listAllEstudiantes();
        } else if (resultado == 2){
            u1.listAllEstudiantes();
        } else {
            System.out.println("Acción no reconocida");
        }
    }
    
}
