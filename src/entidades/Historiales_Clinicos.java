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
public class Historiales_Clinicos extends Base{
    private String codigo;
    private String fecha;
    private String idPaciente;
    private String idMedico;
    private String observaciones;
    private List<Historiales_Clinicos> listaHistoriales;    
    
    public boolean insertar(){
        boolean llOk = false;
        for (Historiales_Clinicos historial : listaHistoriales) {
            if (historial.getCodigo().equals(getCodigo())) {
                llOk = true;
            }
        }
        if (llOk) {
            JOptionPane.showMessageDialog(null, "Código ya existe");
            llOk = false;
        } else {
            Historiales_Clinicos loHistorial = new Historiales_Clinicos();
            loHistorial.setCodigo(getCodigo());
            loHistorial.setFecha(getFecha());
            loHistorial.setIdMedico(getIdMedico());
            loHistorial.setIdPaciente(getIdPaciente());
            loHistorial.setObservaciones(observaciones);
            listaHistoriales.add(loHistorial);
            llOk = true;
        }
        return llOk;
    }
    public boolean eliminar(){
        boolean llOk = false;
        int i = 0;
        int j = 0;
        for (Historiales_Clinicos historial : listaHistoriales) {
            if (historial.getCodigo().equals(getCodigo())) {
                llOk = true;
                j = i;
            }
            i = i + 1;
        }
        if (!llOk) {
            JOptionPane.showMessageDialog(null, "ID NO existe");
        } else {
            listaHistoriales.remove(j);
        }
        return llOk;
    }
    public String consultar() {
        String lcResultado = "";
        for (int i = 0; i < listaHistoriales.size(); i++) {
            lcResultado = lcResultado + "Codigo: " + listaHistoriales.get(i).getCodigo() + "\n"
                    + "Fecha: " + listaHistoriales.get(i).getFecha() + "\n"
                    + "Id Medico: " + listaHistoriales.get(i).getIdMedico() + "\n"
                    + "Id Paciente: " + listaHistoriales.get(i).getIdPaciente() + "\n"
                    + "Observaciones: " + listaHistoriales.get(i).getObservaciones() + "\n\n";            
        }
        return lcResultado;
    }
    public boolean modificar(){
        boolean llOk = false;
        int i = 0;
        int j = 0;
        for (Historiales_Clinicos historial : listaHistoriales) {
            if (historial.getCodigo().equals(getCodigo())) {
                llOk = true;
                j = i;
            }
            i = i + 1;
        }
        if (!llOk) {
            JOptionPane.showMessageDialog(null, "ID NO existe");
        } else {
                Historiales_Clinicos loHistorial = new Historiales_Clinicos();
                loHistorial.setCodigo(getCodigo());
                loHistorial.setFecha(getFecha());
                loHistorial.setIdMedico(getIdMedico());
                loHistorial.setIdPaciente(getIdPaciente());
                loHistorial.setObservaciones(observaciones);
                listaHistoriales.set(j, loHistorial);
        }                
        return llOk;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the idPaciente
     */
    public String getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the idMedico
     */
    public String getIdMedico() {
        return idMedico;
    }

    /**
     * @param idMedico the idMedico to set
     */
    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    /**
     * @return the observaciones
     */
    public String getObservaciones() {
        return observaciones;
    }

    /**
     * @param observaciones the observaciones to set
     */
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    /**
     * @return the listaHistoriales
     */
    public List<Historiales_Clinicos> getListaHistoriales() {
        return listaHistoriales;
    }

    /**
     * @param listaHistoriales the listaHistoriales to set
     */
    public void setListaHistoriales(List<Historiales_Clinicos> listaHistoriales) {
        this.listaHistoriales = listaHistoriales;
    }
}
