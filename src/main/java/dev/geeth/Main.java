package dev.geeth;

import dev.geeth.util.FileReaderUtil;
import dev.geeth.util.FileWriterUtil;

import java.io.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        String[] names = {"Product Name 01", "Product Name 02", "Product Name 03"};
        String fileName = "output.txt";

        FileWriterUtil.writeFile(fileName, names);
        FileReaderUtil.readFile(fileName);
    }
}
