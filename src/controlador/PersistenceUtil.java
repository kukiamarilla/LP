/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author isaacamarilla
 */
public class PersistenceUtil {
    
    private static EntityManager em = Persistence.createEntityManagerFactory("SistemaPU").createEntityManager();

    public static EntityManager getEntityManager() {
        return em;
    }

    
}