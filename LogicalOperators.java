package javaOperators;

public class LogicalOperators {
	public static void main(String[] args) {
		// Variables
        int a = 10, b = 20, c = 30;

        // Logical AND (&&)
        if (a < b && b < c) {
            System.out.println("Both conditions are true: a < b and b < c");
        }

        // Logical OR (||)
        if (a > b || b < c) {
            System.out.println("At least one condition is true: a > b or b < c");
        }

        // Logical NOT (!)
        boolean isConditionTrue = a > b;
        if (!isConditionTrue) {
            System.out.println("Condition is false: !(a > b)");
        }
	}

}
