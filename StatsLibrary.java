//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.util.ArrayList;
import java.lang.Math;
public class StatsLibrary{
    //This project is responsible for processing common probability and statistics problems to aid in our homework assignments.
    //Methods include mean, median, mode, intersection, union, compliment, standard deviation, and Monte Carlo.

    //This method solves for and returns the average (sum of elements divided by number of elements) of an inputted ArrayList of Integers.
    public double mean(ArrayList<Integer> input){
        double sum = 0; //Average will be 0 if inputted ArrayList is empty.
        for(int element:input){
            sum+=element;
        }
        return (sum/input.size());
    }

    //This method solves for and returns the median (middle) of an inputted ArrayList of Integers.
    public Integer median(ArrayList<Integer> input){
        Integer median = 0;
        //If inputted array has an odd number of elements, there is a defined median.
        if((input.size()%2)!=0){
            int midpoint = (input.size()/2);
            median = input.get(midpoint);
        }
        //Otherwise, and array with an even number of elements will not have a median.
        else{
            median = null; //No median -> return null
        }
        return median;
    }

    //This method finds the mode (most frequent element) of an inputted ArrayList of Integers.
    //Code mostly taken from this stackoverflow post: https://stackoverflow.com/a/36416334
    public Integer mode(ArrayList<Integer> input){
        Integer mode = 0;
        int maxFrequency = 0;
        for(int x = 0; x < input.size(); x++){
            Integer value = input.get(x);
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
            mode = null; //No mode -> return null
        }
        return mode;
    }

    //This method finds the standard deviation of an ArrayList of Integers.
    //Figure out a way to make this more accurate with the use of doubles.
    public double standardDeviation(ArrayList<Integer> input){
        double std = 0;
        //Step 1: Find the mean
        double sum = 0; //Average will be 0 if inputted ArrayList is empty.
        for(int element:input){
            sum+=element;
        }
        double mean = (sum/input.size());
        //Step 2: Subtract mean from all elements
        for(int i=0;i > input.size();i++){
            Double element = input.get(i) - mean;
            Integer value = element.intValue();
            input.set(i, value);
        }
        //Step 3: Square these deviations
        for(int i=0;i > input.size();i++){
            Integer element = input.get(i) * input.get(i); 
            input.set(i, element);
        }
        //Step 4: Sum these squares
        for(int element:input){
            sum+=element;
        }
        //Step 5: Divide by count
        std = sum/input.size();
        //Step 6: Square root
        std = Math.sqrt(std);
        return std;
    }
}