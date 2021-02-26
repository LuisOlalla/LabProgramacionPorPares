package Herencia;

public class Cuenta extends ejecutable {
	 
    //Atributos
    private String persona;
    private double monto;
 
    //Constructores
    public Cuenta(String titular) {
        this(titular, 0);
    }
 
    public Cuenta(String titular, double cantidad) {
        this.persona = titular;
        //Cantidad menor a 0
        if (cantidad < 0) {
            this.monto = 0;
        } else {
            this.monto = cantidad;
        }
    }
 
    //Metodos
    public String getTitular() {
        return persona;
    }
 
    public void setTitular(String titular) {
        this.persona = titular;
    }
 
    public double getCantidad() {
        return monto;
    }
 
    public void setCantidad(double cantidad) {
        this.monto = cantidad;
    }
 
    //Ingresa dinero a la cuenta
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            this.monto += cantidad;   
        }
    }
 
    // Retitar dinero de la cuenta
    public void retirar(double cantidad) {
        if (this.monto - cantidad < 0) {
            this.monto = 0;
        } else {
            this.monto -= cantidad;
        }
    }
 
   // devuelte el estado d ela cuenta
    @Override
    public String toString() {
        return "La persona " + persona + " tiene " + monto + " dolares de la cuenta";
    }
 
}