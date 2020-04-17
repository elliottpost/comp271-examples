package unit3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxHeapGrader {

    private static Integer[] values =  {98, 50, 22, 49, 47, 14};
    private static MaxHeapSolution mh;

    public static void main(String[] args) {

        System.out.println("Running the grader for the MaxHeap");

        mh = new MaxHeapSolution();

        List<Integer> intList = Arrays.asList(MaxHeapGrader.values);
        Collections.shuffle(intList);
        for (int i : intList) {
            mh.insert(i);
        }

        testInsert();

    }

    public static void testInsert() {
        System.out.print("\n");
        System.out.println("# ----------------- #");
        System.out.println("#  TESTING INSERT   #");
        System.out.println("# ----------------- #");

        int[] arr = mh.asArray();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != values[i]) {
                System.out.println("Error: Index " + i + " expects value of " + values[i] + " but found " + arr[i]);
            }
        }


    }

    public static void testNodeIndicies() {
    }

    public static void testNodeValues() {
    }
}
