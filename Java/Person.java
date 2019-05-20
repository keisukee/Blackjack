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

  public int draw(ArrayList<Card> cards) {
    int x = (int)(Math.random() * cards.size());
    System.out.println(this.name + "は" + cards.get(x).suit + "の" + cards.get(x).number + "を引きました");
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
    for (int i = 1; i <= 13; i++) {
      cards.add(new Card("spade", i));
      cards.add(new Card("clover", i));
      cards.add(new Card("dia", i));
      cards.add(new Card("heart", i));
    }

    deck.cards = cards;
    System.out.println(person.name);
    deck.shuffle();

    person.draw(cards);
    System.out.println(person.score);
    person.draw(cards);
    System.out.println(person.score);
    person.draw(cards);
    System.out.println(person.score);
  }
}
