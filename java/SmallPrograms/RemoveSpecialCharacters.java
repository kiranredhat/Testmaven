package SmallPrograms;

public class RemoveSpecialCharacters {

	public static void main(String[] args) {
String s ="@#$ latin string 012345679";
s=s.replaceAll("[^ a-zA-Z0-9]", "");//Accept only these value
System.out.println(s);

	}

}
