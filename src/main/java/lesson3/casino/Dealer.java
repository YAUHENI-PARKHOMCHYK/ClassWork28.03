package lesson3.casino;

import java.util.Random;

//public class Dealer {
//    private Random r = new Random();
//
//    public Card getCard() {
//        return null;
//    }
//
//    {
//    int suite = r.nextInt(4);
//    int rank = r.nextInt(13);
//    return new Card(
//            Rank.values()[rank],
//            Suite.values()[suite]);
//    }
//
//}
public class Dealer {
    // генератор карт
    private Random r = new Random();

    public Card getCard()
    {
        int suite = r.nextInt(4); // случайное число от 0 до 3
        int rank = r.nextInt(13); // случайное число от 0 до 12
        return new Card(
                Rank.values()[rank],
                Suite.values()[suite]
        );
    }
}
