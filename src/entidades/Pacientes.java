/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author Carlos
 */
public class Pacientes extends Persona{
    private int edad;
    private String genero;
    private List<Pacientes> listaPacientes;
    

    public boolean validar(){
        boolean llOk = false;
        return llOk;
    }
    public boolean insertar(){
        boolean llOk = false;
        return llOk;
    }
    public boolean eliminar(){
        boolean llOk = false;
        return llOk;
    }
    public boolean consultar(){
        boolean llOk = false;
        return llOk;
    }
    public boolean modificar(){
        boolean llOk = false;
        return llOk;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }    

    /**
     * @return the listaPacientes
     */
    public List<Pacientes> getListaPacientes() {
        return listaPacientes;
    }

    /**
     * @param listaPacientes the listaPacientes to set
     */
    public void setListaPacientes(List<Pacientes> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
}