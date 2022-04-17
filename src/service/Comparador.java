package service;

import java.util.Comparator;

public class Comparador{
	
	    Integer y;
	    int x;
	    
	    public static int compare(int x, int y) {
	        return (x < y) ? -1 : ((x == y) ? 0 : 1);
	    }

	    
//	    public int compareTo(Integer anotherInteger) {
//			return compare(this.valueOf(y), Integer.valueOf(x));
//	    }
}