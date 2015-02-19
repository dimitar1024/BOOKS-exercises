import java.util.Scanner;


public class _03_TextWithUppercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		sc.close();
		ModifyWithUpperCase(text);
	}
	
	public static void ModifyWithUpperCase(String text){
		int startGet = text.indexOf("<upcase>");
			int endGet = text.indexOf("</upcase>") + 9;
			int startReplace = startGet + 8;
			int endReplace = endGet -9;
			
			String uppercase = (String) text.subSequence(startReplace, endReplace);
			uppercase = uppercase.toUpperCase();
			String start = text.substring(0, startGet);
			String end = text.substring(endGet);
			
			String newWord = start + uppercase + end;
			System.out.println(newWord);
			
	}
	

}
