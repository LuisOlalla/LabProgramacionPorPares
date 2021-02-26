package Herencia;

public class ejecutable {
	 
    public static void main(String[] args) {
         
        Cuenta cuentaCarlos= new Cuenta("Carlos Lucio");
        Cuenta cuentaLuis = new Cuenta("Luis", 300);
         
        //Ingresa dinero
        cuentaCarlos.ingresar(300);
        cuentaLuis.ingresar(400);
         
        //Retiramos dinero 
        cuentaCarlos.retirar(500);
        cuentaLuis.retirar(100);
         
        //Muestra la informacion 
        System.out.println(cuentaCarlos); 
        System.out.println(cuentaLuis);
         
    }
     
}