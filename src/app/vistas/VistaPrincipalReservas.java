package app.vistas;

import app.modelo.ColeccionReservas;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Enrique
 */
public final class VistaPrincipalReservas extends javax.swing.JFrame {
    
    private final VistaPrincipal padre;
    public ColeccionReservas reservas;

    public VistaPrincipalReservas(VistaPrincipal padre) {
        initComponents();
        this.padre = padre;
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
        jMenuAyuda = new javax.swing.JMenu();
        jMenuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(getIconImages());
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        cabeceraRestaurante1.setPreferredSize(new java.awt.Dimension(800, 60));

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
        jMenuItemNuevaReserva.setToolTipText("Crear nueva reserva");
        jMenuItemNuevaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaReservaActionPerformed(evt);
            }
        });
        JMenuReservas.add(jMenuItemNuevaReserva);

        jMenuPrincipal.add(JMenuReservas);

        jMenuAyuda.setText("Ayuda");

        jMenuAcercaDe.setText("Acerca De...");
        jMenuAcercaDe.setToolTipText("Informacion de la aplicacion");
        jMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAcercaDeActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jMenuAcercaDe);

        jMenuPrincipal.add(jMenuAyuda);

        setJMenuBar(jMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cabeceraRestaurante1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cabeceraRestaurante1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemNuevaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaReservaActionPerformed
        VistaNuevaReserva vistaNuevaReserva = new VistaNuevaReserva(this);
        vistaNuevaReserva.setLocationRelativeTo(null);
        vistaNuevaReserva.setTitle("Nueva Reserva");
        vistaNuevaReserva.setIconImage(getIconoRestaurante());
        vistaNuevaReserva.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItemNuevaReservaActionPerformed

    private void jMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAcercaDeActionPerformed
        JOptionPane.showMessageDialog(this, "Aplicación creada por Enrique Octavio Fernández Chacón para la Tarea Online 1 de Diseño de Interfaces");
    }//GEN-LAST:event_jMenuAcercaDeActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        padre.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenuReservas;
    private app.vistas.paneles.CabeceraRestaurante cabeceraRestaurante1;
    private javax.swing.JMenuItem jMenuAcercaDe;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuItem jMenuItemNuevaReserva;
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
