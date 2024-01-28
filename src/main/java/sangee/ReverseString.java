package sangee;

public class ReverseString {

	public static void main(String[] args) {
		String str="sangeetha";
		
			// TODO Auto-generated method stub
		char ch[]=str.toCharArray();  
	    String rev="";  
	    for(int i=ch.length-1;i>=0;i--){  
	        rev+=ch[i];  
	    }  
	    System.out.println(rev);

}
}