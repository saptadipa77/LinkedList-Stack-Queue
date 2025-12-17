public class Queue<T> {

    LinkedList<T> list = new LinkedList<>();


    public void enqueue(T data) {

        list.appendNode(data);
    }

    public T dequeue() {
        return list.pop();
    }

    public boolean isEmpty() {

        return list.isEmpty();
    }

    public void display() {

        list.display();
    }
}
