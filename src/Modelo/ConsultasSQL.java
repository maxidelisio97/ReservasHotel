/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.sql.Date;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ferc
 */
public class ConsultasSQL {

    private Conexion conexion;
    private Connection connection;
    private ResultSet rs = null;
    private PreparedStatement ps = null;
    private Statement st = null;

    private Cliente cliente;

    public ConsultasSQL() {

        conexion = new Conexion();

    }

    // INSERT RESERVA
    public void insertCliente(Cliente cliente) {

        try {

            String sql = "INSERT INTO db_habitaciones.CLIENTE(NOM_CLIENTE,CORREO_CLIENTE,TEL_CLIENTE,DNI_CLIENTE)VALUES (?,?,?,?)";

            connection = conexion.Conectar();

            ps = connection.prepareStatement(sql);

            ps.setString(1, cliente.getNom_cliente());
            ps.setString(2, cliente.getCorreo_cliente());
            ps.setString(3, cliente.getTel_cliente());
            ps.setString(4, cliente.getDni_cliente());

            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void insertHabitacion(Habitacion habitacion) {

        String sql = "INSERT INTO db_habitaciones.HABITACION(NUM_HABITACION)VALUES (?)";

        connection = conexion.Conectar();

        try {

            ps = connection.prepareStatement(sql);

            ps.setString(1, habitacion.getNum_habitacion());

            

            ps.executeQuery();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    // OBTENEMOS TODOS LOS DATOS DE LAS RESERVAS
    public ResultSet getReserva() {

        String sql = "SELECT NUM_HABITACION,NOM_CLIENTE,FECHA_DESDE,FECHA_HASTA,CANT_DIAS,CANT_PERSONA,ESTADO_RESERVA,ID_RESERVA FROM RESERVA INNER JOIN HABITACION ON RESERVA.ID_HABITACION=HABITACION.ID_HABITACION INNER JOIN CLIENTE ON RESERVA.ID_CLIENTE=CLIENTE.ID_CLIENTE";

        connection = conexion.Conectar();

        try {
            ps = connection.prepareStatement(sql);

            rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println("error al obtener reserva");
        }
        return rs;
    }

    public ArrayList<Reserva> getReservaCriterio(int id) {

        ArrayList<Reserva>reserva = new ArrayList<Reserva>();
            
            String sql = "SELECT ID_RESERVA,ID_CLIENTE,ID_HABITACION,CANT_DIAS FROM RESERVA WHERE ID_CLIENTE=?";
        try {
            
           
            
            connection = conexion.Conectar();
            
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                
                int idReserva = rs.getInt("ID_RESERVA");
                int idHabitacion = rs.getInt("ID_HABITACION");
                int idCliente = rs.getInt("ID_CLIENTE");
                int cantDias = rs.getInt("CANT_DIAS");
               
                
                
                Reserva r = new Reserva(idHabitacion,idCliente,idReserva,cantDias);
                
                reserva.add(r);
                
            }
                
            } catch (Exception e) {
                System.out.println("error al obtener reserva con criterio de búsqueda");
            }
            return reserva;
        
    }

    public ArrayList<PagoInner> getPagosSQL() {

        String sql = "SELECT NUM_HABITACION,NOM_CLIENTE,SEÑA,SALDO,PRECIO_FINAL,ESTADO_PAGO,ID_PAGO FROM PAGO INNER JOIN HABITACION ON PAGO.ID_HABITACION=HABITACION.ID_HABITACION INNER JOIN CLIENTE ON PAGO.ID_CLIENTE=CLIENTE.ID_CLIENTE";
        connection = conexion.Conectar();
         ArrayList<PagoInner> pagoInner = new ArrayList<PagoInner>();
        try {
            
           
            ps = connection.prepareStatement(sql);

            rs = ps.executeQuery();
            
            while (rs.next()) {
                
                String nom_habitacion = rs.getString(1);
                String nom_cliente = rs.getString(2);
                double seña = rs.getDouble(3);
                double saldo = rs.getDouble(4);
                double pFinal = rs.getDouble(5);
                String estado = rs.getString(6);
                int id_pago = rs.getInt(7);
                String fecha = rs.getString(8);
                
                PagoInner pago = new PagoInner(nom_habitacion, nom_cliente, seña, saldo, pFinal, estado, id_pago,fecha);
                
                pagoInner.add(pago);
                
            }

        } catch (Exception e) {
            System.out.println("error al obtener pagos");
        }
        return pagoInner;
    }

    public ResultSet getInnerJoin() {

        String sql = "SELECT CANT_DIAS,PRECIO_HABITACION FROM PAGO INNER JOIN HABITACION ON PAGO.ID_HABITACION=HABITACION.ID_HABITACION INNER JOIN RESERVA ON PAGO.ID_RESERVA=RESERVA.ID_RESERVA WHERE ID_RESERVA=?";
        connection = conexion.Conectar();

        try {
            ps = connection.prepareStatement(sql);

            rs = ps.executeQuery();

        } catch (Exception e) {
            System.out.println("error al obtener inner join 1");
        }
        return rs;

    }

//RETORNA LOS CLIENTES EN UN ARRAYLIST
    public ArrayList<Cliente> getClientesbd() {

        String selectTODO = "SELECT * FROM db_habitaciones.CLIENTE";

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();

        connection = conexion.Conectar();

        try {

            ps = connection.prepareStatement(selectTODO);

            rs = ps.executeQuery();

            while (rs.next()) {

                //RECORRE LOS CLIENTES EN LA BASE DE DATOS
                int id_cliente = rs.getInt("ID_CLIENTE");
                String nom_cliente = rs.getString("NOM_CLIENTE");
                String correo_cliente = rs.getString("CORREO_CLIENTE");
                String tel_cliente = rs.getString("TEL_CLIENTE");
                String dni_cliente = rs.getString("DNI_CLIENTE");

                cliente = new Cliente(id_cliente, nom_cliente, correo_cliente, tel_cliente, dni_cliente);

                clientes.add(cliente);

               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return clientes;
    }
    
     public ArrayList<Reserva> getAllReserva() {
         
                 
       String selectInnerJoin = "SELECT ID_RESERVA,CANT_DIAS,NOM_CLIENTE,ID_HABITACION,PRECIO_HABITACION FROM RESERVA ";

        ArrayList<Reserva> reserva = new ArrayList<Reserva>();

        connection = conexion.Conectar();

        try {

            ps = connection.prepareStatement(selectInnerJoin);

            rs = ps.executeQuery();

            while (rs.next()) {

                int idReserva = rs.getInt("ID_RESERVA");           
                int idHabitacion = rs.getInt("ID_HABITACION");
                int idCliente = rs.getInt("ID_CLIENTE");
                int cantDias = rs.getInt("CANT_DIAS");
              
                
               
                
                //Reserva r = new Reserva(idReserva,cantDias,idHabitacion,idCliente,fechaDesde,fechaHasta,cantPersonas,estadoReserva);

                //reserva.add(r);

               
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return reserva;
    }

    public ArrayList getFechas(String checkIn, String checkOut) {

        String sql = "SELECT ID_HABITACION,FECHA_DESDE,FECHA_HASTA,ESTADO_RESERVA FROM RESERVA WHERE FECHA_DESDE between ? AND ? or FECHA_HASTA between ? AND ? or FECHA_HASTA >= ? AND FECHA_DESDE <= ? ";
        ArrayList<Reserva> listaFechas = new ArrayList<Reserva>();
        try {

            connection = conexion.Conectar();

            ps = connection.prepareStatement(sql);

            ps.setString(1, checkIn);
            ps.setString(2, checkOut);
            ps.setString(3, checkIn);
            ps.setString(4, checkOut);
            ps.setString(5, checkIn);
            ps.setString(6, checkOut);

            rs = ps.executeQuery();

            while (rs.next()) {

                Reserva r = new Reserva();

                r.setId_habitacion(rs.getInt(1));
                r.setFecha_desde(rs.getString(2));
                r.setFecha_hasta(rs.getString(3));
                r.setEstadoReserva(rs.getString(4));

                listaFechas.add(r);

            }

        } catch (Exception e) {

            e.printStackTrace();
        }

        return listaFechas;
    }

    // INSERT RESERVA
    public void modificarCliente(Cliente cliente) {

        String sqlUPDATE = "UPDATE CLIENTE SET NOM_CLIENTE = ?,CORREO_CLIENTE=?,TEL_CLIENTE=?,DNI_CLIENTE =?  WHERE ID_CLIENTE=?";

        try {

            connection = conexion.Conectar();

            ps = connection.prepareStatement(sqlUPDATE);

            ps.setString(1, cliente.getNom_cliente());
            ps.setString(2, cliente.getCorreo_cliente());
            ps.setString(3, cliente.getTel_cliente());
            ps.setString(4, cliente.getDni_cliente());
            ps.setInt(5, cliente.getId_cliente());

            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    

    public void borrarCliente(int cliente) {

        try {

            connection = conexion.Conectar();

            ps = connection.prepareStatement("DELETE FROM CLIENTE WHERE ID_CLIENTE=?");

            ps.setInt(1, cliente);

            ps.executeQuery();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
                connection.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void borrarReserva(int id) {

        try {

            connection = conexion.Conectar();

            ps = connection.prepareStatement("DELETE FROM RESERVA WHERE ID_RESERVA=?");

            ps.setInt(1, id);

            ps.executeQuery();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
                connection.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public void borrarHabitacion(int id) {

        try {

            connection = conexion.Conectar();

            ps = connection.prepareStatement("DELETE FROM HABITACION WHERE ID_HABITACION=?");

            ps.setInt(1, id);

            ps.executeQuery();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                ps.close();
                connection.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    public ArrayList<Cliente> getClientePorCliente(String criterio) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        try {

            connection = conexion.Conectar();

            st = connection.createStatement();

            rs = st.executeQuery("SELECT * FROM CLIENTE WHERE NOM_CLIENTE LIKE '%" + criterio + "%'");

            while (rs.next()) {

                int id_cliente = rs.getInt("ID_CLIENTE");
                String nom_cliente = rs.getString("NOM_CLIENTE");
                String correo_cliente = rs.getString("CORREO_CLIENTE");
                String tel_cliente = rs.getString("TEL_CLIENTE");
                String dni_cliente = rs.getString("DNI_CLIENTE");

                cliente = new Cliente(id_cliente, nom_cliente, tel_cliente, correo_cliente, dni_cliente);

                clientes.add(cliente);

               

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                st.close();
                connection.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return clientes;

    }

    
    

    public ArrayList<Habitacion> getHabitacionSQL() {

        ArrayList<Habitacion> habitacion = new ArrayList<Habitacion>();
        try {

            connection = conexion.Conectar();

            st = connection.createStatement();

            rs = st.executeQuery("SELECT * FROM HABITACION");

            while (rs.next()) {

                int id_habitacion = rs.getInt("ID_HABITACION");
                String num_habitacion = rs.getString("NUM_HABITACION");

               

                Habitacion hab = new Habitacion(id_habitacion, num_habitacion);

                habitacion.add(hab);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return habitacion;

    }

    //INSERT RESERVA
    public void insertReserva(Reserva reserva) {

        try {

            String sql = "INSERT INTO db_habitaciones.RESERVA(FECHA_DESDE,FECHA_HASTA,CANT_PERSONA,ID_HABITACION,ID_CLIENTE,CANT_DIAS,ESTADO_RESERVA)VALUES (?,?,?,?,?,?,?)";

            connection = conexion.Conectar();

            ps = connection.prepareStatement(sql);

            //ps.setInt(1, reserva.getId_cliente());
            ps.setString(1, reserva.getFecha_desde());
            ps.setString(2, reserva.getFecha_hasta());
            ps.setInt(3, reserva.getNumeroPersonas());
            ps.setInt(4, reserva.getId_habitacion());
            ps.setInt(5, reserva.getId_cliente());
            ps.setInt(6, reserva.getCant_dias());
            ps.setString(7, reserva.getEstadoReserva());

            ps.executeQuery();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void modificarReserva(Reserva reserva) {

        String sqlUPDATE = "UPDATE RESERVA SET FECHA_DESDE=?,FECHA_HASTA=?,CANT_PERSONA=?,ESTADO_RESERVA=?,ID_HABITACION=? WHERE ID_RESERVA=?";

        try {

            connection = conexion.Conectar();

            ps = connection.prepareStatement(sqlUPDATE);

            ps.setString(1, reserva.getFecha_desde());
            ps.setString(2, reserva.getFecha_hasta());
            ps.setInt(3, reserva.getNumeroPersonas());
            ps.setString(4, reserva.getEstadoReserva());
            ps.setInt(5, reserva.getId_habitacion());
            ps.setInt(6, reserva.getId_reserva());

            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
    
    
    

    public void modificarPago(Pago pago) {

        String sqlUPDATE = "UPDATE PAGO SET SEÑA=?,SALDO=?,ESTADO_PAGO=?,FECHA_PAGO=? WHERE ID_PAGO=?";

        try {

            connection = conexion.Conectar();

            ps = connection.prepareStatement(sqlUPDATE);

            ps.setDouble(1, pago.getSeña());
            ps.setDouble(2, pago.getSaldo());
            ps.setDouble(3, pago.getPrecio_final());
            ps.setString(4, pago.getEstado_pago());
            ps.setString(5, pago.getFecha_pago());
            
            ps.setInt(6, pago.getId_pago());

            ps.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    public void insertPagoSQL(Pago pago) {

        String sql = "INSERT INTO db_habitaciones.PAGO(SEÑA,SALDO,PRECIO_FINAL,ESTADO_PAGO,FECHA_PAGO,ID_HABITACION,ID_RESERVA,ID_CLIENTE,PRECIO_HABITACION)VALUES (?,?,?,?,?,?,?,?,?)";

        connection = conexion.Conectar();

        try {

            ps = connection.prepareStatement(sql);

            ps.setDouble(1, pago.getSeña());
            ps.setDouble(2, pago.getSaldo());
            ps.setDouble(3, pago.getPrecio_final());
            ps.setString(4, pago.getEstado_pago());
            ps.setString(5, pago.getFecha_pago());
            ps.setInt(6, pago.getId_habitacion());
            ps.setInt(7, pago.getId_reserva());
            ps.setInt(8, pago.getId_cliente());
            ps.setDouble(9, pago.getPrecio_dia());

            ps.execute();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

}
