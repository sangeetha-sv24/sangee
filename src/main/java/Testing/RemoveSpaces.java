package Testing;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		String str="  . Welcome   to   Interview  ";
		String newStr="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='.') {
				
			}
			else
				newStr=newStr+str.charAt(i);
		}
		
		newStr=newStr.replaceAll("( )+", " ");
		System.out.println(newStr);
		System.out.println(newStr.replaceAll("( )+", " ").trim());
		
	}

}
