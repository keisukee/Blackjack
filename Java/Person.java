import java.io.*;
import java.util.*;

class Person {
  String name;
  int score = 0;

  Person() { // これがないとサブクラスでインスタンスを生成するときにエラーが出る。なぜなら、サブクラスはスーパークラスの引数なしコンストラクタを呼び出そうとするから
  }

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


  public static void main(String[] args) { // TODO JとQとKは10として扱う&Aはとりあえず1として扱う
    Person person = new Person("hogehoge");
    Deck deck = new Deck();
    ArrayList<Card> cards = new ArrayList<Card>();
    // TODO 死ぬほどDRYじゃないので、後でキレイにする
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
    System.out.println(person.name);

    person.draw(cards);
    System.out.println(person.score);
    person.draw(cards);
    System.out.println(person.score);
    person.draw(cards);
    System.out.println(person.score);
  }
}
