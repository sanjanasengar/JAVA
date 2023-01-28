//this is a comment
import java.util.Scanner;

class hello {
    public static void main(String[]args) { //main method
        //System.out.println("Hello...!"); //printing something to user
        int h=5;
         long a = 76575765765l;
         float b=7.6f;
         String c="sanjana";
         char d='@';  // single quote single value
         boolean e=true;
         double f=12.323238237d;
         short g=2111;
        


         System.out.println(a);
         System.out.println(b);
         System.out.println(h);
         System.out.println(d);
         System.out.println(e);
         System.out.println(f);
         System.out.println(g);
         System.out.println(h++);
         System.out.println(h);
         System.out.println(--h);
         System.out.println(a+g);
         System.out.println(a-g);
         System.out.println(a*g);
         System.out.println(a>g);
         System.out.println(a==g);
         System.out.println(a%g);
         System.out.println(h--);
         System.out.println(h);
         System.out.println(h++);
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter integer value");
    int intVal =scan.nextInt();
    System.out.println("user input:" +intVal);
     }
}