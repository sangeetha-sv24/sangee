package sangee;

public class MinDiffArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray=new int[] {10, 5, 9, 14, 8};
		int diff=numArray[0]-numArray[1];
		for(int i=1;i<numArray.length-1;i++) {
			int num=numArray[i]-numArray[i+1];
			if(num<diff) {
				diff=num;
			}			
			
//			for(int j=i+1;j<numArray.length;j++) {
//				int num=numArray[i]-
//			}
		}
		System.out.println("Minimum Difference is"+diff);
	}

}
