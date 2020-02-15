package com.thoughtworks;

public class Card {

    private Suit suit;
    private int point;

    public Card() {
    }

    public Card(Suit suit, int point) {
        this.suit = suit;
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        if (point < 1 || point > 13) {
            System.out.println("Wrong card point, the point must between 1 and 13");
        } else {
            this.point = point;
        }
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        String point;
        switch (this.point) {
            case 1:
                point = "A";
                break;
            case 11:
                point = "J";
                break;
            case 12:
                point = "Q";
                break;
            case 13:
                point = "K";
                break;
            default:
                point = this.point + "";
        }
        return suit.getName() + point + "";
    }
}
