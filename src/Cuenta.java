public class Cuenta {
    public String tipoCuenta;
    public int numeroCuenta;
    public int saldo;

    public Cuenta(String tipoCuenta, int numeroCuenta, int saldo) {
        this.tipoCuenta = tipoCuenta;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipoCuenta;
    }

    public void setTipo(String tipo) {
        this.tipoCuenta = tipo;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
}

