import java.io.*;
class rkw_file{
  public static void main(String args[]){
     try{
	   InputStreamReader r=new InputStreamReader(System.in);
	   BufferedReader br=new BufferedReader(r);
	   System.out.println("Enter the string:");
	   String str=br.readLine();
	   FileWriter f=new FileWriter("F:/Aneeta/sampletxt.txt");
	   BufferedWriter wr=new BufferedWriter(f);
	   wr.write(str);
	   wr.append(" Existing file use append");
	   wr.close();
	   System.out.println("Successfully written to thr file");
	}catch(IOException w){
	System.out.println(w);}
   }
}