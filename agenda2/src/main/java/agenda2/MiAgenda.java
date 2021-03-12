/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda2;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author Cristian Riffo Huez
 */



 //Clase que tiene un ArrayList 
public class MiAgenda {

    //clase para poder acceder a la agenda desde cualquier formulario
    //ArrayList fue la forma que encontre de tener un arreglo dinamico
    private static List<Contacto> agenda = new ArrayList<Contacto>();
    private static AgendaCSV agendaCsv = new AgendaCSV();

    public static void setAgenda(List<Contacto> agenda) {
        MiAgenda.agenda = agenda;
    }

    public MiAgenda() {
    }

    public static List<Contacto> getAgenda() {
        return agenda;
    }


    public static AgendaCSV getAgendaCsv() {
        return agendaCsv;
    }

    
    public static Iterator getIterator(){
        Iterator i = agenda.iterator();
        List contactos = new ArrayList();
        while(i.hasNext()){
            Contacto temp = new Contacto();
            temp = (Contacto) i.next();
            String[] contacto = new String[6];
            contacto[0] = temp.getNombre();
            contacto[1] = temp.getApellido();
            contacto[2] = temp.getGenero().toString();
            contacto[3] = temp.getTipoFono().toString();
            contacto[4] = temp.getNumTelefono();
            contacto[5] = temp.getCorreo();
            contactos.add(contacto);
        }
        
        
        i = contactos.iterator();
        
        return i;
    }
    
    public static void agregarContacto(Contacto contacto){
        agenda.add(contacto);
    }
}
