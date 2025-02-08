package arraysInJava;

public class CheckVowelInArray {
	static boolean isVowel(Character c) {
		switch(c) {
		case 'a','e','i','o','u','A','E','I','O',
		'U':
			return true;
		default: 
			return false;
		}
	}
	public static void main(String[] args) {
		Character[] ch = {'a','b','z','c','k','a','s','A','U','Z'};
		int count = 0;
		for(Character c : ch) {
			if(isVowel(c)) {
				System.out.print(c+" ");
				count++;
			}
		}
		System.out.println("\nTotal number of vowels in the array: "+count);
		
	}

}
