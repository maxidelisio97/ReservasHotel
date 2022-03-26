
package Modelo;


public class Pago {

   

    public Pago(double precio_dia, double seña, double saldo, double precio_final, String estado_pago, String fecha_pago, int id_habitacion, int id_reserva, int id_cliente) {
        this.precio_dia = precio_dia;
        this.seña = seña;
        this.saldo = saldo;
        this.precio_final = precio_final;
        this.estado_pago = estado_pago;
        this.fecha_pago = fecha_pago;
        this.id_habitacion = id_habitacion;
        this.id_reserva = id_reserva;
        this.id_cliente = id_cliente;
    }
    
    

    

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }

    public double getPrecio_dia() {
        return precio_dia;
    }

    public void setPrecio_dia(double precio_dia) {
        this.precio_dia = precio_dia;
    }

    public double getSeña() {
        return seña;
    }

    public void setSeña(double seña) {
        this.seña = seña;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getPrecio_final() {
        return precio_final;
    }

    public void setPrecio_final(double precio_final) {
        this.precio_final = precio_final;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public int getId_habitacion() {
        return id_habitacion;
    }

    public void setId_habitacion(int id_habitacion) {
        this.id_habitacion = id_habitacion;
    }

    public int getId_reserva() {
        return id_reserva;
    }

    public void setId_reserva(int id_reserva) {
        this.id_reserva = id_reserva;
    }
    
    public Pago(){}
    
    
    private int id_pago;
    private double precio_dia;
    private double seña;
    private double saldo;
    private double precio_final;
    private String estado_pago;
    private String fecha_pago;
    private int id_habitacion;
    private int id_reserva;
    private int id_cliente;

    public int getCantDias() {
        return cantDias;
    }

    public void setCantDias(int cantDias) {
        this.cantDias = cantDias;
    }

  
    private int cantDias;
   

    public Pago(int id_pago, double precio_dia, double seña, double saldo, double precio_final, String estado_pago, String fecha_pago, int id_habitacion, int id_reserva, int id_cliente) {
        this.id_pago = id_pago;
        this.precio_dia = precio_dia;
        this.seña = seña;
        this.saldo = saldo;
        this.precio_final = precio_final;
        this.estado_pago = estado_pago;
        this.fecha_pago = fecha_pago;
        this.id_habitacion = id_habitacion;
        this.id_reserva = id_reserva;
        this.id_cliente = id_cliente;
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
}

