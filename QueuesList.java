import java.util.NoSuchElementException;

public class QueuesList<T> {
    class Node {
        T data;
        Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }

    private Node first, last;
    private int size;

    public QueuesList() {
        first = null;
        last = null;
        size = 0;
    }

    public void enqueue(T data) {
        Node newNode = new Node(data);
        if(first == null) {
            first = newNode;
            last = newNode;
            size++;
            return;
        }
        last.next = newNode;
        last = newNode;
        size++;
    }

    public T dequeue() {
        if(first == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        T oldData = first.data;
        first = first.next;
        size--;
        return oldData;
    }

    public T peek() {
        if(first == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int getLength() {
        return size;
    }

    public void printQueue() {
        if(first == null) {
            throw new NoSuchElementException("Queue is empty");
        }
        Node curNode = first;
        System.out.printf("| First -> [%s] -> ", curNode.data);
        while(curNode.next.next != null) {
            curNode = curNode.next;
            System.out.printf("[%s] -> ", curNode.data);
        }
        curNode = curNode.next;
        System.out.printf("[%s] <- Last |\n", curNode.data);
    }
    
}