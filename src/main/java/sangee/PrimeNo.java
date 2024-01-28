package sangee;

import java.util.ArrayList;
import java.util.List;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		List<Integer> primeNumber=new ArrayList<Integer>();
		for(int i=2;i<n;i++) {
			for(int j=2;j<=i;j++) {
				if(i%j==0) {
					primeNumber.add(i);
					break;
				}
			}
			
		}
		System.out.println(primeNumber);
	}

}
