package sangee;

import java.util.HashMap;

public class ReverseEachWordwithSameSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//i/p  --> I love Indium
		//o/p  --> M uidn Ievoli
		String str="I love Indium";
		String strNew=str.replace(" ", "");
		//System.out.println(strNew);
		StringBuilder stringReverse=new StringBuilder(strNew);
		stringReverse.reverse();
		System.out.println(stringReverse);
		int j=0;String outStr="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				char newCh=str.charAt(i);
				if(newCh>='A'&& newCh<='Z') {
					char temp=stringReverse.charAt(j);
					String s=String.valueOf(temp);
					outStr=outStr+s.toUpperCase();
				}
				else {
					char temp=stringReverse.charAt(j);
					String s=String.valueOf(temp);
					outStr=outStr+s.toLowerCase();
					
				}	
				j++;
			}
			else {
				
				outStr=outStr+" ";
			}
				
		}
	
		System.out.println(outStr);
		
		
		
		
	/*	HashMap<Integer, String> map = new HashMap<Integer, String>();
		for (int j = str.length()-1; j >=0; j--) {
			char c = str.charAt(j);
			Character ch = str.charAt(j);
//			System.out.println(ch);
			
			
			System.out.print(stringReverse);
//			System.out.print(stringReverse);
			if(ch.isUpperCase(ch)) {
//				stringReverse += String.valueOf(ch);
			}
		
//			String string = String.valueOf();  
//			String string = (String)str.charAt(j);
		
		}
		
		

		for (int i = 0; i < str.length()-1; i++) {
			Character x = str.charAt(i);
			if(Character.isUpperCase(x)) {
				System.out.println("true condition");
				stringReverse = String.valueOf(ch).toUpperCase();		
			}
			else {
				System.out.println("false condition");
				stringReverse = String.valueOf(ch).toLowerCase();
			}
		}
		*/
	
		
		
		
		/*int i=0;
		String newString="";
		char[] ch=str.toCharArray();
		for(int j=str.length()-1;j>=0;j--) {
			if(str.charAt(i)!=' ') {
				char newCh=str.charAt(i);
				String newStr=String.valueOf(newCh);
				if(newCh>='A'&& newCh<='Z') {
					if(str.charAt(j)!=' ') {
					char s=str.charAt(j);
					String temp=String.valueOf(s);
					newString=newString+temp.toUpperCase();
					}
				}
				else {
					if(str.charAt(j)!=' ') {
					char t=str.charAt(j);
					String temp=String.valueOf(t);
					newString=newString+temp.toLowerCase();
					}
				}
			}
			else {
				newString=newString+" ";
				if(j!=2) {
				j++;
				}
			}
			i++;
		}
		System.out.println(newString);*/
	} 

}
