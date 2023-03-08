/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_uml;

import MisClases.Persona;
import MisClases.Tv;
import MisClases.Vehiculo;

/**
 *
 * @author invitado
 */
public class EVA2_UML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Persona persona1=new Persona();
        persona1.setId(24);
        persona1.setNombre("Juan");
        persona1.setEdad(387);
    
        persona1.imprimirDatos();
        
        
        
        Vehiculo carro1=new Vehiculo();
        carro1.setMarca("nissan");
        carro1.setModelo("Tsuru");
        carro1.setAño(2001);
        carro1.imprimirDatos();
        
        
        
        Tv tv1=new Tv();
        tv1.setCanal(14);
        tv1.setVolumen(42);
        tv1.setPower(true);
        tv1.imprimirDatos();
    }
}
