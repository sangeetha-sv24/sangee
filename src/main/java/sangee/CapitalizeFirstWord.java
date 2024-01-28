package sangee;

public class CapitalizeFirstWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="My name is sangeetha";
		String[] words=sentence.split(" ");
		String firstLetter,remainWord,capitalizeWord="";
		for(String word:words) {
			firstLetter=word.substring(0,1).toUpperCase();
			remainWord=word.substring(1);
			capitalizeWord=capitalizeWord+firstLetter+remainWord+" ";
			
		}
		System.out.println(capitalizeWord);
	}

}
