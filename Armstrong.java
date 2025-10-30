import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner mb = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = mb.nextInt();
        int temp = n;
        int count = String.valueOf(n).length(); // More concise digit count

        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, count); // Use Math.pow for clarity
            n /= 10;
        }

        if (sum == temp) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
