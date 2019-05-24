import java.io.*;
import java.util.*;

class Player extends Person {

  Player() {
  }

  public void getName() {
    try {
      System.out.println("お名前をお聞かせ願えますでしょうか");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String line = reader.readLine();
      this.name = line;
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("数字が正しくありません");
    }
  }

  public void playerTurn(ArrayList<Card> cards) {
    // playerの処理. 1. 現在のスコアを表示, 2. カードを引かず勝負するか、カードを引くか, 3. 勝負するなら終了, カードを引くなら初めに戻る
    // TODO 21点を超えたらゲームオーバーの処理
    this.getScore();
    int draw_or_go = 0;
    try {
      System.out.println("もう一回引く・・・1, 勝負に出る・・・2");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String line = reader.readLine();
      draw_or_go = Integer.parseInt(line);
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("数字が正しくありません");
      playerTurn(cards);
    }

    if (draw_or_go == 1) {
      this.draw(cards);
      this.isScoreOver();
      this.playerTurn(cards);
    } else if (draw_or_go == 2) {
      System.out.println("いざ尋常に勝負!");
    } else {
      System.out.println("例外発生");
    }
  }

  public static void main(String[] args) {
    Player taro = new Player();
    Person person = new Person("hogehoge");
    System.out.println(100);
    taro.getName();
    System.out.println(taro.name);
    System.out.println(person.name);
  }
}
