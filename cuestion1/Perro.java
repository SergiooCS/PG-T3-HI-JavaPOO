/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuestion1;

/**
 *
 * @author BySum
 */
public class Perro extends Animal{
    public void PerroMorder(){
        System.out.println("Soy un perro y estoy mordiendo");
    }
    
    //SOBRECARGA
    public void PerroComer(String perroNombre){
        System.out.println("Soy "+perroNombre+" y estoy comiendo");
    }
    public void PerroComer(String perroNombre, String perroRaza){
        System.out.println("Soy "+perroNombre+", un "+perroRaza+", y estoy comiendo");
    }
    
    //SOBREESCRITURA
    @Override
    public void saltar(String nombre) {
        super.saltar(nombre);
    }
    
    
}//cierra clase

