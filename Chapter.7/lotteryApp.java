import java.util.Random;

public class lotteryApp{

   private int randomarr[] = new int[5];
   private int count = 0;

   public lotteryApp(){
	Random rd = new Random();
	for(int i = 0; i < 5; i++){
	    randomarr[i] = rd.nextInt(10);
	}
   }

   void findmatch(int userarr[]){
	for(int i = 0; i < 5; i++){
	    for(int r = 0; r < 5; r++){
		if(userarr[i] == randomarr[r]){
		    count ++;
		}
	    }
	}
   }

   int getmatchNum(){
	return count;
   }

   int getrandArr(int a){
	return randomarr[a];
   }	   
}