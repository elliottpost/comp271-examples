package unit1;

import java.util.Scanner;

public class LinearSearch<E> {

    E[] arr;

    public LinearSearch(E[] theArr) {
        arr = theArr;
    }

    public static void main(String[] args) {
        Integer[] numbers = {5, 23, 8, 1, 6, 12, 9};
//        LinearSearch<Integer> ls = new LinearSearch<Integer>(numbers);

        String[] strings = {"Hello", "World", "welcome to", "comp271"};
        LinearSearch<String> ls = new LinearSearch<>(strings);

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number to search the array: ");
//            int searchTerm = sc.nextInt();
            String searchTerm = sc.next();
            int idx = ls.indexOf(searchTerm);
            if (idx >= 0) {
                System.out.println("".format("Found %s at position %d", searchTerm, idx));
            } else {
                System.out.println("".format("%s does not exist in the array", searchTerm));
            }
        }
    }

    public int indexOf(E searchTerm) {
        int matchingIdx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(searchTerm)) {
                matchingIdx = i;
            }
        }

        return matchingIdx;
    }
}
