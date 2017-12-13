/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.rafaelaznar.service.specificimplementation;

import eu.rafaelaznar.bean.helper.MetaBeanHelper;
import eu.rafaelaznar.service.genericimplementation.TableGenericServiceImplementation;
import javax.servlet.http.HttpServletRequest;

public class DestinoaltaSpecificServiceImplementation extends TableGenericServiceImplementation{
    
    public DestinoaltaSpecificServiceImplementation(HttpServletRequest request) {
        super(request);
    }
 
@Override    
protected Boolean checkPermission(String strMethodName) {
        MetaBeanHelper oUsuarioBean = (MetaBeanHelper) oRequest.getSession().getAttribute("user");
        if (oUsuarioBean != null) {
            return true;
        } else {
            return false;
        }
    }    
}
