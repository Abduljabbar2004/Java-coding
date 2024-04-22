import java.io.*;
import java.util.Scanner;
public class user_input {
   int input() {
    Scanner obj = new Scanner (System.in);
    String name;
    System.out.println("Enter a Student name: ");
    name = obj.nextLine();
    System.out.println("The name is: ");
    return 0;
   }

    public static void main (String args[]) {
user_input jabbar = new user_input();
jabbar.input();
    }
}
