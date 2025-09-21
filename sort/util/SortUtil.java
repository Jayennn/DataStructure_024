package sort.util;

import java.util.Arrays;

public class SortUtil {
  private int[] array;

  public SortUtil(int[] array) {
    this.array = array;
  }

  public void bubbleSort() {
    int i, j, temp;
    int n = array.length;
    boolean swapped;

    System.err.println("Array before swap: " + this.toString());

    /* Array */
    for (i = 0; i < n - 1; i++) {
      swapped = false;
      // Traversal from back to front
      for (j = 0; j < n - i - 1; j++) {

        // condition if array[j] is largest than array[j + 1]
        if (array[j] > array[j + 1]) {
          System.out.println("Swapping element \n" + " -> " + array[j] + " and " + array[j + 1]);

          // swap arr[j] and arr[j+1]
          temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;

          System.out.println("Array after swap: " + this.toString());
          swapped = true;
        }

      }

      if (!swapped)
        break;
    }

  }

  public void insertionSort() {
    int i, j, key;
    int n = array.length;

    for (i = 1; i < n; i++) {
      key = array[i];
      j = i - 1;

      while (j >= 0 && array[j] > key) {
        System.out.println("Shifting element \n" + " -> " + array[j] + " to the right");

        array[j + 1] = array[j];
        j--;

        System.out.println("Array after shift: " + this.toString());
      }
      array[j + 1] = key;
      System.out.println("Insert key \n" + " -> " + key + " at position " + (j + 1));
      System.out.println("Array after insertion: " + this.toString());
    }
  }

  @Override
  public String toString() {
    return Arrays.toString(array);
  }
}
