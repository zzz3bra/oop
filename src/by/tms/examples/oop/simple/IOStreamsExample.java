package by.tms.examples.oop.simple;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOStreamsExample {
    public static void main(String[] args) throws IOException { // throws checked IOException
        printFilesFromDirectory();
    }

    private static void printFilesFromDirectory() {
        File file = new File("./src/../src/by/tms/examples/oop/simple");
        for (File name : file.listFiles()) {
            System.out.println(name + " is file? " + name.isFile());
        }
    }

    private static void writeFileWithClosing() throws IOException {
        int counter = 6;
        try (FileWriter fileWriter = new FileWriter("fileToBeWritten.txt", true)) {
            while (counter > 0) {
                int read = System.in.read();
                fileWriter.write(read);
                counter -= 1;
            }
        }
    }

    private static void writeFileWithFlush() throws IOException {
        try (FileWriter fileWriter = new FileWriter("fileToBeWritten.txt")) {
            while (true) {
                int read = System.in.read();
                fileWriter.write(read);
                fileWriter.flush();//will help if app crashes/closed in a weird way
            }
        }
    }

    private static void readFile() throws IOException {
        try (FileReader fileReader = new FileReader("file.txt")) {
            int currentCharacter;
            while ((currentCharacter = fileReader.read()) != -1) {
                System.out.print((char) currentCharacter);
            }
        }
    }
}
