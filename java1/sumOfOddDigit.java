
import java.util.*;
public class sumOfOddDigit {
    public static void main(String[] args) {
        int n,sum=0,digit;
        Scanner mb=new Scanner(System.in);
        n=mb.nextInt();
        System.out.println("Enter the number is:"+n);
        while (n>0) {
            digit=n%10;
            if ((digit%2)!=0) {
                sum=sum+digit;
                
            }
            n=n/10;
    }
    System.out.println("Sum of the odd number is:"+sum);
    
}
}
