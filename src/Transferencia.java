
public class Transferencia extends Transaccion {
    public Cuenta cuentaDestino;

    public Transferencia(String id, String fecha, String tipo, int monto, Cuenta cuentaDestino) {
        super(id, fecha, tipo, monto);
        this.cuentaDestino = cuentaDestino;
    }

    public Cuenta getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Cuenta cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public void Transferir (Cuenta cuentaOrigen, Cuenta cuentaDestino, String tipo, int monto){
        if (monto <= cuentaOrigen.getSaldo()){
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo()-monto);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo()+monto);
        }
    }

    public void imprimirTicket (Cliente cliente, CajeroAutomatico cajero, Cuenta cuentaOrigen, Cuenta cuentaDestino){
        System.out.println("====================================");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Banco: " + cajero.getNombreBanco());
        System.out.println("Fecha: " + fecha);
        System.out.println("Tipo de transacción: " + tipo);
        System.out.println("Tipo de la Cuenta Origen: " + cuentaOrigen.getTipo());
        System.out.println("Tipo de la Cuenta Destino: " + cuentaDestino.getTipo());
        System.out.println("Monto Transferido: " + monto);
        System.out.println("Saldo actual: " + cuentaOrigen.getSaldo());
        System.out.println("====================================");
    }
}