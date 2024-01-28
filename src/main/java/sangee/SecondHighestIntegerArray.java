package sangee;

public class SecondHighestIntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number=new int[] {11,4,6,9,32,2,7,16};
		int maxNum=number[0];
		
		for(int i=1;i<number.length;i++) {
			if(maxNum<number[i])
				maxNum=number[i];
		}
		System.out.println("Max Number in array is  "+maxNum);
		int secondMax=number[0];
		for(int j=1;j<number.length;j++) {
			if(number[j]<maxNum && number[j]>secondMax) {
				secondMax=number[j];
			}
				
		}
		System.out.println("Second Max Number in array is  "+secondMax);
		
	}

}
