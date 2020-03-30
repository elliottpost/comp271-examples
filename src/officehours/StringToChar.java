package officehours;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StringToChar {

    /*
     Application Algorithm
     1. First, get an array of unsorted data
     2. Then, send that array to insertionSort()
     3. InsertionSort returns a sorted array
     4. Print out the stored array


     Insertion Sort Algorithm
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter a character: ");
//        String line1 = sc.nextLine(); // \n

        System.out.print("Enter a string without any spaces, followed by enter: ");
        String userInput = sc.next();
        char[] chars = userInput.toCharArray();
        Character[] charObjArr = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            charObjArr[i] = chars[i];
        }
//        insertSort(chars);

        Arrays.sort(charObjArr, Collections.reverseOrder());
        System.out.println("Sorted the array is " + charObjArr);

        // toCharArray
        /*
         * userInput = "Hello!99"
         * userInput.toCharArray()
         *
         * class String {
         *   char[] value;
         *
         *   public String(char[] data) {
         *   }
         *
         *   char[] toCharArray() {
         *      char[] arr = new char[8]; // char[] arr = new char[this.value.length]
         *      // populate the array
         *      // ...
         *
         *     return arr;
         *   }
         * }
         */

        // call insertion sort on chars

    }

    public static char[] insertSort(char[] arr) {
        // sorts unsortedArr

        return arr;
    }
}