//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.util.ArrayList;
public class TestStatsLibrary {
    public static void main(String[] args){
        StatsLibrary test = new StatsLibrary();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(6);
        numbers.add(2);
        System.out.println("Mean: "+test.mean(numbers));
        System.out.println("Median: "+test.median(numbers));
        System.out.println("Mode: "+test.mode(numbers));
    }
}
