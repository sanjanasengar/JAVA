import java.util.Scanner;
public class multiply {
    public static void main(String[]agrs){
        Scanner scan=new Scanner(System.in);

       System.out.println("Enter integer value");
    
        int a=scan.nextInt();

        for(int b=1;b<a+1;b+=1){
            System.out.println(a + "x" +b +"=" +a*b);
        }

    }

    
}
