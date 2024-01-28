package sangee;

public class PrintVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="sangeetha";
         for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'a')
                System.out.println(s.charAt(i));
            else if(s.charAt(i) == 'e')
                System.out.println(s.charAt(i));            
            else if(s.charAt(i) == 'i')
                System.out.println(s.charAt(i));
            else if(s.charAt(i) == 'o')
                System.out.println(s.charAt(i));
            else if(s.charAt(i)=='u')
                System.out.println(s.charAt(i));
        }
}
	

}
