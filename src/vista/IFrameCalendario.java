/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Font;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ferc
 */
public class IFrameCalendario extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFrameCalendario
     */
    public IFrameCalendario() {
        initComponents();
        cargarModeloDisponibilidad();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }
    
    public void cargarModeloDisponibilidad(){
        
        modeloTablaDisponibilidad.addColumn("Habitacion");
        modeloTablaDisponibilidad.addColumn("Desde");
        modeloTablaDisponibilidad.addColumn("Hasta");
         modeloTablaDisponibilidad.addColumn("Disponibilidad");
    }

   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laminaCalendario = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dateDesde = new com.toedter.calendar.JDateChooser();
        dateHasta = new com.toedter.calendar.JDateChooser();
        btnDisponible = new rsbuttom.RSButtonMetro();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();

        laminaCalendario.setBorder(null);
        laminaCalendario.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        dateDesde.setDateFormatString("yyyy/MM/dd");
        dateDesde.setMinSelectableDate(new java.util.Date(-62135755125000L));
        jPanel2.add(dateDesde);

        dateHasta.setDateFormatString("yyyy/MM/dd");
        jPanel2.add(dateHasta);

        btnDisponible.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDisponible.setText("Disponibilidad");
        btnDisponible.setColorHover(new java.awt.Color(51, 255, 102));
        btnDisponible.setColorNormal(new java.awt.Color(51, 51, 51));
        btnDisponible.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnDisponible.setColorTextNormal(new java.awt.Color(0, 255, 51));
        btnDisponible.setFont(new java.awt.Font("Bariol Bold", 1, 24)); // NOI18N
        jPanel2.add(btnDisponible);

        jPanel1.add(jPanel2);

        laminaCalendario.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jTable1.setModel(modeloTablaDisponibilidad);
        jScrollPane1.setViewportView(jTable1);

        laminaCalendario.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));
        laminaCalendario.add(jPanel3, java.awt.BorderLayout.LINE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(laminaCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, 756, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laminaCalendario, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public DefaultTableModel modeloTablaDisponibilidad = new DefaultTableModel();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rsbuttom.RSButtonMetro btnDisponible;
    public com.toedter.calendar.JDateChooser dateDesde;
    public com.toedter.calendar.JDateChooser dateHasta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JPanel laminaCalendario;
    // End of variables declaration//GEN-END:variables
}
