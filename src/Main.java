import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico("Sucursal Centro", "BBVA");
        Cuenta cuentaAhorros = new Cuenta("Cuenta de Ahorros", 23140972, 1700);
        Cuenta cuentaCheques = new Cuenta("Cuenta de Cheques", 98765432, 500);
        Cliente cliente = new Cliente("1", "Catalina", "Calle", 23140972, cuentaCheques);
        String fecha = "25/05/2024", tipoCuenta;
        int numeroTarjeta;
        Scanner leer = new Scanner (System.in);

        System.out.println("Ingrese el número de la tárjeta: ");
        numeroTarjeta=leer.nextInt();
        System.out.println("Ingresa el tipo de cuenta: ");
        tipoCuenta=leer.next(); 
        tipoCuenta+=leer.nextLine();

        if (tipoCuenta.trim().equalsIgnoreCase("Cuenta de Ahorros")){
            cliente.setCuenta(cuentaAhorros);
        }

        if (numeroTarjeta==cliente.numeroTarjeta && tipoCuenta.trim().equalsIgnoreCase(cliente.cuenta.getTipo())){
            cajero.cajeroTransacciones(cajero, cliente, fecha, cuentaAhorros, cuentaCheques);
        }
        else if (numeroTarjeta!=cliente.numeroTarjeta){
            System.out.println("Error. Número de tarjeta no identificado");
        }
        else if (!tipoCuenta.trim().equalsIgnoreCase(cuentaAhorros.getTipo()) && !tipoCuenta.trim().equalsIgnoreCase(cuentaCheques.getTipo()) ) {
            System.out.println("Error. Tipo de cuenta no identificada");
        }
    }
}

