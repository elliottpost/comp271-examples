package unit2;

import java.util.Arrays;

public class ArrayList271 {

    public static void main(String[] args) {
        ArrayList271 myAL = new ArrayList271(5);
        for (int i = 1; i < 11; i++) {
            myAL.insert(i);
        }

        myAL.remove(3);

        System.out.println("The ArrayList looks like: " + myAL);
    }

    private int[] internalArr;
    private int nextAvailableIndex = 0;

    public ArrayList271() {
        this.internalArr = new int[10];
    }

    public ArrayList271(int n) {
        this.internalArr = new int[n];
    }

    public void insert(int val) {
        this.resizeIfNeeded();
        this.internalArr[this.nextAvailableIndex++] = val;
    }

    private void resizeIfNeeded() {
        // check if we have space, if not, resize the array
        if (this.nextAvailableIndex >= this.internalArr.length) {
            resize();
        }
    }

    /**
     * Searches the internal storage/array by value to see if an element exists
     * @param val the value we are searching for
     * @return -1 on match not found or the index number
     */
    public int search(int val) {
        return -1;
    }

    public void remove(int idxToRemove) {
        // arraylist of size 10
        // nextAvaiableIndex = 7
        // index to remove = 3
        // [0 1 2 3 4 5 6 7 8 9] index numbers
        // [x y z a b c d      ] values
        // after remove
        // [0 1 2 3 4 5 6 7 8 9] index numbers
        // [x y z   b c d      ] values
        // nextAvailableIndex = 7

        // if we're removing the last index...
        if (idxToRemove+1 == nextAvailableIndex) {
            // then
            this.internalArr[--nextAvailableIndex] = 0;
        } else {
            for (int i = idxToRemove; i < this.nextAvailableIndex && i+1 < this.internalArr.length; i++) {
                this.internalArr[i] = this.internalArr[i+1];
            }
            this.internalArr[--nextAvailableIndex] = 0;
        }
    }

    private void resize() {
        // steps to resize:
        // 1. create a new array of size 2n (where n is current array length)
        // 2. copy everything from original array into new one
        // 3. update the reference of this.internalArr to the new array

/*        // step 1
        int[] tempArr = new int[this.internalArr.length * 2];

        // step 2
        for (int i = 0; i < this.internalArr.length; i++) tempArr[i] = this.internalArr[i];

        // step 3
        this.internalArr = tempArr;*/

        // step 1 & 2 & 3 combined:
        this.internalArr = Arrays.copyOf(this.internalArr, this.internalArr.length * 2);

    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");

//        for (int i = 0; i < this.internalArr.length; i++) {
//            // append the value of this.internalArr[i];
//            if (i+1 == this.internalArr.length) {
//                str.append(this.internalArr[i]);
//            } else {
//                str.append(this.internalArr[i] + " ");
//            }
//        }

        for (int i : this.internalArr) {
            str.append(i + " ");
        }

        str.append("]");
        return str.toString();
    }

}
