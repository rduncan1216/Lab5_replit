//Name: Ryan Duncan
//Course: CSE 1322 Lab W01
//Date: 9/15/2020
//Lab5

import java.util.Scanner;

//myCollection contains main and tests the other classes
public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        Scanner sc = new Scanner(System.in);

        //create array that holds Items
        Item[] items = new Item[5];

        //myChoice and count for for-each loop/input
        String myChoice = "Z";
        int count = 0;

        //foreach to traverse array
        for (Item abc : items) {

            System.out.print("Please enter B for book or P for periodical: ");
            myChoice = sc.nextLine();

            //if statement for testing
            if ((myChoice.equals("P")) || (myChoice.equals("p"))) {
                Scanner input = new Scanner(System.in);
                System.out.print("Title of periodical: ");
                String currentTitle = input.nextLine();
                System.out.print("Issue #: ");
                int currentIssue = input.nextInt();
                Periodical currentPeriodical = new Periodical(currentTitle, currentIssue);
                items[count] = currentPeriodical;
                System.out.println();

            } else if ((myChoice.equals("B")) || (myChoice.equals("b"))) {
                Scanner input2 = new Scanner(System.in);
                System.out.print("Title of book: ");
                String currentTitle = input2.nextLine();
                System.out.print("Author: ");
                String currentAuthor = input2.nextLine();
                System.out.print("ISBN: ");
                String currentISBN = input2.nextLine();
                items[count] = new Book(currentTitle, currentAuthor, currentISBN);
                System.out.println();
            }

        count++;

    }
        //traverse array and call getlisting()
        System.out.println();
        System.out.println("Here are all of the items in your collection:");
        System.out.println();
        for(Item x : items){
            System.out.println(x.getListing());
            System.out.println();

    }
    }
}



