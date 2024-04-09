/**Double: ArrayValues
 * @author Taj Napier-Shah
 * @version 2.0
 * ITEC 2150 Spring 2024
 * Date: April 2, 2024
 * It takes in an integer in spits out the position its at on an array
*/
package Double;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class ArrayValues {
    public static void main(String[] args) {


        Scanner user = new Scanner(System.in);
        double[] val = new double[50];
        Random ran = new Random();


        for (int x = 0; x < val.length; x++) {
            val[x] = ran.nextDouble();
        }

            try {
                System.out.println("Enter an integer between 0 and 49");
                int y = user.nextInt();

                while (y >= 50) {
                    System.out.println("Please enter an integer between 0 and 49!");
                    y = user.nextInt();
                }
                System.out.println("The value " + y + " index is " + val[y]);
            } catch (InputMismatchException e) {
                System.out.println("Please type in a valid integer");

            }
    }


}
