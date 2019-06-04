public class PointListTest{

    public static void main(String[] args){

	Point<Integer> a = new Point<Integer>(7, 4);
	Point<Integer> b = new Point<Integer>(3, 9);

	PointList<Point<Integer>> a1 = new PointList<Point<Integer>>(a);
	PointList<Point<Integer>> b1 = new PointList<Point<Integer>>(b);

	System.out.println("The value in ArrayList is ");
	a1.display();
	b1.display();

    }
}