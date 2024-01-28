package Testing;

public class StringComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stubString
		String str="ABCD";
		String bdr="ABCD";
		boolean flag=true;
		for(int i=0;i<str.length();i++)
		{
		if(str.charAt(i)!=bdr.charAt(i)){
			flag=false;
			break;
		}
		}
		if(flag==true)
			System.out.println("Both string are equal");
		else
			System.out.println("Both strings are not equal");
		

	}

}
