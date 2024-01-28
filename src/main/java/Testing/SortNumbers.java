package Testing;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldArray=new int[]{5,7,4,4,0,0,1};
		
		for(int i=0;i<oldArray.length;i++) {
			for(int j=i+1;j<oldArray.length;j++) {
				int temp;
				if(oldArray[i]>oldArray[j]) {
					temp=oldArray[i];
					oldArray[i]=oldArray[j];
					oldArray[j]=temp;
				
				}
				
			}
			System.out.println(oldArray[i]);
		}
		

	}

}
