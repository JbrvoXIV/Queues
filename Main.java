
public class Main {

    public static void main(String[] args) {
        QueuesList<Integer> q = new QueuesList<>();
        QueuesWithStacks<Integer> q2 = new QueuesWithStacks<>();

        q.enqueue(58);
        q.enqueue(27);
        q.enqueue(36);
        q.enqueue(14);
        q.printQueue();

        System.out.printf("Length = %d\n", q.getLength());

        System.out.printf("Is Empty? [%b]\n", q.isEmpty());
        System.out.printf("Dequeue'd -> [%s]\n", q.dequeue());
        System.out.printf("Dequeue'd -> [%s]\n", q.dequeue());
        q.printQueue();
        System.out.printf("Length = %d\n", q.getLength());
        System.out.printf("Peeked -> [%s]\n", q.peek());
        q.printQueue();

        /*****************************************************************/

        q2.enqueue(58);
        q2.enqueue(27);
        q2.enqueue(36);
        q2.enqueue(14);

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
        
    }
}