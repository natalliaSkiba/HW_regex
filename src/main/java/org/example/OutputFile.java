package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFile {
    protected static void writeFile(List<String> list) {
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(list.toString());
         } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
