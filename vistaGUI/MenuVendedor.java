/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaGUI;

/**
 *
 * @author 57314
 */
public class MenuVendedor extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdministrador
     */
    public MenuVendedor() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuAutos = new javax.swing.JMenuItem();
        jMenuBuses = new javax.swing.JMenuItem();
        jMenuVolquetas = new javax.swing.JMenuItem();
        jMenuCamiones = new javax.swing.JMenuItem();
        Camionetas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMenu2.setText("Administrar Autos");

        jMenuAutos.setText("Automoviles");
        jMenuAutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAutosMouseClicked(evt);
            }
        });
        jMenuAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAutosActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuAutos);

        jMenuBuses.setText("Buses");
        jMenuBuses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuBusesMouseClicked(evt);
            }
        });
        jMenuBuses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBusesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuBuses);

        jMenuVolquetas.setText("Volquetas");
        jMenuVolquetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuVolquetasActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuVolquetas);

        jMenuCamiones.setText("Camiones");
        jMenuCamiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCamionesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuCamiones);

        Camionetas.setText("Camionetas");
        Camionetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CamionetasActionPerformed(evt);
            }
        });
        jMenu2.add(Camionetas);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("About");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu3.setText("Salir");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 811, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAutosActionPerformed
        // TODO add your handling code here:
        GUIAutomovil desa = new GUIAutomovil();
        desa.getjTplaca().setEnabled(false);
        desa.getjTplaca().setEditable(false);
        
        desa.getjTnumerodecilindros().setEnabled(false);
        desa.getjTnumerodecilindros().setEditable(false);
        
        desa.getjCcolor().setEnabled(false);
        desa.getjCcolor().setEditable(false);
        
        desa.getjCmarca().setEnabled(false);
        desa.getjCmarca().setEditable(false);
        
        desa.getjTcilindraje().setEnabled(false);
        desa.getjTcilindraje().setEditable(false);
        
        desa.getjTnumchasis().setEnabled(false);
        desa.getjTnumchasis().setEditable(false);
        
        desa.getjTnummotor().setEnabled(false);
        desa.getjTnummotor().setEditable(false);
        
        desa.getjTnumpuertas().setEnabled(false);
        desa.getjTnumpuertas().setEditable(false);
        
        desa.getjTtamllanta().setEnabled(false);
        desa.getjTtamllanta().setEditable(false);
        
        desa.getjTtransmision().setEnabled(false);
        desa.getjTtransmision().setEditable(false);
        
        desa.getjTnumcambios().setEnabled(false);
        desa.getjTnumcambios().setEditable(false);
        
        desa.getjTgaloneskilometro().setEnabled(false);
        desa.getjTgaloneskilometro().setEditable(false);
        
        desa.getjBInsertar().setEnabled(false);
        desa.getjBBorrar().setEnabled(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                desa.setVisible(true);
            }
        }
        );
    
    }//GEN-LAST:event_jMenuAutosActionPerformed

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        // TODO add your handling code here:
        /* Set the Nimbus look and feel */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAbout().setVisible(true);
            }
        }
        );
    
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuVolquetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuVolquetasActionPerformed
        // TODO add your handling code here:
        GUIVolquetas desa = new GUIVolquetas();
        desa.getjTplaca().setEnabled(false);
        desa.getjTplaca().setEditable(false);
        
        desa.getjTnumerodecilindros().setEnabled(false);
        desa.getjTnumerodecilindros().setEditable(false);
        
        desa.getjCcolor().setEnabled(false);
        desa.getjCcolor().setEditable(false);
        
        desa.getjCmarca().setEnabled(false);
        desa.getjCmarca().setEditable(false);
        
        desa.getjTcilindraje().setEnabled(false);
        desa.getjTcilindraje().setEditable(false);
        
        desa.getjTnumchasis().setEnabled(false);
        desa.getjTnumchasis().setEditable(false);
        
        desa.getjTnummotor().setEnabled(false);
        desa.getjTnummotor().setEditable(false);
        
        desa.getjTnumpuertas().setEnabled(false);
        desa.getjTnumpuertas().setEditable(false);
        
        desa.getjTtamllanta().setEnabled(false);
        desa.getjTtamllanta().setEditable(false);
        
        desa.getjTtransmision().setEnabled(false);
        desa.getjTtransmision().setEditable(false);
        
        desa.getjTnumcambios().setEnabled(false);
        desa.getjTnumcambios().setEditable(false);
        
        desa.getjTgaloneskilometro().setEnabled(false);
        desa.getjTgaloneskilometro().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        desa.getjTtamvol().setEnabled(false);
        desa.getjTtamvol().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                desa.setVisible(true);
            }
        }
        );
    }//GEN-LAST:event_jMenuVolquetasActionPerformed

    private void jMenuBusesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBusesActionPerformed
        // TODO add your handling code here:
         GUIBuses desa = new GUIBuses();
        desa.getjTplaca().setEnabled(false);
        desa.getjTplaca().setEditable(false);
        
        desa.getjTnumerodecilindros().setEnabled(false);
        desa.getjTnumerodecilindros().setEditable(false);
        
        desa.getjCcolor().setEnabled(false);
        desa.getjCcolor().setEditable(false);
        
        desa.getjCmarca().setEnabled(false);
        desa.getjCmarca().setEditable(false);
        
        desa.getjTcilindraje().setEnabled(false);
        desa.getjTcilindraje().setEditable(false);
        
        desa.getjTnumchasis().setEnabled(false);
        desa.getjTnumchasis().setEditable(false);
        
        desa.getjTnummotor().setEnabled(false);
        desa.getjTnummotor().setEditable(false);
        
        desa.getjTnumpuertas().setEnabled(false);
        desa.getjTnumpuertas().setEditable(false);
        
        desa.getjTtamllanta().setEnabled(false);
        desa.getjTtamllanta().setEditable(false);
        
        desa.getjTtransmision().setEnabled(false);
        desa.getjTtransmision().setEditable(false);
        
        desa.getjTnumcambios().setEnabled(false);
        desa.getjTnumcambios().setEditable(false);
        
        desa.getjTgaloneskilometro().setEnabled(false);
        desa.getjTgaloneskilometro().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        desa.getjTnumpasajeros().setEnabled(false);
        desa.getjTnumpasajeros().setEditable(false);
        
        desa.getjTpesoequipaje().setEnabled(false);
        desa.getjTpesoequipaje().setEditable(false);
        
        desa.getjTtamaño().setEnabled(false);
        desa.getjTtamaño().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                desa.setVisible(true);
            }
        }
        );
    }//GEN-LAST:event_jMenuBusesActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGUI().setVisible(true);
            }
        }
        );
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenuAutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAutosMouseClicked
        // TODO add your handling code here:
        GUIAutomovil desa = new GUIAutomovil();
        desa.getjTplaca().setEnabled(false);
        desa.getjTplaca().setEditable(false);
        
        desa.getjTnumerodecilindros().setEnabled(false);
        desa.getjTnumerodecilindros().setEditable(false);
        
        desa.getjCcolor().setEnabled(false);
        desa.getjCcolor().setEditable(false);
        
        desa.getjCmarca().setEnabled(false);
        desa.getjCmarca().setEditable(false);
        
        desa.getjTcilindraje().setEnabled(false);
        desa.getjTcilindraje().setEditable(false);
        
        desa.getjTnumchasis().setEnabled(false);
        desa.getjTnumchasis().setEditable(false);
        
        desa.getjTnummotor().setEnabled(false);
        desa.getjTnummotor().setEditable(false);
        
        desa.getjTnumpuertas().setEnabled(false);
        desa.getjTnumpuertas().setEditable(false);
        
        desa.getjTtamllanta().setEnabled(false);
        desa.getjTtamllanta().setEditable(false);
        
        desa.getjTtransmision().setEnabled(false);
        desa.getjTtransmision().setEditable(false);
        
        desa.getjTnumcambios().setEnabled(false);
        desa.getjTnumcambios().setEditable(false);
        
        desa.getjTgaloneskilometro().setEnabled(false);
        desa.getjTgaloneskilometro().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                desa.setVisible(true);
            }
        }
        );
    }//GEN-LAST:event_jMenuAutosMouseClicked

    private void jMenuBusesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuBusesMouseClicked
        // TODO add your handling code here:
        GUIAutomovil desa = new GUIAutomovil();
        desa.getjTplaca().setEnabled(false);
        desa.getjTplaca().setEditable(false);
        
        desa.getjTnumerodecilindros().setEnabled(false);
        desa.getjTnumerodecilindros().setEditable(false);
        
        desa.getjCcolor().setEnabled(false);
        desa.getjCcolor().setEditable(false);
        
        desa.getjCmarca().setEnabled(false);
        desa.getjCmarca().setEditable(false);
        
        desa.getjTcilindraje().setEnabled(false);
        desa.getjTcilindraje().setEditable(false);
        
        desa.getjTnumchasis().setEnabled(false);
        desa.getjTnumchasis().setEditable(false);
        
        desa.getjTnummotor().setEnabled(false);
        desa.getjTnummotor().setEditable(false);
        
        desa.getjTnumpuertas().setEnabled(false);
        desa.getjTnumpuertas().setEditable(false);
        
        desa.getjTtamllanta().setEnabled(false);
        desa.getjTtamllanta().setEditable(false);
        
        desa.getjTtransmision().setEnabled(false);
        desa.getjTtransmision().setEditable(false);
        
        desa.getjTnumcambios().setEnabled(false);
        desa.getjTnumcambios().setEditable(false);
        
        desa.getjTgaloneskilometro().setEnabled(false);
        desa.getjTgaloneskilometro().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                desa.setVisible(true);
            }
        }
        );
    }//GEN-LAST:event_jMenuBusesMouseClicked

    private void jMenuCamionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCamionesActionPerformed
        // TODO add your handling code here:
        GUICamiones desa = new GUICamiones();
        desa.getjTplaca().setEnabled(false);
        desa.getjTplaca().setEditable(false);
        
        desa.getjTnumerodecilindros().setEnabled(false);
        desa.getjTnumerodecilindros().setEditable(false);
        
        desa.getjCcolor().setEnabled(false);
        desa.getjCcolor().setEditable(false);
        
        desa.getjCmarca().setEnabled(false);
        desa.getjCmarca().setEditable(false);
        
        desa.getjTcilindraje().setEnabled(false);
        desa.getjTcilindraje().setEditable(false);
        
        desa.getjTnumchasis().setEnabled(false);
        desa.getjTnumchasis().setEditable(false);
        
        desa.getjTnummotor().setEnabled(false);
        desa.getjTnummotor().setEditable(false);
        
        desa.getjTnumpuertas().setEnabled(false);
        desa.getjTnumpuertas().setEditable(false);
        
        desa.getjTtamllanta().setEnabled(false);
        desa.getjTtamllanta().setEditable(false);
        
        desa.getjTtransmision().setEnabled(false);
        desa.getjTtransmision().setEditable(false);
        
        desa.getjTnumcambios().setEnabled(false);
        desa.getjTnumcambios().setEditable(false);
        
        desa.getjTgaloneskilometro().setEnabled(false);
        desa.getjTgaloneskilometro().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        desa.getjTcapcarga().setEnabled(false);
        desa.getjTcapcarga().setEditable(false);
        
        desa.getjTtipocarro().setEnabled(false);
        desa.getjTtipocarro().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                desa.setVisible(true);
            }
        }
        );
    }//GEN-LAST:event_jMenuCamionesActionPerformed

    private void CamionetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CamionetasActionPerformed
        // TODO add your handling code here:
        GUICamionetas desa = new GUICamionetas();
        desa.getjTplaca().setEnabled(false);
        desa.getjTplaca().setEditable(false);
        
        desa.getjTnumerodecilindros().setEnabled(false);
        desa.getjTnumerodecilindros().setEditable(false);
        
        desa.getjCcolor().setEnabled(false);
        desa.getjCcolor().setEditable(false);
        
        desa.getjCmarca().setEnabled(false);
        desa.getjCmarca().setEditable(false);
        
        desa.getjTcilindraje().setEnabled(false);
        desa.getjTcilindraje().setEditable(false);
        
        desa.getjTnumchasis().setEnabled(false);
        desa.getjTnumchasis().setEditable(false);
        
        desa.getjTnummotor().setEnabled(false);
        desa.getjTnummotor().setEditable(false);
        
        desa.getjTnumpuertas().setEnabled(false);
        desa.getjTnumpuertas().setEditable(false);
        
        desa.getjTtamllanta().setEnabled(false);
        desa.getjTtamllanta().setEditable(false);
        
        desa.getjTtransmision().setEnabled(false);
        desa.getjTtransmision().setEditable(false);
        
        desa.getjTnumcambios().setEnabled(false);
        desa.getjTnumcambios().setEditable(false);
        
        desa.getjTgaloneskilometro().setEnabled(false);
        desa.getjTgaloneskilometro().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        desa.getjTtraccion().setEnabled(false);
        desa.getjTtraccion().setEditable(false);
        
        desa.getjTtipogasolina().setEnabled(false);
        desa.getjTtipogasolina().setEditable(false);
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                desa.setVisible(true);
            }
        }
        );
    }//GEN-LAST:event_CamionetasActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MenuAdministrador().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Camionetas;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuAutos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBuses;
    private javax.swing.JMenuItem jMenuCamiones;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuVolquetas;
    // End of variables declaration//GEN-END:variables
}
