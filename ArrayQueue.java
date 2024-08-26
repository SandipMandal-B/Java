import java.util.NoSuchElementException;

public class ArrayQueue {
    private int[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue overflow! Cannot enqueue element " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        array[rear] = element;
        size++;
        System.out.println("Enqueued element: " + element);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow! Cannot dequeue from an empty queue");
        }
        int dequeuedElement = array[front];
        front = (front + 1) % capacity;
        size--;
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow! Cannot peek into an empty queue");
        }
        return array[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Size of the queue: " + queue.size());
        System.out.println("Front element of the queue: " + queue.peek());

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Dequeued element: " + queue.dequeue());

        System.out.println("Is the queue empty? " + queue.isEmpty());
    }
}
