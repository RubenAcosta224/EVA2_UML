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
public class Tv {
    private int canal;
    private int volumen;
    private boolean power;
    
    
    public void setCanal(int n){
        canal=n;
    }
    public void setVolumen(int n){
        volumen=n;
    }
    public void setPower(boolean n){
       power=n;
    }
    
    
    public int getCanal(){
        return canal;
    }
    public int getVolumen(){
        return volumen;
    }
    public boolean getPower(){
        return power;
    }
    
    
    public void imprimirDatos(){
        System.out.println("Canal: "+canal);
        System.out.println("Volumen: "+volumen);
        System.out.println("Power: "+power);
    }
}
