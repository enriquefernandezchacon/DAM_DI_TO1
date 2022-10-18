/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app.vistas;

import app.modelo.ColeccionReservas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enrique
 */
public class VistaPrincipal extends javax.swing.JFrame {

    public ColeccionReservas reservas;
    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        this.setIconImage(getIconoRestaurante());
        reservas = new ColeccionReservas();
        cargarTablaReservas();
    }
    
    private Image getIconoRestaurante() {
       Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("recursos/tenedor.png"));
       return retValue;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cabeceraRestaurante1 = new app.vistas.paneles.CabeceraRestaurante();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservas = new javax.swing.JTable();
        jMenuPrincipal = new javax.swing.JMenuBar();
        JMenuReservas = new javax.swing.JMenu();
        jMenuItemNuevaReserva = new javax.swing.JMenuItem();
        jMenuCarta = new javax.swing.JMenu();
        jMenuMostrarCarta = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());

        jTableReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableReservas);

        JMenuReservas.setText("Reservas");

        jMenuItemNuevaReserva.setText("Nueva Reserva...");
        jMenuItemNuevaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaReservaActionPerformed(evt);
            }
        });
        JMenuReservas.add(jMenuItemNuevaReserva);

        jMenuPrincipal.add(JMenuReservas);

        jMenuCarta.setText("Carta");

        jMenuMostrarCarta.setText("Mostrar Carta...");
        jMenuMostrarCarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuMostrarCartaActionPerformed(evt);
            }
        });
        jMenuCarta.add(jMenuMostrarCarta);

        jMenuPrincipal.add(jMenuCarta);

        jMenuAyuda.setText("Ayuda");

        jMenuAcercaDe.setText("Acerca De...");
        jMenuAyuda.add(jMenuAcercaDe);

        jMenuPrincipal.add(jMenuAyuda);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(cabeceraRestaurante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeceraRestaurante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuMostrarCartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuMostrarCartaActionPerformed
       VistaCarta vistaCarta = new VistaCarta(this);
       vistaCarta.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jMenuMostrarCartaActionPerformed

    private void jMenuItemNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaReservaActionPerformed
        VistaNuevaReserva vistaNuevaReserva = new VistaNuevaReserva(this);
        vistaNuevaReserva.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemNuevaReservaActionPerformed

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuReservas;
    private app.vistas.paneles.CabeceraRestaurante cabeceraRestaurante1;
    private javax.swing.JMenuItem jMenuAcercaDe;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenu jMenuCarta;
    private javax.swing.JMenuItem jMenuItemNuevaReserva;
    private javax.swing.JMenuItem jMenuMostrarCarta;
    private javax.swing.JMenuBar jMenuPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReservas;
    // End of variables declaration//GEN-END:variables

    public void cargarTablaReservas() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new String[]{"Dia","Hora","Cliente","telefono","email", "Forma de Pago"});
        
        var lista = reservas.getReservas();
        for (var item : lista){
            dtm.addRow(item.toArrayString());
        }
        jTableReservas.setModel(dtm);
    }
}
