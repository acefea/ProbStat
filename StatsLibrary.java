//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.util.ArrayList;
import java.lang.Math;
import java.math.BigInteger;
public class StatsLibrary{
    //This project is responsible for processing common probability and statistics problems to aid in our homework assignments, and is due March 2nd before the first exam.
    //Methods include mean, median, mode, and standard deviation X
    //Union, intersection, complement of two ArrayLists<Integer> X
    //Factorial, permutation, combinations, and binomial distribution calculator (using BigInteger from Java API) X
    //Monte Carlo problem (answer 2.20 on page 34 in comments) over 10,000 generations X
    //Birthday problem X
    //Excel work from beginning of semester
    //1 page (single spaced) about Github workflow
    //Formula sheet (Word document)
    //All work must be within the Github, submit the Github link on Blackboard.
    //Optional EC: Word document labeled with extra credit considerations

    //This method solves for and returns the average (sum of elements divided by number of elements) of an inputted ArrayList of Doubles.
    public double mean(ArrayList<Double> input){
        double sum = 0; //Average will be 0 if inputted ArrayList is empty.
        for(double element:input){
            sum+=element;
        }
        return (sum/input.size());
    }

    //This method solves for and returns the median (middle) of an inputted ArrayList of Doubles.
    public double median(ArrayList<Double> input){
        double median = 0;
        //If inputted array has an odd number of elements, there is a defined median.
        if((input.size()%2)!=0){
            int midpoint = (input.size()/2);
            median = input.get(midpoint);
        }
        //Otherwise, and array with an even number of elements will not have a median.
        else{
            median = -1.0; //No median -> return -1.0
        }
        return median;
    }

    //This method finds the mode (most frequent element) of an inputted ArrayList of Doubles.
    //Note: Code mostly taken from this stackoverflow post: https://stackoverflow.com/a/36416334
    public double mode(ArrayList<Double> input){
        double mode = 0;
        int maxFrequency = 0;
        for(int x = 0; x < input.size(); x++){
            double value = input.get(x);
            int frequency = 0;
            for(int y = 0; y < input.size(); y++){
                if (input.get(y)==value) {
                    frequency++;
                }
                if (frequency>maxFrequency){
                    mode = value;
                    maxFrequency = frequency;
                }
            }
        }
        if(maxFrequency<1){
            mode = -1.0; //No mode -> return -1.0
        }
        return mode;
    }

    //This method finds the standard deviation of an ArrayList of Doubles.
    public double standardDeviation(ArrayList<Double> input){
        double std = 0;
        double sum = 0;
        //Step 1: Find the mean
        double mean = mean(input);
        //Step 2: Subtract mean from all elements
        for(int i=0;i > input.size();i++){
            double element = input.get(i) - mean;
            input.set(i, element);
        }
        //Step 3: Square these deviations
        for(int i=0;i > input.size();i++){
            double element = input.get(i) * input.get(i); 
            input.set(i, element);
        }
        //Step 4: Sum these squares
        for(double x:input){
            sum+=x;
        }
        //Step 5: Divide by count-1
        std = sum/input.size();
        //Step 6: Square root
        std = Math.sqrt(std);
        return std;
    }

    //This method finds the factorial of a given integer value
    //Note: I was having issues with visibility, so I referenced the code here: https://javarevisited.blogspot.com/2015/08/how-to-calculate-large-factorials-using-BigInteger-Java-Example.html 
    public BigInteger factorial(int input){
        BigInteger result = BigInteger.valueOf(1);
            for(int i=input;i>0;i--){
                result = result.multiply(BigInteger.valueOf(i)); 
            }
        return result;
    }    

    //This method finds the permutation of a given selection and total
    public BigInteger permutation(int n, int r){
        BigInteger p = factorial(n).divide(factorial(n-r));
        return p;
    }

    //This method finds the combination of a given selection and total
    public BigInteger combination(int n, int r){
        BigInteger c = factorial(n).divide(factorial(r).multiply(factorial(n-r)));
        return c;
    }

    //This method finds the binomial distribution of a given n (total trials), y (observed successes), p (rate of success), and q (rate of failure).
    public double binomialDistribution(int n, int y, double p, double q){
        double result = -1; //Default value in case binomial distribution is not possible.
        result = combination(n,y).doubleValue() * Math.pow(p, y) * Math.pow(q, n-y);
        return result;
    }

    //This method finds the union of two inputted ArrayLists of Integers, a and b.
    public ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<a.size();i++){
            if(!result.contains(a.get(i))){
               result.add(a.get(i)); 
            }
        }
        for(int i=0;i<b.size();i++){
            if(!result.contains(b.get(i))){
              result.add(b.get(i));  
            }
        }
        return result;
    }

    //This method finds the intersection of two inputted ArrayLists of Integers, a and b, in sample space s.
    public ArrayList<Integer> intersection(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<a.size();i++){
            if(b.contains(a.get(i))){
                result.add(a.get(i));
            }
        }
        return result;
    }

    //This method finds the compliment of inputted ArrayList of Integers, a, against the inputted total sample space, s.
    public ArrayList<Integer> complement(ArrayList<Integer> a, ArrayList<Integer> s){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<s.size();i++){
            result.add(s.get(i));
        }
        for(int i=0;i<a.size();i++){
            if(result.contains(a.get(i))){
                result.remove(a.get(i));
            }
        }
        return result;
    }
}