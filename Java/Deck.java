import java.util.*;

public class Deck {
  int leaves; // トランプの残りの枚数
  ArrayList<Card> cards;

  public Deck() {
  }
  public void shuffle() {
    int a = (int)(Math.random() * 52);
    int b = (int)(Math.random() * 52);
    String tmp_suit = cards.get(a).suit;
    cards.get(a).suit = cards.get(b).suit;
    cards.get(b).suit = tmp_suit;

    int tmp_number = cards.get(a).number;
    cards.get(a).number = cards.get(b).number;
    cards.get(b).number = tmp_number;
  }

  public static void main(String[] args) {

    ArrayList<Card> cards = new ArrayList<Card>();
    Deck deck = new Deck();
    for (int i = 1; i <= 13; i++) {
      cards.add(new Card("spade", i));
      cards.add(new Card("clover", i));
      cards.add(new Card("dia", i));
      cards.add(new Card("heart", i));
    }

    deck.cards = cards;

    deck.shuffle();
  }
}
