package paquete;

public class MarcaPasos {

    short presionSanguinea;
    short frecuenciaSanguinea;
    short azucarEnSangre;
    int fuerza;
    float tiempoEntreLatidos;
    double bateriaRestante;
    String codigoFabricante;
    
    public MarcaPasos() {
    }

    public MarcaPasos(short presionSanguinea, short frecuenciaSanguinea, short azucarEnSangre, int fuerza, float tiempoEntreLatidos, double bateriaRestante, String codigoFabricante) {
        this.presionSanguinea = presionSanguinea;
        this.frecuenciaSanguinea = frecuenciaSanguinea;
        this.azucarEnSangre = azucarEnSangre;
        this.fuerza = fuerza;
        this.tiempoEntreLatidos = tiempoEntreLatidos;
        this.bateriaRestante = bateriaRestante;
        this.codigoFabricante = codigoFabricante;
    }

    public short getPresionSanguinea() {
        return presionSanguinea;
    }

    public short getFrecuenciaSanguinea() {
        return frecuenciaSanguinea;
    }

    public short getAzucarEnSangre() {
        return azucarEnSangre;
    }

    public int getFuerza() {
        return fuerza;
    }

    public float getTiempoEntreLatidos() {
        return tiempoEntreLatidos;
    }

    public double getBateriaRestante() {
        return bateriaRestante;
    }

    public String getCodigoFabricante() {
        return codigoFabricante;
    }

    public void setPresionSanguinea(short presionSanguinea) {
        this.presionSanguinea = presionSanguinea;
    }

    public void setFrecuenciaSanguinea(short frecuenciaSanguinea) {
        this.frecuenciaSanguinea = frecuenciaSanguinea;
    }

    public void setAzucarEnSangre(short azucarEnSangre) {
        this.azucarEnSangre = azucarEnSangre;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setTiempoEntreLatidos(float tiempoEntreLatidos) {
        this.tiempoEntreLatidos = tiempoEntreLatidos;
    }

    public void setBateriaRestante(double bateriaRestante) {
        this.bateriaRestante = bateriaRestante;
    }

    public void setCodigoFabricante(String codigoFabricante) {
        this.codigoFabricante = codigoFabricante;
    }
    
    
}
