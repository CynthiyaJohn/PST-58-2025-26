package PST;

public class ASCIIAlphabets {

	public static void main(String[] args) {
		System.out.println("Alphabets and their ASCII Values:");
		
		Uppercase();
		Lowercase();
	}
	static void Uppercase() {
		
		System.out.println();
		System.out.println("Uppercase Alphabets and their ASCII Values:");
		for(char c='A';c<='Z';c++) {
			int value=c;
			System.out.print(c + " = " + value +",");
		}
	}
    static void Lowercase() {
    	    System.out.println();
		System.out.println("\nLowercase Alphabets and their ASCII Values:");
		for(char ch='a';ch<='z';ch++) {
			int valuez=ch;
			System.out.print(ch + " = " + valuez +",");
		}
    }
}