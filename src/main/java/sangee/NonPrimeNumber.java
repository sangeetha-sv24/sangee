package sangee;

import java.util.ArrayList;

public class NonPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;//end of the interval
	    int y=1;//first of the interval
	    ArrayList<Integer> nonPrime = new ArrayList<Integer>();
	    for(int i=y+1;i<x;i++)
	    {
	        for(int j=2;j<i;j++)
	        {  
	            if((i%j==0))
	            {
	               nonPrime.add(i);
	               break;
	            }
	        }
	    }
	    System.out.println(nonPrime);

	}

}
