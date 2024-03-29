/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.vistas;

import app.modelo.Cliente;
import app.modelo.FormaPago;
import app.modelo.Reserva;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Enrique
 */
public class VistaNuevaReserva extends javax.swing.JFrame {
    
    private final VistaPrincipalReservas padre;
    
    public VistaNuevaReserva(VistaPrincipalReservas padre) {
        this.padre = padre;
        initComponents();
        Vector comboBoxItems=new Vector();
        comboBoxItems.add(FormaPago.METALICO);
        comboBoxItems.add(FormaPago.TARJETA);
        comboBoxItems.add(FormaPago.TARJETA_REGALO);
        comboBoxItems.add(FormaPago.TICKET_RESTAURANT);
        final DefaultComboBoxModel model = new DefaultComboBoxModel(comboBoxItems);
        panelNuevaReserva.jComboBoxFormaPago.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelNuevaReserva = new app.vistas.paneles.NuevaReserva();
        jButtonReservar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonReservar.setText("Reservar");
        jButtonReservar.setToolTipText("Crear reserva");
        jButtonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReservarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setToolTipText("Volver al gestor de reservas");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButtonReservar)
                .addGap(74, 74, 74)
                .addComponent(jButtonCancelar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelNuevaReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonReservar)
                    .addComponent(jButtonCancelar))
                .addGap(0, 62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null, 
                "¿Desea cancelar la nueva reserva?", "Cancelar Nueva Reserva!", JOptionPane.YES_NO_OPTION) == 0) {
            padre.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReservarActionPerformed
        boolean centinela = true;
        
        if (panelNuevaReserva.jTFNombre.getText().trim().equals("")){
            centinela = false;
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío");
        }
        
        if (panelNuevaReserva.jTFApellidos.getText().trim().equals("")){
            centinela = false;
            JOptionPane.showMessageDialog(this, "Los apellidos no pueden estar vacíos");
        }
        
        //regex email
        String patronEmail = "\\w+[.]?\\w+[@]\\w+[.]\\w{2,5}";
        if (panelNuevaReserva.jTFEmail.getText().trim().equals("")){
            centinela = false;
            JOptionPane.showMessageDialog(this, "El email no puede estar vacío");
        } else if (!panelNuevaReserva.jTFEmail.getText().matches(patronEmail)){
            centinela = false;
            JOptionPane.showMessageDialog(this, "El formato del email no es correcto");
        } 
                
        if (panelNuevaReserva.jTFDireccion.getText().trim().equals("")){
            centinela = false;
            JOptionPane.showMessageDialog(this, "La direccion no puede estar vacía");
        }
        
        //regex telefono
        String patronTelefono = "[6789]\\d{8}";
        if (!panelNuevaReserva.jTFTelefono.getText().matches(patronTelefono)){
            centinela = false;
            JOptionPane.showMessageDialog(this, "El formato del telefono no es correcto");
        } else if (panelNuevaReserva.jTFTelefono.getText().trim().equals("")){
            centinela = false;
            JOptionPane.showMessageDialog(this, "El telefono no puede estar vacío");
        }
        
        if (centinela) {
            Cliente cliente = new Cliente(
                    panelNuevaReserva.jTFNombre.getText(),
                    panelNuevaReserva.jTFApellidos.getText(),
                    panelNuevaReserva.jTFEmail.getText(),
                    panelNuevaReserva.jTFTelefono.getText(),
                    panelNuevaReserva.jTFTelefono.getText()
            );
          
            Date fecha = (Date) panelNuevaReserva.jSpinnerFecha.getValue();
            Date horaDate = (Date) panelNuevaReserva.jSpinnerHora.getValue();
            LocalTime hora = horaDate.toInstant().atZone(ZoneId.systemDefault()).toLocalTime();
            Reserva reserva = new Reserva(
                    cliente,
                    fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(),
                    hora,
                    (FormaPago) panelNuevaReserva.jComboBoxFormaPago.getSelectedItem());
            
            padre.reservas.anadirReserva(reserva);
            padre.cargarTablaReservas();
            padre.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButtonReservarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonReservar;
    private app.vistas.paneles.NuevaReserva panelNuevaReserva;
    // End of variables declaration//GEN-END:variables
}
