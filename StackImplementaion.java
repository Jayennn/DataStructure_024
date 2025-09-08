
import java.lang.Thread;

public class StackImplementaion {
  public static void main(String[] args) {
    Stack stack = new Stack();

    stack.push(11);
    stack.push(22);
    stack.push(33);
    stack.push(44);

    while (stack.size() != 0) {
      try {
        System.out.println("Pop element: " + stack.peek());
        Thread.sleep(2000);
        stack.pop();
      } catch (Exception e) {
        System.out.println(e);
      }
    }

    stack.traverse();
  }
}
