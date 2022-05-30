/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
        
    public static void main(String[] args) {
        
        String nombreArchivo = "hospital.data";
        
        Hospital h1 = new Hospital("Tara Hernandez", 500, 900);
        Hospital h2 = new Hospital("Gregory Walsh", 60, 500);
        Hospital h3 = new Hospital("Kevin Page", 90, 2500);

        Escritura archivo = new Escritura(nombreArchivo);
        
        // establecer el valor del atributo registro
        archivo.establecerRegistroHospital(h1);
        // establecer en el archivo el atributo del registro
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(h2);
        archivo.establecerSalida();
        archivo.establecerRegistroHospital(h3);
        archivo.establecerSalida();
        archivo.cerrarArchivo();
        
        Lectura lectura = new Lectura(nombreArchivo);
        lectura.establecerHospital();
        System.out.println(lectura);
        
    }
}
