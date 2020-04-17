package unit3;

import java.util.Arrays;

public class MaxHeapSolution {

    // our internal data storage
    private int[] _heap;

    // tracks how many elements are in the heap
    private int _length = 0;

    // [A, C, E, F, H, , , , ]
    // _heap.length = 9
    // _length = 5


    // remove root
    // [H, C, E, F, A, , , , ]
    //  _heap.length = 9
    // _length = 4

    MaxHeapSolution() {
        this(10);
    }

    MaxHeapSolution(int capacity) {
        this._heap = new int[capacity];
    }

    private boolean isBounded(int idx) {
        return idx >= 0 && idx < this._length;
    }

    /**
     * Gets the index number of the left child node
     * @param parentIdx the starting point
     * @return the index number or -1 if no such node exists
     */
    private int getLeftChildIdx(int parentIdx) {
        int idx = 2 * parentIdx + 1;
        return isBounded(idx) ? idx : -1;
    }

    /**
     * Gets the index number of the right child node
     * @param parentIdx the starting point
     * @return the index number or -1 if no such node exists
     */
    private int getRightChildIdx(int parentIdx) {
        int idx = 2 * parentIdx + 2;
        return isBounded(idx) ? idx : -1;
    }

    /**
     * Gets the index number of the parent node
     * @param childIdx the starting point
     * @return the index number or -1 if no such node exists
     */
    private int getParentIndex(int childIdx) {
        return (childIdx - 1) / 2;
    }

    /**
     * Gets the value of the left node
     * @param parentIdx the starting point
     * @return the value or -1 if no such node exists
     */
    private int getLeftValue(int parentIdx) {
        return this._heap[this.getLeftChildIdx(parentIdx)];
    }

    /**
     * Gets the value of the right node
     * @param parentIdx the starting point
     * @return the value or -1 if no such node exists
     */
    private int getRightValue(int parentIdx) {
        return this._heap[this.getRightChildIdx(parentIdx)];
    }

    /**
     * Gets the value of the parent node
     * @param childIdx the starting point
     * @return the value or -1 if no such node exists
     */
    private int getParentValue(int childIdx) {
        return this._heap[this.getParentIndex(childIdx)];
    }

    /**
     * Swap to elements
     * @param idxA
     * @param idxB
     */
    private void swap(int idxA, int idxB) {
        // @todo
    }

    /**
     * Alias for heapifyUp()
     * @param idx the index to heapify upwards
     */
    public void percolateUp(int idx) {
        this.heapifyUp(idx);
    }

    /**
     * Moves a value upwards in the heap, if needed
     * @param idx the index of the value we're moving upwards
     */
    public void heapifyUp(int idx) {
        // @todo
    }

    /**
     * Alias for heapifyDown()
     * @param idx the index to heapify downwards
     */
    public void percolateDown(int idx) {
        this.heapifyDown(idx);
    }

    /**
     * Moves a value downwards in the heap, if needed
     * @param idx the index of the value we're moving downwards
     */
    public void heapifyDown(int idx) {
        // @todo
    }

    /**
     * Inserts an element into the heap
     * @param value the value to insert into the heap
     */
    public void insert(int value) {
        // resize if needed
        if (this._heap.length == this._length + 1) {
            this._heap = Arrays.copyOf(this._heap, this._heap.length * 2);
        }

        this._heap[this._length++] = value;
        heapifyUp(this._length);
    }

    /**
     * Removes the root node
     */
    public void removeMax() {
        // @todo

        // don't forget to adjust our length!
    }

    /**
     * Removes the node at a given index
     * @param idxToRemove the index to remove
     */
    public void removeIndex(int idxToRemove) {
        // @todo

        // don't forget to adjust our length!
    }

    /**
     * Determines if the value is in the heap
     * @param valueToSearchFor the value being searched for within the heap
     * @return -1 for not found, or 0-n for index number if found
     */
    public int search(int valueToSearchFor) {
        int matchingIdx = -1;

        // @todo

        return matchingIdx;
    }

    /**
     * Gets a _copy_ of the heap with _only_ the active values in it and sized exactly as needed
     * @return the heap as an array
     */
    public int[] asArray() {
        int[] arr = new int[this._length];
        for (int i = 0; i < this._length; i++) {
            arr[i] = this._heap[i];
        }

        return arr;
    }
}
