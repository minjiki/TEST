
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(txAmtCalculrator(1000000000));
			
	}

	public static long txAmtCalculrator(long val){
		long stamFee=0;
		long fee = 0;
		long txAmt;
		if( val > 50000000 && val <= 100000000 ){
			stamFee = 35000;
		}else if( val > 100000000 && val <= 1000000000 ){
			stamFee = 75000;
		}else if( val > 1000000000 ){
			stamFee = 175000;
		}
		
		txAmt = val - (fee+stamFee);
		return txAmt;
	}
	
}
