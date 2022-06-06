import java.util.Scanner;
public class complex {
	int real;
	int imaginary;
	public complex(int real_get,int imag_get){
		this.real = real_get;
		this.imaginary = imag_get;
	}
	public static complex sum(complex c1,complex c2){
		complex res = new complex(0,0);
		res.real = c1.real + c2.real;
		res.imaginary = c1.imaginary + c2.imaginary;
		return res;
	}
	public static void main(String []args){
		int a,b,c,d;
		Scanner myObj = new Scanner(System.in); 
		System.out.println("Enter real & imaginary of first number : ");
		a=myObj.nextInt(); 
		b=myObj.nextInt(); 
		complex first = new complex(a,b);
		System.out.println("Enter real & imaginary of second number : ");
		c=myObj.nextInt(); 
		d=myObj.nextInt(); 
		complex second = new complex(c,d);
		complex res = sum(first,second);
		System.out.println("Sum is : " + res.real + "+" +res.imaginary + "i");
	}
}