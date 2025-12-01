package dev.geeth.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReaderUtil {

    public static void readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String readLine;
            while ((readLine = reader.readLine()) != null) {
                System.out.println(readLine);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error occurred while reading file: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
