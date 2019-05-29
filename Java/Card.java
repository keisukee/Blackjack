public class Card {
  String suit; // スペード、ダイヤ、ハート、クローバー,TODO 定数化
  int number; // 1(11),2,3,4,5,6,7,8,9,10,10(jack),10(queen),10(king)
  String rank; // A(1),2,3,4,5,6,7,8,9,10,J,Q,K

  Card(String suit, int number, String rank) {
    this.suit = suit;
    this.number = number;
    this.rank = rank;
  }
  Card(String suit, int number) {
    this.suit = suit;
    this.number = number;
  }
  Card(String rank) {
    this.rank = rank;
  }
}
