package collection.compare.test;

public class Card implements Comparable<Card> {

    private final int rank; // 카드의 숫자
    private final Suit suit; // 카드의 문양

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card another) {
        // 숫자를 먼저 비교하고, 같으면 마크를 비교한다.
        if (this.rank != another.rank) return Integer.compare(this.rank, another.rank);
        else return this.suit.compareTo(another.suit);
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
