import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiarArchivo {

    public static void main(String[] args) {

        try (
                BufferedReader reader = new BufferedReader(new FileReader("origen.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("destino.txt"))
        ) {

            String linea;

            while ((linea = reader.readLine()) != null) {
                writer.write(linea);
                writer.newLine();
            }

            System.out.println("Archivo copiado correctamente.");

        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}