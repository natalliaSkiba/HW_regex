package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ParseFile {
    public List<Card> parseInput(List<String> allCart) {
        String regex = "(FN:|LN:|N:|DATA:|Cvv:)(.+)";
        Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        List<Card> cardList = new ArrayList<>();
        for (String s : allCart) {
            Card card = new Card();
            String s1 = s.replaceAll(" ", "\n");
            Matcher matcher = pattern.matcher(s1);
            while (matcher.find()) {
                switch (matcher.group(1)) {
                    case ("FN:") -> card.setFirstName(matcher.group(2));
                    case ("LN:") -> card.setLastName(matcher.group(2));
                    case ("N:") -> card.setNumber(matcher.group(2));
                    case ("DATA:") -> card.setData(matcher.group(2));
                    case ("Cvv:") -> card.setCvv(matcher.group(2));
                }
            }
            cardList.add(card);
        }
        return cardList;
    }
    public void printAll(List<Card> cardList) {
        for (Card card : cardList) {
            System.out.println(String.format("FistName: %-10s\t LastName: %-15s\t Card number: %-16s\t Data: %-5s\t CVV: %-3s\t",
                    card.getFirstName(), card.getLastName(), card.getNumber(), card.getData(), card.getCvv()));
        }
    }
}
