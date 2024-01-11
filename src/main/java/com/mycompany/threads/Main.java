/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.threads;

/**
 *
 * @author user
 */
public class Main {

    public static void main(String[] args) {
        Edificio edificio = new Edificio (); 
        
        AccesoThread entrada1 = new AccesoThread(edificio, "Jhon", "Puerta Oeste"); 
        AccesoThread entrada2 = new AccesoThread(edificio, "Kevin", "Puerta Norte"); 
        
        entrada1.start();
        entrada2.start(); 

    }
    
}
