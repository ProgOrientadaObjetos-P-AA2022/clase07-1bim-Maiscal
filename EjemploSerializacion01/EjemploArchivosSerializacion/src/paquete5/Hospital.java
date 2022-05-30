/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String no, int nu, double pe) {
        nombre = no;
        numeroCamas = nu;
        presupuesto = pe;
    }
    
    public void establecerNombre(String c) {
        nombre = c;
    }
    public void establecerNumeroCamas(int c) {
        numeroCamas = c;
    }
    public void establecerPresupuesto(double c) {
        presupuesto = c;
    }

    public String obtenerNombre() {
        return nombre;
    }
    public int obtenerNumeroCamas() {
        return numeroCamas;
    }
    public double obtenerPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        String c = String.format("%s - %d - %.2f\n",
                obtenerNombre(),
                obtenerNumeroCamas(),
                obtenerPresupuesto()
        );
        return c;
    }
}