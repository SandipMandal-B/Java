import java.util.EmptyStackException;

public class ArrayStack {
    private int[] array;
    private int top;
    private int capacity;

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.top = -1;
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push element " + element);
            return;
        }
        array[++top] = element;
        System.out.println("Pushed element: " + element);
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int poppedElement = array[top];
        top--;
        return poppedElement;
    }

    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element of the stack: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}