/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda2;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SEARS
 */
public class AgendaCSV {
    
    public AgendaCSV(){
        
    }
    
    
    public static void almacenarCSV(List <Contacto> contactos){
        String salidaArchivo = "Contactos.csv";
        boolean validador = new File(salidaArchivo).exists();
        
        if(validador){
            File archivoUsuarios = new File(salidaArchivo);
            archivoUsuarios.delete();
        }
        
        try{
            
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');
            
            
            salidaCSV.write("Nombre");
            salidaCSV.write("Apellido");
            salidaCSV.write("Genero");
            salidaCSV.write("TipoFono");
            salidaCSV.write("Número");
            salidaCSV.write("Correo");
            
            
            salidaCSV.endRecord();
            
            //Recorrido de lista
            for(Contacto contacto: contactos){
                salidaCSV.write(contacto.getNombre());
                salidaCSV.write(contacto.getApellido());
                salidaCSV.write(contacto.getGenero().toString());
                salidaCSV.write(contacto.getTipoFono().toString());
                salidaCSV.write(contacto.getNumTelefono());
                salidaCSV.write(contacto.getCorreo());
                
                salidaCSV.endRecord();
            }
            
            salidaCSV.close();
            
        }catch(IOException e){
            e.printStackTrace();
        }
        
    }
    
    public static List<Contacto> importarCSV(){
        List <Contacto> contactos = new ArrayList<Contacto>();
        
        
        try{
            
            CsvReader leerUsuarios = new CsvReader ("Contactos.csv");
            leerUsuarios.readHeaders();
            
            while(leerUsuarios.readRecord()){
                Genero generoB = Genero.Femenino;
                TipoFono tf = TipoFono.Fijo;
                
                String nombre = leerUsuarios.get(0);
                String apellido = leerUsuarios.get(1);
                String genero = leerUsuarios.get(2);
                String tipoFono = leerUsuarios.get(3);
                String numFono = leerUsuarios.get(4);
                String correo = leerUsuarios.get(5);
                
                if(genero.equals("Masculino")){
                    generoB = Genero.Masculino;
                }
                if(tipoFono.equals("Celular")){
                    tf = TipoFono.Celular;
                }
                
                contactos.add(new Contacto(nombre, apellido, generoB, tf, numFono, correo));
            }
            
            leerUsuarios.close();
            
            
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return contactos;
        
    }
}
