import java.util.*;

public class Deck {
  ArrayList<Card> cards;

  Deck() {

  }

  public static void main(String[] args) {

    ArrayList<Card> cards = new ArrayList<Card>();
    Deck deck = new Deck();
    for (int i = 1; i <= 1; i++) {
      cards.add(new Card("SPADE", i, "A"));
      cards.add(new Card("CLOVER", i, "A"));
      cards.add(new Card("DIA", i, "A"));
      cards.add(new Card("HEART", i, "A"));
    }
    for (int i = 2; i <= 10; i++) {
      cards.add(new Card("SPADE", i, Integer.toString(i)));
      cards.add(new Card("CLOVER", i, Integer.toString(i)));
      cards.add(new Card("DIA", i, Integer.toString(i)));
      cards.add(new Card("HEART", i, Integer.toString(i)));
    }
    for (int i = 11; i <= 11; i++) {
      cards.add(new Card("SPADE", 10, "J"));
      cards.add(new Card("CLOVER",10, "J"));
      cards.add(new Card("DIA", 10, "J"));
      cards.add(new Card("HEART", 10, "J"));
    }
    for (int i = 12; i <= 12; i++) {
      cards.add(new Card("SPADE", 10, "Q"));
      cards.add(new Card("CLOVER", 10, "Q"));
      cards.add(new Card("DIA", 10, "Q"));
      cards.add(new Card("HEART", 10, "Q"));
    }
    for (int i = 13; i <= 13; i++) {
      cards.add(new Card("SPADE", 10, "K"));
      cards.add(new Card("CLOVER", 10, "K"));
      cards.add(new Card("DIA", 10, "K"));
      cards.add(new Card("HEART", 10, "K"));
    }

    deck.cards = cards;

    for (int i = 0; i < cards.size(); i++) {
      System.out.println(cards.get(i).suit + " " + cards.get(i).number + " " + cards.get(i).rank);
    }
  }
}
