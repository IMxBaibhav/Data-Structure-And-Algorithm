
import java.util.Scanner;

public class largestNum {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter the first number a");
        int a = input.nextInt();
         System.out.println("Enter the first number b");
        int b = input.nextInt();
         System.out.println("Enter the first number c");
        int c = input.nextInt();


        // find the largest of the three number.
 int max = a;
 if(b> max){ 
    max=b;
 }if(c> max){
    max = c;
 }
 System.out.println(max + " Is the maximum of all these three numbers.");
    }
}
