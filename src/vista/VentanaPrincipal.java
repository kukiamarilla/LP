/*
 * VentanaPrincipal.java
 *
 * Created on 25 de mayo de 2008, 11:05 AM
 */
package vista;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import vista.VentanaAbmProducto;

/**
 *
 * @author  gustavo
 */
public class VentanaPrincipal extends JFrame {

    private VentanaAbmProducto vap = null;
    private VentanaAbmProveedor vape = null;    
    private VentanaAbmCliente vacl = null;

    private VentanaListadoProducto vlp = null;
    private VentanaListadoProveedores vlpr = null;
    private VentanaCargaCompra vcc = null;
    private VentanaCargaVenta vcv = null;
    private VentanaListadoCompras vlcp = null;    
    private VentanaListadoClientes vlct = null;    
    private VentanaListadoVentas vlvt = null;



    public VentanaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        itemSalir = new javax.swing.JMenuItem();
        menuAbm = new javax.swing.JMenu();
        abmProducto = new javax.swing.JMenuItem();
        proveedor = new javax.swing.JMenuItem();
        abmCliente = new javax.swing.JMenuItem();
        menuCargaDatos = new javax.swing.JMenu();
        CargaVenta = new javax.swing.JMenuItem();
        CargaCompa = new javax.swing.JMenuItem();
        menuListados = new javax.swing.JMenu();
        listadoProducto = new javax.swing.JMenuItem();
        listadoVenta = new javax.swing.JMenuItem();
        listadoProveedores = new javax.swing.JMenuItem();
        listadoClientes = new javax.swing.JMenuItem();
        listarCompras = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplicación Fabri Ventas");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(null);
        getContentPane().add(panel);

        menuArchivo.setText("Archivo");

        itemSalir.setText("Salir");
        itemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(itemSalir);

        menuBar.add(menuArchivo);

        menuAbm.setText("ABM");

        abmProducto.setText("Producto");
        abmProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abmProductoActionPerformed(evt);
            }
        });
        menuAbm.add(abmProducto);

        proveedor.setText("Proveedor");
        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });
        menuAbm.add(proveedor);

        abmCliente.setText("Cliente");
        abmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abmClienteActionPerformed(evt);
            }
        });
        menuAbm.add(abmCliente);

        menuBar.add(menuAbm);

        menuCargaDatos.setText("Carga Datos");

        CargaVenta.setText("Venta");
        CargaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaVentaActionPerformed(evt);
            }
        });
        menuCargaDatos.add(CargaVenta);

        CargaCompa.setText("Compra");
        CargaCompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaCompaActionPerformed(evt);
            }
        });
        menuCargaDatos.add(CargaCompa);

        menuBar.add(menuCargaDatos);

        menuListados.setText("Listados");

        listadoProducto.setText("Listado Producto");
        listadoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoProductoActionPerformed(evt);
            }
        });
        menuListados.add(listadoProducto);

        listadoVenta.setText("Listado Venta");
        listadoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoVentaActionPerformed(evt);
            }
        });
        menuListados.add(listadoVenta);

        listadoProveedores.setText("Listado Proveedores");
        listadoProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoProveedoresActionPerformed(evt);
            }
        });
        menuListados.add(listadoProveedores);

        listadoClientes.setText("Listado Clientes");
        listadoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoClientesActionPerformed(evt);
            }
        });
        menuListados.add(listadoClientes);

        listarCompras.setText("Listar Compras");
        listarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarComprasActionPerformed(evt);
            }
        });
        listarCompras.addMenuDragMouseListener(new javax.swing.event.MenuDragMouseListener() {
            public void menuDragMouseEntered(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseExited(javax.swing.event.MenuDragMouseEvent evt) {
            }
            public void menuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {
                listarComprasMenuDragMouseDragged(evt);
            }
            public void menuDragMouseReleased(javax.swing.event.MenuDragMouseEvent evt) {
            }
        });
        menuListados.add(listarCompras);

        menuBar.add(menuListados);

        setJMenuBar(menuBar);
    }// </editor-fold>//GEN-END:initComponents

private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
    System.exit(0);
}//GEN-LAST:event_itemSalirActionPerformed

private void abmProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abmProductoActionPerformed
    if (vap == null) {
        vap = new VentanaAbmProducto();
        panel.add(vap);
        vap.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vap = null;
            }
        });
        vap.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vap.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_abmProductoActionPerformed

private void listadoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoProductoActionPerformed
    if (vlp == null) {
        vlp = new VentanaListadoProducto();
        panel.add(vlp);
        vlp.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vlp = null;
            }
        });
        vlp.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vlp.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_listadoProductoActionPerformed
    
private void CargaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaVentaActionPerformed
    if (vcv == null) {
        vcv = new VentanaCargaVenta();
        panel.add(vcv);
        vcv.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vcv = null;
            }
        });
        vcv.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vcv.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_CargaVentaActionPerformed

private void listadoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoVentaActionPerformed
    if (vlvt == null) {
        vlvt = new VentanaListadoVentas();
        panel.add(vlvt);
        vlvt.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vlvt = null;
            }
        });
        vlvt.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vlvt.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_listadoVentaActionPerformed

private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
    // TODO add your handling code here:

    if (vape == null) {
        vape = new VentanaAbmProveedor();
        panel.add(vape);
        vape.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vape = null;
            }
        });
        vape.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vape.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_proveedorActionPerformed

private void abmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abmClienteActionPerformed
    if (vacl == null) {
        vacl = new VentanaAbmCliente();
        panel.add(vacl);
        vacl.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vacl = null;
            }
        });
        vacl.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vacl.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_abmClienteActionPerformed

private void CargaCompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaCompaActionPerformed
    // TODO add your handling code here:

    if (vcc == null) {
        vcc = new VentanaCargaCompra();
        panel.add(vcc);
        vcc.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vcc = null;
            }
        });
        vcc.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vcc.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_CargaCompaActionPerformed

private void listadoProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoProveedoresActionPerformed
    // TODO add your handling code here:

    if (vlpr == null) {
        vlpr = new VentanaListadoProveedores();
        panel.add(vlpr);
        vlpr.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vlpr = null;
            }
        });
        vlpr.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vlpr.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_listadoProveedoresActionPerformed

private void listadoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoClientesActionPerformed
    if (vlct == null) {
        vlct = new VentanaListadoClientes();
        panel.add(vlct);
        vlct.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vlct = null;
            }
        });
        vlct.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vlct.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_listadoClientesActionPerformed

private void listarComprasMenuDragMouseDragged(javax.swing.event.MenuDragMouseEvent evt) {//GEN-FIRST:event_listarComprasMenuDragMouseDragged
    // TODO add your handling code here:

}//GEN-LAST:event_listarComprasMenuDragMouseDragged

private void listarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarComprasActionPerformed
    // TODO add your handling code here:


    if (vlcp == null) {
        vlcp = new VentanaListadoCompras();
        panel.add(vlcp);
        vlcp.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                vlcp = null;
            }
        });
        vlcp.setVisible(true);
    } else { // si la ventana esta abierta, le damos el foco.
        try {
            vlcp.setSelected(true);
        } catch (Exception ignorada) {
        }
    }
}//GEN-LAST:event_listarComprasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CargaCompa;
    private javax.swing.JMenuItem CargaVenta;
    private javax.swing.JMenuItem abmCliente;
    private javax.swing.JMenuItem abmProducto;
    private javax.swing.JMenuItem itemSalir;
    private javax.swing.JMenuItem listadoClientes;
    private javax.swing.JMenuItem listadoProducto;
    private javax.swing.JMenuItem listadoProveedores;
    private javax.swing.JMenuItem listadoVenta;
    private javax.swing.JMenuItem listarCompras;
    private javax.swing.JMenu menuAbm;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCargaDatos;
    private javax.swing.JMenu menuListados;
    protected javax.swing.JDesktopPane panel;
    private javax.swing.JMenuItem proveedor;
    // End of variables declaration//GEN-END:variables
}
