
public class Retiro extends Transaccion {
    public Retiro(String id, String fecha, String tipo, int monto) {
        super(id, fecha, tipo, monto);
    }

    public void Retirar (Cuenta cuenta, String tipo, int monto){
        if (monto <= cuenta.getSaldo()){
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            System.out.println("Retiro realizado");
        }
    }

    public void imprimirTicket (Cliente cliente, CajeroAutomatico cajero, Cuenta cuentaOrigen, Cuenta cuentaDestino){
        System.out.println("====================================");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Banco: " + cajero.getNombreBanco());
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo de transacción: " + tipo);
        System.out.println("Tipo de Cuenta: " + cuentaOrigen.getTipo());
        System.out.println("Saldo actual: " + cuentaOrigen.getSaldo());
        System.out.println("Monto: " + monto);
        System.out.println("====================================");
    }
    /*@Override
    public void realizarTransaccion(Cuenta cuenta) {
        if (getMonto() <= cuenta.getSaldo()) {
            cuenta.setSaldo(cuenta.getSaldo() - getMonto());
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }*/
}