public class MyListTest{

    public static void main(String[] args){

	MyList<Number> ls = new MyList<Number>();
	
	ls.add(6);
	ls.add(2.3);
	ls.add(4.7);
	ls.add(3);
	ls.add(1);
	ls.add(0);
	ls.add(9.9);
	
	System.out.println("Numbers in the ArrayList are: ");
	ls.display();

	Number la = ls.largest();	
	System.out.println("\nThe largest number is " + la);

	Number sm = ls.smallest();
	System.out.println("\nTHe smallest number is " + sm);

    }

}