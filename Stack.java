public class Stack<T> {

    LinkedList<T> list = new LinkedList<>();

    public void push(T data) {

        list.addNode(data);
    }

    public T peek() {
        if (list.isEmpty())
            return null;
        return list.head.data;
    }

    public T pop() {
        return list.pop();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public void display() {
        list.display();
    }
}

