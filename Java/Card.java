public class Card {
  String suit; // スペード、ダイヤ、ハート、クローバー,TODO 定数化
  int number; // A(1),2,3,4,5,6,7,8,9,10,J,Q,K

  public Card(String suit, int number) {
    this.suit = suit;
    this.number = number;
  }

  public static void main(String[] args) {
    Card dia_1 = new Card("dia", 1);
    System.out.println(dia_1.suit + "の" + dia_1.number);
  }
}
