package org.example;

public class Main {
    public static void main(String[] args) {
     OutputFile.writeFile(DataStorage.getAllClients());
      ParseFile.parseInput(InputFile.readFile());
    }
}