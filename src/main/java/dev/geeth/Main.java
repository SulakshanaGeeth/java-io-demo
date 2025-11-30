package dev.geeth;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String[] names = {"Product Name 01", "Product Name 02", "Product Name 03"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Stat Writing to the File");
            writer.write("\nHear is another line");
            for(String name : names){
                writer.write("\n"+name);
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error occurred on Writing file : " + e.getMessage());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String readLine;
            while ((readLine = reader.readLine()) != null){
                System.out.println(readLine);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred on Reading the file : " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
