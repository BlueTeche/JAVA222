import java.util.*;

public class CardPlay{

   public static void main(String[] args){

	Card[][] ab = new Card[2][1];
	Deck ob = new Deck();

	for(int i = 0; i < 26; i++){
	   System.out.printf("\n Round % \n", i);
	}
	for (int p= 0; p< ab.length; p++){
	   ab[p][0] = ob.dealC();
	}

	for (int pl= 0; pl< ab.length; pl++) {
	   System.out.printf("Player %d: ", pl);
	   showCards(ab[pl]);
	}

	int player1 = ab[0][0].getV(); 
	int player2 = ab[1][0].getV();

	if (player1 > player2){
	   System.out.println("Player One Wins.");
	} else if (player2 > player1) {
	   System.out.println("Player Two Wins.");
	} else{
	   System.out.println("The War Is A Tie");
	}
   }

   public static void showCards(Card[] a) {

	for (int c= 0; c< a.length; c++){
	   System.out.printf("%s", a[c].toString());
	}
	System.out.println();

   }
}