package org.example;
import lombok.ToString;

@ToString
public class DataCartClient {
    private static String dataClient;
   // Cart cart;
    static String getClientAsString(Cart cart) {
        dataClient = "FN:" + cart.getFirstName() + " LN:" + cart.getLastName() + " N:" +
        cart.getNumber() + " DATA:" + cart.getData() + " Cvv:" + cart.getCvv() + " ;";
          return dataClient;
    }
}
