/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.Productos;
import modelo.Proveedores;



/**
 *
 * @author isaacamarilla
 */
public class ControladorProductos {
    
    public static List<Productos> listar(){
        EntityManager em = PersistenceUtil.getEntityManager();
        List<Productos> list = em.createNamedQuery("Productos.findAll", Productos.class).getResultList();
        return list;
    }
    public static Productos mostrar(int id){
        EntityManager em = PersistenceUtil.getEntityManager();
        Productos prod = em.createNamedQuery("Productos.findById", Productos.class)
                .setParameter("id", id).getSingleResult();
        return prod;
    }
   
    public static void insertar(Productos nuevo){
        EntityManager em = PersistenceUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(nuevo);
        em.getTransaction().commit();
    }
    
    public static void actualizar(Productos aux){
        EntityManager em = PersistenceUtil.getEntityManager();
        Productos prod = em.find(Productos.class, aux.getId());
        em.getTransaction().begin();
        prod.setDescripcion(aux.getDescripcion());
        prod.setPrecio(aux.getPrecio());
        prod.setCantidad(aux.getCantidad());
        em.getTransaction().commit();
    }
    
    public static void eliminar(int id){
        EntityManager em = PersistenceUtil.getEntityManager();
        Productos prod = em.find(Productos.class, id);
        em.getTransaction().begin();
        em.remove(prod);
        em.getTransaction().commit();
    }
}
