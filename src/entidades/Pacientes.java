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
public class Pacientes extends Persona {

    private int edad;
    private String genero;
    private List<Pacientes> listaPacientes;

    public boolean insertar() {
        boolean llOk = false;
        for (Pacientes paciente : listaPacientes) {
            if (paciente.getIdentificacion().equals(getIdentificacion())) {
                llOk = true;
            }
        }
        if (llOk) {
            JOptionPane.showMessageDialog(null, "ID ya existe");
            llOk = false;
        } else {
            Pacientes loPaciente = new Pacientes();
            loPaciente.setIdentificacion(getIdentificacion());
            loPaciente.setNombres(getNombres());
            loPaciente.setApellidos(getApellidos());
            loPaciente.setEdad(edad);
            loPaciente.setGenero(genero);
            listaPacientes.add(loPaciente);
            llOk = true;
        }
        return llOk;
    }

    public boolean eliminar() {
        boolean llOk = false;
        int i = 0;
        int j = 0;
        for (Pacientes paciente : listaPacientes) {
            if (paciente.getIdentificacion().equals(getIdentificacion())) {
                llOk = true;
                j = i;
            }
            i = i + 1;
        }
        if (!llOk) {
            JOptionPane.showMessageDialog(null, "ID NO existe");
        } else {
            listaPacientes.remove(j);
        }
        return llOk;
    }

    public String consultar() {
        String lcResultado = "";
        for (int i = 0; i < listaPacientes.size(); i++) {
            lcResultado = lcResultado + "Id: " + listaPacientes.get(i).getIdentificacion() + "\n"
                    + "Nombres: " + listaPacientes.get(i).getNombres() + "\n"
                    + "Apellidos: " + listaPacientes.get(i).getApellidos() + "\n"
                    + "Edad: " + listaPacientes.get(i).getEdad() + "\n"
                    + "Género: " + listaPacientes.get(i).getGenero() + "\n\n";
        }
        return lcResultado;
    }

    public boolean modificar() {
        boolean llOk = false;
        int i = 0;
        int j = 0;
        for (Pacientes paciente : listaPacientes) {
            if (paciente.getIdentificacion().equals(getIdentificacion())) {
                llOk = true;
                j = i;
            }
            i = i + 1;
        }
        if (!llOk) {
            JOptionPane.showMessageDialog(null, "ID NO existe");
        } else {
            Pacientes loPaciente = new Pacientes();
            loPaciente.setIdentificacion(getIdentificacion());
            loPaciente.setNombres(getNombres());
            loPaciente.setApellidos(getApellidos());
            loPaciente.setEdad(edad);
            loPaciente.setGenero(genero);
            listaPacientes.set(j, loPaciente);
        }
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
