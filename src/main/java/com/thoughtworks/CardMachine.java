package com.thoughtworks;

import java.util.ArrayList;
import java.util.Scanner;

public class CardMachine {
    private Deck deck;
    private Scanner scanner;

    public CardMachine() {
        deck = new Deck();
        scanner = new Scanner(System.in);
    }

    public CardMachine(Deck deck) {
        this.deck = deck;
        scanner = new Scanner(System.in);
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public void renewDeck() {
        deck = new Deck();
    }

    public void drawCards() {
        System.out.println("How many cards you want draw?");
        int n = scanner.nextInt();
        if (n > deck.size()) {
            System.out.println("Wrong! This is only " + deck.size() + " cards in this deck! Please retry.");
            drawCards();
        } else {
            ArrayList<Card> outCards = deck.drawCards(n);
            String outInfo = "";
            for (int i = 0; i < outCards.size(); i++) {
                outInfo += outCards.get(i).toString() + " ";
            }
            System.out.println(outInfo);
        }
    }
}

