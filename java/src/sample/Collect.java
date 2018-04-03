package sample;

import java.util.ArrayList;
import java.util.Collection;

public class Collect {
	public static void main(String args[]) {
		Collection<Integer> value=new ArrayList<>();
		value.addAll(5,6,7,8,9);
		System.out.println(value);
		
	}

}
