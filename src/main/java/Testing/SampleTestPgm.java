package Testing;

public class SampleTestPgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="    Welcome   to Interview";
		String newStr=str.replaceAll("( )+", " ");
		newStr.trim();
		/* int len = str.length();  
		//initialize count array index  
		for (int i = 0; i < len; i++)  
		count[str.charAt(i)]++;  
		//create an array of given String size  
		char ch[] = new char[str.length()];  
		for (int i = 0; i < len; i++)   
		{  
		ch[i] = str.charAt(i);  
		int find = 0;  
		for (int j = 0; j <= i; j++)   
		{  
		//if any matches found  
		if (str.charAt(i) == ch[j])  
		find++;  
		}             
		if (find == 1)  
		//prints occurrence of the character   
		System.out.println("The occurrence of "+ str.charAt(i)+ " is: " + count[str.charAt(i)]);  
		} */ 
		System.out.println(newStr);
		}  
		
}
