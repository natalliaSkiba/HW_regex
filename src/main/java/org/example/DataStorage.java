package org.example;

import lombok.ToString;
import java.util.ArrayList;
import java.util.List;
@ToString
// в этом классе храним список из n карт в листе строк
public class DataStorage {
    private List<String> listCardsAsString = new ArrayList<>();
    // метод принимает лист карт и переводит в лист стнингов
    public List<String> getListCardsAsListString(List<Card> listCards) {
        for (Card card : listCards) {
            listCardsAsString.add(" FN:" + card.getFirstName() + " LN:" + card.getLastName() +
                    " N:" + card.getNumber() + " DATA:" + card.getData() + " Cvv:" + card.getCvv() + " ");
        }
        return listCardsAsString;
    }
}
