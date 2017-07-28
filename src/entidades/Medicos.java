/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Medicos extends Persona {

    private String especialidad;
    private List<Medicos> listaMedicos;

    public boolean insertar() {
        boolean llOk = false;
        for (Medicos medico : listaMedicos) {
            if (medico.getIdentificacion().equals(getIdentificacion())) {
                llOk = true;
            }
        }
        if (llOk) {
            JOptionPane.showMessageDialog(null, "ID ya existe");
            llOk = false;
        } else {
            Medicos loMedicos = new Medicos();
            loMedicos.setIdentificacion(getIdentificacion());
            loMedicos.setNombres(getNombres());
            loMedicos.setApellidos(getApellidos());
            loMedicos.setEspecialidad(especialidad);
            listaMedicos.add(loMedicos);
            llOk = true;
        }
        return llOk;
    }

    public boolean eliminar() {
        boolean llOk = false;
        int i = 0;
        int j = 0;
        for (Medicos medico : listaMedicos) {
            if (medico.getIdentificacion().equals(getIdentificacion())) {
                llOk = true;
                j = i;
            }
            i = i + 1;
        }
        if (!llOk) {
            JOptionPane.showMessageDialog(null, "ID NO existe");
        } else {
            listaMedicos.remove(j);
        }
        return llOk;
    }

    public String consultar() {
        String lcResultado = "";
        for (int i = 0; i < listaMedicos.size(); i++) {
            lcResultado = lcResultado + "Id: " + listaMedicos.get(i).getIdentificacion() + "\n"
                    + "Nombres: " + listaMedicos.get(i).getNombres() + "\n"
                    + "Apellidos: " + listaMedicos.get(i).getApellidos() + "\n"
                    + "Especialidad: " + listaMedicos.get(i).getEspecialidad() + "\n\n";
        }
        return lcResultado;
    }

    public boolean modificar() {
        boolean llOk = false;
        int i = 0;
        int j = 0;
        for (Medicos medico : listaMedicos) {
            if (medico.getIdentificacion().equals(getIdentificacion())) {
                llOk = true;
                j = i;
            }
            i = i + 1;
        }
        if (!llOk) {
            JOptionPane.showMessageDialog(null, "ID NO existe");
        } else {
            Medicos loMedico = new Medicos();
            loMedico.setIdentificacion(getIdentificacion());
            loMedico.setNombres(getNombres());
            loMedico.setApellidos(getApellidos());
            loMedico.setEspecialidad(especialidad);
            listaMedicos.set(j, loMedico);
        }
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
