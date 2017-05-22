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
public class DetallesComprasPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "compras_id")
    private int comprasId;
    @Basic(optional = false)
    @Column(name = "productos_id")
    private int productosId;

    public DetallesComprasPK() {
    }

    public DetallesComprasPK(int comprasId, int productosId) {
        this.comprasId = comprasId;
        this.productosId = productosId;
    }

    public int getComprasId() {
        return comprasId;
    }

    public void setComprasId(int comprasId) {
        this.comprasId = comprasId;
    }

    public int getProductosId() {
        return productosId;
    }

    public void setProductosId(int productosId) {
        this.productosId = productosId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) comprasId;
        hash += (int) productosId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallesComprasPK)) {
            return false;
        }
        DetallesComprasPK other = (DetallesComprasPK) object;
        if (this.comprasId != other.comprasId) {
            return false;
        }
        if (this.productosId != other.productosId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.DetallesComprasPK[ comprasId=" + comprasId + ", productosId=" + productosId + " ]";
    }
    
}
