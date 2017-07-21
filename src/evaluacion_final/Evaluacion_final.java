/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion_final;

import entidades.Historiales_Clinicos;
import entidades.Medicos;
import entidades.Pacientes;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos
 */
public class Evaluacion_final {

    protected static List<Pacientes> listaPacientes;
    protected static List<Medicos> listaMedicos;
    protected static List<Historiales_Clinicos> listaHistoriales;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean llOk = true;
        do{
            String opcion = JOptionPane.showInputDialog(null, "1. Gestionar Pacientes.\n"
                    + "2. Gestionar Médicos.\n"
                    + "3. Gestionar Historial Clínico.\n"
                    + "4. Salir");
            String entidad = "";
            System.out.println(opcion);
            if (opcion.equals("1")){
                entidad = "Pacientes";
            } else if(opcion.equals("2")){
                entidad = "Médicos";            
            } else if(opcion.equals("3")){
                entidad = "Historial Clínico";
            } else if(opcion.equals("4")){
                llOk = false;
            }else{
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }
            if (!entidad.equals("")){
                mostrarMenu(entidad);
            }
        }while(llOk);        
    }

    public static void mostrarMenu(String p_cEntidad) {
        boolean llOk = true;
        do{
            String opcion = JOptionPane.showInputDialog(null, "1. Registrar " + p_cEntidad + ".\n"
                    + "2. Mostrar " + p_cEntidad + ".\n"
                    + "3. Modificar " + p_cEntidad + ".\n"
                    + "4. Eliminar " + p_cEntidad + ".\n"
                    + "5. Atrás");
            if (opcion.equals("1")){
                registrar(p_cEntidad);
            } else if(opcion.equals("2")){
                mostrar(p_cEntidad);
            } else if(opcion.equals("3")){
                modificar(p_cEntidad);
            } else if(opcion.equals("4")){
                eliminar(p_cEntidad);
            } else if(opcion.equals("5")){
                llOk = false;
            }else{
                JOptionPane.showMessageDialog(null, "Opción inválida");
            }
        }while(llOk);        
    }
    
    public static boolean registrar(String p_cEntidad){
        boolean llOk = false;
        if (p_cEntidad.equals("Pacientes")){
        }
        return llOk;
    }
    public static boolean mostrar(String p_cEntidad){
        boolean llOk = false;
        return llOk;
    }
    public static boolean modificar(String p_cEntidad){
        boolean llOk = false;
        return llOk;
    }
    public static boolean eliminar(String p_cEntidad){
        boolean llOk = false;
        return llOk;
    }
}
