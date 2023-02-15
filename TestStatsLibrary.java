//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.util.ArrayList;
public class TestStatsLibrary {
    public static void main(String[] args){
        StatsLibrary test = new StatsLibrary();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(46);
        numbers.add(69);
        numbers.add(32);
        numbers.add(60);
        numbers.add(52);
        numbers.add(41);
        System.out.println("Mean: "+test.mean(numbers));
        System.out.println("Median: "+test.median(numbers));
        System.out.println("Mode: "+test.mode(numbers));
        System.out.println("Standard Deviation: "+test.standardDeviation(numbers));
    }
}
