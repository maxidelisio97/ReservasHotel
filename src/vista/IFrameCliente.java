/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.ConsultasSQL;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

/**
 *
 * @author ferc
 */
public class IFrameCliente extends javax.swing.JInternalFrame {

    public DefaultTableModel modeloTablaCliente = new DefaultTableModel();
    

    public IFrameCliente() {
        initComponents();
        
        columnasTablaCliente();
        
        filasColores();
        
        txtID.setVisible(false);
        
        cetrarDatos();
        
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);

    }

    //MODELO COLUMNAS
    private void columnasTablaCliente() {
        modeloTablaCliente.addColumn("Id");
        modeloTablaCliente.addColumn("Nombre");
        modeloTablaCliente.addColumn("Correo");
        modeloTablaCliente.addColumn("Telefono");
        modeloTablaCliente.addColumn("Dni");

        TableColumn id = tablaDatosCliente.getColumn("Id");
        TableColumn nom = tablaDatosCliente.getColumn("Nombre");
        TableColumn correo = tablaDatosCliente.getColumn("Correo");
        TableColumn tel = tablaDatosCliente.getColumn("Telefono");
        TableColumn dni = tablaDatosCliente.getColumn("Dni");
       
        id.setMaxWidth(50);
        nom.setMaxWidth(400);
        correo.setMaxWidth(350);
        tel.setMaxWidth(150);
        dni.setMaxWidth(250);


    }
    
   

    private void filasColores() {

        JTableHeader header = tablaDatosCliente.getTableHeader();

        header.setBackground(new Color(0, 204, 102));
        header.setForeground(new Color(55, 55, 55));
        header.setFont(new Font("Segoi", Font.BOLD, 16));
        header.setBorder(null);
    }
    
    private void cetrarDatos(){
         DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
        tcr.setHorizontalAlignment(SwingConstants.CENTER);
        tablaDatosCliente.getColumnModel().getColumn(0).setCellRenderer(tcr);
        tablaDatosCliente.getColumnModel().getColumn(1).setCellRenderer(tcr);
        //tablaDatosCliente.getColumnModel().getColumn(2).setCellRenderer(tcr);
        tablaDatosCliente.getColumnModel().getColumn(3).setCellRenderer(tcr);
        tablaDatosCliente.getColumnModel().getColumn(4).setCellRenderer(tcr);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatosCliente = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnGuardarCliente = new rsbuttom.RSButtonMetro();
        btnModificar = new rsbuttom.RSButtonMetro();
        btnDeleteCliente = new rsbuttom.RSButtonMetro();
        btnLimpiar = new rsbuttom.RSButtonMetro();
        rSButtonMetro2 = new rsbuttom.RSButtonMetro();
        txtID = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();

        setBorder(null);

        tablaDatosCliente.setBackground(new java.awt.Color(51, 51, 51));
        tablaDatosCliente.setFont(new java.awt.Font("Bariol Regular", 1, 18)); // NOI18N
        tablaDatosCliente.setForeground(new java.awt.Color(255, 255, 255));
        tablaDatosCliente.setModel(modeloTablaCliente);
        tablaDatosCliente.setGridColor(new java.awt.Color(204, 204, 204));
        tablaDatosCliente.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tablaDatosCliente.setRequestFocusEnabled(false);
        tablaDatosCliente.setRowHeight(25);
        tablaDatosCliente.setSelectionBackground(new java.awt.Color(51, 51, 51));
        tablaDatosCliente.setSelectionForeground(new java.awt.Color(0, 204, 204));
        tablaDatosCliente.setShowGrid(true);
        jScrollPane1.setViewportView(tablaDatosCliente);
        tablaDatosCliente.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        btnGuardarCliente.setText("Insertar");
        btnGuardarCliente.setColorBorde(null);
        btnGuardarCliente.setColorHover(new java.awt.Color(23, 96, 190));
        btnGuardarCliente.setColorNormal(new java.awt.Color(0, 204, 102));
        btnGuardarCliente.setColorPressed(new java.awt.Color(23, 96, 190));
        btnGuardarCliente.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnGuardarCliente.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jPanel2.add(btnGuardarCliente);

        btnModificar.setText("Modificar");
        btnModificar.setColorBorde(null);
        btnModificar.setColorHover(new java.awt.Color(255, 255, 102));
        btnModificar.setColorNormal(new java.awt.Color(0, 204, 102));
        btnModificar.setColorPressed(new java.awt.Color(255, 255, 102));
        btnModificar.setColorTextHover(new java.awt.Color(51, 51, 51));
        btnModificar.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnModificar.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jPanel2.add(btnModificar);

        btnDeleteCliente.setText("Eliminar");
        btnDeleteCliente.setColorBorde(null);
        btnDeleteCliente.setColorHover(new java.awt.Color(255, 51, 51));
        btnDeleteCliente.setColorNormal(new java.awt.Color(0, 204, 102));
        btnDeleteCliente.setColorPressed(new java.awt.Color(255, 51, 51));
        btnDeleteCliente.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnDeleteCliente.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jPanel2.add(btnDeleteCliente);

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.setColorBorde(null);
        btnLimpiar.setColorHover(new java.awt.Color(90, 46, 141));
        btnLimpiar.setColorNormal(new java.awt.Color(0, 204, 102));
        btnLimpiar.setColorPressed(new java.awt.Color(90, 46, 141));
        btnLimpiar.setColorTextNormal(new java.awt.Color(51, 51, 51));
        btnLimpiar.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jPanel2.add(btnLimpiar);

        rSButtonMetro2.setText("Salir");
        rSButtonMetro2.setColorBorde(null);
        rSButtonMetro2.setColorHover(new java.awt.Color(255, 153, 0));
        rSButtonMetro2.setColorNormal(new java.awt.Color(0, 204, 102));
        rSButtonMetro2.setColorPressed(new java.awt.Color(255, 153, 0));
        rSButtonMetro2.setColorTextNormal(new java.awt.Color(51, 51, 51));
        rSButtonMetro2.setFont(new java.awt.Font("Decker", 1, 18)); // NOI18N
        jPanel2.add(rSButtonMetro2);
        jPanel2.add(txtID);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(4, 0));

        txtNombre.setBackground(new java.awt.Color(51, 51, 51));
        txtNombre.setFont(new java.awt.Font("Bariol Light", 1, 18)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(0, 255, 102))); // NOI18N
        jPanel3.add(txtNombre);

        txtCorreo.setBackground(new java.awt.Color(51, 51, 51));
        txtCorreo.setFont(new java.awt.Font("Bariol Light", 1, 18)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(0, 255, 102))); // NOI18N
        jPanel3.add(txtCorreo);

        txtTel.setBackground(new java.awt.Color(51, 51, 51));
        txtTel.setFont(new java.awt.Font("Bariol Light", 1, 18)); // NOI18N
        txtTel.setForeground(new java.awt.Color(204, 204, 204));
        txtTel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(0, 255, 102))); // NOI18N
        jPanel3.add(txtTel);

        txtDNI.setBackground(new java.awt.Color(51, 51, 51));
        txtDNI.setFont(new java.awt.Font("Bariol Light", 1, 18)); // NOI18N
        txtDNI.setForeground(new java.awt.Color(204, 204, 204));
        txtDNI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDNI.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Dni", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bariol Regular", 1, 14), new java.awt.Color(0, 255, 102))); // NOI18N
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });
        jPanel3.add(txtDNI);

        jPanel1.add(jPanel3, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIActionPerformed

    //LIMPIAR TABLA
    public void limpiarTabla() {
        int filas = modeloTablaCliente.getRowCount();

        if (filas > 0) {
            for (int i = filas - 1; i >= 0; i--) {
                modeloTablaCliente.removeRow(i);
            }
        }

    }

    private ConsultasSQL bd;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rsbuttom.RSButtonMetro btnDeleteCliente;
    public rsbuttom.RSButtonMetro btnGuardarCliente;
    public rsbuttom.RSButtonMetro btnLimpiar;
    public rsbuttom.RSButtonMetro btnModificar;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public rsbuttom.RSButtonMetro rSButtonMetro2;
    public javax.swing.JTable tablaDatosCliente;
    public javax.swing.JTextField txtCorreo;
    public javax.swing.JTextField txtDNI;
    public javax.swing.JTextField txtID;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
