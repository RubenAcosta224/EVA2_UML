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
public class Vehiculo {
    private String marca;
    private String modelo;
    private int año;
    
    
    public void setMarca(String n){
        marca=n;
    }
    public void setModelo(String n){
        modelo=n;
    }
    public void setAño(int n){
        año=n;
    }
    
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public int setAño(){
        return año;
    }
    
    
    public void imprimirDatos(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Año: "+año);
    }
}
