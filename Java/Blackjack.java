import java.util.*;

public class Blackjack {
  Player player;
  Dealer dealer;
  Deck deck;

  public void doFinish() {
    if (this.player.score > 21) {
      System.out.println("終了");
      // exit(0);
    } else if (this.player.score == 21) {
      System.out.println(this.player.name + "の勝ちで終了");
    } else {
      System.out.println("まだまだ続く");
    }
  }

  public void who_win(Player player, Dealer dealer) {
    if (player.score < 22 && dealer.score < 22) {
      if (player.score > dealer.score) {
        System.out.println(player.name + "の勝ち");
      } else if (player.score == dealer.score) {
        System.out.println(player.name + "と" + dealer.name + "は引き分け");
      } else {
        System.out.println(dealer.name + "の勝ち");
        System.out.println("YOU LOSE");
      }
    }
  }

  public static void main(String[] args) {
    Blackjack blackjack = new Blackjack();
    // カードの準備
    Deck deck = new Deck();
    ArrayList<Card> cards = new ArrayList<Card>();
    for (int i = 1; i <= 13; i++) {
      cards.add(new Card("spade", i));
      cards.add(new Card("clover", i));
      cards.add(new Card("dia", i));
      cards.add(new Card("heart", i));
    }
    deck.cards = cards;
    blackjack.deck = deck;

    // プレイヤーとディーラーの準備
    Player player = new Player();
    Dealer dealer = new Dealer();
    blackjack.player = player;
    blackjack.dealer = dealer;
    player.getName();

    // ここからゲーム開始

    player.draw(cards);
    player.draw(cards);
    dealer.draw(cards);
    dealer.secretDraw(cards);

    player.playerTurn(cards);
    dealer.DealerTurn(cards);

    blackjack.who_win(player, dealer);
  }
}
