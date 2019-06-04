public class Card{

   private int cardN;
   final static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
   final static String[] ranks = {"2", "3","4","5","6","7","8", "9","10", "Jack", "Queen", "King", "Ace"};

   Card (int a) {
	setCard(a);
   }

   public void setCard(int b) {
	cardN = (b >= 0 && b<= 51)? b: 0;
   }

   public int getCardNum() {
	return cardN;
   }

   public String toString() {
	return ranks[cardN%13] + " of " + suits[cardN/13];
   }

   public String getS() {
	return suits[cardN/13];
   }

   public String getR() {
	return ranks[cardN%13];
   }

   public int getV() {
	return cardN%13;
   }
}