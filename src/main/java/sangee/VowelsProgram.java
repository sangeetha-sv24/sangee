package sangee;

public class VowelsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloWorld";
		int vowelsCount=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u') {
				vowelsCount++;
			}
		}
		System.out.println("Total no of Vowels Present in the given string is "+vowelsCount);
	}

}
