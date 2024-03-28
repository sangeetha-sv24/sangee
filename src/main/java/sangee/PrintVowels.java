package sangee;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="sangeetha";
         int count=s.replaceAll("[^aeiouAEIOU]","").length();
		System.out.println(count);
		System.out.println(s);
		String vowels=s.replaceAll("[^aeiouAEIOU]","");
		System.out.println(vowels);

	}
        }
}
	

}
