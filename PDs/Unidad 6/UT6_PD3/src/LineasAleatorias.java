import java.io.*;
import java.util.*;

public class LineasAleatorias {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Uso: java LineasAleatorias <archivo> <num_lineas>");
            return;
        }
        
        File archivo = new File(args[0]);
        int numLineas = Integer.parseInt(args[1]);
        List<String> lineas = new ArrayList<>();
        
        try (Scanner scanner = new Scanner(archivo)) {
            // Estimación inicial de capacidad basada en tamaño de archivo
            int capacidadEstimada = (int)(archivo.length() / 50); // 50 bytes por línea promedio
            lineas = new ArrayList<>(capacidadEstimada);
            
            while (scanner.hasNextLine()) {
                lineas.add(scanner.nextLine());
            }
            
            if (numLineas > lineas.size()) {
                System.err.println("Advertencia: El archivo solo tiene " + lineas.size() + " líneas");
                numLineas = lineas.size();
            }
            
            Collections.shuffle(lineas);
            lineas.subList(0, numLineas).forEach(System.out::println);
            
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + archivo);
        }
    }
}