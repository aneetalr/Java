import java.util.Scanner;
class SumSingle {
    public static void main(String args[])  {
        int num;
         System.out.println("Enter a number:");
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
        int sum = 0,d;
        while (sum > 9 || sum == 0) {
            sum=0;
            while (num>0) {
                d = num % 10;
                sum += d;
                num = num/10;                
            }
            if (sum > 9) 
                num = sum;
        }
        System.out.println("Sum of digits : "+sum);
    }
}