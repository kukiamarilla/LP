/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * VentanaCargaCompra.java
 *
 * Created on 16-jun-2010, 11:54:46
 */

package py.una.pol.lp2.compraVenta.vista;

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
import py.una.pol.lp2.compraVenta.controlador.ControladorProveedor;
import py.una.pol.lp2.compraVenta.controlador.ControladorProducto;
import py.una.pol.lp2.compraVenta.controlador.ControladorCompra;
import py.una.pol.lp2.compraVenta.modelo.Proveedor;
import py.una.pol.lp2.compraVenta.modelo.Producto;
import py.una.pol.lp2.compraVenta.modelo.Compra;
import py.una.pol.lp2.compraVenta.modelo.CompraDetalle;
/**
 *t
 * @author gustavo
 */
public class VentanaCargaCompra extends javax.swing.JInternalFrame {

    private ControladorProveedor controladorProveedor;
    private ControladorProducto controladorProducto;
    private ControladorCompra controladorCompra;
    /** Creates new form VentanaCargaCompra */
    public VentanaCargaCompra() {
                initComponents();

        this.addInternalFrameListener(new InternalFrameAdapter() {

            @Override
            public void internalFrameOpened(InternalFrameEvent ev) {
                VentanaCargaCompra estaVentana =
                        (VentanaCargaCompra) ev.getSource();
                try {
                    controladorProveedor = new ControladorProveedor();
                    controladorProducto = new ControladorProducto();
                    controladorCompra = new ControladorCompra();

                    List<Producto> productos =
                            controladorProducto.listar();

                    JComboBox productosComboBox =
                            new JComboBox(productos.toArray());

                    /* Por defecto el Objeto DefaultListCellRenderer presenta
                     * una opcion del combo como el resultado de su método toString(),
                     * Aqui redefinimos el metodo encargado de esto, para que presente
                     * los objetos Materia Prima por el valor de su código
                     */
                    productosComboBox.setRenderer(new DefaultListCellRenderer() {

                        @Override
                        public Component getListCellRendererComponent(
                                JList list, Object value, int index,
                                boolean isSelected, boolean cellHasFocus) {
                            super.getListCellRendererComponent(list, value, index,
                                    isSelected, cellHasFocus);
                            if (value != null) {
                                this.setText(((Producto) value).getCodigo());
                            }
                            return this;
                        }
                    });

                    /* Se establece que el editor de la columna codigo de la tabla
                     * sea el combo recién configurado
                     */
                    detalles.getColumnModel().getColumn(0).setCellEditor(
                            new DefaultCellEditor(productosComboBox));

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(estaVentana,
                            "Error al inciar el motor de persistencia\n ["
                            + e.getMessage() + "]");
                    estaVentana.dispose();
                    return;
                }
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

        detalles.setModel(new CompraDetalleTableModel());
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
            if (controladorCompra.obtener(nroCbteTf.getText().trim()) != null) {
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
        if (detalles.isEditing()) {
            // este método retorna true si el valor cargado puede ser aceptado
            if (!detalles.getCellEditor().stopCellEditing()) {
                // si el valor no puede ser aceptado se cancela la edición
                detalles.getCellEditor().cancelCellEditing();
            }
        }

        if (fechaTf.getValue() == null) {
            JOptionPane.showMessageDialog(this, "La fecha no puede ser nula");
            fechaTf.requestFocus();
            return;
        } else if (nroCbteTf.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El número de comprobante"
                    + " no puede ser nulo");
            nroCbteTf.requestFocus();
            return;
        } else if (codProveedorTf.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El código de proveedor "
                    + "no puede ser nulo");
            codProveedorTf.requestFocus();
            return;
        }

        // se comprueba que los detalles no indiquen más Productos
        // de los que hay
        CompraDetalleTableModel vdtm =
                (CompraDetalleTableModel) detalles.getModel();
        borrarDetallesVacios(vdtm);
        if (vdtm.getDatos().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe haber al menos un detalle");
            codProveedorTf.requestFocus();
            return;
        }        

        try {
            Compra compra = new Compra();
            compra.setNroCbte(nroCbteTf.getText().trim());
            compra.setFecha((Date) fechaTf.getValue());
            compra.setProveedor(controladorProveedor.obtener(
                    codProveedorTf.getText().trim()));
            compra.setDetalles(vdtm.getDatos());
            Double total=0D;
            for (CompraDetalle vc : vdtm.getDatos()) {
                vc.setCompra(compra);
                total+=vc.getCantidad()*vc.getPrecio();
            }
            compra.setTotal(total);
            controladorCompra.guardar(compra);
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
        CompraDetalleTableModel vdtm =
                (CompraDetalleTableModel) detalles.getModel();
        // para cada fila seleccionada
        for (int i = filas.length - 1; i >= 0; i--) {
            // se remueve la fila del modelo
            vdtm.removerDetalle(filas[i]);
        }
}//GEN-LAST:event_borrarDetActionPerformed

    private void codProveedorTfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codProveedorTfFocusLost
        if (!codProveedorTf.getText().isEmpty()) {
            Proveedor proveedor = controladorProveedor.obtener(codProveedorTf.getText());

            if (proveedor == null) {
                JOptionPane.showMessageDialog(this,
                        "El proveedor [" + codProveedorTf.getText().trim()
                        + "] no existe", "Dato no válido",
                        JOptionPane.ERROR_MESSAGE);
                codProveedorTf.setText("");
                codProveedorLabel.requestFocus();
            } else {
                rucCiTf.setText(proveedor.getRucCi());
                nombreTf.setText(proveedor.getNombre());
                direccionTf.setText(proveedor.getDireccion());
            }
        }
}//GEN-LAST:event_codProveedorTfFocusLost

    private void borrarDetallesVacios(CompraDetalleTableModel vdtm) {
        // se agrega a una lista los detalles a borrar
        List<CompraDetalle> listaABorrar=new ArrayList<>();
        for (CompraDetalle vc : vdtm.getDatos()) {
            if (vc.getProducto() == null) {
                listaABorrar.add(vc);
            }
        }
        for (CompraDetalle vc : listaABorrar) {
            vdtm.removerDetalle(vc);
        }        
    }
    private void agregarDetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarDetActionPerformed
        // Se obtiene una referencia al modelos de la tabla
        CompraDetalleTableModel vdtm =
                (CompraDetalleTableModel) detalles.getModel();

        // se borran los detalles vacios en la tabla
        this.borrarDetallesVacios(vdtm);

        // se crea un nuevo objeto formula detalles para la nueva fila
        CompraDetalle vd = new CompraDetalle();
        // se añada el detalle al modelo
        vdtm.agregarDetalle(vd);
        // se indica que el foco y la vista deben correrse hasta la nueva fila
        detalles.setRowSelectionInterval(detalles.getRowCount() - 1,
                detalles.getRowCount() - 1);
        detalles.scrollRectToVisible(detalles.getCellRect(
                detalles.getRowCount() - 1, 0, true));
}//GEN-LAST:event_agregarDetActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        fechaTf.setText(null);
        nroCbteTf.setText(null);
        rucCiTf.setText(null);
        nombreTf.setText(null);
        direccionTf.setText(null);
        codProveedorTf.setText(null);
        ((CompraDetalleTableModel) detalles.getModel()).setDatos(new ArrayList<CompraDetalle>());
}//GEN-LAST:event_cancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarDet;
    private javax.swing.JButton borrarDet;
    private javax.swing.JToggleButton cancelar;
    private javax.swing.JLabel codProveedorLabel;
    private javax.swing.JTextField codProveedorTf;
    private javax.swing.JTable detalles;
    private javax.swing.JLabel direccionProveedorLabel;
    private javax.swing.JTextField direccionTf;
    private javax.swing.JLabel fechaLabel;
    private javax.swing.JFormattedTextField fechaTf;
    private javax.swing.JButton guardar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombreProveedorLabel;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JLabel nroCbteLabel;
    private javax.swing.JTextField nroCbteTf;
    private javax.swing.JLabel rucCiLabel;
    private javax.swing.JTextField rucCiTf;
    // End of variables declaration//GEN-END:variables

}
