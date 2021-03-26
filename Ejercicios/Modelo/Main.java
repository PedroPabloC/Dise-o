/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.LinkedList;
import java.util.Queue;
import Modelo.Cliente;
import java.util.Scanner;
import Modelo.Caja;
import Modelo.Cliente;
import java.util.Random;
/**
 *
 * @author userhp
 */
public class Main {
     public static void main(String[] args) { 
         Random rd=new Random();
         Scanner sc=new Scanner(System.in);
         Caja c1=new Caja();
         int opcion=1;
        System.out.println("Inicio de atención al cliente");
        while(opcion!=2){
            int espera=rd.nextInt(9)+1;
            int caja;
            Cliente cliente=new Cliente();
            caja=cliente.numCajaCliente();
            switch(caja){
                case 1:
                    int clientes=cliente.numCliente();
                    c1.agregarClienteCaja1(clientes);
                    System.out.println("El cliente "+clientes+" es atendido en la caja 1");
                    System.out.println("El cliente está siendo atendido, espere...");
                    cliente.tiempoEspera(espera);
                    System.out.println("Se ha terminado de atender al cliente "+clientes);
                    c1.atenderClienteCaja1();
                    
                    System.out.println("¿Hay otro cliente por atender?");
                    System.out.println("1:Sí     2: No");
                    opcion=sc.nextInt();
                    
                    if(opcion==2){
                         System.out.println("Atención a clientes finalizada");
                         System.exit(0);
                    }else{
                    while(opcion<1 || opcion>2){
                    System.out.println("Opción inválida");
                    System.out.println("¿Hay otro cliente por atender?");
                    System.out.println("1:Sí     2: No");
                    opcion=sc.nextInt();
                    if(opcion==2){
                         System.out.println("Atención a clientes finalizada");
                         System.exit(0);
                    }
                    }
                    }
                    
                case 2:
                    clientes=cliente.numCliente();
                    c1.agregarClienteCaja2(clientes);
                    System.out.println("El cliente "+clientes+" es atendido en la caja 2");
                    System.out.println("El cliente está siendo atendido, espere...");
                    cliente.tiempoEspera(espera);
                    System.out.println("Se ha terminado de atender al cliente "+clientes);
                    c1.atenderClienteCaja2();
                    
                    System.out.println("¿Hay otro cliente por atender?");
                    System.out.println("1:Sí     2: No");
                    opcion=sc.nextInt();
                    
                     if(opcion==2){
                         System.out.println("Atención a clientes finalizada");
                         System.exit(0);
                    }else{
                    while(opcion<1 || opcion>2){
                    System.out.println("Opción inválida");
                    System.out.println("¿Hay otro cliente por atender?");
                    System.out.println("1:Sí     2: No");
                    opcion=sc.nextInt();
                    if(opcion==2){
                         System.out.println("Atención a clientes finalizada");
                         System.exit(0);
                    }
                    }
                    }
                    
                    
                case 3:
                    clientes=cliente.numCliente();
                    c1.agregarClienteCaja3(clientes);
                    System.out.println("El cliente "+clientes+" es atendido en la caja 3");
                    System.out.println("El cliente está siendo atendido, espere...");
                    cliente.tiempoEspera(espera);
                    System.out.println("Se ha terminado de atender al cliente "+clientes);
                    c1.atenderClienteCaja3();
                    
                    System.out.println("¿Hay otro cliente por atender?");
                    System.out.println("1:Sí     2: No");
                    opcion=sc.nextInt();
                    
                    if(opcion==2){
                         System.out.println("Atención a clientes finalizada");
                         System.exit(0);
                    }else{
                    while(opcion<1 || opcion>2){
                    System.out.println("Opción inválida");
                    System.out.println("¿Hay otro cliente por atender?");
                    System.out.println("1:Sí     2: No");
                    opcion=sc.nextInt();
                    if(opcion==2){
                         System.out.println("Atención a clientes finalizada");
                         System.exit(0);
                    }
                    }
                    }
                    
                   
            }
        
        }
        
    
    }
    
}
