package dev.geeth.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterUtil {

    public static void writeFile(String fileName, String[] names) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {

            writer.write("Start Writing to the File");
            writer.write("\nHere is another line");

            for (String name : names) {
                writer.write("\n" + name);
            }

            System.out.println("Writing completed.");

        } catch (IOException e) {
            System.out.println("Error occurred while writing the file: " + e.getMessage());
        }
    }
}
