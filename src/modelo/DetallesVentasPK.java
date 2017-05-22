/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author isaacamarilla
 */
@Embeddable
public class DetallesVentasPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "productos_id")
    private int productosId;
    @Basic(optional = false)
    @Column(name = "ventas_id")
    private int ventasId;

    public DetallesVentasPK() {
    }

    public DetallesVentasPK(int productosId, int ventasId) {
        this.productosId = productosId;
        this.ventasId = ventasId;
    }

    public int getProductosId() {
        return productosId;
    }

    public void setProductosId(int productosId) {
        this.productosId = productosId;
    }

    public int getVentasId() {
        return ventasId;
    }

    public void setVentasId(int ventasId) {
        this.ventasId = ventasId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) productosId;
        hash += (int) ventasId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesVentasPK)) {
            return false;
        }
        DetallesVentasPK other = (DetallesVentasPK) object;
        if (this.productosId != other.productosId) {
            return false;
        }
        if (this.ventasId != other.ventasId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetallesVentasPK[ productosId=" + productosId + ", ventasId=" + ventasId + " ]";
    }
    
}
