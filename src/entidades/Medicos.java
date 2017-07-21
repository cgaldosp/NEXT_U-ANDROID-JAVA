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
        boolean llOk = true;
        return llOk;
    }
    public boolean insertar(){
        boolean llOk = false;
        llOk = validar();
        if (llOk) {
            Medicos loMedicos = new Medicos();
            loMedicos.setIdentificacion(getIdentificacion());
            loMedicos.setNombres(getNombres());
            loMedicos.setApellidos(getApellidos());
            loMedicos.setEspecialidad(especialidad);
            listaMedicos.add(loMedicos);
        }
        return llOk;
    }
    public boolean eliminar(){
        boolean llOk = false;
        return llOk;
    }
    public String consultar(){
        String lcResultado = "";
        for (int i = 0; i < listaMedicos.size(); i++) {
            lcResultado = lcResultado + "Id: " + listaMedicos.get(i).getIdentificacion() + "\n"
                    + "Nombres: " + listaMedicos.get(i).getNombres() + "\n"
                    + "Apellidos: " + listaMedicos.get(i).getApellidos() + "\n"
                    + "Especialidad: " + listaMedicos.get(i).getEspecialidad() + "\n\n";
        }
        return lcResultado;
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
