package org.example;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class DataStorage {
  private static List<String> allClients;

    public static List<String> getAllClients(){
       allClients = new ArrayList<>();
        for (int i = 0; i < 30; i++){
            allClients.add(DataCartClient.getClientAsString(
                    new Cart(Generator.generateFirstName(), Generator.generateLastName(),
                    Generator.generateNumber(), Generator.generateData(), Generator.generateCVV())));
           }
        return allClients;
    }
}
