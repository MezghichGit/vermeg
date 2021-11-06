package vermeg_oca.chapter5;

import java.util.function.Predicate;

public class ExpressionLambda {

	public static void main(String[] args) {
		Predicate<String>p = (String s)->{return s.length()>10;};
		
		String ch = "abccccccccabcccccccc";
		System.out.println(p.test(ch));

	}

}
