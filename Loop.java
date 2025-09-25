import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //syntax for loop 
        //for(initialization; condition; increament or decrement){}

        // Q-1 print number one to five
     //   for(int i=1; i<=5; i++){
        //    System.out.println(i);
        //}
        // print numbers from 1 to n
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n"); 
        int n = in.nextInt();
        for(int num=0; num<=n; num++ ){
            System.out.print(num +" ");
        }
        
  in.close();  }
}
