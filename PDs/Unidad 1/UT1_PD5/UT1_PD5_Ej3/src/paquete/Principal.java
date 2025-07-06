package paquete;

public class Principal {
    
    enum Simbolos {
        COMA(','),
        PUNTO('.'),
        PUNTOYCOMA(';');
        
        private final char simbolo;

        
        Simbolos(char simbolo) {
            this.simbolo = simbolo;
        }

        public char getSimbolo() {
            return simbolo;
        }
        
        public static boolean esSimbolo(char c) {
            for (Simbolos s : Simbolos.values()) {
                if (s.getSimbolo() == c) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an 
        // array of chars
        for (int i = 0; i < len; i++) {
            tempCharArray[i] = Character.toLowerCase(palindrome.charAt(i));
        }

        // reverse array of chars
        for (int j = 0; j < len; j++) {
            if (Simbolos.esSimbolo(tempCharArray[j])) {
                charArray[j] = tempCharArray[j];
            } else {
                if (Simbolos.esSimbolo(tempCharArray[len - 1 - j])) {
                    charArray[len - 1 - j] = tempCharArray[j];
                } else {
                    charArray[j] = tempCharArray[len - 1 - j];
                }
            }
        }
        String reversePalindrome = new String(charArray);
        System.out.println(reversePalindrome);
    }

}
