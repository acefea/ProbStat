//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
import java.util.ArrayList;
import java.util.Random;
public class StatsExamples {
    //This project is responsible for the Monte Hall and Birthday problem examples, and is due March 2nd before the first exam.
    //Monte Carlo problem (answer 2.20 on page 34 in comments) over 10,000 generations
    //Birthday problem 

    //This method can determine the probability of 2 (randomly generated) people having the same birthday.
    public double birthdayProblem(){
        ArrayList<Person> people = new ArrayList<Person>();
        double result = 1;
        boolean flag = true;
        Random r = new Random();
        Person target = new Person(r.nextInt(365) + 1);
        people.add(target);
        //Generate people until a birthday matches. Then, probability is determined as 1/(number of people generated)
        while(flag){
            Person individual = new Person(r.nextInt(365) + 1);
            people.add(individual);
            if(individual.getBirthday()==target.getBirthday()){
                flag = false;
            }
        }
        result = (1.0/people.size()) * 100.0;
        return result;
    }
    
    //This method can run the montyHall simulation over a given numeber of runs.
    //Designed with some help from the discussion and code here: https://rosettacode.org/wiki/Monty_Hall_problem#Java
    public void montyHall(int runs){
        int winsStay = 0;
        int winsSwitch = 0;
        Random r = new Random();
        for(int i=0;i<runs;i++){
            int[] doors = {0,0,0};
            doors[r.nextInt(3)] = 1;
            int choice = r.nextInt(3);
            if(doors[choice]==1){
                winsStay++;
            }
            if(doors[choice]==0)
            {
                winsSwitch++;
            }
        }
        double probStay = (double)winsStay/runs;
        double probSwitch = (double)winsSwitch/runs;
        System.out.println("For "+runs+" runs, here are the results...");
        System.out.println("Total wins with switching: "+winsSwitch);
        System.out.println("Probability of winning with switching: "+probSwitch);
        System.out.println("Total wins with staying: "+winsStay);
        System.out.println("Probability of winning with staying: "+probStay);
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
