import java.util.Scanner;

public class Main {
	static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico("Sucursal Centro", "BBVA");
        Cuenta cuentaOrigen = new Cuenta("Cuenta de Ahorro", 23140972, 1700);
        Cliente cliente = new Cliente("1", "Catalina", "Calle Elm", "23140972", cuentaOrigen);
        Cuenta cuentaDestino = new Cuenta("Cuenta de Cheques", 98765432, 500);
        String fecha = "25/05/2024";

        cajero.cajeroConsulta(cajero, cliente, fecha, cuentaOrigen, cuentaDestino);

    }
}

