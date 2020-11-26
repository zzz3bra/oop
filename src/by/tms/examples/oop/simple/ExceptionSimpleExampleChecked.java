package by.tms.examples.oop.simple;

import java.io.File;
import java.io.IOException;

public class ExceptionSimpleExampleChecked {

    public static void main(String[] args) {
        try {
            createFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createFile() throws IOException {
        new File("/").createNewFile();
    }
}
