/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda2;

/**
 *
 * @author SEARS
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private Genero genero;
    private TipoFono tipoFono;
    private String numTelefono;
    private String correo;
    
    
    public Contacto(){
        this.nombre = null;
        this.apellido = null;
        this.genero = null;
        this.tipoFono = null;
        this.numTelefono = null;
        this.correo = null;
    }
    
    public Contacto(String nombre, String apellido, Genero genero, TipoFono tipoFono, String numTelefono, String correo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.tipoFono = tipoFono;
        this.numTelefono = numTelefono;
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public TipoFono getTipoFono() {
        return tipoFono;
    }

    public void setTipoFono(TipoFono tipoFono) {
        this.tipoFono = tipoFono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }
    
    
    
    
    
    
}
