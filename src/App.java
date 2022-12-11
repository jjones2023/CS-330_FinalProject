import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    Random rand = new Random();
    int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25, 26, 27, 28, 29, 30};
    for (int i = 0; i < 25; i++) {
      int n = Math.abs(rand.nextInt(100) + i - (i+10)); //Generates a random integer between 0 and 100
      num[i] = n; //Adds the random number to an array
    }
    System.out.println("Original Array: " + Arrays.toString(num));
    
    
    /* Selection Sort*/
    SelectionSort ob = new SelectionSort();
    long startTime = System.nanoTime();
    ob.sort(num);
    long endTime = System.nanoTime();
    System.out.println("Sorted Array using SelectionSort: " + Arrays.toString(num));
    System.out.println("Time in Millseconds: " + ((endTime - startTime)/1e6) + "ms");


    /* Quicksort */
    int a = num.length;
    //call quick_sort routine using QuickSort object
    long quickStart = System.nanoTime();
    QuickSort obj = new QuickSort();
    long quickEnd = System.nanoTime();
    obj.quick_sort(num, 0, a-1);
    //print the sorted array
    System.out.println("Sorted Array using Quicksort: " + Arrays.toString(num));
    System.out.println("Time in Milliseconds: " + ((quickEnd - quickStart)/1e6) + "ms");
  }
}