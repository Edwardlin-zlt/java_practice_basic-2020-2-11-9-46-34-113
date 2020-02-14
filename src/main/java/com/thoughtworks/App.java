package com.thoughtworks;

public class App {

    public static void main(String[] args) {
        CardMachine cardMachine = new CardMachine();
        while (true) {
            cardMachine.drawCards();
            if (cardMachine.getDeck().size() == 0) {
                break;
            }
        }
    }
}
