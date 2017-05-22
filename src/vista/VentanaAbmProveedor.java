
package vista;

import javax.swing.JOptionPane;
import controlador.ControladorProveedores;
import modelo.Proveedores;
/**
 *
 * @author gustavo
 */
public class VentanaAbmProveedor extends javax.swing.JInternalFrame {

    private ControladorProveedores controladorProveedores;
    private boolean recuperadoBD;
    /** Creates new form VentanaAbmProveedor */
    public VentanaAbmProveedor() {
        
        this.initComponents();

        try {
            controladorProveedores = new ControladorProveedores();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al inciar el motor de persistencia\n ["
                    + e.getMessage() + "]");
            this.dispose();
        }
        this.recuperadoBD = false;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoLabel = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        codigoLabel1 = new javax.swing.JLabel();
        codigoLabel2 = new javax.swing.JLabel();
        rucci = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        codigoLabel3 = new javax.swing.JLabel();
        codigoLabel4 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        borrar = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setClosable(true);
        setName("Proveedores"); // NOI18N

        codigoLabel.setText("Código:");

        codigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                codigoFocusLost(evt);
            }
        });
        codigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoKeyTyped(evt);
            }
        });

        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        codigoLabel1.setText("Nombre:");

        codigoLabel2.setText("RUC/CI:");

        rucci.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rucciFocusLost(evt);
            }
        });
        rucci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rucciActionPerformed(evt);
            }
        });
        rucci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rucciKeyTyped(evt);
            }
        });

        direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionFocusLost(evt);
            }
        });
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });

        codigoLabel3.setText("Direccion:");

        codigoLabel4.setText("Telefono:");

        telefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                telefonoFocusLost(evt);
            }
        });
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addGap(166, 166, 166))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigoLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigoLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rucci, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigoLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(codigoLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigoLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel1)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel2)
                    .addComponent(rucci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoLabel3)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel4)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cancelar)
                    .addComponent(borrar)
                    .addComponent(guardar))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_codigoFocusLost
        if (this.recuperadoBD == false ) {
            try {
                Proveedores p = controladorProveedores.mostrar(Integer.parseInt(this.codigo.getText()));
                // puede que el objeto no esté sincronizado con la bd
                if (p != null) {
                    codigo.setText(Integer.toString(p.getId()));
                    codigo.setEditable(false);
                    nombre.setText(p.getNombre());
                    rucci.setText(p.getRuc());
                    direccion.setText(p.getDireccion());
                    telefono.setText(p.getTelefono());
                    this.recuperadoBD = true;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error del sistema: ["
                        + e.getMessage() + "]");
                e.printStackTrace();
            }
        }
}//GEN-LAST:event_codigoFocusLost

    private void codigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoKeyTyped
        String text = codigo.getText();
        if (text != null && text.length() >= 10) {
            if (text.length() > 10) {
                codigo.setText(text.substring(0, 10));
            }
            evt.consume();
        }
}//GEN-LAST:event_codigoKeyTyped

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreFocusLost

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
        String text = nombre.getText();
        if (text != null && text.length() >= 50) {
            if (text.length() > 50) {
                nombre.setText(text.substring(0, 50));
            }
            evt.consume();
        }
    }//GEN-LAST:event_nombreKeyTyped

    private void rucciFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rucciFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_rucciFocusLost

    private void rucciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rucciKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_rucciKeyTyped

    private void direccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFocusLost

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionKeyTyped

    private void telefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_telefonoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoFocusLost

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoKeyTyped

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        if (recuperadoBD == true) {
            int r = JOptionPane.showConfirmDialog(this, "Esta seguro de "
                    + "borrar los datos", "Mensaje", JOptionPane.YES_NO_OPTION);
            if (r == JOptionPane.NO_OPTION) {
                return;
            }

            try {
                Proveedores proveedor = new Proveedores();
                proveedor.setId(Integer.parseInt(codigo.getText()));
                controladorProveedores.eliminar(proveedor.getId());
                JOptionPane.showMessageDialog(this, "Proveedor eliminado exitosamente");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error del sistema: ["
                        + e.getMessage() + "]");
            }
        }
        this.cancelarActionPerformed(evt);
}//GEN-LAST:event_borrarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        if (codigo.getText() == null || codigo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El código no puede ser nulo");
            codigo.requestFocus();
            return;
        } else if (nombre.getText() == null
                || nombre.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El nombre no puede ser nulo");
            nombre.requestFocus();
            return;
        } else if (rucci.getText() == null
                || rucci.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El rucci no puede ser nulo");
            rucci.requestFocus();
            return;
        } else if (direccion.getText() == null
                || direccion.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "La direccion no puede ser "
                    + "nula");
            direccion.requestFocus();
            return;
        } else if (telefono.getText() == null
                || telefono.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "El telefono no puede ser "
                    + "nulo");
            telefono.requestFocus();
            return;
        }

        try {
            Proveedores proveedor = new Proveedores();
            proveedor.setId(Integer.parseInt(codigo.getText().trim()));
            proveedor.setNombre(nombre.getText().trim());
            proveedor.setRuc(rucci.getText().trim());
            proveedor.setDireccion(direccion.getText().trim());
            proveedor.setTelefono(telefono.getText().trim());
            controladorProveedores.insertar(proveedor);
            JOptionPane.showMessageDialog(this, "Proveedor guardado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error del sistema: ["
                    + e.getMessage() + "]");
        }
        this.cancelarActionPerformed(evt);
}//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        codigo.setText("");
        codigo.setEditable(true);
        nombre.setText("");
        rucci.setText("");
        direccion.setText("");
        telefono.setText("");
        recuperadoBD = false;
        codigo.requestFocus();
}//GEN-LAST:event_cancelarActionPerformed

    private void rucciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rucciActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rucciActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton borrar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel codigoLabel1;
    private javax.swing.JLabel codigoLabel2;
    private javax.swing.JLabel codigoLabel3;
    private javax.swing.JLabel codigoLabel4;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField rucci;
    private javax.swing.JTextField telefono;
    // End of variables declaration//GEN-END:variables

}