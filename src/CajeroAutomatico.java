import java.util.Scanner;

public class CajeroAutomatico {
    private String localizacion;
    private String nombreBanco;

    public CajeroAutomatico(String localizacion, String nombreBanco) {
        this.localizacion = localizacion;
        this.nombreBanco = nombreBanco;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }

    public void cajeroTransacciones (CajeroAutomatico cajero, Cliente cliente, String fecha, Cuenta cuentaOrigen, Cuenta cuentaDestino){
        Scanner leer = new Scanner (System.in);
        int opcion; 
        System.out.println("Bienvenido al cajero automático de " + cajero.getLocalizacion());
        System.out.println("Fecha " + fecha);
        System.out.println("Nombre: "+ cliente.getNombre());
        System.out.println("Saldo actual: "+ cuentaOrigen.getSaldo());
        do {
                System.out.println(" Por favor seleccione una opción:");
                System.out.println("    1. Retiro.");
                System.out.println("    2. Transferencia.");
                System.out.println("    3. Salir.");
                opcion = leer.nextInt();

                if (opcion==1){
                    String tipo = "Retiro";
                    System.out.println("Introduce el monto a retirar: ");
                    int monto = leer.nextInt();

                    if (monto <= cuentaOrigen.getSaldo()){
                        Retiro retiro = new Retiro(cliente.getIdentificador(), fecha, tipo, monto);
                        retiro.Retirar(cuentaOrigen, tipo, monto);
                        Transaccion transaccion = new Retiro (cliente.getIdentificador(), fecha, tipo, monto);
                        transaccion.imprimirTicket(cliente, cajero, cuentaOrigen, cuentaDestino); 
                    }
                    else {
                        System.out.println("Saldo insuficiente");
                    }
                }
                else if (opcion==2){
                    String tipo = "Transferencia";
                    System.out.println("Introduce el número de la cuenta destino: ");
                    int numeroTarjeta= leer.nextInt();
                    
                    if (numeroTarjeta == cuentaDestino.getNumeroCuenta()){
                        System.out.println("Introduce el monto a transferir: ");
                        int monto = leer.nextInt();System.out.println(cuentaDestino.getNumeroCuenta());
                        if (monto <= cuentaOrigen.getSaldo()){
                            Transferencia transferencia = new Transferencia(cliente.getIdentificador(), fecha, tipo, monto, cuentaDestino);
                            transferencia.Transferir(cuentaOrigen, cuentaDestino, tipo, monto);
                            Transaccion transaccion = new Transferencia (cliente.getIdentificador(), fecha, tipo, monto, cuentaDestino);
                            transaccion.imprimirTicket(cliente, cajero, cuentaOrigen, cuentaDestino);  
                        }
                        else {
                            System.out.println("Saldo insufuciente. ");
                        }   
                    }
                    else {
                        System.out.println("Cuenta no encontrada.");
                    }
                }
                else if (opcion==3){
                    System.out.println("Gracias, vuelva pronto");
                }
                else {
                    System.out.println("Opción no disponible");
                }
        }
        while (opcion !=3);
    }
}
