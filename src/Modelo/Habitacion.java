/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

public class Habitacion {

    public Habitacion() {
    }

    public Habitacion(int id_habitacion, String num_habitacion) {
        this.id_habitacion = id_habitacion;
        this.num_habitacion = num_habitacion;
        
        
    }

    public Habitacion(int id_habitacion, double precio) {
        this.id_habitacion = id_habitacion;
        this.precio = precio;
        
    }
    
    
    

    public Habitacion(String num_habitacion) {

        this.num_habitacion = num_habitacion;
        this.precio = precio;
        
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public String getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(String num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    @Override
    public String toString() {
        return "Habitacion " + id_habitacion;
                                                                                        
    }
    
    

    private int id_habitacion;
    private String num_habitacion;  
    private double precio;
    
}
