class product{
 int p_code,price;
 static int t;
 String p_name;
 product(int c,String n,int p)
 {
   t++;
   p_code=c;
   p_name=n;
   price=p;
 }

 public static void main(String args[])
 {
   product p1=new product(1201,"soap",30);
   product p2=new product(1202,"shampoo",130);
   System.out.println("count="+t);
   if(p1.price>p2.price)
   {
     System.out.println(p1.p_name+" has largest price "+p1.price);
   }
   else
   {
     System.out.println(p2.p_name+" has largest price "+p2.price);
   }
 }
}