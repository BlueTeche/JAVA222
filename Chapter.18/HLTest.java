public class HLTest{

    public static void main(String[] args){

	Integer[] inte = {10, 9, 32, 12, 27, 25};

	HiLo<Integer> ob = new HiLo<Integer>(inte);

	Integer hhi = ob.highest();
	System.out.println("The highest value is " + hhi);
	Integer loww = ob.lowest();
	System.out.println("The lowest value is " + loww);

    }

}