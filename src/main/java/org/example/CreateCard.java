package org.example;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
// создание объектов типа Card
public class CreateCard {
    private int countCard;
    private List<Card> cardList = new ArrayList<>();
    public List<Card> getCardList() {
        return cardList;
    }
    public CreateCard(int countCard){
      this.countCard = countCard;
    }
    public void getListCards() {
        Generator gt = new Generator();
        for (int i = 0; i < countCard; i++) {
            cardList.add(new Card(gt.generateFirstName(), gt.generateLastName(), gt.generateNumber(), gt.generateData(), gt.generateCVV()));
        }
    }
}
