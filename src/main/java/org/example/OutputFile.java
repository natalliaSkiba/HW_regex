package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class OutputFile {
    private String fileName;
    public OutputFile(String fileName) {
        this.fileName = fileName;
    }
    public void writeFile(List<String> list) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(list.toString());
         } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
