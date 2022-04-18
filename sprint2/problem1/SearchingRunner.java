package sprint2.problem1;

public class SearchingRunner {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2}; //unsorted array
        int target = 3;
        BinarySearch bs1 = new BinarySearch( new BubbleSort());
        bs1.binarySearch(arr, target);
        BinarySearch bs2 = new BinarySearch( new SelectionSort());
        bs2.binarySearch(arr, target);
        BinarySearch bs3 = new BinarySearch( new QuickSort());
        bs3.binarySearch(arr, target);
    }
}
class BinarySearch {
    SortingAlgorithm sort;

    public BinarySearch(SortingAlgorithm type) {
        this.sort=type;
    }

    public int binarySearch(int[] arr, int target){

        // sort the array first using sort()
        sort.sort(arr);


        int index=0;
        /* binary search Algorithm
         * no need to implement that
         * Assume it is here
         */
        return index;
    }
}
interface SortingAlgorithm{
    public void sort(int[] arr);
}
class BubbleSort implements SortingAlgorithm{

    @Override
    public void sort(int[] arr) {
        System.out.println("Array Sorted Using Bubble Sort");
    }
}
class SelectionSort implements SortingAlgorithm{

    @Override
    public void sort(int[] arr) {
        System.out.println("Array Sorted Using Selection Sort");
    }
}
class QuickSort implements SortingAlgorithm{

    @Override
    public void sort(int[] arr) {
        System.out.println("Array Sorted Using Quick Sort");
    }
}