package vermeg_oca.chapter4;

public class ImpPrediction implements Prediction{

	@Override
	public boolean test(String ch) {
		// TODO Auto-generated method stub
		return ch.length()==3;
	}

}
