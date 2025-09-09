package queue;

public class QueueImplementaion {
  public static void main(String[] args) {
    Queue queue = new Queue();

    queue.enqueue(11);
    queue.enqueue(22);
    queue.enqueue(33);
    queue.traverse();

    // queue.dequeue();

  }
}