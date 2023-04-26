//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.io.*;

public class GraphNoLib{

    //Plots quadratic formula points according to user input bounds and interval and writes it to a CSV file output
    public void quadratic(int lower, int upper, int interval){
        try{
            FileWriter fw = new FileWriter("output.csv");
            fw.write("Original X, Original Y\n");
            for(int i=lower;i<=upper;i+=interval){
                int out = i*i;
                fw.write(i+", "+out+", \n");
            }
            fw.write("Salted X, Salted Y\n");
            for(int i=lower;i<=upper;i+=interval){
                int in = (i+(int)(Math.random()*5));
                int out = in*in;
                fw.write(in+", "+out+", \n");
            }
            fw.write("Smoothed X, Smoothed Y\n");
            for(int i=lower;i<=upper;i+=interval){
                int salt = (i+(int)(Math.random()*5));
                int avg = (salt+i)/2;
                int out = avg*avg;
                fw.write(avg+", "+out+", \n");
            }
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
