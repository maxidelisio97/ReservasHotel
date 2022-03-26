package Modelo;

import java.util.Date;

public class Reserva {

    public Reserva() {
    }

    public Reserva(int cant_dias, int id_habitacion, int id_cliente, double precioHab, String nomcliente, String numHab, int id_reserva, String fecha_desde, String fecha_hasta, int numeroPersonas, String estadoReserva) {
        this.cant_dias = cant_dias;
        this.id_habitacion = id_habitacion;
        this.id_cliente = id_cliente;
        this.precioHab = precioHab;
        this.nomcliente = nomcliente;
        this.numHab = numHab;
        this.id_reserva = id_reserva;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.numeroPersonas = numeroPersonas;
        this.estadoReserva = estadoReserva;
    }

    public Reserva(int id_habitacion, int id_cliente, String fecha_desde, String fecha_hasta, int numeroPersonas, String estadoReserva,int cantDias) {
        this.id_habitacion = id_habitacion;
        this.id_cliente = id_cliente;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.numeroPersonas = numeroPersonas;
        this.estadoReserva = estadoReserva;
        this.cant_dias= cantDias;
    }
    
    
    

    public Reserva(int id_habitacion, int id_cliente, String fecha_desde, String fecha_hasta, int numeroPersonas) {
        this.id_habitacion = id_habitacion;
        this.id_cliente = id_cliente;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.numeroPersonas = numeroPersonas;
    }

    public Reserva(int id_habitacion, int id_cliente,  int id_reserva, int cantDias) {
        this.id_habitacion = id_habitacion;
        this.id_cliente = id_cliente;
        
        this.id_reserva = id_reserva;
        this.cant_dias = cantDias;
    }
    
    

    public Reserva(int id_reserva,int cant_dias, int id_habitacion, int id_cliente, String fecha_desde, String fecha_hasta, int numeroPersonas, String estadoReserva) {
        this.cant_dias = cant_dias;
        this.id_habitacion = id_habitacion;
        this.id_cliente = id_cliente;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.numeroPersonas = numeroPersonas;
        this.estadoReserva = estadoReserva;
        this.id_reserva=id_reserva;
    }
    

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getFecha_desde() {
        return fecha_desde;
    }

    public void setFecha_desde(String fecha_desde) {
        this.fecha_desde = fecha_desde;
    }

    public String getFecha_hasta() {
        return fecha_hasta;
    }

    public void setFecha_hasta(String fecha_hasta) {
        this.fecha_hasta = fecha_hasta;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public int getCant_dias() {
        return cant_dias;
    }

    public void setCant_dias(int cant_dias) {
        this.cant_dias = cant_dias;
    }

    public String getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(String estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    public String getNumHab() {
        return numHab;
    }

    public void setNumHab(String numHab) {
        this.numHab = numHab;
    }

    public double getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(double precioHab) {
        this.precioHab = precioHab;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    @Override
    public String toString() {
        return nomcliente;
    }

    private int cant_dias;
    private int id_habitacion;
    private int id_cliente;
    private double precioHab;
    private String nomcliente;
    private String numHab;
    private int id_reserva;
    private String fecha_desde;
    private String fecha_hasta;
    private int numeroPersonas;

    //FALTA DE PAGO-DEPOSITO PAGADO - TOTALMENTE PAGADO -CANCELADOR - NO DISPONIBLE
    private String estadoReserva;

}
