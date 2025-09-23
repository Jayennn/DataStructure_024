package sort.util;

public final class SleepUtil {

  private SleepUtil() {
  }

  public static void sleepMillis(long millis) throws InterruptedException {
    if (millis <= 0)
      return;
    Thread.sleep(millis);
  }
}