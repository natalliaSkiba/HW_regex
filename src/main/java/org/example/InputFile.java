package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class InputFile {
    private String fileName;
    public InputFile(String fileName){
        this.fileName = fileName;
    }

    public List<String> readFile() {
        List<String> allCart = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
             allCart = Stream.of(line.split("\\s*,\\s*"))
                        .collect(Collectors.toList());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return allCart;
    }
}
