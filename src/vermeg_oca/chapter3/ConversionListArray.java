package vermeg_oca.chapter3;

import java.util.*;

public class ConversionListArray {

	public static void main(String[] args) {
		/*
		List<String> list = new ArrayList<>();
		list.add("hawk"); 
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray[0]+" "+objectArray[1]);*/
		
		String tab[] = {"oca","ocp","spring boot","Angular"};
		List<String> list = Arrays.asList(tab); 
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//list.set(1,"Angular");
		//System.out.println(list);

	}

}
