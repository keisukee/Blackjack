import java.io.*;
import java.util.*;

class Player extends Person {

  Player() {
  }

  public void inOrFold(ArrayList<Card> cards) {
    int in_or_fold = 0;
    try {
      System.out.println("もう一回引く・・・1, 勝負に出る・・・2");
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String line = reader.readLine();
      in_or_fold = Integer.parseInt(line);
    } catch (IOException e) {
      System.out.println(e);
    } catch (NumberFormatException e) {
      System.out.println("数字が正しくありません");
    }
    if (in_or_fold == 1) {
      this.draw(cards);
      this.inOrFold(cards);
    } else if (in_or_fold == 2) {
      System.out.println("いざ尋常に勝負!");
    } else {
      System.out.println("例外発生");
    }
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



  public static void main(String[] args) {
    Player taro = new Player();
    Person person = new Person("hogehoge");
    System.out.println(100);
    taro.getName();
    System.out.println(taro.name);
    System.out.println(person.name);
  }
}
