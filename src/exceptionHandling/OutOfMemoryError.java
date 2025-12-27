package exceptionHandling;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemoryError {

	public static void main(String[] args) {
		
		List<Integer[]>  list =new ArrayList<>();
		while(1>0) {
			list.add(new Integer[10000000]);
		}
		
		//4bytes*1000000=40HD
		// by this memory is full so OutOfMemoryError
	}

}
