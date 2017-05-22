/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TemporalType;
import modelo.Compras;

/**
 *
 * @author isaacamarilla
 */
public class ControladorCompras {
    
    public static List<Compras> listar(){
        EntityManager em = PersistenceUtil.getEntityManager();
        List<Compras> lista = em.createNamedQuery("Compras.findAll", Compras.class).getResultList();
        return lista;
    }
    
    public static List<Compras> listar(Date desde, Date hasta){
        EntityManager em = PersistenceUtil.getEntityManager();
        List<Compras> lista = em.createNamedQuery("Compras.findByFecha", Compras.class)
                .setParameter("desde", desde, TemporalType.DATE)
                .setParameter("hasta", hasta, TemporalType.DATE)
                .getResultList();

        return lista;
    }
   
    public static Compras mostrar(int id){
        EntityManager em = PersistenceUtil.getEntityManager();
        Compras prov = em.createNamedQuery("Compras.findById", Compras.class)
                .setParameter("id", id).getSingleResult();
        return prov;
    }
   
    public static void insertar(Compras nuevo){
        EntityManager em = PersistenceUtil.getEntityManager();
        em.getTransaction().begin();
        em.persist(nuevo);
        nuevo.getDetallesComprasCollection().forEach((dc) -> {
            dc.getProductos().setCantidad(dc.getProductos().getCantidad() + dc.getCantidad());
        });
        em.getTransaction().commit();
    }
    
}
