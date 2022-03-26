/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ferc
 */
public class Cliente {

    public Cliente(int id_cliente, String nom_cliente, String tel_cliente, String correo_cliente, String dni_cliente) {
        this.id_cliente = id_cliente;
        this.nom_cliente = nom_cliente;
        this.tel_cliente = tel_cliente;
        this.correo_cliente = correo_cliente;
        this.dni_cliente = dni_cliente;
    }

    public Cliente() {
    }

    public Cliente(String nom_cliente, String tel_cliente, String correo_cliente, String dni_cliente) {
        this.nom_cliente = nom_cliente;
        this.tel_cliente = tel_cliente;
        this.correo_cliente = correo_cliente;
        this.dni_cliente = dni_cliente;
    }
    
    

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getTel_cliente() {
        return tel_cliente;
    }

    public void setTel_cliente(String tel_cliente) {
        this.tel_cliente = tel_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    @Override
    public String toString() {
        return nom_cliente;
    }
    
    
    
    
    private int id_cliente;
    private String nom_cliente;
    private String tel_cliente;
    private String correo_cliente;
    private String dni_cliente;
    
}
