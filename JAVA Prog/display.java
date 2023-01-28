import java.util.Scanner;
public class display {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name :");
        String Name=scan.nextLine();
        System.out.print("enter the age :");
        int age=Integer.parseInt(scan.nextLine());
        System.out.print("enter you class :");
        String Class=scan.nextLine();
        System.out.println("name:"+Name + " \n age :"+age + " \n class :"+Class);
    }
    
}
