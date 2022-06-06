import java.io.*;
import java.lang.*;
import java.util.*;
 

class Student {
     int rollno;
    String name, address;
     public Student(int rollno, String name, String address)
    {
 
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }
 
    public String toString()
    {
 
       return this.rollno + " " + this.name + " "
            + this.address;
    }
}
 

class Sortbyroll implements Comparator<Student> {
 
  
    public int compare(Student a, Student b)
    {
 
        return a.rollno - b.rollno;
    }
}
 
class Sortbyname implements Comparator<Student> {
 
   

    public int compare(Student a, Student b)
    {
 
        return a.name.compareTo(b.name);
    }
}
 

class Priority_Q_Ex {
 
    public static void main(String[] args)
    {
 
       
        ArrayList<Student> ar = new ArrayList<Student>();
 
        ar.add(new Student(111, "Maya", "Kerala"));
        ar.add(new Student(131, "Anna", "Delhi"));
        ar.add(new Student(121, "Solmon", "Vishakappatanam"));
        ar.add(new Student(101, "Hari", "MadhayaPradesh"));
       System.out.println("Unsorted");
         for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
        Collections.sort(ar, new Sortbyroll());
 
        System.out.println("\nSorted by rollno");
         for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
       Collections.sort(ar, new Sortbyname());
        System.out.println("\nSorted by name");
       for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
    }
}