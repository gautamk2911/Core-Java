package basicCodes;

public class NeonNumber {
    public static void main(String[] args) {
        int num = 9; // Change this to test other numbers
        int sq = num * num; // Square of the number
        int sum = 0;

        // Calculate sum of digits of square
        int temp = sq; // Preserve sq for summation
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check if sum is equal to the original number
        if (sum == num) {
            System.out.println(num + " is a Neon Number");
        } else {
            System.out.println(num + " is not a Neon Number");
        }
    }
}
