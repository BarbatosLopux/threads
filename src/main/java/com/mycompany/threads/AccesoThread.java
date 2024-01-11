/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threads;

/**
 *
 * @author user
 */
public class AccesoThread extends Thread {
    
    private Edificio edificio; 
    private String nombre; 
    private String entrada; 

    public AccesoThread(Edificio edificio, String nombre, String entrada) {
        this.edificio = edificio;
        this.nombre = nombre;
        this.entrada = entrada;
    }

    @Override
    public void run() {
        edificio.acceso(nombre, entrada); 
    }
   
}
