/*
 * Main.java
 *
 * Created on 19 de diciembre de 2007, 3:12
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package agenda2;

import java.util.Iterator;
import javax.swing.UIManager;

/**
 *
 * @author Cristian Riffo Huez
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Look and Feel
        MiAgenda.setAgenda(AgendaCSV.importarCSV());
        
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception anyException) {
        }
        
        //agregamos dos contactos de prueba
        TipoFono tf = TipoFono.Fijo;
        TipoFono tf2 = TipoFono.Celular;
        Genero gn = Genero.Masculino;
        Genero gn2 = Genero.Femenino;
        Contacto c1= new Contacto("Juan", "Perez", gn, tf,"051233525", "c@hotmail.com");
        Contacto c2= new Contacto("Maria", "Gonzales",gn2, tf2,"0981234567", "a@hotmail.com");
        //MiAgenda.agregarContacto(c1);
        //MiAgenda.agregarContacto(c2);
        //instanciamos listado
        new Listado().setVisible(true);
        //llenamos la lista con datos en MiAgenda
        Listado.mostrarContactos();
        
        //AgendaCSV.almacenarCSV(MiAgenda.getAgenda());
    }
}
