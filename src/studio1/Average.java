package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Number 1?");
        int n2 = ap.nextInt("Number 2?");

        double average = ((double) n1 + n2)/2;
        System.out.println("The average of " + n1 + " and " + n2 + " is " + average);

    }
}
