package sort.util;

import java.util.Arrays;

public class SortUtil {
  private int[] array;

  public SortUtil(int[] array) {
    this.array = array;
  }

  public void bubbleSort() {
    int n = array.length;
    boolean swapped;

    System.out.println("Initial Array: " + this.toString());
    System.out.println("-------------------------------------");

    for (int i = 0; i < n - 1; i++) {
      swapped = false;
      System.out.println("\n▶ Pass " + (i + 1));

      for (int j = 0; j < n - i - 1; j++) {

        System.out.println("  Comparing " + array[j] + " and " + array[j + 1]);

        if (array[j] > array[j + 1]) {
          try {
            System.out.println("    Swapping -> " + array[j] + " and " + array[j + 1]);

            int temp = array[j];
            array[j] = array[j + 1];
            array[j + 1] = temp;

            SleepUtil.sleepMillis(800);

            System.out.println("    Array after swap: " + this.toString());
            swapped = true;

          } catch (InterruptedException e) {
            System.out.println("Interrupted while sleeping: " + e.getMessage());
            Thread.currentThread().interrupt();
          }
        }
      }

      if (!swapped) {
        System.out.println("  No swaps in this pass → Array is sorted early!");
        break;
      }
      System.out.println("-------------------------------------");
    }

    System.out.println("\n✅ Sorted Array: " + this.toString());
  }

  public void insertionSort() {
    int n = array.length;

    System.out.println("Initial Array: " + this.toString());
    System.out.println("-------------------------------------");

    for (int i = 1; i < n; i++) {
      int key = array[i];
      int j = i - 1;

      System.out.println("\n▶ Pass " + i + ": Insert key [" + key + "]");

      try {
        while (j >= 0 && array[j] > key) {
          System.out.println("  Shifting: " + array[j] + " → position " + (j + 1));

          array[j + 1] = array[j];
          j--;

          SleepUtil.sleepMillis(800);
          System.out.println("  Current state: " + this.toString());
        }
        array[j + 1] = key;

        System.out.println("  Insert key " + key + " at position " + (j + 1));
        System.out.println("  Array after insertion: " + this.toString());
        System.out.println("-------------------------------------");

      } catch (InterruptedException e) {
        System.out.println("Interrupted while sleeping: " + e.getMessage());
        Thread.currentThread().interrupt();
      }
    }

    System.out.println("\n Sorted Array: " + this.toString());
  }

  public void selectionSort() {
    int n = array.length;
    for (int i = 0; i < n - 1; i++) {
      int min_idx = i;

      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[min_idx]) {
          min_idx = j;
        }
      }

      int temp = array[i];
      array[i] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  @Override
  public String toString() {
    return Arrays.toString(array);
  }
}
