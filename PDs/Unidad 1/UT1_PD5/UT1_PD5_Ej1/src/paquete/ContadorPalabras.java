package paquete;

import java.util.ArrayList;
import java.util.List;

enum Vocales {
    a, e, i, o, u
}

class ContadorPalabras {

    public int contarPalabras(String frase) {
        int sumador = 0;
        int vocal = 0;
        String texto = frase.trim();
        texto = texto.concat(" ");
        List<Character> palabra = new ArrayList<>();
        for (int i = 0; i < texto.length(); i++) {
            for (Vocales v : Vocales.values()) {
                if (texto.charAt(i) == v.toString().charAt(0)) {
                    vocal++;
                }
            }
            palabra.add(texto.charAt(i));
            if (texto.charAt(i) == ' ') {
                for (int j = 0; j < palabra.size(); j++) {
                    if (Character.isLetter(palabra.get(j))) {
                        sumador++;
                        break;
                    }
                }
                palabra.clear();
            }
        }
        int consonante = texto.length() - vocal - sumador;
        System.out.println("Consonantes: " + consonante);
        return vocal;
    }

}