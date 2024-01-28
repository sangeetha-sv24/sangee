package sangee;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input: Hello World
				//Output: olleH dlroW
				String str="Hello World";
				String word[]=str.split("\\s");
				String reverseWord="",newString2="";
				for(String s:word) {
					String rev="";
					for(int i=s.length()-1;i>=0;i--) {
						rev+=s.charAt(i);
					}
					reverseWord=reverseWord+rev+" ";
					
				}
				System.out.println(reverseWord);
			}
			/*String word[]=str.split("\\s");
			String reverseWord="";
			for(String s:word) {
				StringBuilder sb=new StringBuilder(s);
				 sb.reverse();  
			     reverseWord+=sb.toString()+" "; 
			}
			System.out.print(reverseWord.trim());*/

	

}
