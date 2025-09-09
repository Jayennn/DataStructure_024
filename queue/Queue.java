package queue;

public class Queue {
  private Node front;
  private Node rear;
  private int size;

  Queue() {
    this.front = this.rear = null;
    this.size = 0;
  }

  public boolean isEmpty() {
    return this.front == null;
  }

  public void enqueue(int value) {
    Node data = new Node(value);

    if (isEmpty()) {
      System.out.println("Queue is empty");
      front = rear = data;
      size++;
      return;
    }

    rear.next = data;
    rear = data;
    size++;
  }

  public void dequeue() {
    if (isEmpty())
      return;

    Node temp = front;
    front = front.next;

    if (front == null) {
      rear = null;
    }

    temp = null;
  }

  public void swap(int x, int y) {

    if (x == y) {
      return;
    }

    Node currX = null, currY = null;

    Node curr = front;

    while (curr != null) {
      if (curr.data == x) {
        currX = curr;
        break;
      }

      curr = curr.next;
    }

    if (currX == null || currY == null || currX == currY) {
      return;
    }
  }

  public int size() {
    return this.size;
  }

  public void traverse() {
    if (isEmpty()) {
      System.out.println("Queue is empty");
      return;
    }

    Node current = front;
    while (current != null) {
      System.out.print(current.data);
      if (current.next != null) {
        System.out.print(" <-> ");
      }
      current = current.next;
    }

    System.out.print("\n");
  }
}
