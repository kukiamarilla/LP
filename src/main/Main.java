package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Productos;
import modelo.Proveedores;

/**
 *
 * @author isaacamarilla
 */
public class Main {
    public static void main(String[] args) {
        Proveedores pr = new Proveedores();
        pr.setNombre("Prueba");
        pr.setDireccion("direccion");
        pr.setEmail("emai;");
        pr.setRuc("123124");
        pr.setTelefono("43223");
        persist(pr);
        
        
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SistemaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }
}
