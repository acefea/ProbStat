//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.util.ArrayList;
public class TestStatsLibrary {
    public static void main(String[] args){
        StatsLibrary test = new StatsLibrary();
        
        ArrayList<Double> numbers = new ArrayList<>(); //numbers = {46, 69, 32, 60, 52, 41}
        numbers.add(46.0);
        numbers.add(69.0);
        numbers.add(32.0);
        numbers.add(60.0);
        numbers.add(52.0);
        numbers.add(41.0);
        System.out.println("Mean: "+test.mean(numbers));
        System.out.println("Median: "+test.median(numbers));
        System.out.println("Mode: "+test.mode(numbers));
        System.out.println("Standard Deviation: "+test.standardDeviation(numbers));

        int n = 12;
        int r = 2;
        System.out.println("Factorial of "+n+": "+test.factorial(n));
        System.out.println("Permutation of n = "+n+" and r = "+r+": "+test.permutation(n,r));
        System.out.println("Combination of n = "+n+" and r = "+r+": "+test.combination(n,r));

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> s = new ArrayList<>();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5); //total s = {1,2,3,4,5}
        a.add(2);
        a.add(3);
        a.add(5); //a = {2,3,5} such that a' = {1,4}
        b.add(1);
        b.add(2);
        b.add(4); //b = {1,2,4} such that b' = {3,5}
        System.out.println("Union of A and B: "+test.union(a,b));
        System.out.println("Intersection of A and B: "+test.intersection(a,b));
        System.out.println("Complement of A: "+test.complement(a, s));
        System.out.println("Complement of B: "+test.complement(b, s));
    }
}
