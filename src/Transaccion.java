import java.util.Date;

public abstract class Transaccion {
    private String id;
    private Date fecha;
    private String tipo;
    private int monto;

    public Transaccion(String id, Date fecha, String tipo, int monto) {
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

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
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

    public abstract void realizarTransaccion(Cuenta cuenta);

    public void imprimirTicket(Cliente cliente, CajeroAutomatico cajero) {
        System.out.println("====================================");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Banco: " + cajero.getNombreBanco());
        System.out.println("Tipo de transacción: " + tipo);
        System.out.println("Monto: " + monto);
        System.out.println("====================================");
    }
}