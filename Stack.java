public class Stack<T> {

    LinkedList<T> list = new LinkedList<>();

    // push = add at beginning
    public void push(T data) {
        list.addNode(data);
    }


    public void display() {
        list.display();
    }
}

