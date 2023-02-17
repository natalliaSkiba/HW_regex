package org.example;

import java.util.List;
//        Сделать классы
//      Карта с полями - номер имя фамилия cvv дата
//        Для хранения этих данных ОДНОЙ СТРИНГОЙ
//        для генерации ИмениФамилии итд
//        для хранения всех данных
//        для записи всех данных в файл
//        для чтения всех данных из файла
//        для парсинга регулярными выражениями и там же для предоставления этих данных при помощи printF в красивом виде
//        Далее:
//        Должны быть проверки на корректные даты - формат ММ/ГГ
//        Все отдельным проектом
public class Main {
    public static void main(String[] args) {
        CreateCard createCards = new CreateCard(20);
        createCards.getListCards();
        List<Card> cardList = createCards.getCardList();
        System.out.println(cardList);

        DataStorage dataStorage = new DataStorage();
        List<String> stringList = dataStorage.getListCardsAsListString(cardList);
        System.out.println(stringList);

        OutputFile outputFile = new OutputFile("output.txt");
        outputFile.writeFile(stringList);

        InputFile inputFile = new InputFile("output.txt");
        ParseFile parseFile = new ParseFile();
        List<Card> newCardList = parseFile.parseInput(inputFile.readFile());
        parseFile.printAll(newCardList);
    }
}