public class Cuenta {
    private String tipo;
    private String numeroCuenta;
    private int saldo;

    public Cuenta(String tipo, String numeroCuenta, int saldo) {
        this.tipo = tipo;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

