
public class QueuesWithCircularArray {
    
    private Object[] queue;
    private int head, tail, maxSize;

    public QueuesWithCircularArray(int size) {
        queue = new Object[size];
        maxSize = size;
        head = tail = -1;
    }

    public boolean isFull() {
        return head == (tail + 1) % maxSize;
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public void enqueue(Object data) {
       if(isFull()) {
           throw new IllegalStateException("Queue is full");
       }
       if(isEmpty()) {
           head++;
       }
       tail = (tail + 1) % maxSize;
       queue[tail] = data;
    }

    public Object dequeue() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object removedData = queue[head];
        
        if(head == tail) {
            head = tail = -1;    
        } else {
            head = (head + 1) % maxSize;
        }

        return removedData;
    }

    public Object peek() {
        if(isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[head];
    }

    public void clear() {
        if(isEmpty()) {
            System.out.printf("Queue is already empty\n");
            return;
        }
        tail = -1;
        head = -1;
        System.out.printf("Queue is now empty\n");
    }

    public void resize() {
        Object[] temp = new Object[maxSize * 2];
        int i = 0;
        int j = head;

        do {
            temp[i++] = queue[head];
            j = (j + 1) % maxSize;
        } while(j != head);
        
        head = 0;
        tail = maxSize - 1;
        queue = temp;
    }
}
