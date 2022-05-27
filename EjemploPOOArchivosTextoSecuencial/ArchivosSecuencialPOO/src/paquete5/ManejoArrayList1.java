/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Empresa;
import paquete1.Profesor;

/**
 *
 * @author reroes
 */
public class ManejoArrayList1 {
    
    public static void main(String[] args) {

        Calificacion c1 = new Calificacion(5.5, "Matematicas");
        Calificacion c2 = new Calificacion(9.5, "Geografia");
        Calificacion c3 = new Calificacion(7.5, "Fisica");

        Profesor prof1 = new Profesor("Joseph Jimenez", "facturado");
        Profesor prof2 = new Profesor("David Jones", "nombramiento");
        Profesor prof3 = new Profesor("Melissa Gilbert", "contratado");
        
        // Arreglo
        c1.establecerProfesor(prof1);
        c2.establecerProfesor(prof2);
        c3.establecerProfesor(prof3);
        
        // ArrayList
        ArrayList <Calificacion> cal = new ArrayList<>();
        cal.add(c1);
        cal.add(c2);
        cal.add(c3);
        
        System.out.println("-----------------------------");
        
        for (int i = 0; i < cal.size(); i++) {
            //nombre del profesor
            // nombre de la materia
            //la nota\
            //System.out.printf("%s - %s - %.2f\n",             
            //profesores2.get(i).obtenerNombre(),
            //cal.get(i).obtenerNombreMateria(),cal.get(i).obtenerNota()            
            System.out.printf("%s - %s %.2f\n", 
                    cal.get(i).obtenerProfesor().obtenerNombre(),
                    cal.get(i).obtenerNombreMateria(),
                    cal.get(i).obtenerNota()
            );
      }

    }
}
