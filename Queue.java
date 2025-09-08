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
      System.out.print(current.data + " -> ");
      current = current.next;
    }

    System.out.print("null \n");
  }
}
