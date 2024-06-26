public class Cliente {
    public String identificador;
    public String nombre;
    public String direccion;
    public int numeroTarjeta;
    public Cuenta cuenta;

    public Cliente(String identificador, String nombre, String direccion, int numeroTarjeta, Cuenta cuenta) {
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

    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
