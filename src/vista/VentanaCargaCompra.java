/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaCargaCompra.java
 *
 * Created on 16-jun-2010, 11:54:46
 */

package vista;

import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import controlador.ControladorProveedores;
import controlador.ControladorProductos;
import controlador.ControladorCompras;
import javax.swing.table.DefaultTableModel;
import modelo.Proveedores;
import modelo.Productos;
import modelo.Compras;
import modelo.DetallesCompras;
import modelo.DetallesComprasPK;
import vista.CompraDetalleTableModel;
/**
 *t
 * @author gustavo
 */
public class VentanaCargaCompra extends javax.swing.JInternalFrame {

    private ControladorProveedores controladorProveedor;
    private ControladorProductos controladorProducto;
    private ControladorCompras controladorCompra;
    /** Creates new form VentanaCargaCompra */
    public VentanaCargaCompra() {
        initComponents();
        


        this.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameOpened(InternalFrameEvent ev) {
                detalleDialog.dispose();
                
            }
        });

        //definicion del ancho  de los columnas
        detalles.getColumnModel().getColumn(0).setPreferredWidth(60);
        detalles.getColumnModel().getColumn(1).setPreferredWidth(120);
        detalles.getColumnModel().getColumn(2).setPreferredWidth(60);
        detalles.getColumnModel().getColumn(3).setPreferredWidth(60);
        detalles.getColumnModel().getColumn(4).setPreferredWidth(60);

        this.agregarDetActionPerformed(null);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        detalleDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idProducto = new javax.swing.JTextField();
        cantProd = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        codProveedorLabel = new javax.swing.JLabel();
        nroCbteTf = new javax.swing.JTextField();
        nombreTf = new javax.swing.JTextField();
        direccionProveedorLabel = new javax.swing.JLabel();
        fechaLabel = new javax.swing.JLabel();
        nombreProveedorLabel = new javax.swing.JLabel();
        rucCiTf = new javax.swing.JTextField();
        nroCbteLabel = new javax.swing.JLabel();
        rucCiLabel = new javax.swing.JLabel();
        fechaTf = new javax.swing.JFormattedTextField();
        guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles = new javax.swing.JTable();
        borrarDet = new javax.swing.JButton();
        codProveedorTf = new javax.swing.JTextField();
        direccionTf = new javax.swing.JTextField();
        agregarDet = new javax.swing.JButton();
        cancelar = new javax.swing.JToggleButton();

        detalleDialog.setMinimumSize(new java.awt.Dimension(500, 200));

        jLabel1.setText("Codigo");

        jLabel2.setText("Cantidad");

        cantProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantProdActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Agregar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout detalleDialogLayout = new javax.swing.GroupLayout(detalleDialog.getContentPane());
        detalleDialog.getContentPane().setLayout(detalleDialogLayout);
        detalleDialogLayout.setHorizontalGroup(
            detalleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleDialogLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(detalleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jToggleButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(detalleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(detalleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(idProducto)
                        .addComponent(cantProd, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        detalleDialogLayout.setVerticalGroup(
            detalleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detalleDialogLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(detalleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(detalleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cantProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(detalleDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        setClosable(true);

        codProveedorLabel.setText("Código Proveedor:");

        nroCbteTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nroCbteTfFocusLost(evt);
            }
        });

        nombreTf.setEditable(false);

        direccionProveedorLabel.setText("Dirección:");

        fechaLabel.setText("Fecha (dd/mm/aaaa):");

        nombreProveedorLabel.setText("Nombre:");

        rucCiTf.setEditable(false);

        nroCbteLabel.setText("Nro. Cbte:");

        rucCiLabel.setText("Ruc/CI:");

        fechaTf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        detalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod", "Descripcion", "Cantidad", "Precio", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(detalles);

        borrarDet.setMnemonic('o');
        borrarDet.setText("Borrar Detalle");
        borrarDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarDetActionPerformed(evt);
            }
        });

        codProveedorTf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codProveedorTfFocusLost(evt);
            }
        });

        direccionTf.setEditable(false);

        agregarDet.setMnemonic('a');
        agregarDet.setText("Agregar Detalle");
        agregarDet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarDetActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(agregarDet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrarDet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaLabel)
                            .addComponent(codProveedorLabel)
                            .addComponent(nombreProveedorLabel)
                            .addComponent(direccionProveedorLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fechaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(codProveedorTf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rucCiLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(rucCiTf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nroCbteLabel)
                                        .addGap(10, 10, 10)
                                        .addComponent(nroCbteTf, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(nombreTf, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addComponent(direccionTf, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(fechaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaLabel)
                    .addComponent(nroCbteTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nroCbteLabel))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(codProveedorLabel)
                    .addComponent(codProveedorTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rucCiLabel)
                    .addComponent(rucCiTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreProveedorLabel)
                    .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionProveedorLabel)
                    .addComponent(direccionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar)
                    .addComponent(guardar)
                    .addComponent(agregarDet)
                    .addComponent(borrarDet))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nroCbteTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nroCbteTfFocusLost
        if (!nroCbteTf.getText().isEmpty()) {
            if (ControladorCompras.mostrar(Integer.parseInt(nroCbteTf.getText().trim())) != null) {
                JOptionPane.showMessageDialog(this, "Ya existe otra compra"
                        + " con el número de comprobante ["
                        + nroCbteTf.getText().trim() + "]");
                nroCbteTf.setText(null);
                nroCbteTf.requestFocus();
                return;
            }
        }
}//GEN-LAST:event_nroCbteTfFocusLost

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // si la tabla esta siendo editada se cancele su edición
        

        
        // se comprueba que los detalles no indiquen más Productos
        // de los que hay
        DefaultTableModel vdtm =
                (DefaultTableModel) detalles.getModel();
        if (vdtm.getRowCount()==0) {
            JOptionPane.showMessageDialog(this, "Debe haber al menos un detalle");
            codProveedorTf.requestFocus();
            return;
        }        

        try {
            Compras compra = new Compras();
            compra.setId(Integer.parseInt(nroCbteTf.getText().trim()));
            compra.setFecha((Date) fechaTf.getValue());
            compra.setProveedoresId(ControladorProveedores.mostrar(Integer.parseInt(codProveedorTf.getText().trim())));
            List<DetallesCompras> dCompras = new ArrayList<>();
            int total=0;
            for (int i=0; i<detalles.getRowCount(); i++) {
                DetallesCompras dc = new DetallesCompras();
                dc.setProductos(ControladorProductos.mostrar(Integer.parseInt((String)vdtm.getValueAt(i, 0))));
                DetallesComprasPK dcpk = new DetallesComprasPK(compra.getId(), Integer.parseInt((String)vdtm.getValueAt(i, 0)));
                dc.setDetallesComprasPK(dcpk);
                dc.setCantidad(Integer.parseInt((String)vdtm.getValueAt(i, 2)));
                dCompras.add(dc);
                total+=Integer.parseInt((String)vdtm.getValueAt(i, 4));
            }
            compra.setDetallesComprasCollection(dCompras);
            compra.setTotal(total);
            ControladorCompras.insertar(compra);
            JOptionPane.showMessageDialog(this, "Compra guardada exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error del sistema: ["
                    + e.getMessage() + "]");
            e.printStackTrace();
        }

        this.cancelarActionPerformed(evt);
}//GEN-LAST:event_guardarActionPerformed

    private void borrarDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarDetActionPerformed
        // si la tabla esta siendo editada se cancele su edición
        if (detalles.isEditing()) {
            // este método retorna true si el valor cargado puede ser aceptado
            if (!detalles.getCellEditor().stopCellEditing()) {
                // si el valor no puede ser aceptado se cancela la edición
                detalles.getCellEditor().cancelCellEditing();
            }
        }

        // se obtiene la filas seleccionadas a borrar
        int[] filas = detalles.getSelectedRows();
        // se obtiene una referencia al modelo de la tabla
        DefaultTableModel vdtm =
                (DefaultTableModel) detalles.getModel();
        // para cada fila seleccionada
        for (int i = filas.length - 1; i >= 0; i--) {
            // se remueve la fila del modelo
            vdtm.removeRow(i);
        }
}//GEN-LAST:event_borrarDetActionPerformed

    private void codProveedorTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codProveedorTfFocusLost
        if (!codProveedorTf.getText().isEmpty()) {
            Proveedores proveedor = controladorProveedor.mostrar(Integer.parseInt(codProveedorTf.getText()));

            if (proveedor == null) {
                JOptionPane.showMessageDialog(this,
                        "El proveedor [" + codProveedorTf.getText().trim()
                        + "] no existe", "Dato no válido",
                        JOptionPane.ERROR_MESSAGE);
                codProveedorTf.setText("");
                codProveedorLabel.requestFocus();
            } else {
                rucCiTf.setText(proveedor.getRuc());
                nombreTf.setText(proveedor.getNombre());
                direccionTf.setText(proveedor.getDireccion());
            }
        }
}//GEN-LAST:event_codProveedorTfFocusLost

    
    private void agregarDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDetActionPerformed
        
       detalleDialog.setVisible(true);
}//GEN-LAST:event_agregarDetActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        
}//GEN-LAST:event_cancelarActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)detalles.getModel();
        Productos prod = ControladorProductos.mostrar(Integer.parseInt(idProducto.getText()));
        String [] row = {String.valueOf(prod.getId()), prod.getDescripcion(), cantProd.getText(), String.valueOf(prod.getPrecio()), String.valueOf(Integer.parseInt(cantProd.getText())*prod.getPrecio())};
        model.addRow(row);
        detalleDialog.dispose();
        idProducto.setText("");
        cantProd.setText("");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void cantProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantProdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        detalleDialog.dispose();
        idProducto.setText("");
        cantProd.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarDet;
    private javax.swing.JButton borrarDet;
    private javax.swing.JToggleButton cancelar;
    private javax.swing.JTextField cantProd;
    private javax.swing.JLabel codProveedorLabel;
    private javax.swing.JTextField codProveedorTf;
    private javax.swing.JDialog detalleDialog;
    private javax.swing.JTable detalles;
    private javax.swing.JLabel direccionProveedorLabel;
    private javax.swing.JTextField direccionTf;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JFormattedTextField fechaTf;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField idProducto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel nombreProveedorLabel;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JLabel nroCbteLabel;
    private javax.swing.JTextField nroCbteTf;
    private javax.swing.JLabel rucCiLabel;
    private javax.swing.JTextField rucCiTf;
    // End of variables declaration//GEN-END:variables

}
