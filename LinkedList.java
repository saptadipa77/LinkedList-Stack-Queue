public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;


    public void addNode(T data){
        Node<T> newNode=new Node<>(data);
        if(head==null){
          head=tail=newNode;
        }
        else {
            newNode.next=head;
            head=newNode;
        }
    }
}
