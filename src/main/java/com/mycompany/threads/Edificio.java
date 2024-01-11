/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threads;

/**
 *
 * @author user
 */
public class Edificio {

 public synchronized void acceso(String nombre, String entrada){ 
        System.out.println(nombre +"Esta accediendo al edificio desde la entrada"+entrada); 
 }
    
}
