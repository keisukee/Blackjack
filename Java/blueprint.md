## Blackjack in Java
### rule
- ディーラーは17以上になるまで引き続ける
- 21に近いほうが勝ち
- 初期カードは52枚。引く際にカードの重複は無いようにする
- プレイヤーとディーラーの2人対戦。プレイヤーは実行者、ディーラーは自動的に実行
- 実行開始時、プレイヤーとディーラーはそれぞれ、カードを2枚引く。引いたカードは画面に表示する。ただし、ディーラーの2枚目のカードは分からないようにする
- その後、先にプレイヤーがカードを引く。プレイヤーが21を超えていたらバースト、その時点でゲーム終了
- プレイヤーは、カードを引くたびに、次のカードを引くか選択できる
- プレイヤーが引き終えたら、その後ディーラーは、自分の手札が17以上になるまで引き続ける
- プレイヤーとディーラーが引き終えたら勝負。より21に近い方の勝ち
- JとQとKは10として扱う
- Aはとりあえず「1」としてだけ扱う。「11」にはしない
- ダブルダウンなし、スプリットなし、サレンダーなし、その他特殊そうなルールなし
#### blueprint
- 作るclass
  - Person
    - Player
    - Dealer
  - Deck
    - Card
  - Blackjack

#### TODO
- 動作上の問題
  - ~~Jより上を10として扱う~~
    - カードの名前、数字、得点を別々に考える
  - Aを1としても11としても扱えるように
    - 得点が、Aを1として扱った場合と11として扱った場合とで、x/yのようにスコアが表示されるようにする
    - 引いたcardをpersonクラスが保持して、そこからまとめて得点を計算するほうが簡単な気がする。引いたカードが記憶できるから得点の計算も一括でできるし。
  - 21になったときの処理、ルール確認
    - 現状だと、PlayerとDealer両方21だったときにおかしくなる
    - 21になった瞬間でゲームセットでよいのか
- コード上の問題
  - 全てのクラスがpublicになっているのでそこを解消。実行するファイルは基本的にBlackjava.javaだけということを意識
  - あるクラスで定義した関数をむやみやたらに他のクラスで使わない
  - suitとrankをもっとキレイに設定する
  - ルール上の決まりごとを定数化して一元管理、DRYに書く
