//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).

import java.io.*;

public class GraphNoLib{

    //Plots quadratic formula points according to user input bounds and interval -> CSV file output
    public void quadratic(int lower, int upper, int interval){
        try{
            FileWriter fw = new FileWriter("output.csv");
            for(int i=lower;i<upper;i+=interval){
                int out = i*i;
                fw.write(i+" "+out+",");
            }
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
