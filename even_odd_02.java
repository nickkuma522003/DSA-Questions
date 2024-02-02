import java.util.Scanner;

//. Write a Java program to check whether a number is even or odd.

public class even_odd_02 {
    public static int evenodd(int n){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        return 1;
    }
    public static void main(String args[]){
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a num : ");
        n=in.nextInt();
        
        evenodd(n);
        in.close();
    }
}
