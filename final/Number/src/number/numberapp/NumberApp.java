package number.numberapp;

import java.util.Scanner;
import number.*;

public class NumberApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Please enter a number greater than 0: ");
    int number = sc.nextInt();

    System.out.print("\nThe number " + number + " is " + NumberProcessor.numberType(number));
  }
}
