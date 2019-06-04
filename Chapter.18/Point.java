public class Point <T extends Number>{

    private T xCoord;
    private T yCoord;

    public Point(T x, T y){
	xCoord = x;
	yCoord = y;
    }

    public void setX(T x){
	xCoord = x;
    }

    public void setY(T y){
	yCoord = y;
    }

    public T getX(){
	return xCoord;
    }

    public T getY(){
	return yCoord;
    }

}