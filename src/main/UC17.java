package main;

// UC17.java

import java.util.Arrays;

public class UC17 {

    // Method to sort bogie names
    public static String[] sortBogieNames(String[] arr) {
        Arrays.sort(arr); // Built-in sorting
        return arr;
    }

    public static void main(String[] args) {

        String[] bogies = {"Sleeper","AC Chair","First Class","General","Luxury"};

        sortBogieNames(bogies);

        System.out.println("Sorted Bogie Names: " + Arrays.toString(bogies));
    }
}