/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tinker.findme.ejbsessionremote;

import com.tinker.findme.model.Empresas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author petervs
 */
@Remote
public interface EmpresasEjbBeanRemote {
    
    List<Empresas> getEmpresasByNombre(String empresa);
    
    List<Empresas> getEmpresasByUsuario(Long id);
    
}
