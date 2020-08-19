
package eps.Ventanas;

import Logica.SolicitarCita;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PedirCita extends javax.swing.JFrame {
    private SolicitarCita sc;
    public PedirCita() {
        initComponents();
        this.sc = new SolicitarCita();
        this.setTitle("EPS");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        desTipoDoc = new javax.swing.JComboBox<>();
        desTipoCita = new javax.swing.JComboBox<>();
        Id = new javax.swing.JTextField();
        bSolicitarCita = new javax.swing.JButton();
        bVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("Bell MT", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Pedir Cita");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        desTipoDoc.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        desTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "TI", "CE" }));
        desTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desTipoDocActionPerformed(evt);
            }
        });

        desTipoCita.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        desTipoCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "prioritaria", "primera vez", "lectura de exámenes", "control", " " }));
        desTipoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desTipoCitaActionPerformed(evt);
            }
        });

        Id.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        Id.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Id.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdActionPerformed(evt);
            }
        });

        bSolicitarCita.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        bSolicitarCita.setText("Solicitar Cita");
        bSolicitarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSolicitarCitaActionPerformed(evt);
            }
        });

        bVolver.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        bVolver.setText("Volver");
        bVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVolverActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        jLabel2.setText("N. Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bVolver)
                    .addComponent(bSolicitarCita)
                    .addComponent(desTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(desTipoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(desTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(bSolicitarCita)
                .addGap(18, 18, 18)
                .addComponent(bVolver)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desTipoDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desTipoDocActionPerformed

    private void desTipoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desTipoCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_desTipoCitaActionPerformed

    private void IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdActionPerformed

    private void bVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVolverActionPerformed
    
        AsignarCita.crearVentana().setVisible(true);
        dispose();
        
    }//GEN-LAST:event_bVolverActionPerformed

    private void bSolicitarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSolicitarCitaActionPerformed
                    //primero se debe verificar la existencia del paciente.
            //verificar que hayan citas de ese tipo y activas en la agenda
            //de ser true las dos verificaciones se debe cambiar el estado de la cita a Inactiva.
        boolean verPac = sc.verificarPaciente(Integer.parseInt(Id.getText()), desTipoDoc.getSelectedItem().toString());
        boolean verCita = sc.verificarCita(desTipoCita.getSelectedItem().toString());
        try{
            if(verPac == true && verCita == true){
                JOptionPane.showMessageDialog(this," Existen Citas Activas");
                JOptionPane.showMessageDialog(this," *Mostrar tabla con las citas en especifico");
                
            }
            else if(verPac == false)
                JOptionPane.showMessageDialog(this," El usuario no existe");
            else if(verCita == false)
                JOptionPane.showMessageDialog(this," No hay citas activas de ese tipo");

        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "ERROR El campo solo recibe digitos de tipo enteros: "+e.getMessage());
        }   
            
            
            
    }//GEN-LAST:event_bSolicitarCitaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Id;
    private javax.swing.JButton bSolicitarCita;
    private javax.swing.JButton bVolver;
    private javax.swing.JComboBox<String> desTipoCita;
    private javax.swing.JComboBox<String> desTipoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
