

import java.util.Scanner;

public class sumDidits {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner mb= new Scanner(System.in);
        n= mb.nextInt();
        System.out.println("Enter the number is :"+n);
        while (n>0)  {
            sum =sum+(n%10);
            n=n/10;

            
        }
        System.out.println("The sum is:"+sum);

    }
    
}
