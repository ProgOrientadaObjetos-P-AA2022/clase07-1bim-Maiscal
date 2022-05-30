/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

/**
 *
 * @author SALA I
 */
public class ejecutor2 {
     public static void main(String[] args) {

        // nombre del archivo
        String nombreArchivo = "data/Hospital.data";
        String nombre_buscar = "Isidro";
        Hospital profesor_buscar;
        
        Lectura lectura = new Lectura(nombreArchivo);
        lectura.establecerIdentificador(nombre_buscar);
        lectura.establecerHospitalBuscado();
        profesor_buscar = lectura.obtenerHospitalBuscado();
        if(profesor_buscar!=null){
            System.out.println(profesor_buscar);
        }else{
            System.out.println("Profesor no encontrado");
        }
        
    }
}
