/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author invitado
 */
public class Persona {
    private int id;
    private String nombre;
    private int edad;
    
    
    public void setId(int n){
        id=n;
    }
    public void setNombre(String n){
        nombre=n;
    }
    public void setEdad(int n){
        edad=n;
    }
    
    
    public int getId(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    
    public void imprimirDatos(){
        System.out.println("Persona: "+id);
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    
}
