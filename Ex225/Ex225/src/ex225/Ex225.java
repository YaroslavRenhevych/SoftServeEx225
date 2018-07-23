package ex225;
import java.util.Scanner;
public class Ex225 {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int N=input.nextInt();
        System.out.println("Numbers whose square is a divisor of given number but cube is not divisor:");
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if((N%(Math.pow(i, 2)))==0 && (N%(Math.pow(i, 3))!=0))
                System.out.println(i);
        }
    }
    
}
