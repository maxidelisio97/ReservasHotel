package controlador;

import Modelo.Cliente;
import Modelo.ConsultasSQL;
import Modelo.Habitacion;
import Modelo.Pago;
import Modelo.Reserva;
import com.toedter.calendar.JDateChooser;
import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import vista.IFrameCalendario;
import vista.IFrameCliente;
import vista.IFrameHabitacion;
import vista.IFramePago;
import vista.IFrameReserva;
import Modelo.PagoInner;

import vista.Vista;

public class Controlador {

    private IFrameReserva ifr;
    private IFrameCliente ifc;
    private IFramePago ifp;
    private IFrameHabitacion ifh;
    private IFrameCalendario ifv;
    private Vista v;
    private ConsultasSQL bd;

    private DefaultTableModel modeloTablaReserva = new DefaultTableModel();
    private DefaultTableModel modeloTablaClientes = new DefaultTableModel();

    public Controlador() {
    }

    //CONTROLADOR VISTA
    public Controlador(Vista v, ConsultasSQL bd) {
        ifh = new IFrameHabitacion();
        ifc = new IFrameCliente();
        ifr = new IFrameReserva();
        ifv = new IFrameCalendario();
        ifp = new IFramePago();
        this.bd = bd;
        this.v = v;
        getReserva();
        getClientes();
        getHabitacion();
        getPagos();
        cargarModeloClientes();
        cargarModeloHabitaciones();
        
        ifp.jScrollPane1.setViewportView(ifp.tablaDatosPagos);

        //LISTENER DE MODIFICAR CLIENTE
        this.ifc.btnModificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                System.out.println("hola");

            }
        });

        this.ifp.comboBoxCliente.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent k) {

                getReservaPorCriterio(k);

            }

        });

        //LISTENER TABLA CLIENTE 
        this.ifc.tablaDatosCliente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent m) {
                seleccionRowCliente(m);
            }

        });

        //LISTENER TABLA HABITACION        
        this.ifh.tablaHabitaciones.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent m) {
                seleccionRowHabitacion(m);
            }

        });

        //LISTENER FRAM PAGOS
        this.v.btnPagos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                abrirFramePagos(e);

            }

        });

        //LISTENER FRAME HABITACION
        this.v.btnHabitacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFrameHabitacion(e);
            }
        });

        //LISTENER FRAME CLIENTE
        this.v.btnCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFrameCliente(e);
            }

        });
        //LISTENER FRAME RESERVA
        this.v.btnReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abrirFrameReserva(e);
            }
        });
        //LISTENER FRAM CALENDARIO
        this.v.btnDisponibilidad.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                abrirFrameCalendario(e);

            }

        });

        //LISTENER GUARDAR CLIENTE
        this.ifc.btnGuardarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarCliente(e);
            }

        });
        //LISTENER LIMPIAR CAMPOS CLIENTE
        this.ifc.btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos(e);
            }

        });
        //LISTENER BUSCADOR DE CLIENTE EN RESERVA
        this.ifr.txtBuscador.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent e) {

                getClientePorCriterio(e);
            }

        });
        //LISTENER GUARDAR RESERVA
        this.ifr.btnGuardarReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                insertarReserva(e);
            }
        });
        //LISTENER MODIFICAR RESERVA
        this.ifr.btnModificarReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                modificarReserva(e);
            }

        });
        //LISTENER DE ELIMINAR CLIENTE
        this.ifc.btnDeleteCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                eliminarCliente(e);
            }

        });
        //LISTENER NUEVA RESERVA
        this.ifr.btnNuevaReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                limpiarCamposReserva(e);

            }

        });
        //LISTENER ELIMINAR RESERVA
        this.ifr.btnEliminarReserva.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                borrarReserva(e);

            }

        });
        //LISTETENER DE TABLA RESERVA
        this.ifr.tablaDatosReserva.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent m) {
                seleccionRowReserva(m);
            }

        });

        this.ifv.btnDisponible.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                getFechasDisponibilidad(e);
            }
        });
        //HABITACION --------> LISTENER GUARAR HABITACION
        this.ifh.btnGuardarHabitacion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                guardarHabitacion(e);
            }

        });

        this.ifh.btnModificarHabitacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                editarHabitacion(e);

            }
        });

        this.ifp.btnPago.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                insertarPago(e);

            }

        });
            ifp.tablaDatosPagos.setModel(ifp.modeloTablaPagos);
          this.ifp.tablaDatosPagos.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent l) {
               
                
                seleccionRowPago(l);
                
            }
              
              
              
          });

        

    }
///////////////////////////////////////////////////////////////////////////////////////////
    //FRAME CLIENTE

    private void abrirFrameCliente(ActionEvent e) {

        v.escritorio.removeAll();
        v.escritorio.repaint();
        v.escritorio.add(BorderLayout.CENTER, this.ifc);
        v.escritorio.getDesktopManager().maximizeFrame(ifc);
        this.ifc.show();
        getClientes();

    }

    private void abrirFrameHabitacion(ActionEvent e) {
        v.escritorio.removeAll();
        v.escritorio.repaint();
        v.escritorio.add(BorderLayout.CENTER, this.ifh);
        v.escritorio.getDesktopManager().maximizeFrame(ifh);
        this.ifh.show();
        getHabitacion();

    }

    //FRAME RESERVA
    private void abrirFrameReserva(ActionEvent e) {

        v.escritorio.removeAll();
        v.escritorio.repaint();
        v.escritorio.add(BorderLayout.CENTER, this.ifr);
        v.escritorio.getDesktopManager().maximizeFrame(ifr);

        this.ifr.show();

    }

    //FRAME CALENDARIO
    private void abrirFrameCalendario(ActionEvent e) {
        v.escritorio.removeAll();
        v.escritorio.repaint();
        v.escritorio.add(BorderLayout.CENTER, this.ifv);
        v.escritorio.getDesktopManager().maximizeFrame(ifv);
        this.ifv.show();
    }

    private void abrirFramePagos(ActionEvent e) {
        v.escritorio.removeAll();
        v.escritorio.repaint();
        v.escritorio.add(BorderLayout.CENTER, this.ifp);
        v.escritorio.getDesktopManager().maximizeFrame(ifp);
        this.ifp.show();
    }

    private void cargarModeloClientes() {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        listaCliente = bd.getClientesbd();

        for (Cliente c : listaCliente) {
            ifp.modeloComboCliente.addElement(c);
        }

    }

    private void cargarModeloHabitaciones() {
        ArrayList<Habitacion> listaHabitacion = new ArrayList<Habitacion>();
        listaHabitacion = bd.getHabitacionSQL();

        for (Habitacion h : listaHabitacion) {
            ifp.modeloComboHabitaciones.addElement(h);
        }

    }

    private void getFechasDisponibilidad(ActionEvent m) {

        String fDesde = ((JTextField) this.ifv.dateDesde.getDateEditor().getUiComponent()).getText();
        String fHasta = ((JTextField) this.ifv.dateHasta.getDateEditor().getUiComponent()).getText();

        ArrayList<Reserva> listaReservas = bd.getFechas(fDesde, fHasta);
        ifv.modeloTablaDisponibilidad.setNumRows(listaReservas.size());

        for (int i = 0; i < listaReservas.size(); i++) {

            Reserva r = listaReservas.get(i);
            int id = r.getId_habitacion();
            String Fd = r.getFecha_desde();
            String Fh = r.getFecha_hasta();
            String estado = r.getEstadoReserva();

            ifv.modeloTablaDisponibilidad.setValueAt(id, i, 0);
            ifv.modeloTablaDisponibilidad.setValueAt(Fd, i, 1);
            ifv.modeloTablaDisponibilidad.setValueAt(Fh, i, 2);
            ifv.modeloTablaDisponibilidad.setValueAt(estado, i, 3);

        }

    }

    //GUARDAR CLIENTE
    private void guardarCliente(ActionEvent e) {

        try {

            String nom = this.ifc.txtNombre.getText().toUpperCase();
            String tel = this.ifc.txtTel.getText().toUpperCase();
            String dni = this.ifc.txtDNI.getText().toUpperCase();
            String correo = this.ifc.txtCorreo.getText().toUpperCase();

            Cliente cliente = new Cliente(nom, tel, correo, dni);

            this.bd.insertCliente(cliente);

            JOptionPane.showMessageDialog(null, "Se ha insertado un cliente");

            getClientes();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Falta completar un dato");
        }

    }

    //MODIFICAR CLIENTE    
    private void modificarCliente(ActionEvent e) {

        try {

            int id = Integer.parseInt(this.ifc.txtID.getText());
            String nom = this.ifc.txtNombre.getText().toUpperCase();
            String tel = this.ifc.txtTel.getText().toUpperCase();
            String dni = this.ifc.txtDNI.getText().toUpperCase();
            String correo = this.ifc.txtCorreo.getText().toUpperCase();

            Cliente cliente = new Cliente(id, nom, tel, correo, dni);

            this.bd.modificarCliente(cliente);

            JOptionPane.showMessageDialog(null, "Se ha modificado un cliente");

            getClientes();

        } catch (HeadlessException ex) {
            ex.printStackTrace();
        }
    }

    private void borrarReserva(ActionEvent e) {

        int id = Integer.parseInt(ifr.txtIdReserva.getText());

        int c = JOptionPane.showConfirmDialog(null, "Desea eliminar una reserva?");

        if (c == JOptionPane.YES_OPTION) {
            bd.borrarReserva(id);
        }

        limpiarTabla();

        getReserva();

    }

    //MODIFICAR RESERVA
    private void modificarReserva(ActionEvent e) {

        try {

            String fDesde = ((JTextField) this.ifr.Cdesde.getDateEditor().getUiComponent()).getText();
            String fHasta = ((JTextField) this.ifr.Chasta.getDateEditor().getUiComponent()).getText();
            int idHabitacion = ifr.comboHabitaciones.getSelectedIndex();
            //Double seña = Double.parseDouble(this.ifr.txtSeña.getText());
            String estado = this.ifr.comboEstadoReserva.getSelectedItem().toString();
            int cantPersonas = this.ifr.comboPersonas.getSelectedIndex();
            int idReserva = Integer.parseInt(ifr.txtIdReserva.getText());

            //Double precio = Double.parseDouble(this.ifr.txtPrecioHabitacion.getText());
            //int totalDias = calcularDias(ifr.Cdesde, ifr.Chasta);
            //Double precioFinal = Double.valueOf(totalDias * precio);
            //Double saldo = Double.valueOf(precioFinal - seña);
//            Reserva reserva = new Reserva(idReserva, fDesde, fHasta, cantPersonas, estado, idHabitacion);
            //  this.bd.modificarReserva(reserva);
            limpiarTabla();

            getReserva();

        } catch (HeadlessException ex) {
            ex.printStackTrace();
        }
    }

    //OBTENER CLIENTE POR CRITERIO
    private void getClientePorCriterio(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_ENTER) {

            String nombre = ifr.txtBuscador.getText();

            ArrayList<Cliente> cliente = bd.getClientePorCliente(nombre);

            for (int i = 0; i < cliente.size(); i++) {

                Cliente c = cliente.get(i);
                int id = c.getId_cliente();
                String nom = c.getNom_cliente();
                String tel = c.getTel_cliente();
                String cor = c.getCorreo_cliente();
                String dni = c.getDni_cliente();

                ifr.txtIdCliente.setText(String.valueOf(id));
                ifr.txtNombreCliente.setText(nom);
                ifr.txtTelCliente.setText(tel);
                ifr.txtCorreoCliente.setText(cor);
                ifr.txtDniCliente.setText(dni);

            }
        }
    }

    //LIMPIA LOS CAMPOS
    private void limpiarCampos(ActionEvent e) {

        ifc.txtNombre.setText("");
        ifc.txtCorreo.setText("");
        ifc.txtDNI.setText("");
        ifc.txtTel.setText("");
    }

    //ELIMINAR UN CLIENTE
    private void eliminarCliente(ActionEvent e) {

        int id = Integer.parseInt(ifc.txtID.getText());

        int c = JOptionPane.showConfirmDialog(null, "Desea eliminar un cliente?");

        if (c == JOptionPane.YES_OPTION) {
            bd.borrarCliente(id);
        }

        getClientes();

    }

    //OBTENER DATOS DE LA TABLA CLIENTE
    private void seleccionRowCliente(MouseEvent m) {

        int seleccion = ifc.tablaDatosCliente.rowAtPoint(m.getPoint());
        ifc.txtID.setText(String.valueOf(ifc.tablaDatosCliente.getValueAt(seleccion, 0)));
        ifc.txtNombre.setText(String.valueOf(ifc.tablaDatosCliente.getValueAt(seleccion, 1)));
        ifc.txtCorreo.setText(String.valueOf(ifc.tablaDatosCliente.getValueAt(seleccion, 2)));
        ifc.txtTel.setText(String.valueOf(ifc.tablaDatosCliente.getValueAt(seleccion, 3)));
        ifc.txtDNI.setText(String.valueOf(ifc.tablaDatosCliente.getValueAt(seleccion, 4)));

    }

    private void seleccionRowPago(ListSelectionEvent m) {

        if (!m.getValueIsAdjusting() && (ifp.tablaDatosPagos.getSelectedRow() >= 0)) {
            
            SimpleDateFormat formatoDelTexto2 = new SimpleDateFormat("yyyy-MM-dd");
            
            

            PagoInner pago = (PagoInner) ifp.modeloTablaPagos.getValueAt(ifp.tablaDatosPagos.getSelectedRow(), 1);

            ifp.txtSeña.setText(String.valueOf(pago.getSeña()));
            ifp.txtSaldo.setText(String.valueOf(pago.getSaldo()));
            ifp.comboEstadoPago.setSelectedItem(ifp.tablaDatosPagos.getValueAt(ifp.tablaDatosPagos.getSelectedRow(), 5).toString());
            String fechaPago = pago.getFecha();
            Date dato=null;
            try {
                dato = formatoDelTexto2.parse(fechaPago);
            } catch (ParseException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            ifp.dateFechaPago.setDate(dato);
         

        }

    }

    //OBTIENE DATOS DE LA TABLA RESERVA
    private void seleccionRowReserva(MouseEvent m) {

        try {

            int seleccion = ifr.tablaDatosReserva.rowAtPoint(m.getPoint());
            //LE DA UN FORMATO

            SimpleDateFormat formatoDelTexto1 = new SimpleDateFormat("yyyy-MM-dd");
            SimpleDateFormat formatoDelTexto2 = new SimpleDateFormat("yyyy-MM-dd");
            //OBTIENE LA FILA SELECCIONADA
            String fecha1 = ifr.tablaDatosReserva.getValueAt(ifr.tablaDatosReserva.getSelectedRow(), 2).toString().trim();
            String fecha2 = ifr.tablaDatosReserva.getValueAt(ifr.tablaDatosReserva.getSelectedRow(), 3).toString().trim();
            //DECLARA UN DATE NULO
            Date dato1 = null;
            Date dato2 = null;
            //CONVIERTE EL STRING OBTENIDO EN DATE
            dato1 = formatoDelTexto1.parse(fecha1);
            dato2 = formatoDelTexto2.parse(fecha2);
            //LO ESTABLECE EN EL JDateChooser
            ifr.Cdesde.setDate(dato1);
            ifr.Chasta.setDate(dato2);
            //OBTIENE LOS DATOS DE LA TABLA
            //ifr.txtSeña.setText(String.valueOf(ifr.tablaDatosReserva.getValueAt(seleccion, 5)));
            String cantidadPersonas = ifr.tablaDatosReserva.getValueAt(ifr.tablaDatosReserva.getSelectedRow(), 5).toString();
            //LOS ESTABLECE EN EL COMBOBOX
            ifr.comboPersonas.setSelectedItem(cantidadPersonas);
            String numeroHabitacion = ifr.tablaDatosReserva.getValueAt(ifr.tablaDatosReserva.getSelectedRow(), 0).toString();
            ifr.comboHabitaciones.setSelectedItem(numeroHabitacion);
            ifr.comboHabitaciones.setSelectedItem(ifr.tablaDatosReserva.getValueAt(seleccion, 1));

            ifr.txtIdReserva.setText(String.valueOf(ifr.tablaDatosReserva.getValueAt(seleccion, 7)));
            //ifr.txtPrecioHabitacion.setText(String.valueOf(ifr.tablaDatosReserva.getValueAt(seleccion, 8)));
            String estadoReserva = ifr.tablaDatosReserva.getValueAt(ifr.tablaDatosReserva.getSelectedRow(), 6).toString();
            //LOS ESTABLECE EN EL COMBOBOX
            ifr.comboEstadoReserva.setSelectedItem(estadoReserva);
            // ifr.comboEstadoReserva.setSelectedItem(ifr.tablaDatosReserva.getValueAt(seleccion, 6));
            //ifr.txtPrecioHabitacion.setEditable(false);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }

    }

    public void limpiarCamposReserva(ActionEvent e) {

        ifr.txtBuscador.setText("");
        ifr.txtCorreoCliente.setText("");
        ifr.txtDniCliente.setText("");
        ifr.txtNombreCliente.setText("");
        // ifr.txtPrecioHabitacion.setText("");
        //ifr.txtSeña.setText("");
        ifr.txtTelCliente.setText("");
        //ifr.txtPrecioHabitacion.setEditable(true);
        ifr.Cdesde.setDate(null);
        ifr.Chasta.setDate(null);
        ifr.comboPersonas.setSelectedIndex(0);
        ifr.comboHabitaciones.setSelectedIndex(0);
    }

    //OBTIENE LOS CLIENTES DE LA BASE DE DATOS          
    public void getClientes() {

        ArrayList<Cliente> clientes = bd.getClientesbd();

        int cantidadColumnas = clientes.size();
        ifc.modeloTablaCliente.setNumRows(cantidadColumnas);

        for (int i = 0; i < cantidadColumnas; i++) {

            Cliente c = clientes.get(i);
            int id = c.getId_cliente();
            String nombre = c.getNom_cliente();
            String tel = c.getTel_cliente();
            String dni = c.getDni_cliente();
            String correo = c.getCorreo_cliente();

            ifc.modeloTablaCliente.setValueAt(id, i, 0);
            ifc.modeloTablaCliente.setValueAt(c, i, 1);
            ifc.modeloTablaCliente.setValueAt(tel, i, 2);
            ifc.modeloTablaCliente.setValueAt(correo, i, 3);
            ifc.modeloTablaCliente.setValueAt(dni, i, 4);

            //ifc.tablaDatosCliente.setModel(ifc.modeloTablaCliente);
        }
    }

    /*
    
    ----------------------------RESERVA---------------------------------
    
    
     */
    private void insertarReserva(ActionEvent e) {

        try {

            String fDesde = ((JTextField) this.ifr.Cdesde.getDateEditor().getUiComponent()).getText();
            String fHasta = ((JTextField) this.ifr.Chasta.getDateEditor().getUiComponent()).getText();
            //Double precio = Double.parseDouble(this.ifr.txtPrecioHabitacion.getText());
            int personas = this.ifr.comboPersonas.getSelectedIndex();
            int idc = Integer.parseInt(this.ifr.txtIdCliente.getText());
            int idh = this.ifr.comboHabitaciones.getSelectedIndex();
            String estado = this.ifr.comboEstadoReserva.getSelectedItem().toString();
            int totalDias = calcularDias(ifr.Cdesde, ifr.Chasta);
            /*Double seña;

            if (this.ifr.txtSeña.getText().isEmpty()) {
                seña = 0.0;
            } else {
                seña = Double.parseDouble(this.ifr.txtSeña.getText());
            }

            Double precioFinal = Double.valueOf(totalDias * precio);
            Double saldo = Double.valueOf(precioFinal - seña);*/

            Reserva reserva = new Reserva(idh, idc, fDesde, fHasta, personas, estado, totalDias);

            this.bd.insertReserva(reserva);

            JOptionPane.showMessageDialog(null, "Se ha insertado una reserva");

            limpiarTabla();

            getReserva();

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Falta completar un dato");

        }

    }

    private void insertarPago(ActionEvent e) {

        try {

            Cliente cliente = (Cliente) ifp.comboBoxCliente.getSelectedItem();
            Habitacion habitacion = (Habitacion) ifp.comboBoxHabitaciones.getSelectedItem();
            Double precio = Double.parseDouble(this.ifp.txtPrecioHabitacion.getText());
            String fechaPago = ((JTextField) this.ifp.dateFechaPago.getDateEditor().getUiComponent()).getText();
            String estado = this.ifp.comboEstadoPago.getSelectedItem().toString();
            int cantDias = Integer.parseInt(this.ifp.txtCantidadDias.getText());
            int idReserva = Integer.parseInt(this.ifp.txtIdReserva.getText());
            Double seña;

            if (this.ifp.txtSeña.getText().isEmpty()) {
                seña = 0.0;
            } else {
                seña = Double.parseDouble(this.ifp.txtSeña.getText());
            }

            Double precioFinal = Double.valueOf(cantDias * precio);
            Double saldo = Double.valueOf(precioFinal - seña);

            Pago pago = new Pago(precio, seña, saldo, precioFinal, estado, fechaPago, habitacion.getId_habitacion(), idReserva, cliente.getId_cliente());

            this.bd.insertPagoSQL(pago);

            JOptionPane.showMessageDialog(null, "Se ha insertado un pago");

            limpiarTablaPagos();

            getPagos();

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

//OBTIENE LA RESERVA DE LA BASE DE DATOS
    private void getReserva() {

        ResultSet rs = bd.getReserva();

        try {
            ResultSetMetaData rsm = rs.getMetaData();

            int numColumnas = rsm.getColumnCount();

            while (rs.next()) {

                Object[] fila = new Object[numColumnas];

                for (int i = 0; i < numColumnas; i++) {

                    fila[0] = rs.getObject(1);
                    fila[1] = rs.getObject(2);
                    fila[2] = rs.getObject(3);
                    fila[3] = rs.getObject(4);
                    fila[4] = rs.getObject(5);
                    fila[5] = rs.getObject(6);
                    fila[6] = rs.getObject(7);
                    fila[7] = rs.getObject(8);

                }
                ifr.modeloTablaReserva.addRow(fila);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

   
     private void getPagos() {

        ArrayList<PagoInner> pagoInner = bd.getPagosSQL();
        int numeroProducto = pagoInner.size();
        ifp.modeloTablaPagos.setNumRows(numeroProducto);

        for (int i = 0; i < numeroProducto; i++) {

            PagoInner pago = pagoInner.get(i);
            String numHab = pago.getNum_habitacion();
            String nomCliente = pago.getNom_cliente();
            Double seña = pago.getSeña();
            Double saldo = pago.getSaldo();
            Double precioTotal = pago.getpFinal();
            String estado = pago.getEstado_pago();
            int idPago = pago.getId_pago();

            ifp.modeloTablaPagos.setValueAt(numHab, i, 0);
            ifp.modeloTablaPagos.setValueAt(pago, i, 1);            
            ifp.modeloTablaPagos.setValueAt(seña, i, 2);
            ifp.modeloTablaPagos.setValueAt(saldo, i, 3);
            ifp.modeloTablaPagos.setValueAt(precioTotal, i, 4);
            ifp.modeloTablaPagos.setValueAt(estado, i, 5);
            ifp.modeloTablaPagos.setValueAt(idPago, i, 6);

        }

    }

    public void limpiarTabla() {
        int filas = ifr.modeloTablaReserva.getRowCount();

        if (filas > 0) {
            for (int i = filas - 1; i >= 0; i--) {
                ifr.modeloTablaReserva.removeRow(i);
            }
        }

    }

    public void limpiarTablaPagos() {
        int filas = ifp.modeloTablaPagos.getRowCount();

        if (filas > 0) {
            for (int i = filas - 1; i >= 0; i--) {
                ifp.modeloTablaPagos.removeRow(i);
            }
        }

    }

    //CALCULAR DIAS 
    public int calcularDias(JDateChooser Cdesde, JDateChooser Chasta) {

        if (Cdesde.getDate() != null && Chasta.getDate() != null) {
            Calendar inicio = Cdesde.getCalendar();
            Calendar termino = Chasta.getCalendar();
            int dias = 0;

            while (inicio.before(termino) || inicio.equals(termino)) {
                dias++;
                inicio.add(Calendar.DATE, 1);
            }

            return dias - 1;
        } else {
            System.out.println("seleccione la fecha");
        }
        return 0;
    }

    private void getHabitacion() {

        ArrayList<Habitacion> habitaciones = bd.getHabitacionSQL();

        int cantidadColumnas = habitaciones.size();
        ifh.modeloTablaHabitaciones.setNumRows(cantidadColumnas);

        for (int i = 0; i < cantidadColumnas; i++) {

            Habitacion h = habitaciones.get(i);
            int id = h.getId_habitacion();

            ifh.modeloTablaHabitaciones.setValueAt(id, i, 0);

        }

    }

    private void guardarHabitacion(ActionEvent e) {

        try {

            String Num = this.ifh.txtNumHabitacion.getText();

            Habitacion habitacion = new Habitacion(Num);

            this.bd.insertHabitacion(habitacion);

            JOptionPane.showMessageDialog(null, "Se ha insertado un Habitacion");

            getHabitacion();

            limpiarCamposHabitacion();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    //SELECIONA UNA FILA DE LA TABLA HABITACION
    private void seleccionRowHabitacion(MouseEvent m) {

        try {

            int seleccion = ifh.tablaHabitaciones.rowAtPoint(m.getPoint());
            ifh.txtNumHabitacion.setText(String.valueOf(ifh.tablaHabitaciones.getValueAt(seleccion, 0)));
            ifh.txtPrecioHabitacion.setText(String.valueOf(ifh.tablaHabitaciones.getValueAt(seleccion, 1)));

        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

    private void editarHabitacion(ActionEvent e) {

        try {

            int id = Integer.parseInt(this.ifh.txtNumHabitacion.getText());
            double precio = Double.parseDouble(this.ifh.txtPrecioHabitacion.getText());

            Habitacion h = new Habitacion(id, precio);

            //  this.bd.m(h);
            JOptionPane.showMessageDialog(null, "Se ha modificado un estado");

            getHabitacion();

        } catch (HeadlessException ex) {
            ex.printStackTrace();
        }
    }

    private void getReservaPorCriterio(KeyEvent k) {

        if (k.getKeyCode() == KeyEvent.VK_ENTER) {

            Cliente c = (Cliente) ifp.comboBoxCliente.getSelectedItem();

            Habitacion h = new Habitacion();

            ArrayList<Reserva> reserva = bd.getReservaCriterio(c.getId_cliente());

            for (int i = 0; i < reserva.size(); i++) {

                Reserva r = reserva.get(i);

                int idReserva = r.getId_reserva();
                int idCliente = r.getId_cliente();
                int idHabitacion = r.getId_habitacion();
                int cantDias = r.getCant_dias();

                h.setId_habitacion(idHabitacion);

                ifp.txtCantidadDias.setText(String.valueOf(cantDias));
                //ifp.comboBoxCliente.setSelectedItem(idCliente);
                ifp.comboBoxHabitaciones.setSelectedIndex(h.getId_habitacion() - 1);
                ifp.txtIdReserva.setText(String.valueOf(idReserva));

            }
        }

    }

    private void limpiarCamposHabitacion() {
        ifh.txtNumHabitacion.setText("");
        ifh.txtPrecioHabitacion.setText("");
    }

}
