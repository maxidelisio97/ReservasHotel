package vista;

import com.toedter.calendar.JDateChooser;
import controlador.Controlador;
import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class IFrameReserva extends javax.swing.JInternalFrame {

    public DefaultTableModel modeloTablaReserva = new DefaultTableModel();

    public IFrameReserva() {
        initComponents();
        columnasReserva();
        filasColores();
        textPromp();
        centrarDatos();
        txtIdCliente.setVisible(false);
        txtIdReserva.setVisible(false);

        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        LaminaFondo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtBuscador = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        Chasta = new com.toedter.calendar.JDateChooser();
        Cdesde = new com.toedter.calendar.JDateChooser();
        jPanel4 = new javax.swing.JPanel();
        txtNombreCliente = new javax.swing.JTextField();
        txtDniCliente = new javax.swing.JTextField();
        txtCorreoCliente = new javax.swing.JTextField();
        txtTelCliente = new javax.swing.JTextField();
        txtIdCliente = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNuevaReserva = new rsbuttom.RSButtonMetro();
        btnGuardarReserva = new rsbuttom.RSButtonMetro();
        btnEliminarReserva = new rsbuttom.RSButtonMetro();
        btnModificarReserva = new rsbuttom.RSButtonMetro();
        txtIdReserva = new javax.swing.JTextField();
        comboPersonas = new javax.swing.JComboBox<>();
        comboHabitaciones = new javax.swing.JComboBox<>();
        comboEstadoReserva = new javax.swing.JComboBox<>();
        txtBuscador1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaDatosReserva = new javax.swing.JTable();

        javax.swing.GroupLayout LaminaFondoLayout = new javax.swing.GroupLayout(LaminaFondo);
        LaminaFondo.setLayout(LaminaFondoLayout);
        LaminaFondoLayout.setHorizontalGroup(
            LaminaFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1251, Short.MAX_VALUE)
        );
        LaminaFondoLayout.setVerticalGroup(
            LaminaFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
        );

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(1128, 500));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 200));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        txtBuscador.setBackground(new java.awt.Color(51, 51, 51));
        txtBuscador.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscador.setForeground(new java.awt.Color(255, 191, 37));
        txtBuscador.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscador.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Buscador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(255, 191, 37))); // NOI18N
        txtBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscadorActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 582, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 52, Short.MAX_VALUE)
        );

        Chasta.setBackground(new java.awt.Color(51, 51, 51));
        Chasta.setDateFormatString("yyyy/MM/dd");

        Cdesde.setBackground(new java.awt.Color(51, 51, 51));
        Cdesde.setBorder(null);
        Cdesde.setDateFormatString("yyyy/MM/dd");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Cdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Chasta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Cdesde, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Chasta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 400, 120));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new java.awt.GridLayout(4, 0));

        txtNombreCliente.setBackground(new java.awt.Color(51, 51, 51));
        txtNombreCliente.setFont(new java.awt.Font("Bariol Bold", 0, 18)); // NOI18N
        txtNombreCliente.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(255, 191, 37))); // NOI18N
        jPanel4.add(txtNombreCliente);

        txtDniCliente.setBackground(new java.awt.Color(51, 51, 51));
        txtDniCliente.setFont(new java.awt.Font("Bariol Bold", 0, 18)); // NOI18N
        txtDniCliente.setForeground(new java.awt.Color(204, 204, 204));
        txtDniCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDniCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Dni", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(255, 191, 37))); // NOI18N
        jPanel4.add(txtDniCliente);

        txtCorreoCliente.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreoCliente.setFont(new java.awt.Font("Bariol Bold", 0, 18)); // NOI18N
        txtCorreoCliente.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreoCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCorreoCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(255, 191, 37))); // NOI18N
        jPanel4.add(txtCorreoCliente);

        txtTelCliente.setBackground(new java.awt.Color(51, 51, 51));
        txtTelCliente.setFont(new java.awt.Font("Bariol Bold", 0, 18)); // NOI18N
        txtTelCliente.setForeground(new java.awt.Color(204, 204, 204));
        txtTelCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(255, 191, 37))); // NOI18N
        jPanel4.add(txtTelCliente);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 2, 260, 190));
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 50, 20));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new java.awt.GridLayout(2, 0, 4, 4));

        btnNuevaReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/addAmerilloReserva.png"))); // NOI18N
        btnNuevaReserva.setText("Nueva ");
        btnNuevaReserva.setColorBorde(null);
        btnNuevaReserva.setColorHover(new java.awt.Color(59, 59, 59));
        btnNuevaReserva.setColorNormal(new java.awt.Color(59, 59, 59));
        btnNuevaReserva.setColorTextHover(new java.awt.Color(0, 204, 102));
        btnNuevaReserva.setColorTextNormal(new java.awt.Color(255, 191, 37));
        btnNuevaReserva.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnNuevaReserva.setFocusable(false);
        btnNuevaReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(btnNuevaReserva);

        btnGuardarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/disketteAmarilloReserva.png"))); // NOI18N
        btnGuardarReserva.setText("Guardar ");
        btnGuardarReserva.setColorBorde(null);
        btnGuardarReserva.setColorHover(new java.awt.Color(59, 59, 59));
        btnGuardarReserva.setColorNormal(new java.awt.Color(59, 59, 59));
        btnGuardarReserva.setColorTextHover(new java.awt.Color(0, 204, 204));
        btnGuardarReserva.setColorTextNormal(new java.awt.Color(255, 191, 37));
        btnGuardarReserva.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnGuardarReserva.setFocusable(false);
        btnGuardarReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(btnGuardarReserva);

        btnEliminarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/deleteAmarilloReserva.png"))); // NOI18N
        btnEliminarReserva.setText("Eliminar");
        btnEliminarReserva.setColorBorde(null);
        btnEliminarReserva.setColorHover(new java.awt.Color(59, 59, 59));
        btnEliminarReserva.setColorNormal(new java.awt.Color(59, 59, 59));
        btnEliminarReserva.setColorTextHover(new java.awt.Color(255, 0, 0));
        btnEliminarReserva.setColorTextNormal(new java.awt.Color(255, 191, 37));
        btnEliminarReserva.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnEliminarReserva.setFocusable(false);
        btnEliminarReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jPanel2.add(btnEliminarReserva);

        btnModificarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editAmarilloReserva.png"))); // NOI18N
        btnModificarReserva.setText("  Editar");
        btnModificarReserva.setColorBorde(null);
        btnModificarReserva.setColorHover(new java.awt.Color(59, 59, 59));
        btnModificarReserva.setColorNormal(new java.awt.Color(59, 59, 59));
        btnModificarReserva.setColorTextHover(new java.awt.Color(51, 240, 155));
        btnModificarReserva.setColorTextNormal(new java.awt.Color(255, 191, 37));
        btnModificarReserva.setColorTextPressed(new java.awt.Color(0, 0, 0));
        btnModificarReserva.setFocusable(false);
        btnModificarReserva.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModificarReserva.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanel2.add(btnModificarReserva);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 260, 180));
        jPanel1.add(txtIdReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 160, 60, 20));

        comboPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personas", "1", "2", "3", "4" }));
        jPanel1.add(comboPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, 150, 40));

        comboHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Habitaciones", "1", "2", "3", "4", "5" }));
        jPanel1.add(comboHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 70, 150, 40));

        comboEstadoReserva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DISPONIBLE", "RESERVADO", "OCUPADO" }));
        jPanel1.add(comboEstadoReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 125, 150, 40));

        txtBuscador1.setBackground(new java.awt.Color(51, 51, 51));
        txtBuscador1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtBuscador1.setForeground(new java.awt.Color(255, 191, 37));
        txtBuscador1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscador1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Buscador", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(255, 191, 37))); // NOI18N
        txtBuscador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscador1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtBuscador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 240, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        tablaDatosReserva.setBackground(new java.awt.Color(51, 51, 51));
        tablaDatosReserva.setBorder(null);
        tablaDatosReserva.setFont(new java.awt.Font("Bariol Regular", 1, 18)); // NOI18N
        tablaDatosReserva.setForeground(new java.awt.Color(255, 255, 255));
        tablaDatosReserva.setModel(modeloTablaReserva);
        tablaDatosReserva.setMaximumSize(new java.awt.Dimension(10, 0));
        tablaDatosReserva.setMinimumSize(new java.awt.Dimension(10, 0));
        tablaDatosReserva.setRequestFocusEnabled(false);
        tablaDatosReserva.setRowHeight(25);
        tablaDatosReserva.setRowMargin(4);
        tablaDatosReserva.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tablaDatosReserva.setSelectionForeground(new java.awt.Color(255, 191, 37));
        tablaDatosReserva.setUpdateSelectionOnSort(false);
        tablaDatosReserva.setVerifyInputWhenFocusTarget(false);
        jScrollPane2.setViewportView(tablaDatosReserva);

        getContentPane().add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscadorActionPerformed

    private void txtBuscador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscador1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscador1ActionPerformed

    public void columnasReserva() {
        modeloTablaReserva.addColumn("Depto");
        modeloTablaReserva.addColumn("Nombre");
        modeloTablaReserva.addColumn("Desde");
        modeloTablaReserva.addColumn("Hasta");
        modeloTablaReserva.addColumn("Dias");      
        modeloTablaReserva.addColumn("Personas");
        modeloTablaReserva.addColumn("Estado");
        modeloTablaReserva.addColumn("#");
        

        TableColumn hab = tablaDatosReserva.getColumn("Depto");
        TableColumn nom = tablaDatosReserva.getColumn("Nombre");
        TableColumn desde = tablaDatosReserva.getColumn("Desde");
        TableColumn hasta = tablaDatosReserva.getColumn("Hasta");
        TableColumn dias = tablaDatosReserva.getColumn("Dias");
        TableColumn pas = tablaDatosReserva.getColumn("Personas");
        TableColumn estado = tablaDatosReserva.getColumn("Estado");
        TableColumn id = tablaDatosReserva.getColumn("#");
        
        
        estado.setMaxWidth(150);
        hab.setMaxWidth(80);
        nom.setMaxWidth(300);
        desde.setMaxWidth(250);
        hasta.setMaxWidth(250);
        dias.setMaxWidth(150);
        pas.setMaxWidth(150);        
        id.setMaxWidth(10);

    }

    private void filasColores() {

        JTableHeader header = tablaDatosReserva.getTableHeader();

        header.setBackground(new Color(255, 191, 37));
        header.setForeground(new Color(49, 49, 49));
        header.setFont(new Font("Segoi", Font.BOLD, 16));
        header.setBorder(null);
    }

    private void textPromp() {

        //TextPrompt precio = new TextPrompt("$/Dia", txtPrecioHabitacion);
        TextPrompt bus = new TextPrompt("Ingrese un nombre o apellido para buscar el cliente", txtBuscador);

        //TextPrompt seña = new TextPrompt("$/Seña", txtSeña);

        bus.changeAlpha(0.75f);
        bus.changeStyle(Font.BOLD);

        //precio.changeAlpha(1f);
        //precio.changeStyle(Font.BOLD);

        //seña.changeAlpha(1f);
        //seña.changeStyle(Font.BOLD);
    }

    private void centrarDatos() {

        DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatosReserva.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tablaDatosReserva.getColumnModel().getColumn(1).setCellRenderer(tcr);
        tablaDatosReserva.getColumnModel().getColumn(2).setCellRenderer(tcr);
        tablaDatosReserva.getColumnModel().getColumn(3).setCellRenderer(tcr);
        tablaDatosReserva.getColumnModel().getColumn(4).setCellRenderer(tcr);
        tablaDatosReserva.getColumnModel().getColumn(5).setCellRenderer(tcr);
        tablaDatosReserva.getColumnModel().getColumn(6).setCellRenderer(tcr);
      
        

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser Cdesde;
    public com.toedter.calendar.JDateChooser Chasta;
    private javax.swing.JPanel LaminaFondo;
    public rsbuttom.RSButtonMetro btnEliminarReserva;
    public rsbuttom.RSButtonMetro btnGuardarReserva;
    public rsbuttom.RSButtonMetro btnModificarReserva;
    public rsbuttom.RSButtonMetro btnNuevaReserva;
    public javax.swing.JComboBox<String> comboEstadoReserva;
    public javax.swing.JComboBox<String> comboHabitaciones;
    public javax.swing.JComboBox<String> comboPersonas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    public javax.swing.JTable tablaDatosReserva;
    public javax.swing.JTextField txtBuscador;
    public javax.swing.JTextField txtBuscador1;
    public javax.swing.JTextField txtCorreoCliente;
    public javax.swing.JTextField txtDniCliente;
    public javax.swing.JTextField txtIdCliente;
    public javax.swing.JTextField txtIdReserva;
    public javax.swing.JTextField txtNombreCliente;
    public javax.swing.JTextField txtTelCliente;
    // End of variables declaration//GEN-END:variables

}
