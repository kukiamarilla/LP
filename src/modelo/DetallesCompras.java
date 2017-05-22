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
@Table(name = "detalles_compras")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallesCompras.findAll", query = "SELECT d FROM DetallesCompras d")
    , @NamedQuery(name = "DetallesCompras.findByComprasId", query = "SELECT d FROM DetallesCompras d WHERE d.detallesComprasPK.comprasId = :comprasId")
    , @NamedQuery(name = "DetallesCompras.findByProductosId", query = "SELECT d FROM DetallesCompras d WHERE d.detallesComprasPK.productosId = :productosId")
    , @NamedQuery(name = "DetallesCompras.findByCantidad", query = "SELECT d FROM DetallesCompras d WHERE d.cantidad = :cantidad")})
public class DetallesCompras implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallesComprasPK detallesComprasPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    @JoinColumn(name = "compras_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compras compras;
    @JoinColumn(name = "productos_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Productos productos;

    public DetallesCompras() {
    }

    public DetallesCompras(DetallesComprasPK detallesComprasPK) {
        this.detallesComprasPK = detallesComprasPK;
    }

    public DetallesCompras(int comprasId, int productosId) {
        this.detallesComprasPK = new DetallesComprasPK(comprasId, productosId);
    }

    public DetallesComprasPK getDetallesComprasPK() {
        return detallesComprasPK;
    }

    public void setDetallesComprasPK(DetallesComprasPK detallesComprasPK) {
        this.detallesComprasPK = detallesComprasPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Compras getCompras() {
        return compras;
    }

    public void setCompras(Compras compras) {
        this.compras = compras;
    }

    public Productos getProductos() {
        return productos;
    }

    public void setProductos(Productos productos) {
        this.productos = productos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallesComprasPK != null ? detallesComprasPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesCompras)) {
            return false;
        }
        DetallesCompras other = (DetallesCompras) object;
        if ((this.detallesComprasPK == null && other.detallesComprasPK != null) || (this.detallesComprasPK != null && !this.detallesComprasPK.equals(other.detallesComprasPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetallesCompras[ detallesComprasPK=" + detallesComprasPK + " ]";
    }
    
}
