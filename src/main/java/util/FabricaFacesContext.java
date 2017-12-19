/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.faces.context.FacesContext;

/**
 *
 * @author 20151148060170
 */
public class FabricaFacesContext implements Serializable{
    @Produces
    public FacesContext getFacesContext(){
        return FacesContext.getCurrentInstance();
    }
}
