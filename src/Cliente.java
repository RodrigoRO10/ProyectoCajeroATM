public class Cliente {
    private String identificador;
    private String nombre;
    private String direccion;
    private String numeroTarjeta;
    private Cuenta cuenta;

    public Cliente(String identificador, String nombre, String direccion, String numeroTarjeta, Cuenta cuenta) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroTarjeta = numeroTarjeta;
        this.cuenta = cuenta;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
