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
public class ManejoArrayList11 {
    
    public static void main(String[] args) {

        Empresa e1 = new Empresa("Malitos","Macara");
        Empresa e2 = new Empresa("Jones","Loja");
        Empresa e3 = new Empresa("Papitos","Quito");

        ArrayList <Empresa> emp = new ArrayList<>();

        emp.add(e1);
        emp.add(e2);
        emp.add(e3);

        for(int i = 0; i < emp.size(); i++){
            System.out.printf("%s - %s\n",
                    emp.get(i).obtenerNombre(),emp.get(i).obtenerCiudad()
                    );
        }
    }
}
