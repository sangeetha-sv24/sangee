package sangee;

public class StringOccuranceCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Sangeetha test qa automation sang chubb qa";
		String findWord="sang";
		String word[]=str.split(" ");
		int count=0;
		for(String w:word){
		if(w.contains(findWord)){
		count++;
		}
		}
		System.out.println("The total count of the word sang is "+count);

	}

}
