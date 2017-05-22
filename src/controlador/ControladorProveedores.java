/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.Clientes;
import modelo.Proveedores;

/**
 *
 * @author isaacamarilla
 */
public class ControladorProveedores {
    
    public static List<Proveedores> listar(){
        EntityManager em = PersistenceUtil.getEntityManager();
        List<Proveedores> lista = em.createNamedQuery("Proveedores.findAll", Proveedores.class).getResultList();
        return lista;
    }
   
    public static Proveedores mostrar(int id){
        EntityManager em = PersistenceUtil.getEntityManager();
        Proveedores prov = em.createNamedQuery("Proveedores.findById", Proveedores.class)
                .setParameter("id", id).getSingleResult();
        return prov;
    }
    
    public static List<Proveedores> buscar(String nombre){
        EntityManager em = PersistenceUtil.getEntityManager();
        List<Proveedores> lista = em.createNamedQuery("Proveedores.search", Proveedores.class)
                .setParameter("nombre", "%"+nombre+"%")
                .getResultList();
        return lista;
    }
   
    public static void insertar(Proveedores nuevo){
        EntityManager em = PersistenceUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(nuevo);
        em.getTransaction().commit();
    }
    
    public static void actualizar(Proveedores aux){
        EntityManager em = PersistenceUtil.getEntityManager();
        Proveedores prov = em.find(Proveedores.class, aux.getId());
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
        Proveedores prov = em.find(Proveedores.class, id);
        em.getTransaction().begin();
        em.remove(prov);
        em.getTransaction().commit();
    }
    
    public static boolean existe(String ruc){
        EntityManager em = PersistenceUtil.getEntityManager();
        List<Proveedores> proveedores = em.createNamedQuery("Proveedores.findByRuc",Proveedores.class).getResultList();
        return proveedores.size() > 0;
    }
}
