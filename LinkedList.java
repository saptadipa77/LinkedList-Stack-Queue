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

    public void appendNode(T data)
    {
        Node<T> newNode=new Node<>(data);
        if(head==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void insertAfter(T key, T data)
    {
        Node<T> newNode=new Node<>(data);
        Node<T> curr=head;
        while(curr!=null){
            if(curr.data.equals(key)){
                newNode.next=curr.next;
                curr.next=newNode;
                if(curr==tail)
                {
                    tail=newNode;
                }
                return;
            }
            else{
                curr=curr.next;
            }
        }
    }

    public void pop()
    {
        if(head!=null)
        {
           head=head.next;
        }
    }

    public void popLast() {
        if (head == null || head.next == null) {
            head = tail = null;
            return;
        }

        Node<T> current = head;
        while (current.next != tail) {
            current = current.next;
        }
        current.next = null;
        tail = current;
    }

    public boolean searchValue(T key)
    {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(key))
                return true;
            current = current.next;
        }
        return false;
    }
}
