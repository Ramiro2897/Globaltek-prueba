package vistas;

import controladores.CrearProductoController;
import java.awt.Color;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CrearProductoInternalFrame extends javax.swing.JInternalFrame {

    private int id, costo;

    public CrearProductoInternalFrame() {
        initComponents();
        num(txtTemperatura);
        num(txtValorBase);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        txtIdProducto = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTemperatura = new javax.swing.JTextField();
        txtValorBase = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        txtCosto = new javax.swing.JTextField();
        panelProductos = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        btnActualizar1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));
        setClosable(true);
        setTitle("Crear Productos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 0, 0));
        panel.setMinimumSize(new java.awt.Dimension(830, 450));
        panel.setPreferredSize(new java.awt.Dimension(830, 450));
        panel.setVerifyInputWhenFocusTarget(false);
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdProducto.setEditable(false);
        txtIdProducto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtIdProducto.setBorder(javax.swing.BorderFactory.createTitledBorder("Id Producto"));
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });
        panel.add(txtIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 40));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre"));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panel.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 190, 40));

        txtTemperatura.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtTemperatura.setBorder(javax.swing.BorderFactory.createTitledBorder("Temperatura"));
        txtTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaActionPerformed(evt);
            }
        });
        txtTemperatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTemperaturaKeyTyped(evt);
            }
        });
        panel.add(txtTemperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 190, 40));

        txtValorBase.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtValorBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Valor Base"));
        txtValorBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorBaseActionPerformed(evt);
            }
        });
        txtValorBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorBaseKeyTyped(evt);
            }
        });
        panel.add(txtValorBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 190, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/disquete.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panel.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 130, -1));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/boton-eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        panel.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 130, -1));

        btnConsultar.setBackground(new java.awt.Color(0, 0, 0));
        btnConsultar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnConsultar.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/consulta.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMouseExited(evt);
            }
        });
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });
        panel.add(btnConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 130, -1));

        txtCosto.setEditable(false);
        txtCosto.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder("Costo"));
        txtCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoActionPerformed(evt);
            }
        });
        panel.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 190, -1));

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Temperatura", "Valor Base", "Costo"
            }
        ));
        tblProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosMouseClicked(evt);
            }
        });
        panelProductos.setViewportView(tblProductos);

        panel.add(panelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 590, 250));

        btnActualizar1.setBackground(new java.awt.Color(0, 0, 0));
        btnActualizar1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        btnActualizar1.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/actualizar.png"))); // NOI18N
        btnActualizar1.setText("Actualizar");
        btnActualizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizar1MouseExited(evt);
            }
        });
        btnActualizar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizar1ActionPerformed(evt);
            }
        });
        panel.add(btnActualizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 130, -1));

        getContentPane().add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listarProductos() {
        CrearProductoController controlador = new CrearProductoController();
        try {
            tblProductos.setModel(controlador.cargarProductos());
        } catch (SQLException ex) {
            Logger.getLogger(CrearProductoInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cargarTabla() {
        CrearProductoController controlador = new CrearProductoController();
        try {
            tblProductos.setModel(controlador.cargarProductos());
        } catch (SQLException ex) {
            Logger.getLogger(CrearProductoInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double costo() {
        double temp = Double.valueOf(txtTemperatura.getText());
        double Valor_Base = Double.valueOf(txtValorBase.getText());
        if (temp > 20) {
            return Valor_Base * 1.2;
        } else {
            return Valor_Base * 1.1;
        }
    }

    private String costo(String temperatura) {
        double resultado = 0;
        //Convertir Temperatura en String
        double temp = Double.parseDouble(temperatura);
        //Pasar el String Valor_Base a Double
        double Valor_Base = Double.valueOf(txtValorBase.getText());
        if (temp > 21) {
            resultado = Valor_Base * 1.2;
            String.format(".%1f", resultado);
            String val = String.valueOf(resultado);
            return val;
        } else {
            resultado = Valor_Base * 110 / 100;
            String.format(".%1f", resultado);
            String val = String.valueOf(resultado);
            return val;
        }
    }

    private void num(JTextField a) {
        a.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c) && c != '.') {
                    e.consume();
                }
                if (c == '.' && txtTemperatura.getText().contains(".")) {
                    e.consume();
                }
                if (c == '.' && txtValorBase.getText().contains(".")) {
                    e.consume();
                }
            }
        });
    }


    private void tblProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosMouseClicked
        int fila = tblProductos.getSelectedRow();
        this.id = Integer.parseInt(String.valueOf(tblProductos.getModel().getValueAt(fila, 0)));
        txtNombre.setText(String.valueOf(tblProductos.getModel().getValueAt(fila, 1)));
        txtTemperatura.setText(String.valueOf(tblProductos.getModel().getValueAt(fila, 2)));
        txtValorBase.setText(String.valueOf(tblProductos.getModel().getValueAt(fila, 3)));
        txtCosto.setText(String.valueOf(tblProductos.getModel().getValueAt(fila, 4)));
        txtIdProducto.setText(String.valueOf(this.id));

    }//GEN-LAST:event_tblProductosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        CrearProductoController controlador = new CrearProductoController();
        try {
            controlador.eliminarProducto(this.id);
            cargarTabla();
            JOptionPane.showMessageDialog(null, "Eliminado Exitosamente");

        } catch (SQLException ex) {
            Logger.getLogger(CrearProductoInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        JTextField caja;
        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (panel.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                caja = (JTextField) panel.getComponent(i);
                caja.setText("");
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        listarProductos();
        JTextField caja;
        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (panel.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                caja = (JTextField) panel.getComponent(i);
                caja.setText("");
            }
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdProductoActionPerformed

    private void txtTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperaturaActionPerformed

    private void txtValorBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorBaseActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        btnEliminar.setBackground(new Color(3, 233, 244));
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnConsultarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseEntered
        btnConsultar.setBackground(new Color(3, 233, 244));
    }//GEN-LAST:event_btnConsultarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        btnEliminar.setBackground(Color.black);
    }//GEN-LAST:event_btnEliminarMouseExited

    private void btnConsultarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMouseExited
        btnConsultar.setBackground(Color.black);
    }//GEN-LAST:event_btnConsultarMouseExited

    private void txtCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoActionPerformed

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarMouseExited

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        JTextField caja;
        if (txtNombre.getText().isEmpty() || txtTemperatura.getText().isEmpty()
                || txtValorBase.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Dejar Campos Vacios");
        } else {
            CrearProductoController controlador = new CrearProductoController();
            String[] datos = {
                txtNombre.getText(),
                txtTemperatura.getText(),
                txtValorBase.getText(),
                costo(txtTemperatura.getText())
            };

            try {
                controlador.crearProducto(datos);
                listarProductos();
                for (int i = 0; i < panel.getComponentCount(); i++) {
                    if (panel.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                        caja = (JTextField) panel.getComponent(i);
                        caja.setText("");
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(CrearProductoInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnActualizar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar1MouseEntered

    private void btnActualizar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizar1MouseExited

    private void btnActualizar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizar1ActionPerformed
        JTextField caja;
        if (txtNombre.getText().isEmpty() || txtTemperatura.getText().isEmpty()
                || txtValorBase.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "No Dejar Campos Vacios");
        } else {
            String[] datos = {
                txtIdProducto.getText(),
                txtNombre.getText(),
                txtTemperatura.getText(),
                txtValorBase.getText(),
                costo(txtTemperatura.getText())
            };

            CrearProductoController controlador = new CrearProductoController();
            try {
                controlador.actualizarProducto(this.id, datos);
                cargarTabla();
                JOptionPane.showMessageDialog(null, "Actualizado Exitosamente");
                for (int i = 0; i < panel.getComponentCount(); i++) {
                    if (panel.getComponent(i).getClass().getName().equals("javax.swing.JTextField")) {
                        caja = (JTextField) panel.getComponent(i);
                        caja.setText("");
                    }
                }

            } catch (SQLException ex) {
                Logger.getLogger(CrearProductoInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_btnActualizar1ActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        if (txtNombre.getText().length() >= 18) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtTemperaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTemperaturaKeyTyped
        if (txtTemperatura.getText().length() >= 18) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtTemperaturaKeyTyped

    private void txtValorBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorBaseKeyTyped
        if (txtTemperatura.getText().length() >= 18) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtValorBaseKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar1;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane panelProductos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTemperatura;
    private javax.swing.JTextField txtValorBase;
    // End of variables declaration//GEN-END:variables

}
