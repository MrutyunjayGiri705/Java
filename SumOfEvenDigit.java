//  Sum of Even Digits
// START
//   INPUT n
//   sum = 0
//   WHILE n > 0
//     d = n % 10
//     IF d % 2 == 0 THEN
//       sum = sum + d
//     n = n / 10
//   PRINT sum
// END
import java.util.*;
public class SumOfEvenDigit{
    public static void main(String[] args) {
        int n,sum=0,digit;
        Scanner mb=new Scanner(System.in);
        n=mb.nextInt();
        System.out.println("Enter the number is:"+n);
        while (n>0) {
            digit=n%10;
            if (digit%2==0) {
                sum=sum+digit;
                
            }
            n=n/10;

            
        }
        System.out.println("The sum is:"+sum);

        
    }
    
}
