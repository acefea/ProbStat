//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
public class TestStatsExamples {
    public static void main(String[] args){

        StatsExamples test = new StatsExamples();
        System.out.println("Birthday Problem results: "+test.birthdayProblem()); //Test Birthday Problem
        test.montyHall(10000); //Test Monty Hall

    }
}
