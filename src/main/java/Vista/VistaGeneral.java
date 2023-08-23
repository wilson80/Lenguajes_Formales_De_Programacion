/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;

/**
 *
 * @author Jonwil
 */
public class VistaGeneral extends javax.swing.JFrame {

    /**
     * Creates new form VistaGeneral
     */
    public VistaGeneral() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTexto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajonTexto = new javax.swing.JTextArea();
        panelError = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        archivo = new javax.swing.JButton();
        botonGenerarGrafico = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        botonAcercaDe = new javax.swing.JButton();
        botonAnalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelTexto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 153), 2));

        cajonTexto.setColumns(20);
        cajonTexto.setRows(5);
        jScrollPane1.setViewportView(cajonTexto);

        javax.swing.GroupLayout panelTextoLayout = new javax.swing.GroupLayout(panelTexto);
        panelTexto.setLayout(panelTextoLayout);
        panelTextoLayout.setHorizontalGroup(
            panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        panelTextoLayout.setVerticalGroup(
            panelTextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTextoLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelError.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 153), 2, true));

        javax.swing.GroupLayout panelErrorLayout = new javax.swing.GroupLayout(panelError);
        panelError.setLayout(panelErrorLayout);
        panelErrorLayout.setHorizontalGroup(
            panelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelErrorLayout.setVerticalGroup(
            panelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );

        jLabel1.setText("ERROR");

        panelOpciones.setLayout(new java.awt.GridBagLayout());

        archivo.setText("Archivo");
        archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoActionPerformed(evt);
            }
        });
        panelOpciones.add(archivo, new java.awt.GridBagConstraints());

        botonGenerarGrafico.setText("Generar Grafico");
        botonGenerarGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGenerarGraficoActionPerformed(evt);
            }
        });
        panelOpciones.add(botonGenerarGrafico, new java.awt.GridBagConstraints());

        botonAyuda.setText("Ayuda");
        panelOpciones.add(botonAyuda, new java.awt.GridBagConstraints());

        botonAcercaDe.setText("Acerca de");
        panelOpciones.add(botonAcercaDe, new java.awt.GridBagConstraints());

        botonAnalizar.setText("Analizar");
        botonAnalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(panelError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAnalizar)
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnalizar))
                .addGap(46, 46, 46)
                .addComponent(panelTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addComponent(panelError, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGenerarGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGenerarGraficoActionPerformed
        System.out.println("nandsfnadslkfn");
    }//GEN-LAST:event_botonGenerarGraficoActionPerformed

    private void archivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoActionPerformed
        JFileChooser jFileChooser = new JFileChooser();
        
        int selecccion = jFileChooser.showOpenDialog(this);
        
        if(selecccion==JFileChooser.APPROVE_OPTION){
            
            File fichero = jFileChooser.getSelectedFile();
            this.archivo.setText("Archivo");
            
            try (FileReader fr = new FileReader(fichero)){
                String cadena = "";
                int valor = fr.read();
                while(valor != -1){
                    cadena = cadena + (char) valor;
                    valor=fr.read();
                    
                }
                this.cajonTexto.setText(cadena);
            } catch (Exception e) {
            }
            
        }
    }//GEN-LAST:event_archivoActionPerformed

    private void botonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAnalizarActionPerformed

 
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
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivo;
    private javax.swing.JButton botonAcercaDe;
    private javax.swing.JButton botonAnalizar;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonGenerarGrafico;
    private javax.swing.JTextArea cajonTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelError;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelTexto;
    // End of variables declaration//GEN-END:variables
}
