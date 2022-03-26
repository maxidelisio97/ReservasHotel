package vista;


import controlador.Controlador;



public class Vista extends javax.swing.JFrame {

    
    public Vista() {
        initComponents();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        laminaBotonesUp = new javax.swing.JPanel();
        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnReserva = new rsbuttom.RSButtonMetro();
        btnCliente = new rsbuttom.RSButtonMetro();
        btnDisponibilidad = new rsbuttom.RSButtonMetro();
        btnHabitacion = new rsbuttom.RSButtonMetro();
        btnPagos = new rsbuttom.RSButtonMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new java.awt.BorderLayout());

        laminaBotonesUp.setLayout(new java.awt.BorderLayout());

        escritorio.setBackground(new java.awt.Color(51, 51, 51));
        escritorio.setPreferredSize(new java.awt.Dimension(1378, 800));
        escritorio.setLayout(new java.awt.BorderLayout());
        laminaBotonesUp.add(escritorio, java.awt.BorderLayout.CENTER);

        jPanel1.setBackground(new java.awt.Color(14, 22, 33));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/homeVioletaReserva.png"))); // NOI18N
        btnReserva.setText("Reservas");
        btnReserva.setBorderPainted(false);
        btnReserva.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnReserva.setColorHover(new java.awt.Color(36, 47, 61));
        btnReserva.setColorNormal(new java.awt.Color(14, 22, 33));
        btnReserva.setColorPressed(new java.awt.Color(54, 38, 87));
        btnReserva.setColorTextHover(new java.awt.Color(204, 204, 0));
        btnReserva.setColorTextPressed(new java.awt.Color(204, 204, 0));
        btnReserva.setFocusable(false);
        btnReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservaActionPerformed(evt);
            }
        });
        jPanel1.add(btnReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 0, 200, 80));

        btnCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clientePrincipalVioleta.png"))); // NOI18N
        btnCliente.setText("Cliente");
        btnCliente.setBorderPainted(false);
        btnCliente.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnCliente.setColorHover(new java.awt.Color(36, 47, 61));
        btnCliente.setColorNormal(new java.awt.Color(14, 22, 33));
        btnCliente.setColorPressed(new java.awt.Color(54, 38, 87));
        btnCliente.setColorTextHover(new java.awt.Color(0, 204, 102));
        btnCliente.setColorTextPressed(new java.awt.Color(0, 204, 102));
        btnCliente.setFocusable(false);
        jPanel1.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 80, 200, 82));

        btnDisponibilidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/calendar_year.png"))); // NOI18N
        btnDisponibilidad.setText("Calendario");
        btnDisponibilidad.setBorderPainted(false);
        btnDisponibilidad.setColorBorde(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        btnDisponibilidad.setColorHover(new java.awt.Color(36, 47, 61));
        btnDisponibilidad.setColorNormal(new java.awt.Color(14, 22, 33));
        btnDisponibilidad.setColorPressed(new java.awt.Color(50, 37, 54));
        btnDisponibilidad.setColorTextHover(new java.awt.Color(255, 0, 153));
        btnDisponibilidad.setColorTextPressed(new java.awt.Color(204, 0, 204));
        btnDisponibilidad.setFocusable(false);
        jPanel1.add(btnDisponibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 160, 200, 82));

        btnHabitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/habitacion.png"))); // NOI18N
        btnHabitacion.setText("Habitacion");
        btnHabitacion.setBorderPainted(false);
        btnHabitacion.setColorHover(new java.awt.Color(36, 47, 61));
        btnHabitacion.setColorNormal(new java.awt.Color(14, 22, 33));
        btnHabitacion.setColorPressed(new java.awt.Color(50, 37, 54));
        btnHabitacion.setColorTextHover(new java.awt.Color(0, 255, 153));
        btnHabitacion.setColorTextPressed(new java.awt.Color(204, 0, 204));
        btnHabitacion.setDefaultCapable(false);
        btnHabitacion.setFocusPainted(false);
        jPanel1.add(btnHabitacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 240, 200, 80));

        btnPagos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/pagos.png"))); // NOI18N
        btnPagos.setText("    Pagos");
        btnPagos.setColorHover(new java.awt.Color(36, 47, 61));
        btnPagos.setColorNormal(new java.awt.Color(14, 22, 33));
        btnPagos.setColorPressed(new java.awt.Color(50, 37, 54));
        btnPagos.setColorTextHover(new java.awt.Color(0, 204, 204));
        jPanel1.add(btnPagos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 200, 90));

        laminaBotonesUp.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.add(laminaBotonesUp, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservaActionPerformed

    private IFrameReserva ifr = new IFrameReserva();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public rsbuttom.RSButtonMetro btnCliente;
    public rsbuttom.RSButtonMetro btnDisponibilidad;
    public rsbuttom.RSButtonMetro btnHabitacion;
    public rsbuttom.RSButtonMetro btnPagos;
    public rsbuttom.RSButtonMetro btnReserva;
    public javax.swing.JDesktopPane escritorio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel laminaBotonesUp;
    // End of variables declaration//GEN-END:variables

}
