package vermeg_oca.chapter5;

import java.util.ArrayList;
import java.util.List;

public class Animal {

	private final List<String> foods;
	
	public Animal(List<String> val) {
		this.foods = new ArrayList(val);
	}
	
	public List<String> getFoods() {
		return new ArrayList(foods);
	}

	public static void main(String[] args) {
		List<String> f = new ArrayList<>();
		f.add("meat");
		f.add("fish");
		Animal a = new Animal(f);
		//f.clear();
		System.out.println(a.getFoods());
		
		List<String> f2 = a.getFoods();
		f2.clear();
		System.out.println(a.getFoods());

	}

}
