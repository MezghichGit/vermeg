package vermeg_oca.chapter3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import vermeg_oca.chapter4.Personne;

public class MainListArrayList {

	public static void main(String[] args) {
		/*ArrayList<String> la = new ArrayList<>();
		List<String> ls = new ArrayList<>();
		LinkedList<String> li = new LinkedList<>();
		ls=li; ls=la;*/
		ArrayList<String> ls = new ArrayList<>();
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		ls.add("oca");
		ls.add("ocp");
		ls.add("spring");
		//System.out.println(ls.isEmpty());
		//System.out.println(ls.size());
		System.out.println(ls);
		ls.remove("ocp");
		ls.remove(0);
		System.out.println(ls);
		ArrayList<Integer> tab = new ArrayList<>();
		tab.add(1);
		tab.add(0);
		tab.add(4);
		tab.add(1);
		System.out.println(tab);
		tab.remove(new Integer(1));
		System.out.println(tab);
		/*
		ls.add(true);
		ls.add("Hello");
		ls.add(12);
		for(Object e : ls)
		{
			String temp = (String)e;
			System.out.println(temp.toUpperCase());
		}*/

		Personne p = new Personne();
		
	}

}
