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
}
