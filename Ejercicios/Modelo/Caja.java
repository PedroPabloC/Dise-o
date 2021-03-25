/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.LinkedList;
import java.util.Queue;
import Modelo.Cliente;
/**
 *
 * @author userhp
 */
public class Caja {
    Queue<Integer> caja1 = new LinkedList<Integer>();
    Queue<Integer> caja2 = new LinkedList<Integer>();
    Queue<Integer> caja3 = new LinkedList<Integer>();
    
    public void agregarClienteCaja1(int cliente){
            caja1.add(cliente) ;
    }
    
    
    public void atenderClienteCaja1(){
        try{
            caja1.poll();
                }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No puede retirarse el elemento");
        }
    
    }
            
    public void agregarClienteCaja2(int cliente){
        caja2.add(cliente);
    
    }
    
    public void atenderClienteCaja2(){
        try{
            caja2.poll();
                }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No puede retirarse el elemento");
        }
        
    }
            
    public void agregarClienteCaja3(int cliente){
        caja3.add(cliente);
    
    }
    
    public void atenderClienteCaja3(){
        try{
            caja2.poll();
                }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No puede retirarse el elemento");
        }
    
    }
            
   
    
}
