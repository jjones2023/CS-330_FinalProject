import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    Random rand = new Random();
    int n = 10;
    int[] num = new int[n];
    for (int i = 0; i < n; i++) {
      int a = Math.abs(rand.nextInt(n) + rand.nextInt(10)); //Generates a random integer between 0 and n
      num[i] = a; //Adds the random number to an array
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
    int length = num.length;
    //call quick_sort routine using QuickSort object
    long quickStart = System.nanoTime();
    QuickSort obj = new QuickSort();
    long quickEnd = System.nanoTime();
    obj.quick_sort(num, 0, length-1);
    //print the sorted array
    System.out.println("Sorted Array using Quicksort: " + Arrays.toString(num));
    System.out.println("Time in Milliseconds: " + ((quickEnd - quickStart)/1e6) + "ms");
  }
}