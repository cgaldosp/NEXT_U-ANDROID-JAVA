/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_final;

import entidades.Historiales_Clinicos;
import entidades.Medicos;
import entidades.Pacientes;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Evaluacion_final {

    private static List<Pacientes> listaPacientes;
    private static List<Medicos> listaMedicos;
    private static List<Historiales_Clinicos> listaHistoriales;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean llOk = true;
        listaPacientes = new ArrayList<Pacientes>();
        listaMedicos = new ArrayList<Medicos>();
        listaHistoriales = new ArrayList<Historiales_Clinicos>();
        do {
            String opcion = JOptionPane.showInputDialog(null, "1. Gestionar Pacientes.\n"
                    + "2. Gestionar Médicos.\n"
                    + "3. Gestionar Historial Clínico.\n"
                    + "4. Salir");
            String entidad = "";
            System.out.println(opcion);
            if (opcion.equals("1")) {
                entidad = "Pacientes";
            } else if (opcion.equals("2")) {
                entidad = "Médicos";
            } else if (opcion.equals("3")) {
                entidad = "Historial Clínico";
            } else if (opcion.equals("4")) {
                llOk = false;
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }
            if (!entidad.equals("")) {
                mostrarMenu(entidad);
            }
        } while (llOk);
    }

    public static void mostrarMenu(String p_cEntidad) {
        boolean llOk = true;
        do {
            String opcion = JOptionPane.showInputDialog(null, "1. Registrar " + p_cEntidad + ".\n"
                    + "2. Mostrar " + p_cEntidad + ".\n"
                    + "3. Modificar " + p_cEntidad + ".\n"
                    + "4. Eliminar " + p_cEntidad + ".\n"
                    + "5. Atrás");
            if (opcion.equals("1")) {
                registrar(p_cEntidad);
            } else if (opcion.equals("2")) {
                mostrar(p_cEntidad);
            } else if (opcion.equals("3")) {
                modificar(p_cEntidad);
            } else if (opcion.equals("4")) {
                eliminar(p_cEntidad);
            } else if (opcion.equals("5")) {
                llOk = false;
            } else {
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        } while (llOk);
    }

    public static boolean registrar(String p_cEntidad) {
        boolean llOk = false;
        if (p_cEntidad.equals("Pacientes")) {
            String id = JOptionPane.showInputDialog(null, "Ingrese Identificacion");
            String apellidos = JOptionPane.showInputDialog(null, "Ingrese Apellidos");
            String nombres = JOptionPane.showInputDialog(null, "Ingrese Nombres");
            String edad = JOptionPane.showInputDialog(null, "Ingrese Edad");
            String genero = JOptionPane.showInputDialog(null, "Ingrese Género");
            Pacientes loPaciente = new Pacientes();
            loPaciente.setListaPacientes(getListaPacientes());
            loPaciente.setIdentificacion(id);
            loPaciente.setApellidos(apellidos);
            loPaciente.setNombres(nombres);
            loPaciente.setEdad(Integer.parseInt(edad));
            loPaciente.setGenero(genero);
            llOk = loPaciente.insertar();
            if (!llOk) {
                JOptionPane.showMessageDialog(null, loPaciente.getError());
            } else {
                setListaPacientes(loPaciente.getListaPacientes());
            }
        } else if (p_cEntidad.equals("Médicos")) {
            String id = JOptionPane.showInputDialog(null, "Ingrese Identificacion");
            String apellidos = JOptionPane.showInputDialog(null, "Ingrese Apellidos");
            String nombres = JOptionPane.showInputDialog(null, "Ingrese Nombres");
            String especialidad = JOptionPane.showInputDialog(null, "Ingrese Especialidad");
            Medicos loMedicos = new Medicos();
            loMedicos.setListaMedicos(getListaMedicos());
            loMedicos.setIdentificacion(id);
            loMedicos.setApellidos(apellidos);
            loMedicos.setNombres(nombres);
            loMedicos.setEspecialidad(especialidad);
            llOk = loMedicos.insertar();
            if (!llOk) {
                JOptionPane.showMessageDialog(null, loMedicos.getError());
            } else {
                setListaMedicos(loMedicos.getListaMedicos());
            }
        } else if (p_cEntidad.equals("Historial Clinico")) {
            String codigo = JOptionPane.showInputDialog(null, "Ingrese Código");
            String fecha = JOptionPane.showInputDialog(null, "Ingrese Fecha");
            String paciente = JOptionPane.showInputDialog(null, "Ingrese Id Paciente");
            String medico = JOptionPane.showInputDialog(null, "Ingrese ID Médico");
            String observaciones = JOptionPane.showInputDialog(null, "Ingrese Observaciones");
            Historiales_Clinicos loHistorial = new Historiales_Clinicos();
            loHistorial.setListaHistoriales(getListaHistoriales());
            loHistorial.setCodigo(codigo);
            loHistorial.setFecha(fecha);
            loHistorial.setIdPaciente(paciente);
            loHistorial.setIdMedico(medico);
            loHistorial.setObservaciones(observaciones);
            llOk = loHistorial.insertar();
            if (!llOk) {
                JOptionPane.showMessageDialog(null, loHistorial.getError());
            } else {
                setListaHistoriales(loHistorial.getListaHistoriales());
            }
        } else{
            llOk = false;
        }
        return llOk;
    }

    public static void mostrar(String p_cEntidad) {
        String lcResultado = "";
        if (p_cEntidad.equals("Pacientes")) {
            Pacientes loPaciente = new Pacientes();            
            lcResultado = loPaciente.consultar();
        }else if (p_cEntidad.equals("Medicos")) {
            Medicos loMedico = new Medicos();
            lcResultado = loMedico.consultar();
        }else if (p_cEntidad.equals("Historiales")) {
            Historiales_Clinicos loHistorial = new Historiales_Clinicos();
            lcResultado = loHistorial.consultar();
        }
        JOptionPane.showMessageDialog(null, lcResultado);
    }

    public static boolean modificar(String p_cEntidad) {
        boolean llOk = false;
        return llOk;
    }

    public static boolean eliminar(String p_cEntidad) {
        boolean llOk = false;
        return llOk;
    }

    /**
     * @return the listaPacientes
     */
    public static List<Pacientes> getListaPacientes() {
        return listaPacientes;
    }

    /**
     * @param aListaPacientes the listaPacientes to set
     */
    public static void setListaPacientes(List<Pacientes> aListaPacientes) {
        listaPacientes = aListaPacientes;
    }

    /**
     * @return the listaMedicos
     */
    public static List<Medicos> getListaMedicos() {
        return listaMedicos;
    }

    /**
     * @param aListaMedicos the listaMedicos to set
     */
    public static void setListaMedicos(List<Medicos> aListaMedicos) {
        listaMedicos = aListaMedicos;
    }

    /**
     * @return the listaHistoriales
     */
    public static List<Historiales_Clinicos> getListaHistoriales() {
        return listaHistoriales;
    }

    /**
     * @param aListaHistoriales the listaHistoriales to set
     */
    public static void setListaHistoriales(List<Historiales_Clinicos> aListaHistoriales) {
        listaHistoriales = aListaHistoriales;
    }
}
