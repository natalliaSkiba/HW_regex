package org.example;
import lombok.ToString;
import java.util.ArrayList;
import java.util.List;
@ToString
// создание объектов типа Card
public class CreateCard {
    private List<Card> cardList = new ArrayList<>();
    public List<Card> getListCards() {
        Generator gt = new Generator();
        for (int i = 0; i < 3; i++) {
            cardList.add(new Card(gt.generateFirstName(), gt.generateLastName(), gt.generateNumber(), gt.generateData(), gt.generateCVV()));
        }
        return cardList;
    }
}
