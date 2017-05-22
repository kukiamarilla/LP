
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controlador.ControladorProveedores;
import modelo.Proveedores;

public class VentanaListadoProveedores extends javax.swing.JInternalFrame {

    private ControladorProveedores controladorProveedor;

    /** Creates new form VentanaListadoProveedores */
    public VentanaListadoProveedores() {
        initComponents();

        try {
            controladorProveedor = new ControladorProveedores();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al inciar el motor de persistencia\n ["
                    + e.getMessage() + "]");
            this.dispose();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoLabel1 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        codigoLabel2 = new javax.swing.JLabel();
        nombreProveedor = new javax.swing.JTextField();
        rucProveedor = new javax.swing.JTextField();
        codigoLabel = new javax.swing.JLabel();
        codigoLabel3 = new javax.swing.JLabel();
        direccionProveedor = new javax.swing.JTextField();
        codigoLabel4 = new javax.swing.JLabel();
        telefonoProveedor = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultados = new javax.swing.JTable();

        setClosable(true);

        codigoLabel1.setText("Nombre:");

        codigoLabel2.setText("RUC/CI:");

        codigoLabel.setText("Código:");

        codigoLabel3.setText("Direccion:");

        codigoLabel4.setText("Telefono:");

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        resultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "RUC/CI", "Direccion", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        resultados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(resultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(codigoLabel)
                                .addGap(18, 18, 18)
                                .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoLabel2)
                                    .addComponent(codigoLabel3)
                                    .addComponent(codigoLabel4)
                                    .addComponent(codigoLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombreProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                    .addComponent(telefonoProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                    .addComponent(direccionProveedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                                    .addComponent(rucProveedor, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE))))
                        .addGap(34, 34, 34)
                        .addComponent(buscar)))
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel1)
                    .addComponent(nombreProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel2)
                    .addComponent(rucProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel3)
                    .addComponent(direccionProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codigoLabel4)
                    .addComponent(telefonoProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        Proveedores p = new Proveedores();
        if (!codigo.getText().isEmpty()) {
            p.setId(Integer.parseInt(codigo.getText().trim()));
        }

        if (!nombreProveedor.getText().isEmpty()) {
            p.setNombre(nombreProveedor.getText().trim());
        }

        if (!rucProveedor.getText().isEmpty()) {
            p.setRuc(rucProveedor.getText().trim());
        }

        if (!direccionProveedor.getText().isEmpty()) {
            p.setDireccion(direccionProveedor.getText().trim());
        }

        if (!telefonoProveedor.getText().isEmpty()) {
            p.setTelefono(telefonoProveedor.getText().trim());
        }



        try {
            // se obtienen los resultados
            List<Proveedores> result = controladorProveedor.buscar(p);

            // se obtiene la referencia al modelo de datos
            DefaultTableModel tm = ((DefaultTableModel) resultados.getModel());
            // se descartan la filas existentes
            tm.setRowCount(0);

            // se añaden los datos obtenidos si es que existen
            // cada fila recuperada es un array de Object[]
            for (Proveedores iterador : result) {
                Object[] row = {iterador.getId(), iterador.getNombre(),
                iterador.getRuc(), iterador.getDireccion(), iterador.getTelefono()};
                tm.addRow(row);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error del sistema ["
                    + e.getMessage() + "]");
            e.printStackTrace();
        }
}//GEN-LAST:event_buscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel codigoLabel;
    private javax.swing.JLabel codigoLabel1;
    private javax.swing.JLabel codigoLabel2;
    private javax.swing.JLabel codigoLabel3;
    private javax.swing.JLabel codigoLabel4;
    private javax.swing.JTextField direccionProveedor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreProveedor;
    private javax.swing.JTable resultados;
    private javax.swing.JTextField rucProveedor;
    private javax.swing.JTextField telefonoProveedor;
    // End of variables declaration//GEN-END:variables

}