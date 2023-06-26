import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String message = "Bonjour Haithem";

        // Afficher le message à la console
        System.out.println(message);

        // Écrire le message dans un fichier Bonjour.java en utilisant echo
        try (PrintWriter writer = new PrintWriter(new FileWriter("Bonjour.java"))) {
            writer.println(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
