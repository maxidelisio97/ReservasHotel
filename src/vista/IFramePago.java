/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.Cliente;
import Modelo.Habitacion;
import Modelo.Reserva;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;


/**
 *
 * @author ferc
 */
public class IFramePago extends javax.swing.JInternalFrame {

    /**
     * Creates new form IFramePago
     */
    public IFramePago() {
        initComponents();
        columnasReserva();
        filasColores();
        textPromp();
        txtIdReserva.setVisible(false);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);
    }

    public DefaultComboBoxModel modeloComboHabitaciones = new DefaultComboBoxModel();
    public DefaultComboBoxModel modeloComboCliente = new DefaultComboBoxModel();

    public void columnasReserva() {
        modeloTablaPagos.addColumn("Habitacion");
        modeloTablaPagos.addColumn("Cliente");
        modeloTablaPagos.addColumn("Seña");
        modeloTablaPagos.addColumn("Saldo");
        modeloTablaPagos.addColumn("Precio total");
        modeloTablaPagos.addColumn("Estado");
        modeloTablaPagos.addColumn("Id pago");

        TableColumn id = tablaDatosPagos.getColumn("Habitacion");
        TableColumn cli = tablaDatosPagos.getColumn("Cliente");
        TableColumn seña = tablaDatosPagos.getColumn("Seña");
        TableColumn saldo = tablaDatosPagos.getColumn("Saldo");
        TableColumn pFinal = tablaDatosPagos.getColumn("Precio total");
        TableColumn estado = tablaDatosPagos.getColumn("Estado");
        TableColumn idpago = tablaDatosPagos.getColumn("Id pago");

        id.setMaxWidth(100);
        cli.setMaxWidth(350);
        seña.setMaxWidth(100);
        saldo.setMaxWidth(300);
        pFinal.setMaxWidth(250);
        estado.setMaxWidth(100);
        idpago.setMaxWidth(50);

    }

    private void textPromp() {

        //TextPrompt precio = new TextPrompt("$/Dia", txtPrecioHabitacion);
        TextPrompt b1 = new TextPrompt("Buscar cliente ...", txtBuscadorCliente);
        TextPrompt b2 = new TextPrompt("Buscar Habitacion ...", txtSaldo);
        TextPrompt b3 = new TextPrompt("Dias alquilados ", txtCantidadDias);
        TextPrompt b4 = new TextPrompt("Seña reserva", txtSeña);
        TextPrompt b5 = new TextPrompt("Precio por dia", txtPrecioHabitacion);

        //TextPrompt seña = new TextPrompt("$/Seña", txtSeña);
        b1.changeAlpha(0.75f);
        b1.changeStyle(Font.BOLD);
        b2.changeAlpha(0.75f);
        b2.changeStyle(Font.BOLD);
        b3.changeAlpha(0.75f);
        b3.changeStyle(Font.BOLD);
        b4.changeAlpha(0.75f);
        b4.changeStyle(Font.BOLD);
        b5.changeAlpha(0.75f);
        b5.changeStyle(Font.BOLD);

        //precio.changeAlpha(1f);
        //precio.changeStyle(Font.BOLD);
        //seña.changeAlpha(1f);
        //seña.changeStyle(Font.BOLD);
    }

    private void filasColores() {

        JTableHeader header = tablaDatosPagos.getTableHeader();

        header.setBackground(new Color(255, 191, 37));
        header.setForeground(new Color(49, 49, 49));
        header.setFont(new Font("Segoi", Font.BOLD, 16));
        header.setBorder(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosPagos = new javax.swing.JTable();
        txtSeña = new javax.swing.JTextField();
        txtBuscadorCliente = new javax.swing.JTextField();
        txtSaldo = new javax.swing.JTextField();
        comboEstadoPago = new javax.swing.JComboBox<>();
        dateFechaPago = new com.toedter.calendar.JDateChooser();
        txtCantidadDias = new javax.swing.JTextField();
        txtPrecioHabitacion = new javax.swing.JTextField();
        btnPago = new javax.swing.JButton();
        comboBoxHabitaciones = new javax.swing.JComboBox<>();
        comboBoxCliente = new javax.swing.JComboBox<>();
        txtIdReserva = new javax.swing.JTextField();
        txtMePagaron = new javax.swing.JTextField();

        setBorder(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaDatosPagos.setModel(modeloTablaPagos);
        jScrollPane1.setViewportView(tablaDatosPagos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1020, 398));

        txtSeña.setBackground(new java.awt.Color(51, 51, 51));
        txtSeña.setForeground(new java.awt.Color(255, 255, 255));
        txtSeña.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtSeña, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 52, 129, 38));

        txtBuscadorCliente.setBackground(new java.awt.Color(51, 51, 51));
        txtBuscadorCliente.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscadorCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtBuscadorCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 7, 187, 38));

        txtSaldo.setBackground(new java.awt.Color(51, 51, 51));
        txtSaldo.setForeground(new java.awt.Color(255, 255, 255));
        txtSaldo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 7, 129, 38));

        comboEstadoPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SEÑADO", "PAGADO", "DEBE" }));
        jPanel1.add(comboEstadoPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 6, 190, 38));

        dateFechaPago.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(dateFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 174, 40));

        txtCantidadDias.setBackground(new java.awt.Color(51, 51, 51));
        txtCantidadDias.setForeground(new java.awt.Color(255, 255, 255));
        txtCantidadDias.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtCantidadDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 52, 117, 38));

        txtPrecioHabitacion.setBackground(new java.awt.Color(51, 51, 51));
        txtPrecioHabitacion.setForeground(new java.awt.Color(255, 255, 255));
        txtPrecioHabitacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(txtPrecioHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(264, 52, 139, 38));

        btnPago.setText("Insertando pago ");
        jPanel1.add(btnPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 100, -1, 39));

        comboBoxHabitaciones.setModel(modeloComboHabitaciones);
        jPanel1.add(comboBoxHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 310, 38));

        comboBoxCliente.setModel(modeloComboCliente);
        jPanel1.add(comboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 290, 39));
        jPanel1.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, -1, -1));

        txtMePagaron.setText("Cuanto pagan");
        jPanel1.add(txtMePagaron, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public DefaultTableModel modeloTablaPagos = new DefaultTableModel() {
        @Override
        public final boolean isCellEditable(int row, int column) {
            return false;

        }
    };
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnPago;
    public javax.swing.JComboBox<Cliente> comboBoxCliente;
    public javax.swing.JComboBox<Habitacion> comboBoxHabitaciones;
    public javax.swing.JComboBox<String> comboEstadoPago;
    public com.toedter.calendar.JDateChooser dateFechaPago;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaDatosPagos;
    public javax.swing.JTextField txtBuscadorCliente;
    public javax.swing.JTextField txtCantidadDias;
    public javax.swing.JTextField txtIdReserva;
    public javax.swing.JTextField txtMePagaron;
    public javax.swing.JTextField txtPrecioHabitacion;
    public javax.swing.JTextField txtSaldo;
    public javax.swing.JTextField txtSeña;
    // End of variables declaration//GEN-END:variables
}
