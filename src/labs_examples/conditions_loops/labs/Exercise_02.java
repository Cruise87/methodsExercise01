package labs_examples.conditions_loops.labs;
import java.util.Scanner;
/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use an if-else statement
 *      to accomplish this task.
 * 
 *      Bonus Tricky Challenge: Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        Scanner s = new Scanner(System.in);
        // 2) prompt user
        System.out.println("Enter a # 1-7: ");
        // 3) assign input to variable as int
        int number = s.nextInt();
        // 4) write completed code here
        if(number < 1 || number > 7 ){
            System.out.println("Other");
        }
        if(number == 1){
            System.out.println("Monday");
        }if(number == 2){
            System.out.println("Tuesday");
        }if(number == 3){
            System.out.println("Wednesday");
        }if(number == 4){
            System.out.println("Thursday");
        }if(number == 5){
            System.out.println("Friday");
        }if(number == 6){
            System.out.println("Saturday");
        }if(number == 7){
            System.out.println("Sunday");
        }
    }
}
