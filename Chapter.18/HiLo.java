public class HiLo <T extends Comparable<T>>{

    T[] arr;

    public HiLo(T[] ar){
	arr = ar;
    }

    public T highest(){
	T hi = arr[0];
	for (int i = 1; i < arr.length; i++){
	    if(hi.compareTo(arr[i]) < 0){
		hi = arr[i];
	    }
	}
	return hi;
    }

    public T lowest(){
	T lo = arr[0];
	for (int i = 1; i < arr.length; i++){
	    if(lo.compareTo(arr[i]) > 0){
		lo = arr[i];
	    }
	}
	return lo;
    }

}