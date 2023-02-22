/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.proyecto1.gui;

import com.proyecto1.models.Product;
import com.proyecto1.models.Wearhouse;
import javax.swing.JOptionPane;

/**
 *
 * @author andresbucarello
 */
public class ModificarStock extends javax.swing.JPanel {
    
    int cantidad = 5;
    Wearhouse[] almacenes = new Wearhouse[cantidad];
    int stock;
    Wearhouse almacenSeleccionado;
    Product productoSeleccionado;
    /**
     * Creates new form ModificarStockk
     */
    public ModificarStock() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonRetroceder = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        listaAlmacenes = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        titulo3 = new javax.swing.JLabel();
        listaProductos = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        titulo4 = new javax.swing.JLabel();
        fieldPrecio = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        botonModificar = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(630, 450));
        setMinimumSize(new java.awt.Dimension(630, 450));
        setPreferredSize(new java.awt.Dimension(630, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonRetroceder.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        botonRetroceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/proyecto1/assets/retroceder.png"))); // NOI18N
        botonRetroceder.setBorder(null);
        botonRetroceder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });
        add(botonRetroceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        titulo1.setFont(new java.awt.Font("Silom", 0, 48)); // NOI18N
        titulo1.setText("MODIFICAR STOCK");
        add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        titulo2.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        titulo2.setText("SELECCIONE EL ALMACEN :");
        add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 190, -1));

        listaAlmacenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaAlmacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlmacenesActionPerformed(evt);
            }
        });
        add(listaAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 150, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 580, 20));

        titulo3.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        titulo3.setText("SELECCIONE EL NOMBRE DEL PRODUCTO :");
        add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 290, 20));

        listaProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaProductosActionPerformed(evt);
            }
        });
        add(listaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 290, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 580, 20));

        titulo4.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        titulo4.setText("INGRESE LA CANTIDAD A AUMENTAR  DEL PRODUCTO :");
        add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 370, 20));

        fieldPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldPrecioActionPerformed(evt);
            }
        });
        add(fieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 210, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 580, 20));

        botonModificar.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        botonModificar.setText("MODIFICAR");
        botonModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificar.setEnabled(false);
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 120, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void fieldPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldPrecioActionPerformed
        try{
            stock=Integer.parseInt(fieldPrecio.getText());
            botonModificar.setEnabled(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, " ERROR LA CANTIDAD INGRESADA NO ES VALIDA ");
        }
    }//GEN-LAST:event_fieldPrecioActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        for (Wearhouse almacen : almacenes){
            if(almacenSeleccionado.name.equals(almacen.name)){
                for (Product producto : almacen.products){
                    if(productoSeleccionado.name.equals(producto.name)){
                        producto.stock+=stock;
                    }
                }
            }    
        }
        botonModificar.setEnabled(false);
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        this.setVisible(false);
        // MainPanel menu= new MainPanel
        // MainPanel.show()
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void listaAlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlmacenesActionPerformed
        almacenSeleccionado=(Wearhouse) listaAlmacenes.getSelectedItem();
    }//GEN-LAST:event_listaAlmacenesActionPerformed

    private void listaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaProductosActionPerformed
        productoSeleccionado=(Product) listaProductos.getSelectedItem();
    }//GEN-LAST:event_listaProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JTextField fieldPrecio;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox<String> listaAlmacenes;
    private javax.swing.JComboBox<String> listaProductos;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}
