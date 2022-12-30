package vistas;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContenedor = new javax.swing.JPanel();
        menuPrincipal = new javax.swing.JMenuBar();
        mnuProductos = new javax.swing.JMenu();
        menuProductosCrear = new javax.swing.JMenuItem();
        menuProductosCrear1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("C.R.U.D. NetBeans");

        panelContenedor.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout panelContenedorLayout = new javax.swing.GroupLayout(panelContenedor);
        panelContenedor.setLayout(panelContenedorLayout);
        panelContenedorLayout.setHorizontalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
        );
        panelContenedorLayout.setVerticalGroup(
            panelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        mnuProductos.setText("Productos");

        menuProductosCrear.setText("Crear Productos");
        menuProductosCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosCrearActionPerformed(evt);
            }
        });
        mnuProductos.add(menuProductosCrear);

        menuProductosCrear1.setText("Farmacias");
        menuProductosCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductosCrear1ActionPerformed(evt);
            }
        });
        mnuProductos.add(menuProductosCrear1);

        menuPrincipal.add(mnuProductos);

        setJMenuBar(menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menuProductosCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosCrearActionPerformed
        CrearProductoInternalFrame crear = new CrearProductoInternalFrame();
        cargarFormulario(crear);
    }//GEN-LAST:event_menuProductosCrearActionPerformed

    private void menuProductosCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductosCrear1ActionPerformed
     
    }//GEN-LAST:event_menuProductosCrear1ActionPerformed

    private void cargarFormulario(JInternalFrame ventana) {
        panelContenedor.removeAll();
        panelContenedor.add(ventana);
        ventana.setVisible(true);
        try {
            ventana.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        panelContenedor.updateUI();
    }
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuPrincipal;
    private javax.swing.JMenuItem menuProductosCrear;
    private javax.swing.JMenuItem menuProductosCrear1;
    private javax.swing.JMenu mnuProductos;
    private javax.swing.JPanel panelContenedor;
    // End of variables declaration//GEN-END:variables
}
