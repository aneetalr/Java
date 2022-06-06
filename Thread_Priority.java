class fibno implements Runnable
{
   int n,p;
	
	Thread t;
	fibno(int n)	
        {
          this.n=n;
          t=new Thread(this,"fibanocci_series");
System.out.println("The name of the thread is "+t.getName());
//System.out.println("The name of the thread is "+Thread.currentThread().getName());
System.out.println("The normal priority ="+t.getPriority());
	 t.setPriority(3);
		//t.setPriority(Thread.NORM_PRIORITY-4);
System.out.println("The Priority of fibno is "+t.getPriority());
          t.start();
        } 
	public void run()
        { 
System.out.println("The name of the thread is "+Thread.currentThread().getName());
int f1=0,f2=1,f3;
           if(n>3)
            {
              try {
               		System.out.println("Fib numbers "+f1 +"  "+f2);
			for(int i=3;i<=n;i++)
                         { f3=f1+f2;
				System.out.println("  "+f3);
				f1=f2;f2=f3;
				t.sleep(15);
			}
		  }catch(InterruptedException q){}
              }
	else

		System.out.println("Sorry can't print the series");
	}
}

class mul_table implements Runnable
{
   int n;Thread a;
	mul_table(int n)	
        {
          this.n=n;
          a=new Thread(this,"Mul");
	  a.setPriority(10);
   System.out.println("The Priority of mul_table is "+a.getPriority());

          a.start();
        } 
	public void run()
        {    String tName = Thread.currentThread().getName();
		System.out.println("The Name of the Thread is "+tName);
              try {
               		System.out.println("          Multiplication table of  "+n);
			for(int i=1;i<=10;i++)
                         { System.out.println("      "+ i +"*"+n+"="+i*n);
				a.sleep(10);
			}
		}catch(InterruptedException q){}
	
	}
}
class Thread_Priority
{ 
   public static void main(String args[]){
 		int num =12;
//Integer.parseInt(args[0]);
	fibno f=new fibno(num);
	mul_table mt=new mul_table(num);
   }
}

