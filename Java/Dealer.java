import java.io.*;
import java.util.*;

public class Dealer extends Person {

  Dealer() {
    this.name = "ディーラー";
    this.score = 0;
  }

  public int secretDraw(ArrayList<Card> cards) {
    int x = (int)(Math.random() * cards.size());
    System.out.println(this.name + "は" + "〇〇を引きました");
    score += cards.get(x).number; // score計算
    cards.remove(x);
    return score;
  }

  public void DealerTurn(ArrayList<Card> cards) {
    // dealerの処理. 1. 現在のスコアを表示, 2. 17点以上になるまでカードを引く
    // TODO 21点を超えたらゲームオーバーの処理
    this.getScore();
    int draw_or_go = 0;
    this.isScoreOver();
    if (this.score > 21 ) {
      System.out.println(this.name + "は21点を超えたので負けです");
    } else if (this.score == 21) {
      System.out.println("Blackjack! " + this.name + "の勝ち");
    } else if (this.score >= 17 && this.score < 21) {
      System.out.println(this.name + "は" + this.score + "点です");
    } else if (this.score < 17){
      this.draw(cards);
      this.DealerTurn(cards);
    }
  }
}
