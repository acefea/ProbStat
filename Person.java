//Program written by Leonardo Acefe for CSCI3327 Section 001 Probability and Applied Statistics taught by Byron Hoy (Spring 2023).
public class Person {
    //Person class to define random people with random birthdays for use in the birthdayProblem method in the StatsExamples class.

    private int birthday; 

    //Initialization
    public Person(int b){
        birthday = b;    //Birthday will be represented as an integer 1-365 representing a specific day within the year.
    }

    //Get method to return Person's birthday
    public int getBirthday(){
        return birthday;
    }
}
