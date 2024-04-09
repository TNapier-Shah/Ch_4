/**Calculator: Addition
 * @author Taj Napier-Shah
 * @version 2.0
 * ITEC 2150 Spring 2024
 * Date: April 2, 2024
 * This takes in two integers and spits out the sun of said integers, and prevents the
 * user from putting in an invalid one
 */



package Calculator;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Addition {

    public static void main(String[] args) {

    Scanner user = new Scanner(System.in);

    try {
        System.out.println("Enter 2 integers for addition: ");
        System.out.println("Integer 1: ");
        int x = user.nextInt();
        System.out.println("Integer 2: ");
        int y = user.nextInt();
        int z = x + y;
        System.out.println("The total is: " + z);
    } catch(InputMismatchException q) {
        System.out.println("ENTER A VALID INTEGER, please");

    }
}

}
