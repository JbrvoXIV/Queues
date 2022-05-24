
import java.util.Stack;

public class QueuesWithStacks<T> {
    private Stack<T> newOnTop = new Stack<>();
    private Stack<T> oldOnTop = new Stack<>();

    public void enqueue(T data) {
        newOnTop.push(data);
    }

    public T dequeue() {
        if(oldOnTop.isEmpty()) {
            while(!newOnTop.isEmpty()) {
                oldOnTop.push(newOnTop.pop());
            }
        }
        return oldOnTop.pop();
    }

    public T peek() {
        if(oldOnTop.isEmpty()) {
            while(!newOnTop.isEmpty()) {
                oldOnTop.push(newOnTop.pop());
            }
        }
        return oldOnTop.peek();
    }

    public boolean isEmpty() {
        return newOnTop.isEmpty() && oldOnTop.isEmpty();
    }

    public int getLength() {
        return newOnTop.size() + oldOnTop.size();
    }

}
