package Exercise20;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Verdu
 */

import java.util.Scanner;

public class Exercise20 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String amount = scanner.nextLine();

        System.out.print("What state do you live in? ");
        String state = scanner.nextLine();

        System.out.print("What county do you live in? ");
        String county = scanner.nextLine();

        double Amount = Double.parseDouble(amount);
        double Tax = 0;

        if (state.equals("Wisconsin") || state.equals("wisconsin")){
            Tax = 0.05;

            if (county.equals("Eau Claire") || county.equals("eau claire")){
              Tax = 0.055;
              }
            else if (county.equals("Dunn") || county.equals("dunn")){
              Tax += 0.054;
              }
        }

        else if (state.equals("Illinois") || state.equals("illinois")){
            Tax = 0.08;
        }

        double Final = Amount*Tax;

        System.out.print("The tax is $"+ String.format("%.2f", Final) + "." + "\nThe total is $" + String.format("%.2f", (Amount+(Final))) + ".");

    }

}
