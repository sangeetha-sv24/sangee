package sangee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomFileNameGeneration {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			System.out.println(Math.random());
		}
		Random random = new Random(); 
		for(int i=0;i<5;i++) {
			System.out.println(random.nextInt());
		}
		
		
		
		
		
		/*	String str="sangeetha";
			String revString="";
			for(int i=str.length()-1;i>=0;i--) {
				revString=revString+str.charAt(i);
			}
			int count=0;
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
					count++;
				}
			}
			System.out.println("Vowels count is "+count+revString);*/
//	}
		
//		int[] array=new int[] {1,2,3,4,5,100,2};
//		int sum=0;
//		for(int i=0;i<array.length;i++) {
//			sum=sum+array[i];			
//		}
//		for(int a:array) {
//			sum=sum+a;
//		}
//		System.out.println("Sum of Array is "+sum);
		
	/*	int maxNo=array[0];
		
		for(int i=1;i<array.length;i++) {
			if(maxNo<array[i]) {
				maxNo=array[i];
			}
		}
	
		System.out.println("Max Value in array is "+maxNo);*/
		/*String fileName="login";
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
		Random  ram=new Random();
		ram.
		//Date date=sdf.parse("18/01/2024");
		Date date=new Date();
		System.out.println(date.toString());*/
//		for(int i=0;i<5;i++) {
//			System.out.println(sdf.getDateInstance());
//		}
	}

}
