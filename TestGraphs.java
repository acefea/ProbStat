//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.util.Scanner;

public class TestGraphs {
    public static void main(String[] args){
        GraphNoLib test = new GraphNoLib();
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide integers only!");
        System.out.print("Input your lower bound: ");
        int lower = input.nextInt();
        System.out.print("Input your upper bound: ");
        int upper = input.nextInt();
        System.out.print("Input your interval: ");
        int interval = input.nextInt();
        test.quadratic(lower,upper,interval);
    }
    
}