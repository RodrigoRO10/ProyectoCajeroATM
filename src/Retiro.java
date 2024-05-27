import java.util.Date;

public class Retiro extends Transaccion {
    public Retiro(String id, Date fecha, String tipo, int monto) {
        super(id, fecha, tipo, monto);
    }

    @Override
    public void realizarTransaccion(Cuenta cuenta) {
        if (getMonto() <= cuenta.getSaldo()) {
            cuenta.setSaldo(cuenta.getSaldo() - getMonto());
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }
}