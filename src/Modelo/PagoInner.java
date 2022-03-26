
package Modelo;


public class PagoInner {

    public PagoInner(String num_habitacion, String nom_cliente, double seña, double saldo, double pFinal, String estado_pago, int id_pago,String fecha) {
        this.num_habitacion = num_habitacion;
        this.nom_cliente = nom_cliente;
        this.seña = seña;
        this.saldo = saldo;
        this.pFinal = pFinal;
        this.estado_pago = estado_pago;
        this.id_pago = id_pago;
        this.fecha=fecha;
    }

    public PagoInner() {
    }

    public String toString(){
        
        return nom_cliente;
    }
    
    
    
    public String getNum_habitacion() {
        return num_habitacion;
    }

    public void setNum_habitacion(String num_habitacion) {
        this.num_habitacion = num_habitacion;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
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

    public double getpFinal() {
        return pFinal;
    }

    public void setpFinal(double pFinal) {
        this.pFinal = pFinal;
    }

    public String getEstado_pago() {
        return estado_pago;
    }

    public void setEstado_pago(String estado_pago) {
        this.estado_pago = estado_pago;
    }

    public int getId_pago() {
        return id_pago;
    }

    public void setId_pago(int id_pago) {
        this.id_pago = id_pago;
    }
    
    
    
    
    
    private String num_habitacion;
    private String nom_cliente;
    private double seña;
    private double saldo;
    private double pFinal;
    private String estado_pago;
    private int id_pago;
    private String fecha;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
//NUM_HABITACION,NOM_CLIENTE,SEÑA,SALDO,PRECIO_FINAL,ESTADO_PAGO,ID_PAGO