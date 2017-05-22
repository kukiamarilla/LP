/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.Clientes;

/**
 *
 * @author isaacamarilla
 */
public class ControladorClientes {
    public static List<Clientes> listar(){
        EntityManager em = PersistenceUtil.getEntityManager();
        List<Clientes> lista = em.createNamedQuery("Clientes.findAll", Clientes.class).getResultList();
        return lista;
    }
   
    public static Clientes mostrar(int id){
        EntityManager em = PersistenceUtil.getEntityManager();
        Clientes prov = em.createNamedQuery("Clientes.findById", Clientes.class)
                .setParameter("id", id).getSingleResult();
        return prov;
    }
   
    public static void insertar(Clientes nuevo){
        EntityManager em = PersistenceUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(nuevo);
        em.getTransaction().commit();
    }
    
    public static void actualizar(Clientes aux){
        EntityManager em = PersistenceUtil.getEntityManager();
        Clientes prov = em.find(Clientes.class, aux.getId());
        em.getTransaction().begin();
        prov.setNombre(aux.getNombre());
        prov.setEmail(aux.getEmail());
        prov.setDireccion(aux.getDireccion());
        prov.setTelefono(aux.getTelefono());
        prov.setRuc(aux.getRuc());
        em.getTransaction().commit();
    }
    
    public static void eliminar(int id){
        EntityManager em = PersistenceUtil.getEntityManager();
        Clientes prov = em.find(Clientes.class, id);
        em.getTransaction().begin();
        em.remove(prov);
        em.getTransaction().commit();
    }
}
