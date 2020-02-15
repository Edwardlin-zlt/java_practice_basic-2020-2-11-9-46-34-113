package com.thoughtworks;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private Random r;

    public Deck() {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (int i = 1; i < 14; i++) {
                cards.add(new Card(suit, i));
            }
        }
        r = new Random();
    }

    public Deck(ArrayList<Card> cards) {
        this.cards = cards;
        r = new Random();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public int size() {
        return cards.size();
    }

    public Card drawACard() {
        int index = r.nextInt(cards.size());
        return cards.remove(index);
    }

    public ArrayList<Card> drawCards(int n) {
        ArrayList<Card> outCards = new ArrayList<>();
        if (n < 1 || n > cards.size()) {
            try {
                throw new Exception("抛出异常");
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("捕获异常");
            }
        } else {
            for (int i = 0; i < n; i++) {
                outCards.add(drawACard());
            }
        }
        return outCards;
    }
}
