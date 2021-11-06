package vermeg_oca.chapter4;

public class Imp2 implements Prediction{

	@Override
	public boolean test(String ch) {
		// TODO Auto-generated method stub
		return ch.contains("oc");
	}

}
