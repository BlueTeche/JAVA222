import java.util.*;

public class MyList<T extends Number>{

    ArrayList<T> ob = new ArrayList<T>();

    public void add(T number){
	ob.add(number);
    }

    public T largest(){
	T la = ob.get(0);
	for(int i = 0; i < ob.size(); i++){
	    if(ob.get(i).toString().compareTo(la.toString())>0){
		la = ob.get(i);
	    }
	}
	return la;
    }

    public T smallest(){
	T sm = ob.get(0);
	for(int i = 0; i < ob.size(); i++){
	    if(ob.get(i).toString().compareTo(sm.toString()) < 0){
		sm = ob.get(i);
	    }
	}
	return sm;
    }

    public void display(){
	System.out.println(ob);
    }

}