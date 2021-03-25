/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.Random;
/**
 *
 * @author userhp
 */
public class Cliente {
 
    
    public int numCliente(){
        Random rd=new Random();
        int numeroCliente=rd.nextInt(100)+1;
        return numeroCliente; 
    }
    
    public int numCajaCliente(){
        Random rd2=new Random();
        int numeroCaja=rd2.nextInt(3)+1;
        return numeroCaja;   
    }
    
    public void tiempoEspera(int espera){
         try {
            Thread.sleep(espera* 1000);
            
         } catch (Exception e) {
            System.out.println(e);
         }   
    }   
    
    
    
}
