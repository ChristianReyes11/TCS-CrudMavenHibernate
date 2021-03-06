/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.christian.Vista;


import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import com.christian.Dao.DaoGeneral;
import com.christian.Dao.FactoryDAO;
import com.christian.Modelo.Departamento;


public abstract class FormularioGUI extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
        
            
    public FormularioGUI() {
        initComponents();
        modelo = new DefaultTableModel();
        
        modelo.addColumn("Clave");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
        modelo.addColumn("Telefono");
        this.tablaGUI.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lb2 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lb3 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btoGuardar = new javax.swing.JButton();
        btoModificar = new javax.swing.JButton();
        btoEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaGUI = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtNombreDepa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        lb2.setText("Nombre");

        lb1.setText("Clave");

        lb3.setText("Direccion");

        lb4.setText("Telefono");

        btoGuardar.setText("Guardar");
        btoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoGuardarActionPerformed(evt);
            }
        });

        btoModificar.setText("Modificar");
        btoModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoModificarActionPerformed(evt);
            }
        });

        btoEliminar.setText("Eliminar");
        btoEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoEliminarActionPerformed(evt);
            }
        });

        tablaGUI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0001"}
            },
            new String [] {
                "Clave"
            }
        ));
        tablaGUI.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tablaGUIFocusGained(evt);
            }
        });
        tablaGUI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaGUIMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaGUI);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "seleccione..." }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel1.setText("Departamento");

        txtNombreDepa.setEditable(false);

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb2)
                            .addComponent(lb1)
                            .addComponent(lb3)
                            .addComponent(lb4))
                        .addGap(3, 3, 3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtClave, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombreDepa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(btoGuardar)
                .addGap(18, 18, 18)
                .addComponent(btoEliminar)
                .addGap(18, 18, 18)
                .addComponent(btoModificar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb3)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb4)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtNombreDepa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btoEliminar)
                    .addComponent(btoGuardar)
                    .addComponent(btoModificar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoGuardarActionPerformed
        // TODO add your handling code here:
        guardar ();
    }//GEN-LAST:event_btoGuardarActionPerformed

    private void btoModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoModificarActionPerformed
        // TODO add your handling code here:
        modificar();
    }//GEN-LAST:event_btoModificarActionPerformed

    private void btoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_btoEliminarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        //consultar();
    }//GEN-LAST:event_formInternalFrameOpened

    private void tablaGUIFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tablaGUIFocusGained
        // TODO add your handling code here:
        txtClave.setText((String)tablaGUI.getValueAt(tablaGUI.getSelectedRow(), 0));
        txtNombre.setText((String)tablaGUI.getValueAt(tablaGUI.getSelectedRow(), 1));
        txtDireccion.setText((String)tablaGUI.getValueAt(tablaGUI.getSelectedRow(), 2));
        txtTelefono.setText((String)tablaGUI.getValueAt(tablaGUI.getSelectedRow(), 3));
        
    }//GEN-LAST:event_tablaGUIFocusGained

    private void tablaGUIMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaGUIMouseClicked
        // TODO add your handling code here:
        txtClave.setText((String)tablaGUI.getValueAt(tablaGUI.getSelectedRow(), 0));
        txtNombre.setText((String)tablaGUI.getValueAt(tablaGUI.getSelectedRow(), 1));
        txtDireccion.setText((String)tablaGUI.getValueAt(tablaGUI.getSelectedRow(), 2));
        txtTelefono.setText((String)tablaGUI.getValueAt(tablaGUI.getSelectedRow(), 3));
    }//GEN-LAST:event_tablaGUIMouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:}
        cambio();
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        buscarPorClave();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtNombre.setText("");
        txtClave.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
        txtNombreDepa.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed
public abstract void guardar ();
public abstract void modificar ();
public abstract void eliminar ();
public abstract void consultar ();
public abstract void buscarPorClave();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton btoEliminar;
    protected javax.swing.JButton btoGuardar;
    protected javax.swing.JButton btoModificar;
    protected javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    protected javax.swing.JComboBox<String> jComboBox1;
    protected javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    protected javax.swing.JLabel lb1;
    protected javax.swing.JLabel lb2;
    protected javax.swing.JLabel lb3;
    protected javax.swing.JLabel lb4;
    protected javax.swing.JTable tablaGUI;
    protected javax.swing.JTextField txtClave;
    protected javax.swing.JTextField txtDireccion;
    protected javax.swing.JTextField txtNombre;
    protected javax.swing.JTextField txtNombreDepa;
    protected javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public  void cambio (){
        DaoGeneral<Departamento> dao = FactoryDAO.create(FactoryDAO.DAOType.DEPARTAMENTO);
        Departamento depa = dao.buscarBYID(jComboBox1.getSelectedItem().toString());
        txtNombreDepa.setText(depa.getNombre());
        
        System.out.println(depa.getNombre());
    }

}
