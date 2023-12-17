package Pacchetto1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // lavorare con file

        // File file2 = new File("prova.txt");
        // if (file2.exists()) {
        // System.out.println("Il file2 esiste");
        // System.out.println(file2.getPath());
        // System.out.println(file2.getAbsolutePath());
        // System.out.println(file2.isFile());
        // System.out.println(file2.isDirectory());
        // System.out.println(file2.canRead());
        // System.out.println(file2.canWrite());
        // System.out.println(file2.length());
        // System.out.println(file2.lastModified());
        // System.out.println(file2.delete());

        // } else {
        // System.out.println("Il file2 non esiste");
        // }

        try {
            FileWriter writer = new FileWriter("prova.txt");
            writer.write("questo codice è scritto da codice java");
            writer.append("\n");
            writer.append("bellissimo file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileReader reader = new FileReader("reader.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }

}
