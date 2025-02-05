package String.PawanSirClassQuestion.WithoutMethod;

public class FristCharToUpperUsingCharacterClass {
    public static void main(String[] args) {
		String str="deepak";
		String result="";
		char fristChar=str.charAt(0);
		if(Character.isLowerCase(fristChar)) {
			result=Character.toUpperCase(fristChar)+str.substring(1);
		}else {
			result=str;
		}
		System.out.println(result);

	}
}
