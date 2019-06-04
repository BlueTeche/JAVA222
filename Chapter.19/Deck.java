public class Deck{

   private Card[] deck = new Card[52];
   private int tc;

   public Deck(){
	tc = 0;
	for(int i = 0; i < deck.length; i++){
	   deck[i] = new Card(i);
	}
   }

   public void shuffle(){
	tc = 0;
	for(int i = 0; i < 1000; i++){
	   int a = (int)(Math.random()*52);
	   int b = (int)(Math.random()*52);
	   Card temp = deck[a];
	   deck[a] = deck[b];
	   deck[b] = temp;
	}
   }

   public Card dealC(){
	Card c;
	if(tc < deck.length){
	   c = deck[tc];
	   tc++;
	} else{
	   c = null;
	}
	return c;
   }
}