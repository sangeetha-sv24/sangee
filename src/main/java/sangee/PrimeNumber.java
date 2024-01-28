package sangee;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=100;
		//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, and 97
		int ct=0,n=0,i=1,j=1;  
		while(n<5)  
		{  
		j=1;  
		ct=0;  
		while(j<=i)  
		{  
		if(i%j==0)  
		ct++;  
		j++;   
		}  
		if(ct==2)  
		{  
		System.out.printf("%d ",i);  
		n++;  
		}  
		i++;  
		}    
		
	}

}
