
public class Stack {
  private Node top;
  private int size;

  Stack() {
    this.top = null;
    this.size = 0;
  }

  boolean isEmpty() {
    return top == null;
  }

  public void push(int value) {
    Node data = new Node(value);
    data.next = top;
    top = data;
    size++;
  }

  public int peek() {
    if (isEmpty()) {
      return Integer.MIN_VALUE;
    }

    return top.data;
  }

  public int size() {
    return this.size;
  }

  public void pop() {
    if (isEmpty()) {
      return; /* TODO: Throws Error */
    }

    top = top.next;
    size--;
  }

  public void traverse() {
    if (isEmpty()) {
      throw new NullPointerException("Stack kosong");
    }

    /* TODO: Traverse linkedlist */
  }
}