package sort;

import sort.util.SortUtil;

public class Main {
  public static void main(String[] args) {
    int[] arr = { 12, 11, 13, 5, 6 };

    SortUtil sort = new SortUtil(arr);

    sort.bubbleSort();
  }
}
