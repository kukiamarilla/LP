/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.persistence.EntityManager;
import modelo.DetallesVentas;
import modelo.Ventas;


/**
 *
 * @author isaacamarilla
 */
public class ControladorVentas {
     public static List<Ventas> listar(){
        EntityManager em = PersistenceUtil.getEntityManager();
        List<Ventas> lista = em.createNamedQuery("Ventas.findAll", Ventas.class).getResultList();
        return lista;
    }
   
    public static Ventas mostrar(int id){
        EntityManager em = PersistenceUtil.getEntityManager();
        Ventas prov = em.createNamedQuery("Ventas.findById", Ventas.class)
                .setParameter("id", id).getSingleResult();
        return prov;
    }
   
    public static void insertar(Ventas nuevo) throws UnsupportedOperationException{
        EntityManager em = PersistenceUtil.getEntityManager();
        boolean hayProductos = true;
        em.getTransaction().begin();
        em.persist(nuevo);
        for(DetallesVentas dv : nuevo.getDetallesVentasCollection()){
            if(dv.getProductos().getCantidad() < dv.getCantidad()) hayProductos=false;
            dv.getProductos().setCantidad(dv.getProductos().getCantidad() - dv.getCantidad());
        }
        if(hayProductos){
            em.getTransaction().commit();
        }else{
            em.getTransaction().rollback();
            throw new UnsupportedOperationException("No hay suficientes productos.");
        }
        
    }
}
