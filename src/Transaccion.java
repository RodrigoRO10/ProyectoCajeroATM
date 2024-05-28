
public abstract class Transaccion {
    public String id;
    public String fecha;
    public String tipo;
    public int monto;

    public Transaccion(String id, String fecha, String tipo, int monto) {
        this.id = id;
        this.fecha = fecha;
        this.tipo = tipo;
        this.monto = monto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public abstract void imprimirTicket(Cliente cliente, CajeroAutomatico cajero, Cuenta cuentaOrigen, Cuenta cuentaDestino);
}