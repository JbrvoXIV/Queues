
public class Main {

    public static void main(String[] args) {
        QueuesList<Integer> q = new QueuesList<>();
        
        q.enqueue(58);
        q.enqueue(27);
        q.enqueue(36);
        q.enqueue(14);
        q.printQueue();
        
        System.out.printf("\nQUEUES WITH LINKED LISTS\n\n");
        System.out.printf("Length = %d\n", q.getLength());
        
        System.out.printf("Is Empty? [%b]\n", q.isEmpty());
        System.out.printf("Dequeue'd -> [%s]\n", q.dequeue());
        System.out.printf("Dequeue'd -> [%s]\n", q.dequeue());
        q.printQueue();
        System.out.printf("Length = %d\n", q.getLength());
        System.out.printf("Peeked -> [%s]\n", q.peek());
        q.printQueue();
        
        /*****************************************************************/
        QueuesWithStacks<Integer> q2 = new QueuesWithStacks<>();
        
        q2.enqueue(58);
        q2.enqueue(27);
        q2.enqueue(36);
        q2.enqueue(14);

        System.out.printf("\nQUEUES WITH STACKS\n\n");
        System.out.printf("Length = %d\n", q2.getLength());

        System.out.printf("Is Empty? [%b]\n", q2.isEmpty());
        System.out.printf("Dequeue'd -> [%s]\n", q2.dequeue());
        System.out.printf("Dequeue'd -> [%s]\n", q2.dequeue());
        System.out.printf("Length = %d\n", q2.getLength());
        System.out.printf("Peeked -> [%s]\n", q2.peek());

        q2.enqueue(98);
        System.out.printf("Dequeue'd -> [%s]\n", q2.dequeue());
        System.out.printf("Dequeue'd -> [%s]\n", q2.dequeue());
        System.out.printf("Dequeue'd -> [%s]\n", q2.dequeue());
 
        /*****************************************************************/
        QueuesWithCircularArray q3 = new QueuesWithCircularArray(5);

        q3.enqueue(58);
        q3.enqueue(27);
        q3.enqueue(36);
        q3.enqueue(14);

        System.out.printf("\nQUEUES WITH CIRCULAR ARRAY\n\n");
        System.out.printf("Is Empty? [%b]\n", q3.isEmpty());
        System.out.printf("Dequeue'd -> [%s]\n", q3.dequeue());
        System.out.printf("Dequeue'd -> [%s]\n", q3.dequeue());
        
        q3.enqueue(98);
        System.out.printf("Dequeue'd -> [%s]\n", q3.dequeue());
        System.out.printf("Dequeue'd -> [%s]\n", q3.dequeue());
        System.out.printf("Dequeue'd -> [%s]\n", q3.dequeue());
    }
}