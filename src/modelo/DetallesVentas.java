/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author isaacamarilla
 */
@Entity
@Table(name = "detalles_ventas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallesVentas.findAll", query = "SELECT d FROM DetallesVentas d")
    , @NamedQuery(name = "DetallesVentas.findByProductosId", query = "SELECT d FROM DetallesVentas d WHERE d.detallesVentasPK.productosId = :productosId")
    , @NamedQuery(name = "DetallesVentas.findByVentasId", query = "SELECT d FROM DetallesVentas d WHERE d.detallesVentasPK.ventasId = :ventasId")
    , @NamedQuery(name = "DetallesVentas.findByCantidad", query = "SELECT d FROM DetallesVentas d WHERE d.cantidad = :cantidad")})
public class DetallesVentas implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesVentasPK detallesVentasPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "productos_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productos productos;
    @JoinColumn(name = "ventas_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Ventas ventas;

    public DetallesVentas() {
    }

    public DetallesVentas(DetallesVentasPK detallesVentasPK) {
        this.detallesVentasPK = detallesVentasPK;
    }

    public DetallesVentas(int productosId, int ventasId) {
        this.detallesVentasPK = new DetallesVentasPK(productosId, ventasId);
    }

    public DetallesVentasPK getDetallesVentasPK() {
        return detallesVentasPK;
    }

    public void setDetallesVentasPK(DetallesVentasPK detallesVentasPK) {
        this.detallesVentasPK = detallesVentasPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    public Ventas getVentas() {
        return ventas;
    }

    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesVentasPK != null ? detallesVentasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesVentas)) {
            return false;
        }
        DetallesVentas other = (DetallesVentas) object;
        if ((this.detallesVentasPK == null && other.detallesVentasPK != null) || (this.detallesVentasPK != null && !this.detallesVentasPK.equals(other.detallesVentasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetallesVentas[ detallesVentasPK=" + detallesVentasPK + " ]";
    }
    
}
