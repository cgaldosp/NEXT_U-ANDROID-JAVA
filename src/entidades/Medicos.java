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
public class Medicos extends Persona{
    private String especialidad;
    private List<Medicos> listaMedicos;    
    
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
     * @return the especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the listaMedicos
     */
    public List<Medicos> getListaMedicos() {
        return listaMedicos;
    }

    /**
     * @param listaMedicos the listaMedicos to set
     */
    public void setListaMedicos(List<Medicos> listaMedicos) {
        this.listaMedicos = listaMedicos;
    }
    
    
}
