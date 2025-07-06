package paquete;
public class Principal {

    /***** CALCULO DE CANTIDAD DE MEMORIA *****/
    /*    
        El calculo de bytes totales con las variables planteadas en MarcaPasos seria:
        presionSanguinea - 2 bytes
        frecuenciaSanguinea - 2 bytes
        azucarEnSangre - 2 bytes
        fuerza - 4 bytes
        tiempoEntreLatidos - 4 bytes
        bateriaRestante - 8 bytes
        codigoFabricante - 8 bytes de referencia + 16 bytes por los 8 caracteres planteados como maximo
    
        Siendo en total 46 BYTES de consumo de memoria
    */
    
    public static void main(String[] args) {
        MarcaPasos marca = new MarcaPasos();
    }
    
}
