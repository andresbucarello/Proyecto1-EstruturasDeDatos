package com.proyecto1.gui;

import com.proyecto1.models.Wearhouse;
import javax.swing.JOptionPane;

// @author andresbucarello

public class AgregarRuta extends javax.swing.JPanel {
    
    boolean comprobado;
    int cantRutas;
    int index;
    int cantidad=5;
    Wearhouse almacenSeleccionado;
    Wearhouse[] almacenes = new Wearhouse[cantidad];
    /**
     * Creates new form AgregarRuta
     */
    public AgregarRuta() {
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
        jSeparator1 = new javax.swing.JSeparator();
        titulo3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rutasDisponibles = new javax.swing.JList<>();
        botonAgregar = new javax.swing.JButton();
        titulo4 = new javax.swing.JLabel();
        botonAgregarRutas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rutasAgregadas = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        comentario1 = new javax.swing.JTextArea();
        comentario2 = new javax.swing.JLabel();
        comentario3 = new javax.swing.JLabel();
        listaAlmacenes = new javax.swing.JComboBox<>();

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
        titulo1.setText("AGREGAR RUTA");
        add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        titulo2.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        titulo2.setText("SELECCIONE EL ALMACEN :");
        add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 580, 10));

        titulo3.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        titulo3.setText("RUTAS DISPONIBLES");
        add(titulo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 220, 30));

        rutasDisponibles.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        rutasDisponibles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rutasDisponiblesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rutasDisponibles);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 220, 220));

        botonAgregar.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        botonAgregar.setText(">>");
        botonAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregar.setEnabled(false);
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 60, 40));

        titulo4.setFont(new java.awt.Font("Silom", 1, 14)); // NOI18N
        titulo4.setText("RUTAS AGREGADAS");
        add(titulo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, 220, 30));

        botonAgregarRutas.setFont(new java.awt.Font("Silom", 0, 14)); // NOI18N
        botonAgregarRutas.setText("Agregar Rutas");
        botonAgregarRutas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarRutas.setEnabled(false);
        botonAgregarRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarRutasActionPerformed(evt);
            }
        });
        add(botonAgregarRutas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 580, -1));

        rutasAgregadas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(rutasAgregadas);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 220, 220));

        comentario1.setColumns(20);
        comentario1.setFont(new java.awt.Font("Helvetica Neue", 0, 6)); // NOI18N
        comentario1.setRows(5);
        comentario1.setTabSize(5);
        comentario1.setText("// Se activa solo\ncuando se haya\nseleeccionado un\nalmacen para ruta");
        jScrollPane3.setViewportView(comentario1);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 70, -1));

        comentario2.setFont(new java.awt.Font("Helvetica Neue", 0, 6)); // NOI18N
        comentario2.setText("// Se activa cuando se hayan agregado al menos dos rutas");
        add(comentario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, 160, 10));

        comentario3.setText("// JOP para pedir la distancia");
        add(comentario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, -1, 20));

        listaAlmacenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaAlmacenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAlmacenesActionPerformed(evt);
            }
        });
        add(listaAlmacenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 220, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        this.setVisible(false);
        // MainPanel menu= new MainPanel
        // MainPanel.show()
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        do{
            comprobado=false;
            String x=JOptionPane.showInputDialog(null, " INGRESE LA DISTANCIA CON EL ALMACEN " + rutasDisponibles.getSelectedValue());
            try{
                int distancia=Integer.parseInt(x);
                comprobado=true;
                // crear arista y agregar a la lista
                botonAgregar.setEnabled(false);
                cantRutas = rutasAgregadas.getVisibleRowCount();
                if (cantRutas >= 2) {
                    botonAgregarRutas.setEnabled(true);
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, " ERROR LA DISTANCIA INGRSADA NO ES VALIDA ");
            }   
        }while(!comprobado);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonAgregarRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarRutasActionPerformed
        for (Wearhouse almacen : almacenes) {
            if(almacenSeleccionado.name.equals(almacen.name)){
                // almacenSeleccionado.edges.pushBack(arr);
                botonAgregarRutas.setEnabled(false);
            }
        }
    }//GEN-LAST:event_botonAgregarRutasActionPerformed

    private void botonRetroceder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetroceder1ActionPerformed

    }//GEN-LAST:event_botonRetroceder1ActionPerformed

    private void listaAlmacenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAlmacenesActionPerformed
        almacenSeleccionado=(Wearhouse) listaAlmacenes.getSelectedItem();
    }//GEN-LAST:event_listaAlmacenesActionPerformed

    private void rutasDisponiblesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rutasDisponiblesMouseClicked
        index= rutasDisponibles.getSelectedIndex();
        if (index != -1) {
            botonAgregar.setEnabled(true);
        } 
    }//GEN-LAST:event_rutasDisponiblesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonAgregarRutas;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JTextArea comentario1;
    private javax.swing.JLabel comentario2;
    private javax.swing.JLabel comentario3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> listaAlmacenes;
    private javax.swing.JList<String> rutasAgregadas;
    private javax.swing.JList<String> rutasDisponibles;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel titulo3;
    private javax.swing.JLabel titulo4;
    // End of variables declaration//GEN-END:variables
}
