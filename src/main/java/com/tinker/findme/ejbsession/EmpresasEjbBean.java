/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tinker.findme.ejbsession;

import com.tinker.findme.ejbsessionremote.EmpresasEjbBeanRemote;
import com.tinker.findme.model.Empresas;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author petervs
 */
@Stateless
public class EmpresasEjbBean implements EmpresasEjbBeanRemote {

//    @PersistenceContext(unitName = "com.tinker.findme_findmeP_ejb_1.0PU")
    @Inject
    private EntityManager em;

    @Override
    public List<Empresas> getEmpresasByNombre(String empresa) {
        Query q = em.createNamedQuery(Empresas.FIND_BY_NOMBRE_LIKE);
        q.setParameter("nombre", "%" + empresa + "%");
        q.setParameter("estado", 1);
        return q.getResultList();
    }

    @Override
    public List<Empresas> getEmpresasByUsuario(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
