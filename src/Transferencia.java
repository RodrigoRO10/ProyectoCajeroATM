import java.sql.Date;

public class Transferencia extends Transaccion {
    private String cuentaDestino;

    public Transferencia(String id, Date fecha, String tipo, int monto, String cuentaDestino) {
        super(id, fecha, tipo, monto);
        this.cuentaDestino = cuentaDestino;
    }

    

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    @Override
    public void realizarTransaccion(Cuenta cuenta) {
        if (getMonto() <= cuenta.getSaldo()) {
            cuenta.setSaldo(cuenta.getSaldo() - getMonto());
            System.out.println("Transferencia realizada a la cuenta: " + cuentaDestino);
        } else {
            System.out.println("Saldo insuficiente para realizar la transferencia.");
        }
    }
}