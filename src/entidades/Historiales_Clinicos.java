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
public class Historiales_Clinicos extends Base{
    private String codigo;
    private String fecha;
    private String idPaciente;
    private String idMedico;
    private String observaciones;
    private List<Historiales_Clinicos> listaHistoriales;    
    
    public boolean validar(){
        boolean llOk = true;
        return llOk;
    }
    public boolean insertar(){
        boolean llOk = false;
        llOk = validar();
        if (llOk) {
            Historiales_Clinicos loHistorial = new Historiales_Clinicos();
            loHistorial.setCodigo(getCodigo());
            loHistorial.setFecha(getFecha());
            loHistorial.setIdMedico(getIdMedico());
            loHistorial.setIdPaciente(getIdPaciente());
            loHistorial.setObservaciones(observaciones);
            listaHistoriales.add(loHistorial);
        }
        return llOk;
    }
    public boolean eliminar(){
        boolean llOk = false;
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
