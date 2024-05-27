public class CajeroAutomatico {
    private String localizacion;
    private String nombreBanco;

    public CajeroAutomatico(String localizacion, String nombreBanco) {
        this.localizacion = localizacion;
        this.nombreBanco = nombreBanco;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getNombreBanco() {
        return nombreBanco;
    }

    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
}
