import java.io.*;
import java.util.Scanner;
public class user_input {
   void input() {
    Scanner obj = new Scanner (System.in);
    String name;
    System.out.println("Enter a Student name: ");
    name = obj.nextLine();
    System.out.println("The name is: ");
   }

    public static void main (String args[]) {
userinput jabbar = new userinput();
jabbar.input();
    }
}