public class Queue<T> {

    LinkedList<T> list = new LinkedList<>();


    public void enqueue(T data) {
        list.appendNode(data);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }
}
