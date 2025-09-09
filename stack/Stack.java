package stack;

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

  public Node swap(int x, int y) {
    if (x == y) {
      return top;
    }

    Node prevX = null, currX = null;
    Node prevY = null, currY = null;

    Node curr = top;

    // Search for the x
    while (curr != null) {
      if (curr.data == x) {
        currX = curr;
        break;
      }

      prevX = curr;
      curr = curr.next;
    }

    curr = top;

    // Search for the y
    while (curr != null) {
      if (curr.data == y) {
        currY = curr;
        break;
      }

      prevY = curr;
      curr = curr.next;
    }

    if (currX == null || currY == null) {
      return top;
    }

    // If x is not top of the linked list
    if (prevX != null) {
      prevX.next = currY;
    } else {
      top = currY;
    }

    // If y is not top of the linked list
    if (prevY != null) {
      prevY.next = currX;
    } else {
      top = currX;
    }

    Node temp = currX.next;
    currX.next = currY.next;
    currY.next = temp;

    return top;
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

    Node temp = top;
    top = top.next;
    temp = null;
    size--;

  }

  public void traverse() {
    if (isEmpty()) {
      throw new NullPointerException("Stack kosong");
    }

    /* TODO: Traverse linkedlist */
    Node current = top;
    while (current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }

    System.out.print("null \n");
  }
}