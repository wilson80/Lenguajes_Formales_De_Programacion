/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import com.ipc2.alsimple.ControlAnalizadorLexico;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;

/**
 *
 * @author Jonwil
 */
public class VistaGeneral extends javax.swing.JFrame {
    ControlAnalizadorLexico controlAnalizador;
    
    private int contador = 0;

    /**
     * Creates new form VistaGeneral
     */
    public VistaGeneral() {
        controlAnalizador = new ControlAnalizadorLexico(this);
        
        initComponents();
        
    }
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTexto = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cajonTexto = new javax.swing.JTextArea();
        panelError = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaErrores = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        archivo = new javax.swing.JButton();
        botonGenerarGrafico = new javax.swing.JButton();
        botonAyuda = new javax.swing.JButton();
        botonAcercaDe = new javax.swing.JButton();
        botonAnalizar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();

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

        areaErrores.setColumns(20);
        areaErrores.setRows(5);
        jScrollPane2.setViewportView(areaErrores);

        javax.swing.GroupLayout panelErrorLayout = new javax.swing.GroupLayout(panelError);
        panelError.setLayout(panelErrorLayout);
        panelErrorLayout.setHorizontalGroup(
            panelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        panelErrorLayout.setVerticalGroup(
            panelErrorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelErrorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
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

        botonLimpiar.setText("Limpiar");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(botonLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonAnalizar)))
                        .addGap(77, 77, 77))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelOpciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnalizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonLimpiar)
                .addGap(18, 18, 18)
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
        contador++;
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

    public JTextArea getCajonTexto() {
        return cajonTexto;
    }

    public void setCajonTexto(String cajonTexto) {
        this.cajonTexto.setText(cajonTexto);
    }

    

    private void botonAnalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalizarActionPerformed
        controlAnalizador.analizar();
        MostraErrores mostrarErr;
        mostrarErr = new MostraErrores(controlAnalizador.getListTokens(), this);
        mostrarErr.clasificarerrores();
    }//GEN-LAST:event_botonAnalizarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        cajonTexto.setText("");
        areaErrores.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    public JTextArea getAreaErrores() {
        return areaErrores;
    }

    public void setAreaErrores(String areaErrores) {
        this.areaErrores.setText(areaErrores);
    }

    
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton archivo;
    private javax.swing.JTextArea areaErrores;
    private javax.swing.JButton botonAcercaDe;
    private javax.swing.JButton botonAnalizar;
    private javax.swing.JButton botonAyuda;
    private javax.swing.JButton botonGenerarGrafico;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JTextArea cajonTexto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelError;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JPanel panelTexto;
    // End of variables declaration//GEN-END:variables
}
