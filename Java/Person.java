import java.io.*;
import java.util.*;

class Person {
  String name;
  int score = 0;

  Person() {} // これがないとサブクラスでインスタンスを生成するときにエラーが出る。なぜなら、サブクラスはスーパークラスの引数なしコンストラクタを呼び出そうとするから

  Person(String name) {
    this.name = name;
    this.score = 0;
  }

  public void isScoreOver() {
    if (this.score > 21) {
      System.out.println(this.name + "の負けです");
      System.exit(0);
    }
  }

  public int draw(ArrayList<Card> cards) {
    int x = (int)(Math.random() * cards.size());
    System.out.println(this.name + "は" + cards.get(x).suit + "の" + cards.get(x).rank + "を引きました");
    score += cards.get(x).number; // score計算
    cards.remove(x);
    return score;
  }

  public int getScore() {
    System.out.println(this.name + "の得点は" + this.score + "です");
    return this.score;
  }

  public void winOrLose() {
    if (this.score > 21) {
      System.out.println(this.name + "の負けです");
    } else if (this.score == 21) {
      System.out.println(this.name + "の勝利");
    } else {
      this.getScore();
      System.out.println("まだまだ続くぞい"); // TODO ディーラーとプレイヤーの勝敗を決めるようにする
    }
  }
}
