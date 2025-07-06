package paquete;
public class ListaNegra {
    private int idFarmaco;
    private int idSuero;

    public ListaNegra(int idFarmaco, int idSuero) {
        this.idFarmaco = idFarmaco;
        this.idSuero = idSuero;
    }

    public int getIdFarmaco() {
        return idFarmaco;
    }

    public void setIdFarmaco(int idFarmaco) {
        this.idFarmaco = idFarmaco;
    }

    public int getIdSuero() {
        return idSuero;
    }

    public void setIdSuero(int idSuero) {
        this.idSuero = idSuero;
    }
    
}
