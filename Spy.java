//to find weather a number is spy number or not

import java.util.Scanner;
public class Spy {
    public static void main(String args[])
    {
        int n,sum=0,k=0,mul=1;
        Scanner in =new Scanner(System.in);
        System.out.println("enter the value of n");
        n=in.nextInt();
    while(n>0)
    {
        k=n%10;
        sum=sum+k;
        mul=mul*k;
        n=n/10;
    }
    if(sum==mul)
    {
        System.out.println("it is spy number");
    }
    else
    {
        System.out.println("it is not spy number");
    }
    }
    
}
