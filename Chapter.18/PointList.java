import java.util.*;

public class PointList<T extends Point<?>>{

    Number x;
    Number y;

    ArrayList<T> al = new ArrayList<T>();

    public PointList(T point){
	x = point.getX();
	y = point.getY();
	addP(x,y);
    }

    public void addP(Number x, Number y){
	al.add((T) new Point(x,y));
    }

    public void display(){
	System.out.print("("+((Point<?>)al.get(0)).getX() + ", " + ((Point<?>)al.get(0)).getY() + ")");
    }
}