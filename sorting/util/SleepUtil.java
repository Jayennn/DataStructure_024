package sort.util;

public class SleepUtil {

  // metode untuk pause dalam milidetik
  public static void sleepMillis(long millis) {
    try {
      Thread.sleep(millis);
    } catch (InterruptedException e) {
      // kalau thread diinterupsi, set kembali status interrupt
      Thread.currentThread().interrupt();
      System.out.println("Sleep terganggu: " + e.getMessage());
    }
  }
}
