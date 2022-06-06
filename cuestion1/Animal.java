/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuestion1;

/**
 *
 * @author BySum
 */
public class Animal {
    //CAMPOS DE DATOS
    private String nombre;
    private int edad;
    private String tipo;
    private int id;
    
    
    //SI CREAMOS EL CONSTRUCTOR POR LA VERSION DE MI JAVA (18) ME DA ERROR EN EL MAIN POR LO QUE HE DECIDIDO UTILIZAR EL CONSTRUCTOR QUE JAVA NOS PROPORCIONA POR DEFECTO CUANDO INSTANCIAMOS OBJETOS.
    
    
    
    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }
    
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    //METODOS
    public void comer(){
        System.out.println("Soy un animal comiendo");
    }
    public void saltar(String nombre){
        System.out.println("Soy "+nombre+" un animal saltando");
    }
    public void correr(){
        System.out.println("Soy un animal corriendo");
    }

    

    
}//cierra clase
