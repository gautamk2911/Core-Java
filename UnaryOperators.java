package javaOperators;

public class UnaryOperators {
	public static void main(String[] args) {
		int num = 150;
		num++;
		System.out.println("After postIncrement: "+num);
		--num;
		System.out.println("After preIncrement: "+num);

		int first_var=100;
		int second_var=20;
		
		first_var++; 
		++first_var; //first_var=first_var+1;
		System.out.println(first_var++ + ++first_var);
		System.out.println(first_var++ + first_var++);
		System.out.println(++first_var + ++first_var);
		System.out.println(++first_var + first_var++);
		
		System.out.println("----------------------------------");
		second_var--;
		--second_var;
		System.out.println("Decrement by 1::"+second_var);
		System.out.println(second_var-- + --second_var);
		System.out.println(second_var-- + second_var--);
		System.out.println(--second_var + --second_var);
		System.out.println(--second_var - second_var--);
		
		
		
	}

}
