package main;

// UC18.java

public class UC18 {

    // Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {  // string comparison
                return true;           // match found
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogieIDs = {"BG101","BG205","BG309","BG412","BG550"};
        String searchKey = "BG309";

        boolean found = linearSearch(bogieIDs, searchKey);

        if (found) {
            System.out.println("Bogie ID found: " + searchKey);
        } else {
            System.out.println("Bogie ID not found: " + searchKey);
        }
    }
}
