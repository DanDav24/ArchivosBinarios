/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package archivosbinarios;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dell
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        ListarEmpleados = new javax.swing.JButton();
        PagarEmpleado = new javax.swing.JButton();
        AgregarEmpleado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        AgregarVenta = new javax.swing.JButton();
        DespedirEmpleado = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ListarEmpleados.setText("Listar Empleados No Empleados");
        ListarEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarEmpleadosActionPerformed(evt);
            }
        });
        getContentPane().add(ListarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 300, -1));

        PagarEmpleado.setText("Pagar Empleado");
        PagarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PagarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(PagarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 300, -1));

        AgregarEmpleado.setText("Agregar Empleado");
        AgregarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 300, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 0, 36)); // NOI18N
        jLabel2.setText("MENU");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, 110, 50));

        AgregarVenta.setText("Agregar Venta a Empleado");
        AgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(AgregarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 300, -1));

        DespedirEmpleado.setText("Despedir Empleado");
        DespedirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DespedirEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(DespedirEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 300, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 470, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListarEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarEmpleadosActionPerformed
        try {
            ListarEmpleados list = new ListarEmpleados();
            list.setVisible(true);

            this.dispose();
        } catch (IOException ex) {
             JOptionPane.showMessageDialog(null, "Error, no se pudo completar la acción");
        }
        
    }//GEN-LAST:event_ListarEmpleadosActionPerformed

    private void PagarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PagarEmpleadoActionPerformed
        PagarEmpleado pg= new PagarEmpleado();
        pg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_PagarEmpleadoActionPerformed

    private void AgregarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEmpleadoActionPerformed
        AgregarEmpleado ag= new AgregarEmpleado();
        ag.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarEmpleadoActionPerformed

    private void AgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVentaActionPerformed
        AgregarVenta agregarAmigo= new AgregarVenta();
        agregarAmigo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarVentaActionPerformed

    private void DespedirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DespedirEmpleadoActionPerformed
        DespedirEmpleado viewProfile= new DespedirEmpleado();
        viewProfile.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DespedirEmpleadoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarEmpleado;
    private javax.swing.JButton AgregarVenta;
    private javax.swing.JButton DespedirEmpleado;
    private javax.swing.JButton ListarEmpleados;
    private javax.swing.JButton PagarEmpleado;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
