//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.util.ArrayList;
import java.util.Random;
public class StatsExamples {
    //This project is responsible for the Monte Hall and Birthday problem examples, and is due March 2nd before the first exam.
    //Monte Carlo problem (answer 2.20 on page 34 in comments) over 10,000 generations
    //Birthday problem 

    //This method can determine the probability of 2 (randomly generated) people having the same birthday in a given group size over a given number of iterations.
    public double birthdayProblem(){
        double result = 0;
        return result;
    }
    
    public ArrayList<Integer> montyHall(int runs){
        ArrayList<Integer> results = new ArrayList<Integer>();
        int winsStay = 0;
        int winsSwitch = 0;
        return results; 
    }
    
    /* PROBLEM 2.20 ON PAGE 34
     * Given S = {G, D1, D2}
     * a) If randomly chosen, each event can be assigned equal probability of 1/3. Thus, the probability of selecting the prize, G, is 1/3.
     * b)
     *  i) If the contestant stayed with her original selection, her probability of picking the prize, G, is P(G) = 1/3.
     *  ii) If the contestant originally (unknowingly) chose the prize, G, then switched her selection after the reveal of a dud, she would end up picking a dud.
     *  iii) If the contestant originally (unknowingly) chose a dud, D1 or D2, then switched her selection after the reveal of a dud, she would end up picking the prize, G.
     *  iv) If the contestant switches her choice after the reveal of a dud, her probability of selecting the prize, G, is P(G) = 2/3
     *  v) To maximize the chance of winning after the reveal of one of the duds, the contestant would be better off switching their selected choice.
     */
}
