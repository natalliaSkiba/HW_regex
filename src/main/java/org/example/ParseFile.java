package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseFile {
    public static List<Cart> parseInput(List<String> allCart) {
        String regex = "(FN:|LN:|N:|DATA:|Cvv:)(.+)";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        List<Cart> cartList = new ArrayList<>();
        for (String s : allCart) {
            Cart cart = new Cart();
            String s1 = s.replaceAll(" ", "\n");
            Matcher matcher = pattern.matcher(s1);
            while (matcher.find()) {
                switch (matcher.group(1)) {
                    case ("FN:") -> cart.setFirstName(matcher.group(2));
                    case ("LN:") -> cart.setLastName(matcher.group(2));
                    case ("N:") -> cart.setNumber(matcher.group(2));
                    case ("DATA:") -> cart.setData(matcher.group(2));
                    case ("Cvv:") -> cart.setCvv(matcher.group(2));
                }
            }
            cartList.add(cart);
        }
        printAll(cartList);
        return cartList;
    }

    private static void printAll(List<Cart> cartList) {
        for (Cart cart : cartList) {
            System.out.println(String.format("FistName: %-10s\t LastName: %-15s\t Card number: %-16s\t Data: %-5s\t CVV: %-3s\t",
                    cart.getFirstName(), cart.getLastName(), cart.getNumber(), cart.getData(), cart.getCvv()));
        }
    }
}
