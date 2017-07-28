/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Carlos
 */
public abstract class Base {    
    private String error;//Almacena descripción de error.

    //Realiza operación de inserción de entidades
    public abstract boolean insertar();
    //Realiza operación de eliminación de entidades
    public abstract boolean eliminar();
    //Realiza operación de modificación de entidades
    public abstract boolean modificar();
    
    /**
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(String error) {
        this.error = error;
    }
}
